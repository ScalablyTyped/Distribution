package typings.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ReservedRange. */
trait IReservedRange extends js.Object {
  /** ReservedRange end */
  var end: js.UndefOr[Double | Null] = js.undefined
  /** ReservedRange start */
  var start: js.UndefOr[Double | Null] = js.undefined
}

object IReservedRange {
  @scala.inline
  def apply(end: js.UndefOr[Null | Double] = js.undefined, start: js.UndefOr[Null | Double] = js.undefined): IReservedRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReservedRange]
  }
}

