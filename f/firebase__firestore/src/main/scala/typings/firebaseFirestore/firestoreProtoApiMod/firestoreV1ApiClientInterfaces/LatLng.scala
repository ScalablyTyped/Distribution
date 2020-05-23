package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLng extends js.Object {
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
}

object LatLng {
  @scala.inline
  def apply(latitude: js.UndefOr[Double] = js.undefined, longitude: js.UndefOr[Double] = js.undefined): LatLng = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLng]
  }
}

