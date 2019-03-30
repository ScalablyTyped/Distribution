package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var accuracy: js.UndefOr[stdLib.Number] = js.undefined
  var address: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var latitude: js.UndefOr[stdLib.Number] = js.undefined
  var longitude: js.UndefOr[stdLib.Number] = js.undefined
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    accuracy: stdLib.Number = null,
    address: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    latitude: stdLib.Number = null,
    longitude: stdLib.Number = null,
    timestamp: java.lang.String = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy)
    if (address != null) __obj.updateDynamic("address")(address)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude)
    if (longitude != null) __obj.updateDynamic("longitude")(longitude)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[Location]
  }
}

