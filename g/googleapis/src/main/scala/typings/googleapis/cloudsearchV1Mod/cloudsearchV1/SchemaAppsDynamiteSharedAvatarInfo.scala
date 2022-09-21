package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedAvatarInfo extends StObject {
  
  var emoji: js.UndefOr[SchemaAppsDynamiteSharedEmoji] = js.undefined
}
object SchemaAppsDynamiteSharedAvatarInfo {
  
  inline def apply(): SchemaAppsDynamiteSharedAvatarInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedAvatarInfo]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedAvatarInfo](x: Self) {
    
    inline def setEmoji(value: SchemaAppsDynamiteSharedEmoji): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
  }
}
