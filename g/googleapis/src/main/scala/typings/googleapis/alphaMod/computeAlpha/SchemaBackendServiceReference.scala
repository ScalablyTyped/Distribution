package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServiceReference extends StObject {
  
  var backendService: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackendServiceReference {
  
  inline def apply(): SchemaBackendServiceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceReference]
  }
  
  extension [Self <: SchemaBackendServiceReference](x: Self) {
    
    inline def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    inline def setBackendServiceNull: Self = StObject.set(x, "backendService", null)
    
    inline def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
  }
}
