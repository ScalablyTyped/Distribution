package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brightness extends js.Object {
  /**
  			 * Value to brighten the image up (0..255)
  			 * @default 0
  			 */
  var brightness: Double
}

object Anon_Brightness {
  @scala.inline
  def apply(brightness: Double): Anon_Brightness = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Brightness]
  }
}

