package typings.dialogflow.protosProtosMod.google.protobuf.EnumDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EnumReservedRange. */
trait IEnumReservedRange extends js.Object {
  /** EnumReservedRange end */
  var end: js.UndefOr[Double | Null] = js.undefined
  /** EnumReservedRange start */
  var start: js.UndefOr[Double | Null] = js.undefined
}

object IEnumReservedRange {
  @scala.inline
  def apply(end: Int | Double = null, start: Int | Double = null): IEnumReservedRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnumReservedRange]
  }
}

