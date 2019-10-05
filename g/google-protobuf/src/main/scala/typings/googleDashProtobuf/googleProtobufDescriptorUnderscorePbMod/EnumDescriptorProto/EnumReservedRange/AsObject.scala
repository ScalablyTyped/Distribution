package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto.EnumReservedRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(end: Int | Double = null, start: Int | Double = null): AsObject = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

