package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrightness extends js.Object {
  /**
  			 * Value to brighten the image up (0..255)
  			 * @default 0
  			 */
  var brightness: Double
}

object AnonBrightness {
  @scala.inline
  def apply(brightness: Double): AnonBrightness = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBrightness]
  }
}

