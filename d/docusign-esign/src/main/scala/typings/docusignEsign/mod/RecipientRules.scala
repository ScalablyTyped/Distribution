package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientRules extends StObject {
  
  var conditionalRecipients: js.UndefOr[js.Array[ConditionalRecipientRule]] = js.undefined
}
object RecipientRules {
  
  inline def apply(): RecipientRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientRules] (val x: Self) extends AnyVal {
    
    inline def setConditionalRecipients(value: js.Array[ConditionalRecipientRule]): Self = StObject.set(x, "conditionalRecipients", value.asInstanceOf[js.Any])
    
    inline def setConditionalRecipientsUndefined: Self = StObject.set(x, "conditionalRecipients", js.undefined)
    
    inline def setConditionalRecipientsVarargs(value: ConditionalRecipientRule*): Self = StObject.set(x, "conditionalRecipients", js.Array(value*))
  }
}
