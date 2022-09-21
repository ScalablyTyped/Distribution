package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoubleRange extends StObject {
  
  /**
    * Max value of the double parameter.
    */
  var max: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Min value of the double parameter.
    */
  var min: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDoubleRange {
  
  inline def apply(): SchemaDoubleRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleRange]
  }
  
  extension [Self <: SchemaDoubleRange](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxNull: Self = StObject.set(x, "max", null)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinNull: Self = StObject.set(x, "min", null)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
