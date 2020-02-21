package typings.firebaseFirestore.localLocalStoreMod

import typings.firebaseFirestore.utilErrorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/local_store", "ignoreIfPrimaryLeaseLoss")
@js.native
object ignoreIfPrimaryLeaseLoss extends js.Object {
  def apply(err: FirestoreError): js.Promise[Unit] = js.native
}

