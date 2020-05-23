package typings.googleGax.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encode extends js.Object {
  def encode(obj: js.Object): Finish
}

object Encode {
  @scala.inline
  def apply(encode: js.Object => Finish): Encode = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[Encode]
  }
}

