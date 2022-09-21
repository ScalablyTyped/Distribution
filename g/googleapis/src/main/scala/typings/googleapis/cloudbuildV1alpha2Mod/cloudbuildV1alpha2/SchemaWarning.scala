package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWarning extends StObject {
  
  /**
    * The priority for this warning.
    */
  var priority: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Explanation of the warning generated.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaWarning {
  
  inline def apply(): SchemaWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWarning]
  }
  
  extension [Self <: SchemaWarning](x: Self) {
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
