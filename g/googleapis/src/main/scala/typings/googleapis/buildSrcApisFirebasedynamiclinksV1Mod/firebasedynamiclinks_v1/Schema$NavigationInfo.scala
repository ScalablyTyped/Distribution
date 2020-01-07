package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information of navigation behavior.
  */
@js.native
trait Schema$NavigationInfo extends js.Object {
  /**
    * If this option is on, FDL click will be forced to redirect rather than
    * show an interstitial page.
    */
  var enableForcedRedirect: js.UndefOr[Boolean] = js.native
}

object Schema$NavigationInfo {
  @scala.inline
  def apply(enableForcedRedirect: js.UndefOr[Boolean] = js.undefined): Schema$NavigationInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableForcedRedirect)) __obj.updateDynamic("enableForcedRedirect")(enableForcedRedirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NavigationInfo]
  }
}

