package typings.googleCloudPubsub.pubsubMod.google.protobuf.EnumDescriptorProto

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
  def apply(end: js.UndefOr[Null | Double] = js.undefined, start: js.UndefOr[Null | Double] = js.undefined): IEnumReservedRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnumReservedRange]
  }
}

