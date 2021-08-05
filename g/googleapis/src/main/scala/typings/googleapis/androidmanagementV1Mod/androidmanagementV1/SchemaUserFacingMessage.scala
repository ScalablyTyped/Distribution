package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a user-facing message with locale info. The maximum message length
  * is 4096 characters.
  */
trait SchemaUserFacingMessage extends StObject {
  
  /**
    * The default message displayed if no localized message is specified or the
    * user&#39;s locale doesn&#39;t match with any of the localized messages. A
    * default message must be provided if any localized messages are provided.
    */
  var defaultMessage: js.UndefOr[String] = js.undefined
  
  /**
    * A map containing &lt;locale, message&gt; pairs, where locale is a
    * well-formed BCP 47 language
    * (https://www.w3.org/International/articles/language-tags/) code, such as
    * en-US, es-ES, or fr.
    */
  var localizedMessages: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaUserFacingMessage {
  
  inline def apply(): SchemaUserFacingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserFacingMessage]
  }
  
  extension [Self <: SchemaUserFacingMessage](x: Self) {
    
    inline def setDefaultMessage(value: String): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
    
    inline def setLocalizedMessages(value: StringDictionary[String]): Self = StObject.set(x, "localizedMessages", value.asInstanceOf[js.Any])
    
    inline def setLocalizedMessagesUndefined: Self = StObject.set(x, "localizedMessages", js.undefined)
  }
}
