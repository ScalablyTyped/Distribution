package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterInfo extends StObject {
  
  /**
    * Counter name.
    */
  var name: String
  
  /**
    * Counter value.
    */
  var value: integer
}
object CounterInfo {
  
  inline def apply(name: String, value: integer): CounterInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterInfo]
  }
  
  extension [Self <: CounterInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: integer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
