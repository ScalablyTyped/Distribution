package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.dxFunnelItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Percent extends StObject {
  
  var item: js.UndefOr[dxFunnelItem] = js.native
  
  var percent: js.UndefOr[Double] = js.native
  
  var percentText: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
  
  var valueText: js.UndefOr[String] = js.native
}
object Percent {
  
  @scala.inline
  def apply(): Percent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Percent]
  }
  
  @scala.inline
  implicit class PercentMutableBuilder[Self <: Percent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: dxFunnelItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentText(value: String): Self = StObject.set(x, "percentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentTextUndefined: Self = StObject.set(x, "percentText", js.undefined)
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
