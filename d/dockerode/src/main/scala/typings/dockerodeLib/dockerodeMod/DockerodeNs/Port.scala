package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Port extends js.Object {
  var IP: java.lang.String
  var PrivatePort: scala.Double
  var PublicPort: scala.Double
  var Type: java.lang.String
}

object Port {
  @scala.inline
  def apply(IP: java.lang.String, PrivatePort: scala.Double, PublicPort: scala.Double, Type: java.lang.String): Port = {
    val __obj = js.Dynamic.literal(IP = IP, PrivatePort = PrivatePort, PublicPort = PublicPort, Type = Type)
  
    __obj.asInstanceOf[Port]
  }
}

