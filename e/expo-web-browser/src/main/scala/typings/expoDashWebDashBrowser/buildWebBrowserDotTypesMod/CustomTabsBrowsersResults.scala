package typings.expoDashWebDashBrowser.buildWebBrowserDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTabsBrowsersResults extends js.Object {
  var browserPackages: js.Array[String]
  var defaultBrowserPackage: js.UndefOr[String] = js.undefined
  var preferredBrowserPackage: js.UndefOr[String] = js.undefined
  var servicePackages: js.Array[String]
}

object CustomTabsBrowsersResults {
  @scala.inline
  def apply(
    browserPackages: js.Array[String],
    servicePackages: js.Array[String],
    defaultBrowserPackage: String = null,
    preferredBrowserPackage: String = null
  ): CustomTabsBrowsersResults = {
    val __obj = js.Dynamic.literal(browserPackages = browserPackages, servicePackages = servicePackages)
    if (defaultBrowserPackage != null) __obj.updateDynamic("defaultBrowserPackage")(defaultBrowserPackage)
    if (preferredBrowserPackage != null) __obj.updateDynamic("preferredBrowserPackage")(preferredBrowserPackage)
    __obj.asInstanceOf[CustomTabsBrowsersResults]
  }
}

