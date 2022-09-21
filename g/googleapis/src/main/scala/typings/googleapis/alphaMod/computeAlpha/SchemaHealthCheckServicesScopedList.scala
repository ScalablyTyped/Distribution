package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHealthCheckServicesScopedList extends StObject {
  
  /**
    * A list of HealthCheckServices contained in this scope.
    */
  var resources: js.UndefOr[js.Array[SchemaHealthCheckService]] = js.undefined
  
  /**
    * Informational warning which replaces the list of backend services when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaHealthCheckServicesScopedList {
  
  inline def apply(): SchemaHealthCheckServicesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheckServicesScopedList]
  }
  
  extension [Self <: SchemaHealthCheckServicesScopedList](x: Self) {
    
    inline def setResources(value: js.Array[SchemaHealthCheckService]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaHealthCheckService*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
