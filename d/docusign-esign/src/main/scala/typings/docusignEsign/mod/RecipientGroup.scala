package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientGroup extends StObject {
  
  /**
    * The group message, typically a description of the group.
    */
  var groupMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the group
    */
  var groupName: js.UndefOr[String] = js.undefined
  
  /**
    * An array of recipient objects that provides details about the recipients of the envelope.
    */
  var recipients: js.UndefOr[js.Array[RecipientOption]] = js.undefined
}
object RecipientGroup {
  
  inline def apply(): RecipientGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientGroup]
  }
  
  extension [Self <: RecipientGroup](x: Self) {
    
    inline def setGroupMessage(value: String): Self = StObject.set(x, "groupMessage", value.asInstanceOf[js.Any])
    
    inline def setGroupMessageUndefined: Self = StObject.set(x, "groupMessage", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setRecipients(value: js.Array[RecipientOption]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    inline def setRecipientsVarargs(value: RecipientOption*): Self = StObject.set(x, "recipients", js.Array(value*))
  }
}
