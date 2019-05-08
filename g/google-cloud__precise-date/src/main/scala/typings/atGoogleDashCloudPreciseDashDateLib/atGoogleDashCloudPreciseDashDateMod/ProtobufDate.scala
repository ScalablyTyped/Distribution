package typings
package atGoogleDashCloudPreciseDashDateLib.atGoogleDashCloudPreciseDashDateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtobufDate extends js.Object {
  var nanos: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var seconds: js.UndefOr[scala.Double | java.lang.String | Long] = js.undefined
}

object ProtobufDate {
  @scala.inline
  def apply(
    nanos: scala.Double | java.lang.String = null,
    seconds: scala.Double | java.lang.String | Long = null
  ): ProtobufDate = {
    val __obj = js.Dynamic.literal()
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtobufDate]
  }
}

