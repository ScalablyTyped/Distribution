package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Brightness extends js.Object {
  /**
    * Value to brighten the image up (0..255)
    * @default 0
    */
  var brightness: Double
}

object Brightness {
  @scala.inline
  def apply(brightness: Double): Brightness = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brightness]
  }
}

