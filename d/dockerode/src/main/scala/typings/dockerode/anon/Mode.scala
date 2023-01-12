package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var Destination: String
  
  var Mode: String
  
  var Name: js.UndefOr[String] = js.undefined
  
  var Propagation: String
  
  var RW: Boolean
  
  var Source: String
}
object Mode {
  
  inline def apply(Destination: String, Mode: String, Propagation: String, RW: Boolean, Source: String): Mode = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Propagation = Propagation.asInstanceOf[js.Any], RW = RW.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: String): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPropagation(value: String): Self = StObject.set(x, "Propagation", value.asInstanceOf[js.Any])
    
    inline def setRW(value: Boolean): Self = StObject.set(x, "RW", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
