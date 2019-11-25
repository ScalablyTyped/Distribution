package typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceActionResult extends js.Object {
  var servicePackage: js.UndefOr[String] = js.undefined
}

object ServiceActionResult {
  @scala.inline
  def apply(servicePackage: String = null): ServiceActionResult = {
    val __obj = js.Dynamic.literal()
    if (servicePackage != null) __obj.updateDynamic("servicePackage")(servicePackage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceActionResult]
  }
}

