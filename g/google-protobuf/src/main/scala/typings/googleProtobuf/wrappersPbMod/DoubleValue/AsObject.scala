package typings.googleProtobuf.wrappersPbMod.DoubleValue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var value: Double
}

object AsObject {
  @scala.inline
  def apply(value: Double): AsObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

