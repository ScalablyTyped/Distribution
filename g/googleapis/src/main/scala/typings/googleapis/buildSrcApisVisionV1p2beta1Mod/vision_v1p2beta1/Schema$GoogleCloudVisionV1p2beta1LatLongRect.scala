package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rectangle determined by min and max `LatLng` pairs.
  */
@js.native
trait Schema$GoogleCloudVisionV1p2beta1LatLongRect extends js.Object {
  /**
    * Max lat/long pair.
    */
  var maxLatLng: js.UndefOr[Schema$LatLng] = js.native
  /**
    * Min lat/long pair.
    */
  var minLatLng: js.UndefOr[Schema$LatLng] = js.native
}

object Schema$GoogleCloudVisionV1p2beta1LatLongRect {
  @scala.inline
  def apply(maxLatLng: Schema$LatLng = null, minLatLng: Schema$LatLng = null): Schema$GoogleCloudVisionV1p2beta1LatLongRect = {
    val __obj = js.Dynamic.literal()
    if (maxLatLng != null) __obj.updateDynamic("maxLatLng")(maxLatLng.asInstanceOf[js.Any])
    if (minLatLng != null) __obj.updateDynamic("minLatLng")(minLatLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p2beta1LatLongRect]
  }
}

