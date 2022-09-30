package typings.expoDevServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorProxyAny extends StObject {
  
  var InspectorProxy: Any
}
object InspectorProxyAny {
  
  inline def apply(InspectorProxy: Any): InspectorProxyAny = {
    val __obj = js.Dynamic.literal(InspectorProxy = InspectorProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorProxyAny]
  }
  
  extension [Self <: InspectorProxyAny](x: Self) {
    
    inline def setInspectorProxy(value: Any): Self = StObject.set(x, "InspectorProxy", value.asInstanceOf[js.Any])
  }
}
