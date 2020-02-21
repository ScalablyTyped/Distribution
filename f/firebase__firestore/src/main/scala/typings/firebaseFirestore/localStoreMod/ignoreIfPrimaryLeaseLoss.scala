package typings.firebaseFirestore.localStoreMod

import typings.firebaseFirestore.errorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/local_store", "ignoreIfPrimaryLeaseLoss")
@js.native
object ignoreIfPrimaryLeaseLoss extends js.Object {
  def apply(err: FirestoreError): js.Promise[Unit] = js.native
}

