package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomEmojiMetadata extends StObject {
  
  var customEmoji: js.UndefOr[SchemaAppsDynamiteSharedCustomEmoji] = js.undefined
}
object SchemaCustomEmojiMetadata {
  
  inline def apply(): SchemaCustomEmojiMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomEmojiMetadata]
  }
  
  extension [Self <: SchemaCustomEmojiMetadata](x: Self) {
    
    inline def setCustomEmoji(value: SchemaAppsDynamiteSharedCustomEmoji): Self = StObject.set(x, "customEmoji", value.asInstanceOf[js.Any])
    
    inline def setCustomEmojiUndefined: Self = StObject.set(x, "customEmoji", js.undefined)
  }
}
