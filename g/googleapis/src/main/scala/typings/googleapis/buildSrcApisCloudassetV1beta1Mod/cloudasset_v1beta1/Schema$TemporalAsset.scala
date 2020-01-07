package typings.googleapis.buildSrcApisCloudassetV1beta1Mod.cloudasset_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Temporal asset. In addition to the asset, the temporal asset includes the
  * status of the asset and valid from and to time of it.
  */
@js.native
trait Schema$TemporalAsset extends js.Object {
  /**
    * Asset.
    */
  var asset: js.UndefOr[Schema$Asset] = js.native
  /**
    * If the asset is deleted or not.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * The time window when the asset data and state was observed.
    */
  var window: js.UndefOr[Schema$TimeWindow] = js.native
}

object Schema$TemporalAsset {
  @scala.inline
  def apply(
    asset: Schema$Asset = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    window: Schema$TimeWindow = null
  ): Schema$TemporalAsset = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TemporalAsset]
  }
}

