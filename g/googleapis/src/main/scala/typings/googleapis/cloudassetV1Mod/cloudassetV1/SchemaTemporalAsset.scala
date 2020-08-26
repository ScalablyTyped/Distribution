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
  def apply(): SchemaTemporalAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemporalAsset]
  }
  @scala.inline
  implicit class SchemaTemporalAssetOps[Self <: SchemaTemporalAsset] (val x: Self) extends AnyVal {
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
    def setAsset(value: SchemaAsset): Self = this.set("asset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsset: Self = this.set("asset", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setWindow(value: SchemaTimeWindow): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

