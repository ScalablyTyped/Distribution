package typings.gapiDotAuth2.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentUser extends js.Object {
  /**
    * Returns a GoogleUser object that represents the current user. Note that in a newly-initialized
    * GoogleAuth instance, the current user has not been set. Use the currentUser.listen() method or the
    * GoogleAuth.then() to get an initialized GoogleAuth instance.
    */
  def get(): GoogleUser
  /**
    * Listen for changes in currentUser.
    */
  def listen(listener: js.Function1[/* user */ GoogleUser, _]): Unit
}

object CurrentUser {
  @scala.inline
  def apply(get: () => GoogleUser, listen: js.Function1[/* user */ GoogleUser, _] => Unit): CurrentUser = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), listen = js.Any.fromFunction1(listen))
  
    __obj.asInstanceOf[CurrentUser]
  }
}

