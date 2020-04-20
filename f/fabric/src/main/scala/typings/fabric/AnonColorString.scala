package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorString extends js.Object {
  /**
  			 * Color to multiply the image pixels with
  			 * @default #000000
  			 */
  var color: String
}

object AnonColorString {
  @scala.inline
  def apply(color: String): AnonColorString = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorString]
  }
}

