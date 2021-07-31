package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightIn extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var weightIn: js.UndefOr[Double] = js.undefined
  
  var weightOut: js.UndefOr[Double] = js.undefined
}
object WeightIn {
  
  @scala.inline
  def apply(): WeightIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeightIn]
  }
  
  @scala.inline
  implicit class WeightInMutableBuilder[Self <: WeightIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
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
