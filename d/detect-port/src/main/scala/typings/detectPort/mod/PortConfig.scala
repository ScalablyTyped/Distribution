package typings.detectPort.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortConfig extends js.Object {
  var callback: js.UndefOr[DetectPortCallback] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var port: Double
}

object PortConfig {
  @scala.inline
  def apply(
    port: Double,
    callback: (/* err */ Error, /* _port */ Double) => Unit = null,
    hostname: String = null
  ): PortConfig = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortConfig]
  }
}

