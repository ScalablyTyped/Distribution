package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcModelPathMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/path", "DOCUMENT_KEY_NAME")
  @js.native
  val DOCUMENT_KEY_NAME: /* "__name__" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/path", "FieldPath")
  @js.native
  open class FieldPath ()
    extends StObject
       with BasePath[FieldPath] {
    
    def canonicalString(): String = js.native
    
    /**
      * Returns true if this field references the key of a document.
      */
    def isKeyField(): Boolean = js.native
  }
  /* static members */
  object FieldPath {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/model/path", "FieldPath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def emptyPath(): FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyPath")().asInstanceOf[FieldPath]
    
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
    inline def fromServerFormat(path: String): FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("fromServerFormat")(path.asInstanceOf[js.Any]).asInstanceOf[FieldPath]
    
    /**
      * Returns true if the string could be used as a segment in a field path
      * without escaping.
      */
    @JSImport("@firebase/firestore/dist/packages/firestore/src/model/path", "FieldPath.isValidIdentifier")
    @js.native
    def isValidIdentifier: Any = js.native
    inline def isValidIdentifier_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isValidIdentifier")(x.asInstanceOf[js.Any])
    
    /**
      * The field designating the key of a document.
      */
    inline def keyField(): FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("keyField")().asInstanceOf[FieldPath]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/path", "ResourcePath")
  @js.native
  open class ResourcePath ()
    extends StObject
       with BasePath[ResourcePath] {
    
    def canonicalString(): String = js.native
  }
  /* static members */
  object ResourcePath {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/model/path", "ResourcePath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def emptyPath(): ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyPath")().asInstanceOf[ResourcePath]
    
    /**
      * Creates a resource path from the given slash-delimited string. If multiple
      * arguments are provided, all components are combined. Leading and trailing
      * slashes from all components are ignored.
      */
    inline def fromString(pathComponents: String*): ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(pathComponents.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ResourcePath]
  }
  
  /**
    * Path represents an ordered sequence of string segments.
    */
  @js.native
  trait BasePath[B /* <: BasePath[B] */] extends StObject {
    
    def child(nameOrPath: B): B = js.native
    def child(nameOrPath: String): B = js.native
    
    /**
      * Abstract constructor method to construct an instance of B with the given
      * parameters.
      */
    /* protected */ def construct(segments: js.Array[String]): B = js.native
    /* protected */ def construct(segments: js.Array[String], offset: Double): B = js.native
    /* protected */ def construct(segments: js.Array[String], offset: Double, length: Double): B = js.native
    /* protected */ def construct(segments: js.Array[String], offset: Unit, length: Double): B = js.native
    
    def firstSegment(): String = js.native
    
    def forEach(fn: js.Function1[/* segment */ String, Unit]): Unit = js.native
    
    def get(index: Double): String = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isEqual(other: B): Boolean = js.native
    
    def isImmediateParentOf(potentialChild: this.type): Boolean = js.native
    
    def isPrefixOf(other: this.type): Boolean = js.native
    
    def lastSegment(): String = js.native
    
    /* private */ var len: Any = js.native
    
    def length: Double = js.native
    
    /** The index of one past the last segment of the path. */
    /* private */ var limit: Any = js.native
    
    /* private */ var offset: Any = js.native
    
    def popFirst(): B = js.native
    def popFirst(size: Double): B = js.native
    
    def popLast(): B = js.native
    
    /* private */ var segments: Any = js.native
    
    def toArray(): js.Array[String] = js.native
  }
}
