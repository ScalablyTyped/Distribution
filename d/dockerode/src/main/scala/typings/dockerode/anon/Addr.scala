package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addr extends StObject {
  
  var Addr: String
  
  var Cpus: Double
  
  var ID: String
  
  var IP: String
  
  var Labels: Any
  
  var Memory: Double
  
  var Name: String
}
object Addr {
  
  inline def apply(Addr: String, Cpus: Double, ID: String, IP: String, Labels: Any, Memory: Double, Name: String): Addr = {
    val __obj = js.Dynamic.literal(Addr = Addr.asInstanceOf[js.Any], Cpus = Cpus.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IP = IP.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Memory = Memory.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Addr] (val x: Self) extends AnyVal {
    
    inline def setAddr(value: String): Self = StObject.set(x, "Addr", value.asInstanceOf[js.Any])
    
    inline def setCpus(value: Double): Self = StObject.set(x, "Cpus", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: Any): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setMemory(value: Double): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
