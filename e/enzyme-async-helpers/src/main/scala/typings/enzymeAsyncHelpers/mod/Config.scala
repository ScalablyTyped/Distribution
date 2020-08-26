package typings.enzymeAsyncHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var interval: js.UndefOr[Double] = js.native
   // Default: true, logs the wrapper's rendered structure when the wait times out. An attempt to help out in finding what's wrong.
  var logStructureOnSuccess: js.UndefOr[Boolean] = js.native
  var logStructureOnTimeout: js.UndefOr[Boolean] = js.native
   // Default: 50, how often to check for validity
  var timeout: js.UndefOr[Double] = js.native
   // Default: 2000 (2 seconds), how long to wait before timing out
  var timeoutMessage: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setLogStructureOnSuccess(value: Boolean): Self = this.set("logStructureOnSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogStructureOnSuccess: Self = this.set("logStructureOnSuccess", js.undefined)
    @scala.inline
    def setLogStructureOnTimeout(value: Boolean): Self = this.set("logStructureOnTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogStructureOnTimeout: Self = this.set("logStructureOnTimeout", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTimeoutMessage(value: String): Self = this.set("timeoutMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutMessage: Self = this.set("timeoutMessage", js.undefined)
  }
  
}

