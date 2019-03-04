package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addr extends js.Object {
  var Addr: java.lang.String
  var Cpus: scala.Double
  var ID: java.lang.String
  var IP: java.lang.String
  var Labels: js.Any
  var Memory: scala.Double
  var Name: java.lang.String
}

object Anon_Addr {
  @scala.inline
  def apply(
    Addr: java.lang.String,
    Cpus: scala.Double,
    ID: java.lang.String,
    IP: java.lang.String,
    Labels: js.Any,
    Memory: scala.Double,
    Name: java.lang.String
  ): Anon_Addr = {
    val __obj = js.Dynamic.literal(Addr = Addr, Cpus = Cpus, ID = ID, IP = IP, Labels = Labels, Memory = Memory, Name = Name)
  
    __obj.asInstanceOf[Anon_Addr]
  }
}

