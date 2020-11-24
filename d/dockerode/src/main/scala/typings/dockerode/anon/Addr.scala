package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Addr extends js.Object {
  
  var Addr: String = js.native
  
  var Cpus: Double = js.native
  
  var ID: String = js.native
  
  var IP: String = js.native
  
  var Labels: js.Any = js.native
  
  var Memory: Double = js.native
  
  var Name: String = js.native
}
object Addr {
  
  @scala.inline
  def apply(Addr: String, Cpus: Double, ID: String, IP: String, Labels: js.Any, Memory: Double, Name: String): Addr = {
    val __obj = js.Dynamic.literal(Addr = Addr.asInstanceOf[js.Any], Cpus = Cpus.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IP = IP.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Memory = Memory.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addr]
  }
  
  @scala.inline
  implicit class AddrOps[Self <: Addr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddr(value: String): Self = this.set("Addr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpus(value: Double): Self = this.set("Cpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIP(value: String): Self = this.set("IP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Any): Self = this.set("Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: Double): Self = this.set("Memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
