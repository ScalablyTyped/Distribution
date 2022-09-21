package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalRecipientRuleFilter extends StObject {
  
  var operator: js.UndefOr[String] = js.undefined
  
  /**
    * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
    */
  var recipientId: js.UndefOr[String] = js.undefined
  
  /**
    * Must be set to "api".
    */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier for the tab.
    */
  var tabId: js.UndefOr[String] = js.undefined
  
  /**
    * The label associated with the tab. This value may be an empty string. If no value is provided, the tab type is used as the value.
    *
    * Maximum Length: 500 characters.
    */
  var tabLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the value of the tab.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ConditionalRecipientRuleFilter {
  
  inline def apply(): ConditionalRecipientRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRecipientRuleFilter]
  }
  
  extension [Self <: ConditionalRecipientRuleFilter](x: Self) {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setTabId(value: String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setTabLabel(value: String): Self = StObject.set(x, "tabLabel", value.asInstanceOf[js.Any])
    
    inline def setTabLabelUndefined: Self = StObject.set(x, "tabLabel", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
