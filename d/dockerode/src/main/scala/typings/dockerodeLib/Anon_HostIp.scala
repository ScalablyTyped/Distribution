package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostIp extends js.Object {
  var HostIp: java.lang.String
  var HostPort: java.lang.String
}

object Anon_HostIp {
  @scala.inline
  def apply(HostIp: java.lang.String, HostPort: java.lang.String): Anon_HostIp = {
    val __obj = js.Dynamic.literal(HostIp = HostIp, HostPort = HostPort)
  
    __obj.asInstanceOf[Anon_HostIp]
  }
}

