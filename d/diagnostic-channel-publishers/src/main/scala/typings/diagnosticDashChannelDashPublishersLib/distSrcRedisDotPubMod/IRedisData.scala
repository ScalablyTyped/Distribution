package typings
package diagnosticDashChannelDashPublishersLib.distSrcRedisDotPubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRedisData extends js.Object {
  var address: java.lang.String
  var commandObj: js.Any
  var duration: scala.Double
  var err: stdLib.Error
  var result: js.Any
}

object IRedisData {
  @scala.inline
  def apply(
    address: java.lang.String,
    commandObj: js.Any,
    duration: scala.Double,
    err: stdLib.Error,
    result: js.Any
  ): IRedisData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("commandObj")(commandObj)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("err")(err)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[IRedisData]
  }
}

