package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueValueText extends StObject {
  
  var value: js.UndefOr[typings.std.Date | Double | String] = js.native
  
  var valueText: js.UndefOr[String] = js.native
}
object ValueValueText {
  
  @scala.inline
  def apply(): ValueValueText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueValueText]
  }
  
  @scala.inline
  implicit class ValueValueTextMutableBuilder[Self <: ValueValueText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: typings.std.Date | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
