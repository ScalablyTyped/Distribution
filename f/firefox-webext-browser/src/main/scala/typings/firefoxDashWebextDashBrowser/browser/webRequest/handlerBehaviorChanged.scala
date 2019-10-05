package typings.firefoxDashWebextDashBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.webRequest.handlerBehaviorChanged")
@js.native
object handlerBehaviorChanged extends js.Object {
  /* webRequest functions */
  /**
    * Needs to be called when the behavior of the webRequest handlers has changed to prevent incorrect handling due to
    * caching. This function call is expensive. Don't call it often.
    */
  def apply(): js.Promise[Unit] = js.native
}

