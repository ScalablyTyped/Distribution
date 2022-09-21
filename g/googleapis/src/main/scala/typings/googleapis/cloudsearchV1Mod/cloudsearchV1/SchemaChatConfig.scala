package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChatConfig extends StObject {
  
  /**
    * The Type of chat this Conference is currently using.
    */
  var chatType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The configuration of Google Chat when selected.
    */
  var googleChatConfig: js.UndefOr[SchemaGoogleChatConfig] = js.undefined
}
object SchemaChatConfig {
  
  inline def apply(): SchemaChatConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChatConfig]
  }
  
  extension [Self <: SchemaChatConfig](x: Self) {
    
    inline def setChatType(value: String): Self = StObject.set(x, "chatType", value.asInstanceOf[js.Any])
    
    inline def setChatTypeNull: Self = StObject.set(x, "chatType", null)
    
    inline def setChatTypeUndefined: Self = StObject.set(x, "chatType", js.undefined)
    
    inline def setGoogleChatConfig(value: SchemaGoogleChatConfig): Self = StObject.set(x, "googleChatConfig", value.asInstanceOf[js.Any])
    
    inline def setGoogleChatConfigUndefined: Self = StObject.set(x, "googleChatConfig", js.undefined)
  }
}
