package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialReference extends js.Object {
  var wkid: js.UndefOr[Double] = js.undefined
  var wkt: js.UndefOr[String] = js.undefined
}

object SpatialReference {
  @scala.inline
  def apply(wkid: js.UndefOr[Double] = js.undefined, wkt: String = null): SpatialReference = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(wkid)) __obj.updateDynamic("wkid")(wkid.get.asInstanceOf[js.Any])
    if (wkt != null) __obj.updateDynamic("wkt")(wkt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialReference]
  }
}

