package typings.googleCloudPubsub.protosMod.google.protobuf

import typings.long.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Timestamp. */
trait ITimestamp extends js.Object {
  /** Timestamp nanos */
  var nanos: js.UndefOr[Double | Null] = js.undefined
  /** Timestamp seconds */
  var seconds: js.UndefOr[Double | Long | String | Null] = js.undefined
}

object ITimestamp {
  @scala.inline
  def apply(
    nanos: js.UndefOr[Null | Double] = js.undefined,
    seconds: js.UndefOr[Null | Double | Long | String] = js.undefined
  ): ITimestamp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nanos)) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (!js.isUndefined(seconds)) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimestamp]
  }
}

