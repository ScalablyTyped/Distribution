package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotificationEndpointsScopedList extends StObject {
  
  /**
    * A list of NotificationEndpoints contained in this scope.
    */
  var resources: js.UndefOr[js.Array[SchemaNotificationEndpoint]] = js.undefined
  
  /**
    * Informational warning which replaces the list of notification endpoints when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaNotificationEndpointsScopedList {
  
  inline def apply(): SchemaNotificationEndpointsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationEndpointsScopedList]
  }
  
  extension [Self <: SchemaNotificationEndpointsScopedList](x: Self) {
    
    inline def setResources(value: js.Array[SchemaNotificationEndpoint]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaNotificationEndpoint*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
