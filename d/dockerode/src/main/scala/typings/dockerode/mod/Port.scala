package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Port extends js.Object {
  var IP: String
  var PrivatePort: Double
  var PublicPort: Double
  var Type: String
}

object Port {
  @scala.inline
  def apply(IP: String, PrivatePort: Double, PublicPort: Double, Type: String): Port = {
    val __obj = js.Dynamic.literal(IP = IP.asInstanceOf[js.Any], PrivatePort = PrivatePort.asInstanceOf[js.Any], PublicPort = PublicPort.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Port]
  }
}

