package typings
package gapiDotClientDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Latitude extends js.Object {
  /** The latitude of this position. */
  var latitude: js.UndefOr[scala.Double] = js.undefined
  /** The longitude of this position. */
  var longitude: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Latitude {
  @scala.inline
  def apply(latitude: scala.Int | scala.Double = null, longitude: scala.Int | scala.Double = null): Anon_Latitude = {
    val __obj = js.Dynamic.literal()
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Latitude]
  }
}

