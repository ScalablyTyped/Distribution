package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brightness extends js.Object {
  /**
  			 * Value to brighten the image up (0..255)
  			 * @default 0
  			 */
  var brightness: scala.Double
}

object Anon_Brightness {
  @scala.inline
  def apply(brightness: scala.Double): Anon_Brightness = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("brightness")(brightness)
    __obj.asInstanceOf[Anon_Brightness]
  }
}

