package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueText extends StObject {
  
  var value: js.UndefOr[Double] = js.native
  
  var valueText: js.UndefOr[String] = js.native
}
object ValueText {
  
  @scala.inline
  def apply(): ValueText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueText]
  }
  
  @scala.inline
  implicit class ValueTextMutableBuilder[Self <: ValueText] (val x: Self) extends AnyVal {
    
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
