package typings.firebaseFirestore.modelMutationMod

import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.srcModelFieldValueMod.ObjectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/mutation", "PatchMutation")
@js.native
class PatchMutation protected () extends Mutation {
  def this(key: DocumentKey, data: ObjectValue, fieldMask: FieldMask, precondition: Precondition) = this()
  val data: ObjectValue = js.native
  val fieldMask: FieldMask = js.native
  /**
    * Patches the data of document if available or creates a new document. Note
    * that this does not check whether or not the precondition of this patch
    * holds.
    */
  var patchDocument: js.Any = js.native
  var patchObject: js.Any = js.native
}

