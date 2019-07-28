package typings.diagnosticDashChannelDashPublishers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(host: String = null, port: Int | Double = null, socketPath: String = null): Anon_Host = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    __obj.asInstanceOf[Anon_Host]
  }
}

