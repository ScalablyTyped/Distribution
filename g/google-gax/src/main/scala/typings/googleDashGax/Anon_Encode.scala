package typings.googleDashGax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encode extends js.Object {
  def encode(obj: js.Object): Anon_Finish
}

object Anon_Encode {
  @scala.inline
  def apply(encode: js.Object => Anon_Finish): Anon_Encode = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[Anon_Encode]
  }
}

