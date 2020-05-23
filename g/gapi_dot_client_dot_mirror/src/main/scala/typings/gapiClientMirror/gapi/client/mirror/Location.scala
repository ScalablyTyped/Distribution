package typings.gapiClientMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /** The accuracy of the location fix in meters. */
  var accuracy: js.UndefOr[Double] = js.undefined
  /** The full address of the location. */
  var address: js.UndefOr[String] = js.undefined
  /** The name to be displayed. This may be a business name or a user-defined place, such as "Home". */
  var displayName: js.UndefOr[String] = js.undefined
  /** The ID of the location. */
  var id: js.UndefOr[String] = js.undefined
  /** The type of resource. This is always mirror#location. */
  var kind: js.UndefOr[String] = js.undefined
  /** The latitude, in degrees. */
  var latitude: js.UndefOr[Double] = js.undefined
  /** The longitude, in degrees. */
  var longitude: js.UndefOr[Double] = js.undefined
  /** The time at which this location was captured, formatted according to RFC 3339. */
  var timestamp: js.UndefOr[String] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    accuracy: js.UndefOr[Double] = js.undefined,
    address: String = null,
    displayName: String = null,
    id: String = null,
    kind: String = null,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    timestamp: String = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accuracy)) __obj.updateDynamic("accuracy")(accuracy.get.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

