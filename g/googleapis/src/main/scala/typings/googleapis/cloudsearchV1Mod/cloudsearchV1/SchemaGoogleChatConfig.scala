package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChatConfig extends StObject {
  
  /**
    * ID of the Chat group.
    */
  var chatGroupId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChatConfig {
  
  inline def apply(): SchemaGoogleChatConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChatConfig]
  }
  
  extension [Self <: SchemaGoogleChatConfig](x: Self) {
    
    inline def setChatGroupId(value: String): Self = StObject.set(x, "chatGroupId", value.asInstanceOf[js.Any])
    
    inline def setChatGroupIdNull: Self = StObject.set(x, "chatGroupId", null)
    
    inline def setChatGroupIdUndefined: Self = StObject.set(x, "chatGroupId", js.undefined)
  }
}
