package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedEmoji extends StObject {
  
  /**
    * A custom emoji.
    */
  var customEmoji: js.UndefOr[SchemaAppsDynamiteSharedCustomEmoji] = js.undefined
  
  /**
    * A basic emoji represented by a unicode string.
    */
  var unicode: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedEmoji {
  
  inline def apply(): SchemaAppsDynamiteSharedEmoji = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedEmoji]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedEmoji](x: Self) {
    
    inline def setCustomEmoji(value: SchemaAppsDynamiteSharedCustomEmoji): Self = StObject.set(x, "customEmoji", value.asInstanceOf[js.Any])
    
    inline def setCustomEmojiUndefined: Self = StObject.set(x, "customEmoji", js.undefined)
    
    inline def setUnicode(value: String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    inline def setUnicodeNull: Self = StObject.set(x, "unicode", null)
    
    inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
  }
}
