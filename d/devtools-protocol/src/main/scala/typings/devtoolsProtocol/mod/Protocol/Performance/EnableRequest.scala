package typings.devtoolsProtocol.mod.Protocol.Performance

import typings.devtoolsProtocol.devtoolsProtocolStrings.threadTicks
import typings.devtoolsProtocol.devtoolsProtocolStrings.timeTicks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableRequest extends js.Object {
  /**
    * Time domain to use for collecting and reporting duration metrics. (EnableRequestTimeDomain enum)
    */
  var timeDomain: js.UndefOr[timeTicks | threadTicks] = js.native
}

object EnableRequest {
  @scala.inline
  def apply(): EnableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableRequest]
  }
  @scala.inline
  implicit class EnableRequestOps[Self <: EnableRequest] (val x: Self) extends AnyVal {
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
    def setTimeDomain(value: timeTicks | threadTicks): Self = this.set("timeDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeDomain: Self = this.set("timeDomain", js.undefined)
  }
  
}

