package typings.firebaseFirestore

import typings.firebaseFirestore.apiFieldValueMod.SerializableFieldValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/src/api/field_value", JSImport.Namespace)
@js.native
object fieldValueMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FieldValue * / any */ @js.native
  abstract class FieldValue () extends SerializableFieldValue
  
  def arrayRemove(elements: js.Any*): js.Any = js.native
  def arrayUnion(elements: js.Any*): js.Any = js.native
  def deleteField(): js.Any = js.native
  def increment(n: Double): js.Any = js.native
  def serverTimestamp(): js.Any = js.native
}

