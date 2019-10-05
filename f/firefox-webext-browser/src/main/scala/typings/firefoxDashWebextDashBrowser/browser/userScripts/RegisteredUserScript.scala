package typings.firefoxDashWebextDashBrowser.browser.userScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object that represents a user script registered programmatically */
trait RegisteredUserScript extends js.Object {
  /** Unregister a user script registered programmatically */
  def unregister(): js.Promise[_]
}

object RegisteredUserScript {
  @scala.inline
  def apply(unregister: () => js.Promise[_]): RegisteredUserScript = {
    val __obj = js.Dynamic.literal(unregister = js.Any.fromFunction0(unregister))
  
    __obj.asInstanceOf[RegisteredUserScript]
  }
}

