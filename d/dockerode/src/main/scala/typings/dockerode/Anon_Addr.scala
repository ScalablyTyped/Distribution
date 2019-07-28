package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addr extends js.Object {
  var Addr: String
  var Cpus: Double
  var ID: String
  var IP: String
  var Labels: js.Any
  var Memory: Double
  var Name: String
}

object Anon_Addr {
  @scala.inline
  def apply(Addr: String, Cpus: Double, ID: String, IP: String, Labels: js.Any, Memory: Double, Name: String): Anon_Addr = {
    val __obj = js.Dynamic.literal(Addr = Addr, Cpus = Cpus, ID = ID, IP = IP, Labels = Labels, Memory = Memory, Name = Name)
  
    __obj.asInstanceOf[Anon_Addr]
  }
}

