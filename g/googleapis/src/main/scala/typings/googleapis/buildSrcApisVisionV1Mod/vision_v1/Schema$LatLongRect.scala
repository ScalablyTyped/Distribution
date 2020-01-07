package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rectangle determined by min and max `LatLng` pairs.
  */
@js.native
trait Schema$LatLongRect extends js.Object {
  /**
    * Max lat/long pair.
    */
  var maxLatLng: js.UndefOr[Schema$LatLng] = js.native
  /**
    * Min lat/long pair.
    */
  var minLatLng: js.UndefOr[Schema$LatLng] = js.native
}

object Schema$LatLongRect {
  @scala.inline
  def apply(maxLatLng: Schema$LatLng = null, minLatLng: Schema$LatLng = null): Schema$LatLongRect = {
    val __obj = js.Dynamic.literal()
    if (maxLatLng != null) __obj.updateDynamic("maxLatLng")(maxLatLng.asInstanceOf[js.Any])
    if (minLatLng != null) __obj.updateDynamic("minLatLng")(minLatLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LatLongRect]
  }
}

