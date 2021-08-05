package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeCallCounterInfo extends StObject {
  
  /**
    * Counter name.
    */
  var name: String
  
  /**
    * Counter time in seconds.
    */
  var time: Double
  
  /**
    * Counter value.
    */
  var value: Double
}
object RuntimeCallCounterInfo {
  
  inline def apply(name: String, time: Double, value: Double): RuntimeCallCounterInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeCallCounterInfo]
  }
  
  extension [Self <: RuntimeCallCounterInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
