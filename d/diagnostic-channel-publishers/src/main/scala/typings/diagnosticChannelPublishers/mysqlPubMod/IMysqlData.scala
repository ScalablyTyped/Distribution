package typings.diagnosticChannelPublishers.mysqlPubMod

import typings.diagnosticChannelPublishers.anon.Connection
import typings.std.Date
import typings.std.Error
import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMysqlData extends js.Object {
  var callbackArgs: IArguments
  var duration: Double
  var err: Error
  var query: Connection
  var time: Date
}

object IMysqlData {
  @scala.inline
  def apply(callbackArgs: IArguments, duration: Double, err: Error, query: Connection, time: Date): IMysqlData = {
    val __obj = js.Dynamic.literal(callbackArgs = callbackArgs.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMysqlData]
  }
}

