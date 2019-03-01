package typings
package diagnosticDashChannelDashPublishersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostPort extends js.Object {
  var host: java.lang.String
  var port: java.lang.String
}

object Anon_HostPort {
  @scala.inline
  def apply(host: java.lang.String, port: java.lang.String): Anon_HostPort = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[Anon_HostPort]
  }
}

