package typings.googleapis.buildSrcApisPolyV1Mod.poly_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data about the user&#39;s asset.
  */
@js.native
trait Schema$UserAsset extends js.Object {
  /**
    * An Asset.
    */
  var asset: js.UndefOr[Schema$Asset] = js.native
}

object Schema$UserAsset {
  @scala.inline
  def apply(asset: Schema$Asset = null): Schema$UserAsset = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserAsset]
  }
}

