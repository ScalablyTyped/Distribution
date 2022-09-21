package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserFacingMessage extends StObject {
  
  /**
    * The default message displayed if no localized message is specified or the user's locale doesn't match with any of the localized messages. A default message must be provided if any localized messages are provided.
    */
  var defaultMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A map containing pairs, where locale is a well-formed BCP 47 language (https://www.w3.org/International/articles/language-tags/) code, such as en-US, es-ES, or fr.
    */
  var localizedMessages: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaUserFacingMessage {
  
  inline def apply(): SchemaUserFacingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserFacingMessage]
  }
  
  extension [Self <: SchemaUserFacingMessage](x: Self) {
    
    inline def setDefaultMessage(value: String): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageNull: Self = StObject.set(x, "defaultMessage", null)
    
    inline def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
    
    inline def setLocalizedMessages(value: StringDictionary[String]): Self = StObject.set(x, "localizedMessages", value.asInstanceOf[js.Any])
    
    inline def setLocalizedMessagesNull: Self = StObject.set(x, "localizedMessages", null)
    
    inline def setLocalizedMessagesUndefined: Self = StObject.set(x, "localizedMessages", js.undefined)
  }
}
