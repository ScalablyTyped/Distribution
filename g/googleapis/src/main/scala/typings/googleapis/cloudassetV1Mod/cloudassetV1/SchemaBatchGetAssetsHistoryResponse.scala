package typings.googleapis.cloudassetV1Mod.cloudassetV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Batch get assets history response.
  */
@js.native
trait SchemaBatchGetAssetsHistoryResponse extends js.Object {
  /**
    * A list of assets with valid time windows.
    */
  var assets: js.UndefOr[js.Array[SchemaTemporalAsset]] = js.native
}

object SchemaBatchGetAssetsHistoryResponse {
  @scala.inline
  def apply(assets: js.Array[SchemaTemporalAsset] = null): SchemaBatchGetAssetsHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (assets != null) __obj.updateDynamic("assets")(assets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchGetAssetsHistoryResponse]
  }
}

