package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPoint extends js.Object {
  var altitude: js.UndefOr[stdLib.Number] = js.undefined
  var latitude: js.UndefOr[stdLib.Number] = js.undefined
  var longitude: js.UndefOr[stdLib.Number] = js.undefined
}

object GeoPoint {
  @scala.inline
  def apply(altitude: stdLib.Number = null, latitude: stdLib.Number = null, longitude: stdLib.Number = null): GeoPoint = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude)
    if (longitude != null) __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[GeoPoint]
  }
}

