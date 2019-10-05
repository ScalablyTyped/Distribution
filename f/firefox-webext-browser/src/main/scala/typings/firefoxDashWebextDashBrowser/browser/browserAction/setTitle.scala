package typings.firefoxDashWebextDashBrowser.browser.browserAction

import typings.firefoxDashWebextDashBrowser.Anon_TabIdTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browserAction.setTitle")
@js.native
object setTitle extends js.Object {
  /* browserAction functions */
  /**
    * Sets the title of the browser action. This shows up in the tooltip.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be
    *     retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  def apply(details: Anon_TabIdTitle): js.Promise[Unit] = js.native
}

