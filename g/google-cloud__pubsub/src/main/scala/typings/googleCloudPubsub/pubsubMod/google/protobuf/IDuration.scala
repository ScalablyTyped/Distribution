package typings.googleCloudPubsub.pubsubMod.google.protobuf

import typings.long.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Duration. */
trait IDuration extends js.Object {
  /** Duration nanos */
  var nanos: js.UndefOr[Double | Null] = js.undefined
  /** Duration seconds */
  var seconds: js.UndefOr[Double | Long | Null] = js.undefined
}

object IDuration {
  @scala.inline
  def apply(
    nanos: js.UndefOr[Null | Double] = js.undefined,
    seconds: js.UndefOr[Null | Double | Long] = js.undefined
  ): IDuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nanos)) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (!js.isUndefined(seconds)) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDuration]
  }
}

