package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalFormattingBaseRule extends StObject {
  
  var priority: Double = js.native
  
  var style: js.UndefOr[PartialStyle] = js.native
}
object ConditionalFormattingBaseRule {
  
  @scala.inline
  def apply(priority: Double): ConditionalFormattingBaseRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingBaseRule]
  }
  
  @scala.inline
  implicit class ConditionalFormattingBaseRuleMutableBuilder[Self <: ConditionalFormattingBaseRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: PartialStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
