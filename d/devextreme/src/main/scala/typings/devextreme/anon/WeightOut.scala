package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightOut extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var weightIn: js.UndefOr[Double] = js.undefined
  
  var weightOut: js.UndefOr[Double] = js.undefined
}
object WeightOut {
  
  inline def apply(): WeightOut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeightOut]
  }
  
  extension [Self <: WeightOut](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setWeightIn(value: Double): Self = StObject.set(x, "weightIn", value.asInstanceOf[js.Any])
    
    inline def setWeightInUndefined: Self = StObject.set(x, "weightIn", js.undefined)
    
    inline def setWeightOut(value: Double): Self = StObject.set(x, "weightOut", value.asInstanceOf[js.Any])
    
    inline def setWeightOutUndefined: Self = StObject.set(x, "weightOut", js.undefined)
  }
}
