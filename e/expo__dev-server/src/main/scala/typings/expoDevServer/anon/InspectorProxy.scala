package typings.expoDevServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectorProxy extends StObject {
  
  var inspectorProxy: Any
}
object InspectorProxy {
  
  inline def apply(inspectorProxy: Any): InspectorProxy = {
    val __obj = js.Dynamic.literal(inspectorProxy = inspectorProxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorProxy]
  }
  
  extension [Self <: InspectorProxy](x: Self) {
    
    inline def setInspectorProxy(value: Any): Self = StObject.set(x, "inspectorProxy", value.asInstanceOf[js.Any])
  }
}
