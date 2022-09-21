package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserMentionMetadata extends StObject {
  
  /**
    * The type of user mention.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user mentioned.
    */
  var user: js.UndefOr[SchemaUser] = js.undefined
}
object SchemaUserMentionMetadata {
  
  inline def apply(): SchemaUserMentionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserMentionMetadata]
  }
  
  extension [Self <: SchemaUserMentionMetadata](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
