package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntRange extends StObject {
  
  /**
    * Max value of the int parameter.
    */
  var max: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Min value of the int parameter.
    */
  var min: js.UndefOr[String | Null] = js.undefined
}
object SchemaIntRange {
  
  inline def apply(): SchemaIntRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntRange]
  }
  
  extension [Self <: SchemaIntRange](x: Self) {
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxNull: Self = StObject.set(x, "max", null)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinNull: Self = StObject.set(x, "min", null)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
