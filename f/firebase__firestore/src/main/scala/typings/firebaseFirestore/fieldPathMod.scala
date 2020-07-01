package typings.firebaseFirestore

import typings.firebaseFirestore.apiFieldPathMod.BaseFieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/src/api/field_path", JSImport.Namespace)
@js.native
object fieldPathMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FieldPath * / any */ @js.native
  class FieldPath protected () extends BaseFieldPath {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames A list of field names.
      */
    def this(fieldNames: String*) = this()
    def isEqual(
      other: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FieldPath */ js.Any
    ): Boolean = js.native
  }
  
  def documentId(): js.Any = js.native
}

