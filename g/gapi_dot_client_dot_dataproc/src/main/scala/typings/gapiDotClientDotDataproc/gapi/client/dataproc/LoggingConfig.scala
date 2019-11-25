package typings.gapiDotClientDotDataproc.gapi.client.dataproc

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingConfig extends js.Object {
  /**
    * The per-package log levels for the driver. This may include "root" package name to configure rootLogger. Examples:  'com.google = FATAL', 'root =
    * INFO', 'org.apache = DEBUG'
    */
  var driverLogLevels: js.UndefOr[Record[String, String]] = js.undefined
}

object LoggingConfig {
  @scala.inline
  def apply(driverLogLevels: Record[String, String] = null): LoggingConfig = {
    val __obj = js.Dynamic.literal()
    if (driverLogLevels != null) __obj.updateDynamic("driverLogLevels")(driverLogLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfig]
  }
}

