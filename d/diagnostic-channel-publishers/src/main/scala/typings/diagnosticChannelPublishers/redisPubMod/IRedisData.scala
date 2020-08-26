package typings.diagnosticChannelPublishers.redisPubMod

import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRedisData extends js.Object {
  var address: String = js.native
  var commandObj: js.Any = js.native
  var duration: Double = js.native
  var err: Error = js.native
  var result: js.Any = js.native
  var time: Date = js.native
}

object IRedisData {
  @scala.inline
  def apply(address: String, commandObj: js.Any, duration: Double, err: Error, result: js.Any, time: Date): IRedisData = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commandObj = commandObj.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRedisData]
  }
  @scala.inline
  implicit class IRedisDataOps[Self <: IRedisData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandObj(value: js.Any): Self = this.set("commandObj", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setErr(value: Error): Self = this.set("err", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Date): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

