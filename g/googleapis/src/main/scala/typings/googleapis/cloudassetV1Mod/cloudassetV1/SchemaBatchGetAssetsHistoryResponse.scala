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
  def apply(): SchemaBatchGetAssetsHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetAssetsHistoryResponse]
  }
  @scala.inline
  implicit class SchemaBatchGetAssetsHistoryResponseOps[Self <: SchemaBatchGetAssetsHistoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssetsVarargs(value: SchemaTemporalAsset*): Self = this.set("assets", js.Array(value :_*))
    @scala.inline
    def setAssets(value: js.Array[SchemaTemporalAsset]): Self = this.set("assets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssets: Self = this.set("assets", js.undefined)
  }
  
}

