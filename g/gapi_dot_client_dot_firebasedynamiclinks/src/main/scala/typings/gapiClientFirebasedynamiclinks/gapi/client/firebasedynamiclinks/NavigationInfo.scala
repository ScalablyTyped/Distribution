package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationInfo extends js.Object {
  /**
    * If this option is on, FDL click will be forced to redirect rather than
    * show an interstitial page.
    */
  var enableForcedRedirect: js.UndefOr[Boolean] = js.undefined
}

object NavigationInfo {
  @scala.inline
  def apply(enableForcedRedirect: js.UndefOr[Boolean] = js.undefined): NavigationInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableForcedRedirect)) __obj.updateDynamic("enableForcedRedirect")(enableForcedRedirect.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationInfo]
  }
}

