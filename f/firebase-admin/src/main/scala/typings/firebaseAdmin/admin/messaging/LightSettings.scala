package typings.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents settings to control notification LED that can be included in
  * {@link admin.messaging.AndroidNotification}.
  */
trait LightSettings extends js.Object {
  /**
    * Required. Sets color of the LED in `#rrggbb` or `#rrggbbaa` format.
    */
  var color: String
  /**
    * Required. Along with `light_on_duration`, defines the blink rate of LED flashes.
    */
  var lightOffDurationMillis: Double
  /**
    * Required. Along with `light_off_duration`, defines the blink rate of LED flashes.
    */
  var lightOnDurationMillis: Double
}

object LightSettings {
  @scala.inline
  def apply(color: String, lightOffDurationMillis: Double, lightOnDurationMillis: Double): LightSettings = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], lightOffDurationMillis = lightOffDurationMillis.asInstanceOf[js.Any], lightOnDurationMillis = lightOnDurationMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSettings]
  }
}

