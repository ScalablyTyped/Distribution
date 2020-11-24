package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.dxFunnelItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Percent extends js.Object {
  
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
  implicit class PercentOps[Self <: Percent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItem(value: dxFunnelItem): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    
    @scala.inline
    def setPercentText(value: String): Self = this.set("percentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentText: Self = this.set("percentText", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueText(value: String): Self = this.set("valueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueText: Self = this.set("valueText", js.undefined)
  }
}
