package typings.firebaseFirestore.asyncQueueMod

import typings.firebaseFirestore.errorMod.FirestoreError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/util/async_queue", "wrapInUserErrorIfRecoverable")
@js.native
object wrapInUserErrorIfRecoverable extends js.Object {
  def apply(e: Error, msg: String): FirestoreError = js.native
}

