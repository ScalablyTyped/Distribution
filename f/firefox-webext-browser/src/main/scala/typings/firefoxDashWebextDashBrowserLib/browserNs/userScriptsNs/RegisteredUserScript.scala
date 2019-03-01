package typings
package firefoxDashWebextDashBrowserLib.browserNs.userScriptsNs

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
  def apply(unregister: js.Function0[js.Promise[_]]): RegisteredUserScript = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unregister")(unregister)
    __obj.asInstanceOf[RegisteredUserScript]
  }
}

