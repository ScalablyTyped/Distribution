package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedAppProfile extends StObject {
  
  /**
    * Displayed user avatar emoji.
    */
  var avatarEmoji: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Displayed user avatar url.
    */
  var avatarUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Displayed user name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedAppProfile {
  
  inline def apply(): SchemaAppsDynamiteSharedAppProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedAppProfile]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedAppProfile](x: Self) {
    
    inline def setAvatarEmoji(value: String): Self = StObject.set(x, "avatarEmoji", value.asInstanceOf[js.Any])
    
    inline def setAvatarEmojiNull: Self = StObject.set(x, "avatarEmoji", null)
    
    inline def setAvatarEmojiUndefined: Self = StObject.set(x, "avatarEmoji", js.undefined)
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setAvatarUrlNull: Self = StObject.set(x, "avatarUrl", null)
    
    inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
