package typings.diagnosticDashChannelDashPublishers.distSrcMysqlDotPubMod

import typings.diagnosticDashChannelDashPublishers.Anon_Connection
import typings.std.Error
import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMysqlData extends js.Object {
  var callbackArgs: IArguments
  var duration: Double
  var err: Error
  var query: Anon_Connection
}

object IMysqlData {
  @scala.inline
  def apply(callbackArgs: IArguments, duration: Double, err: Error, query: Anon_Connection): IMysqlData = {
    val __obj = js.Dynamic.literal(callbackArgs = callbackArgs, duration = duration, err = err, query = query)
  
    __obj.asInstanceOf[IMysqlData]
  }
}

