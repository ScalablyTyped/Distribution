package typings.gapiClientDataproc.gapi.client.dataproc

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfig extends js.Object {
  /**
    * The per-package log levels for the driver. This may include "root" package name to configure rootLogger. Examples:  'com.google = FATAL', 'root =
    * INFO', 'org.apache = DEBUG'
    */
  var driverLogLevels: js.UndefOr[Record[String, String]] = js.native
}

object LoggingConfig {
  @scala.inline
  def apply(): LoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfig]
  }
  @scala.inline
  implicit class LoggingConfigOps[Self <: LoggingConfig] (val x: Self) extends AnyVal {
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
    def setDriverLogLevels(value: Record[String, String]): Self = this.set("driverLogLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriverLogLevels: Self = this.set("driverLogLevels", js.undefined)
  }
  
}

