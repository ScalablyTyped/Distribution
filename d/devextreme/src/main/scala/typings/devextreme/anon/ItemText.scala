package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.BarGaugeBarInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemText extends StObject {
  
  var item: js.UndefOr[BarGaugeBarInfo] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object ItemText {
  
  @scala.inline
  def apply(): ItemText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemText]
  }
  
  @scala.inline
  implicit class ItemTextMutableBuilder[Self <: ItemText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: BarGaugeBarInfo): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
