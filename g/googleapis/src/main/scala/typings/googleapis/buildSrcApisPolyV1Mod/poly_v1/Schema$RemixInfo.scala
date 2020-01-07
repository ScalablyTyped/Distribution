package typings.googleapis.buildSrcApisPolyV1Mod.poly_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info about the sources of this asset (i.e. assets that were remixed to
  * create this asset).
  */
@js.native
trait Schema$RemixInfo extends js.Object {
  /**
    * Resource ids for the sources of this remix, of the form:
    * `assets/{ASSET_ID}`
    */
  var sourceAsset: js.UndefOr[js.Array[String]] = js.native
}

object Schema$RemixInfo {
  @scala.inline
  def apply(sourceAsset: js.Array[String] = null): Schema$RemixInfo = {
    val __obj = js.Dynamic.literal()
    if (sourceAsset != null) __obj.updateDynamic("sourceAsset")(sourceAsset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RemixInfo]
  }
}

