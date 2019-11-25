package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.DescriptorProto

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
  def apply(end: Int | Double = null, start: Int | Double = null): IReservedRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReservedRange]
  }
}

