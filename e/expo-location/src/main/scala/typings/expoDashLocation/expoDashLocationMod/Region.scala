package typings.expoDashLocation.expoDashLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var identifier: js.UndefOr[String] = js.undefined
  var latitude: Double
  var longitude: Double
  var notifyOnEnter: js.UndefOr[Boolean] = js.undefined
  var notifyOnExit: js.UndefOr[Boolean] = js.undefined
  var radius: Double
}

object Region {
  @scala.inline
  def apply(
    latitude: Double,
    longitude: Double,
    radius: Double,
    identifier: String = null,
    notifyOnEnter: js.UndefOr[Boolean] = js.undefined,
    notifyOnExit: js.UndefOr[Boolean] = js.undefined
  ): Region = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (!js.isUndefined(notifyOnEnter)) __obj.updateDynamic("notifyOnEnter")(notifyOnEnter.asInstanceOf[js.Any])
    if (!js.isUndefined(notifyOnExit)) __obj.updateDynamic("notifyOnExit")(notifyOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
}

