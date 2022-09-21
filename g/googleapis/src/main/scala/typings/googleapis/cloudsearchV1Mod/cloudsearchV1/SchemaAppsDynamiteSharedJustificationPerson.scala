package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedJustificationPerson extends StObject {
  
  /**
    * Whether the person is the recipient of the suggestions.
    */
  var isRecipient: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Obfuscated user ID.
    */
  var user: js.UndefOr[SchemaUserId] = js.undefined
}
object SchemaAppsDynamiteSharedJustificationPerson {
  
  inline def apply(): SchemaAppsDynamiteSharedJustificationPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedJustificationPerson]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedJustificationPerson](x: Self) {
    
    inline def setIsRecipient(value: Boolean): Self = StObject.set(x, "isRecipient", value.asInstanceOf[js.Any])
    
    inline def setIsRecipientNull: Self = StObject.set(x, "isRecipient", null)
    
    inline def setIsRecipientUndefined: Self = StObject.set(x, "isRecipient", js.undefined)
    
    inline def setUser(value: SchemaUserId): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
