package typings.googleCloudPreciseDate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtobufDate extends js.Object {
  var nanos: js.UndefOr[Double | String] = js.undefined
  var seconds: js.UndefOr[Double | String | Long] = js.undefined
}

object ProtobufDate {
  @scala.inline
  def apply(nanos: Double | String = null, seconds: Double | String | Long = null): ProtobufDate = {
    val __obj = js.Dynamic.literal()
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtobufDate]
  }
}

