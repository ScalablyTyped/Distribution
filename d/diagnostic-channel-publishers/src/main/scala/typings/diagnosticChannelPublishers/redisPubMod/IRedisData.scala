package typings.diagnosticChannelPublishers.redisPubMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRedisData extends js.Object {
  var address: String
  var commandObj: js.Any
  var duration: Double
  var err: Error
  var result: js.Any
}

object IRedisData {
  @scala.inline
  def apply(address: String, commandObj: js.Any, duration: Double, err: Error, result: js.Any): IRedisData = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commandObj = commandObj.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRedisData]
  }
}

