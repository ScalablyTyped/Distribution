package typings.googleDdns.mod

import typings.googleDdns.googleDdnsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOptions extends DynamicDNSOptions {
  /**
    * The number of seconds between updates.
    */
  var checkInterval: js.UndefOr[Double] = js.native
  /**
    * Whether to stop the service if the maximum number of consecutive
    * errors is reached.
    */
  var exitOnMaxErrors: js.UndefOr[Boolean] = js.native
  /**
    * The path of the log file to output to. Set to `false` to disable
    * logging to file.
    */
  var logPath: js.UndefOr[String | `false`] = js.native
  /**
    * Whether to log output to the console.
    */
  var logToConsole: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of consecutive errors before stopping the service
    * if `exitOnMaxErrors` is `true`.
    */
  var maxConsecutiveErrors: js.UndefOr[Double] = js.native
}

object ServiceOptions {
  @scala.inline
  def apply(hostname: String, password: String, username: String): ServiceOptions = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOptions]
  }
  @scala.inline
  implicit class ServiceOptionsOps[Self <: ServiceOptions] (val x: Self) extends AnyVal {
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
    def setCheckInterval(value: Double): Self = this.set("checkInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckInterval: Self = this.set("checkInterval", js.undefined)
    @scala.inline
    def setExitOnMaxErrors(value: Boolean): Self = this.set("exitOnMaxErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitOnMaxErrors: Self = this.set("exitOnMaxErrors", js.undefined)
    @scala.inline
    def setLogPath(value: String | `false`): Self = this.set("logPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogPath: Self = this.set("logPath", js.undefined)
    @scala.inline
    def setLogToConsole(value: Boolean): Self = this.set("logToConsole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogToConsole: Self = this.set("logToConsole", js.undefined)
    @scala.inline
    def setMaxConsecutiveErrors(value: Double): Self = this.set("maxConsecutiveErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConsecutiveErrors: Self = this.set("maxConsecutiveErrors", js.undefined)
  }
  
}

