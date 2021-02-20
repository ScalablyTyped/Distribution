package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Addr extends StObject {
  
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
  implicit class AddrMutableBuilder[Self <: Addr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddr(value: String): Self = StObject.set(x, "Addr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpus(value: Double): Self = StObject.set(x, "Cpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Any): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: Double): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
