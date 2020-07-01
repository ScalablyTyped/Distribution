package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/field_path", JSImport.Namespace)
@js.native
object apiFieldPathMod extends js.Object {
  @js.native
  abstract class BaseFieldPath protected () extends js.Object {
    def this(fieldNames: js.Array[String]) = this()
    /** Internal representation of a Firestore field path. */
    val _internalPath: typings.firebaseFirestore.pathMod.FieldPath = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseFirestoreTypes.mod.FieldPath because Inheritance from two classes. Inlined isEqual */ @js.native
  class FieldPath protected () extends BaseFieldPath {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames A list of field names.
      */
    def this(fieldNames: String*) = this()
    def isEqual(other: typings.firebaseFirestoreTypes.mod.FieldPath): Boolean = js.native
  }
  
  def fromDotSeparatedString(path: String): FieldPath = js.native
  /* static members */
  @js.native
  object FieldPath extends js.Object {
    /**
      * Internal Note: The backend doesn't technically support querying by
      * document ID. Instead it queries by the entire document name (full path
      * included), but in the cases we currently support documentId(), the net
      * effect is the same.
      */
    val _DOCUMENT_ID: js.Any = js.native
    def documentId(): FieldPath = js.native
  }
  
}

