package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagersDeletePerInstanceConfigsReq extends StObject {
  
  /**
    * The list of instance names for which we want to delete per-instance configs on this managed instance group.
    */
  var names: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaInstanceGroupManagersDeletePerInstanceConfigsReq {
  
  inline def apply(): SchemaInstanceGroupManagersDeletePerInstanceConfigsReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersDeletePerInstanceConfigsReq]
  }
  
  extension [Self <: SchemaInstanceGroupManagersDeletePerInstanceConfigsReq](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesNull: Self = StObject.set(x, "names", null)
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
