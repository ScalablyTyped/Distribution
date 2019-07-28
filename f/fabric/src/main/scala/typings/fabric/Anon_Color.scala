package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  /**
  			 * Color to multiply the image pixels with
  			 * @default #000000
  			 */
  var color: String
}

object Anon_Color {
  @scala.inline
  def apply(color: String): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color)
  
    __obj.asInstanceOf[Anon_Color]
  }
}

