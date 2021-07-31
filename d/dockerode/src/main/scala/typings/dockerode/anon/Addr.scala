package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addr extends StObject {
  
  var Addr: String
  
  var Cpus: Double
  
  var ID: String
  
  var IP: String
  
  var Labels: js.Any
  
  var Memory: Double
  
  var Name: String
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
