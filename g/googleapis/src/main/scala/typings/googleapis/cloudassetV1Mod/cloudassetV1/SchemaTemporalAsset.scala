package typings.googleapis.cloudassetV1Mod.cloudassetV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Temporal asset. In addition to the asset, the temporal asset includes the
  * status of the asset and valid from and to time of it.
  */
@js.native
trait SchemaTemporalAsset extends js.Object {
  /**
    * Asset.
    */
  var asset: js.UndefOr[SchemaAsset] = js.native
  /**
    * If the asset is deleted or not.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * The time window when the asset data and state was observed.
    */
  var window: js.UndefOr[SchemaTimeWindow] = js.native
}

object SchemaTemporalAsset {
  @scala.inline
  def apply(
    asset: SchemaAsset = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    window: SchemaTimeWindow = null
  ): SchemaTemporalAsset = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTemporalAsset]
  }
}

