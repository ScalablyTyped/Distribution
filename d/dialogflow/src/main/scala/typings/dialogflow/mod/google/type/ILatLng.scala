package typings.dialogflow.mod.google.`type`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a LatLng. */
trait ILatLng extends js.Object {
  /** LatLng latitude */
  var latitude: js.UndefOr[Double | Null] = js.undefined
  /** LatLng longitude */
  var longitude: js.UndefOr[Double | Null] = js.undefined
}

object ILatLng {
  @scala.inline
  def apply(
    latitude: js.UndefOr[Null | Double] = js.undefined,
    longitude: js.UndefOr[Null | Double] = js.undefined
  ): ILatLng = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILatLng]
  }
}

