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
  def apply(latitude: Int | Double = null, longitude: Int | Double = null): ILatLng = {
    val __obj = js.Dynamic.literal()
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILatLng]
  }
}

