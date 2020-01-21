package typings.expoLocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocationServicesEnabled extends js.Object {
  var locationServicesEnabled: Boolean
}

object AnonLocationServicesEnabled {
  @scala.inline
  def apply(locationServicesEnabled: Boolean): AnonLocationServicesEnabled = {
    val __obj = js.Dynamic.literal(locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocationServicesEnabled]
  }
}

