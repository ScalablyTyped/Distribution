package typings.firefoxDashWebextDashBrowser.browser.extension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.extension.setUpdateUrlData")
@js.native
object setUpdateUrlData extends js.Object {
  /**
    * Sets the value of the ap CGI parameter used in the extension's update URL. This value is ignored for extensions
    * that are hosted in the browser vendor's store.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(data: String): Unit = js.native
}

