package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalRecipientRuleCondition extends StObject {
  
  var filters: js.UndefOr[js.Array[ConditionalRecipientRuleFilter]] = js.undefined
  
  /**
    * An integer that specifies the order in which rules are processed. Lower values are processed before higher values.
    */
  var order: js.UndefOr[String] = js.undefined
  
  var recipientLabel: js.UndefOr[String] = js.undefined
}
object ConditionalRecipientRuleCondition {
  
  inline def apply(): ConditionalRecipientRuleCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRecipientRuleCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalRecipientRuleCondition] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: js.Array[ConditionalRecipientRuleFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ConditionalRecipientRuleFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRecipientLabel(value: String): Self = StObject.set(x, "recipientLabel", value.asInstanceOf[js.Any])
    
    inline def setRecipientLabelUndefined: Self = StObject.set(x, "recipientLabel", js.undefined)
  }
}
