package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorString extends js.Object {
  /**
    * Color to multiply the image pixels with
    * @default #000000
    */
  var color: String
}

object ColorString {
  @scala.inline
  def apply(color: String): ColorString = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorString]
  }
}

