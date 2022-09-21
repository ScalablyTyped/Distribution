package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoutersScopedList extends StObject {
  
  /**
    * A list of routers contained in this scope.
    */
  var routers: js.UndefOr[js.Array[SchemaRouter]] = js.undefined
  
  /**
    * Informational warning which replaces the list of routers when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaRoutersScopedList {
  
  inline def apply(): SchemaRoutersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoutersScopedList]
  }
  
  extension [Self <: SchemaRoutersScopedList](x: Self) {
    
    inline def setRouters(value: js.Array[SchemaRouter]): Self = StObject.set(x, "routers", value.asInstanceOf[js.Any])
    
    inline def setRoutersUndefined: Self = StObject.set(x, "routers", js.undefined)
    
    inline def setRoutersVarargs(value: SchemaRouter*): Self = StObject.set(x, "routers", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
