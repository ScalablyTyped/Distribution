package typings.gapiDotAuth2.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsSignedIn extends js.Object {
  /**
    * Returns whether the current user is currently signed in.
    */
  def get(): Boolean
  /**
    * Listen for changes in the current user's sign-in state.
    */
  def listen(listener: js.Function1[/* signedIn */ Boolean, _]): Unit
}

object IsSignedIn {
  @scala.inline
  def apply(get: () => Boolean, listen: js.Function1[/* signedIn */ Boolean, _] => Unit): IsSignedIn = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), listen = js.Any.fromFunction1(listen))
  
    __obj.asInstanceOf[IsSignedIn]
  }
}

