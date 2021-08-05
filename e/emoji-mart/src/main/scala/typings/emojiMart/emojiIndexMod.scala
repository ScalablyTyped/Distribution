package typings.emojiMart

import typings.emojiMart.emojiMartStrings._empty
import typings.emojiMart.nimbleEmojiIndexMod.EmojiData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emojiIndexMod {
  
  object default {
    
    @JSImport("emoji-mart/dist-es/utils/emoji-index/emoji-index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def search(query: String): js.Array[EmojiData] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[EmojiData] | Null]
    inline def search(query: _empty): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(query.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    /** Mapping of string to keyof emojis */
    object emoticons
  }
}
