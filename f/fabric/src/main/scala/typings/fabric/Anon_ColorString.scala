package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorString extends js.Object {
  /**
  			 * Color to multiply the image pixels with
  			 * @default #000000
  			 */
  var color: String
}

object Anon_ColorString {
  @scala.inline
  def apply(color: String): Anon_ColorString = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColorString]
  }
}

