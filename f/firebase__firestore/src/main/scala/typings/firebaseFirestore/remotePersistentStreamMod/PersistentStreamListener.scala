package typings.firebaseFirestore.remotePersistentStreamMod

import typings.firebaseFirestore.utilErrorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistentStreamListener extends js.Object {
  /**
    * Called after the stream has closed. If there was an error, the
    * FirestoreError will be set.
    */
  def onClose(): js.Promise[Unit] = js.native
  def onClose(err: FirestoreError): js.Promise[Unit] = js.native
  /**
    * Called after the stream was established and can accept outgoing
    * messages
    */
  def onOpen(): js.Promise[Unit] = js.native
}

