package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/model/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  /**
    * Path represents an ordered sequence of string segments.
    */
  @js.native
  trait BasePath[B /* <: BasePath[B] */] extends js.Object {
    var len: js.Any = js.native
    /** The index of one past the last segment of the path. */
    var limit: js.Any = js.native
    var offset: js.Any = js.native
    var segments: js.Any = js.native
    def child(nameOrPath: B): B = js.native
    def child(nameOrPath: String): B = js.native
    /**
      * Abstract constructor method to construct an instance of B with the given
      * parameters.
      */
    /* protected */ def construct(segments: js.Array[String]): B = js.native
    /* protected */ def construct(segments: js.Array[String], offset: Double): B = js.native
    /* protected */ def construct(segments: js.Array[String], offset: Double, length: Double): B = js.native
    def firstSegment(): String = js.native
    def forEach(fn: js.Function1[/* segment */ String, Unit]): Unit = js.native
    def get(index: Double): String = js.native
    def isEmpty(): Boolean = js.native
    def isEqual(other: B): Boolean = js.native
    def isImmediateParentOf(potentialChild: this.type): Boolean = js.native
    def isPrefixOf(other: this.type): Boolean = js.native
    def lastSegment(): String = js.native
    def length: Double = js.native
    def popFirst(): B = js.native
    def popFirst(size: Double): B = js.native
    def popLast(): B = js.native
    def toArray(): js.Array[String] = js.native
  }
  
  @js.native
  class FieldPath () extends BasePath[FieldPath] {
    def canonicalString(): String = js.native
    /**
      * Returns true if this field references the key of a document.
      */
    def isKeyField(): Boolean = js.native
  }
  
  @js.native
  class ResourcePath () extends BasePath[ResourcePath] {
    def canonicalString(): String = js.native
  }
  
  val DOCUMENT_KEY_NAME: /* "__name__" */ String = js.native
  /* static members */
  @js.native
  object FieldPath extends js.Object {
    var EMPTY_PATH: FieldPath = js.native
    /**
      * Returns true if the string could be used as a segment in a field path
      * without escaping.
      */
    var isValidIdentifier: js.Any = js.native
    /**
      * Parses a field string from the given server-formatted string.
      *
      * - Splitting the empty string is not allowed (for now at least).
      * - Empty segments within the string (e.g. if there are two consecutive
      *   separators) are not allowed.
      *
      * TODO(b/37244157): we should make this more strict. Right now, it allows
      * non-identifier path components, even if they aren't escaped.
      */
    def fromServerFormat(path: String): FieldPath = js.native
    /**
      * The field designating the key of a document.
      */
    def keyField(): FieldPath = js.native
  }
  
  /* static members */
  @js.native
  object ResourcePath extends js.Object {
    var EMPTY_PATH: ResourcePath = js.native
    /**
      * Creates a resource path from the given slash-delimited string.
      */
    def fromString(path: String): ResourcePath = js.native
  }
  
}

