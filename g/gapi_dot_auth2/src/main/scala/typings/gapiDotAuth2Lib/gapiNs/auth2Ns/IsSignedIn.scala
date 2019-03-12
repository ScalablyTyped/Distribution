package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsSignedIn extends js.Object {
  /**
    * Returns whether the current user is currently signed in.
    */
  def get(): scala.Boolean
  /**
    * Listen for changes in the current user's sign-in state.
    */
  def listen(listener: js.Function1[/* signedIn */ scala.Boolean, _]): scala.Unit
}

object IsSignedIn {
  @scala.inline
  def apply(get: () => scala.Boolean, listen: js.Function1[/* signedIn */ scala.Boolean, _] => scala.Unit): IsSignedIn = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), listen = js.Any.fromFunction1(listen))
  
    __obj.asInstanceOf[IsSignedIn]
  }
}

