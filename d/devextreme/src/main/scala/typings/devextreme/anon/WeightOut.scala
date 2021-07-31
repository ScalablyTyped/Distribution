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
  
  @scala.inline
  def apply(): WeightOut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeightOut]
  }
  
  @scala.inline
  implicit class WeightOutMutableBuilder[Self <: WeightOut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setWeightIn(value: Double): Self = StObject.set(x, "weightIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightInUndefined: Self = StObject.set(x, "weightIn", js.undefined)
    
    @scala.inline
    def setWeightOut(value: Double): Self = StObject.set(x, "weightOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightOutUndefined: Self = StObject.set(x, "weightOut", js.undefined)
  }
}
