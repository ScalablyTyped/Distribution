package typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var accuracy: js.UndefOr[Double] = js.undefined
  var address: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[String] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    accuracy: Int | Double = null,
    address: String = null,
    displayName: String = null,
    id: String = null,
    kind: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    timestamp: String = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[Location]
  }
}

