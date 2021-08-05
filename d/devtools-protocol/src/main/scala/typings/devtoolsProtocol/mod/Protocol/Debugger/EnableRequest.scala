package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableRequest extends StObject {
  
  /**
    * The maximum size in bytes of collected scripts (not referenced by other heap objects)
    * the debugger can hold. Puts no limit if paramter is omitted.
    */
  var maxScriptsCacheSize: js.UndefOr[Double] = js.undefined
}
object EnableRequest {
  
  inline def apply(): EnableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableRequest]
  }
  
  extension [Self <: EnableRequest](x: Self) {
    
    inline def setMaxScriptsCacheSize(value: Double): Self = StObject.set(x, "maxScriptsCacheSize", value.asInstanceOf[js.Any])
    
    inline def setMaxScriptsCacheSizeUndefined: Self = StObject.set(x, "maxScriptsCacheSize", js.undefined)
  }
}
