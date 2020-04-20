package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddr extends js.Object {
  var Addr: String
  var Cpus: Double
  var ID: String
  var IP: String
  var Labels: js.Any
  var Memory: Double
  var Name: String
}

object AnonAddr {
  @scala.inline
  def apply(Addr: String, Cpus: Double, ID: String, IP: String, Labels: js.Any, Memory: Double, Name: String): AnonAddr = {
    val __obj = js.Dynamic.literal(Addr = Addr.asInstanceOf[js.Any], Cpus = Cpus.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IP = IP.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Memory = Memory.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddr]
  }
}

