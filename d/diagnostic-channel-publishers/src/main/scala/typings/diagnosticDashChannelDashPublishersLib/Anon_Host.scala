package typings
package diagnosticDashChannelDashPublishersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(
    host: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    socketPath: java.lang.String = null
  ): Anon_Host = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    __obj.asInstanceOf[Anon_Host]
  }
}

