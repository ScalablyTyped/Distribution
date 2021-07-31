package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalFormattingOptions extends StObject {
  
  var ref: String
  
  var rules: js.Array[ConditionalFormattingRule]
}
object ConditionalFormattingOptions {
  
  @scala.inline
  def apply(ref: String, rules: js.Array[ConditionalFormattingRule]): ConditionalFormattingOptions = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingOptions]
  }
  
  @scala.inline
  implicit class ConditionalFormattingOptionsMutableBuilder[Self <: ConditionalFormattingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: js.Array[ConditionalFormattingRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: ConditionalFormattingRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
