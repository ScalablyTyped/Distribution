package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostIp extends js.Object {
  var HostIp: String
  var HostPort: String
}

object Anon_HostIp {
  @scala.inline
  def apply(HostIp: String, HostPort: String): Anon_HostIp = {
    val __obj = js.Dynamic.literal(HostIp = HostIp, HostPort = HostPort)
  
    __obj.asInstanceOf[Anon_HostIp]
  }
}

