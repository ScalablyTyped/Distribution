package typings
package diagnosticDashChannelDashPublishersLib.distSrcMysqlDotPubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMysqlData extends js.Object {
  var callbackArgs: stdLib.IArguments
  var duration: scala.Double
  var err: stdLib.Error
  var query: diagnosticDashChannelDashPublishersLib.Anon_Connection
}

object IMysqlData {
  @scala.inline
  def apply(
    callbackArgs: stdLib.IArguments,
    duration: scala.Double,
    err: stdLib.Error,
    query: diagnosticDashChannelDashPublishersLib.Anon_Connection
  ): IMysqlData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbackArgs")(callbackArgs)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("err")(err)
    __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[IMysqlData]
  }
}

