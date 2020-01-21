package typings.googleGax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncode extends js.Object {
  def encode(obj: js.Object): AnonFinish
}

object AnonEncode {
  @scala.inline
  def apply(encode: js.Object => AnonFinish): AnonEncode = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[AnonEncode]
  }
}

