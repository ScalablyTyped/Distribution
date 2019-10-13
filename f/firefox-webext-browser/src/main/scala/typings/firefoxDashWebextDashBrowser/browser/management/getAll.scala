package typings.firefoxDashWebextDashBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.management.getAll")
@js.native
object getAll extends js.Object {
  /* management functions */
  /** Returns a list of information about installed extensions. */
  def apply(): js.Promise[js.Array[ExtensionInfo]] = js.native
}

