package typings.googleapis.buildSrcApisCloudassetV1beta1Mod.cloudasset_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Batch get assets history response.
  */
@js.native
trait Schema$BatchGetAssetsHistoryResponse extends js.Object {
  /**
    * A list of assets with valid time windows.
    */
  var assets: js.UndefOr[js.Array[Schema$TemporalAsset]] = js.native
}

object Schema$BatchGetAssetsHistoryResponse {
  @scala.inline
  def apply(assets: js.Array[Schema$TemporalAsset] = null): Schema$BatchGetAssetsHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (assets != null) __obj.updateDynamic("assets")(assets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchGetAssetsHistoryResponse]
  }
}

