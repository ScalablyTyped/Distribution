package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfig extends js.Object {
  /** Counter options. */
  var counter: js.UndefOr[LogConfigCounterOptions] = js.native
}

object LogConfig {
  @scala.inline
  def apply(): LogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfig]
  }
  @scala.inline
  implicit class LogConfigOps[Self <: LogConfig] (val x: Self) extends AnyVal {
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
    def setCounter(value: LogConfigCounterOptions): Self = this.set("counter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
  }
  
}

