package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result containing the Asset and its State.
  */
@js.native
trait Schema$ListAssetsResult extends js.Object {
  /**
    * Asset matching the search request.
    */
  var asset: js.UndefOr[Schema$Asset] = js.native
  /**
    * State of the asset.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$ListAssetsResult {
  @scala.inline
  def apply(asset: Schema$Asset = null, state: String = null): Schema$ListAssetsResult = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAssetsResult]
  }
}

