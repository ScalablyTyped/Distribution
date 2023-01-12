package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalRecipientRule extends StObject {
  
  /**
    * An array of conditions that satisfy the rule.
    */
  var conditions: js.UndefOr[js.Array[ConditionalRecipientRuleCondition]] = js.undefined
  
  /**
    * An integer that specifies the order in which rules are processed. Lower values are processed before higher values.
    */
  var order: js.UndefOr[String] = js.undefined
  
  var recipientGroup: js.UndefOr[RecipientGroup] = js.undefined
  
  /**
    * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
    */
  var recipientId: js.UndefOr[String] = js.undefined
}
object ConditionalRecipientRule {
  
  inline def apply(): ConditionalRecipientRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRecipientRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalRecipientRule] (val x: Self) extends AnyVal {
    
    inline def setConditions(value: js.Array[ConditionalRecipientRuleCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: ConditionalRecipientRuleCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRecipientGroup(value: RecipientGroup): Self = StObject.set(x, "recipientGroup", value.asInstanceOf[js.Any])
    
    inline def setRecipientGroupUndefined: Self = StObject.set(x, "recipientGroup", js.undefined)
    
    inline def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
  }
}
