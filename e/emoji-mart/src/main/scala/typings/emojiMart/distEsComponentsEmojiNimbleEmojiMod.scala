package typings.emojiMart

import org.scalablytyped.runtime.Shortcut
import typings.emojiMart.distEsUtilsDataMod.Data
import typings.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.EmojiData
import typings.emojiMart.distEsUtilsSharedPropsMod.EmojiProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsComponentsEmojiNimbleEmojiMod extends Shortcut {
  
  @JSImport("emoji-mart/dist-es/components/emoji/nimble-emoji", JSImport.Default)
  @js.native
  val default: FC[NimbleEmojiProps] = js.native
  
  trait NimbleEmojiProps
    extends StObject
       with EmojiProps {
    
    var data: Data
  }
  object NimbleEmojiProps {
    
    inline def apply(data: Data, emoji: String | EmojiData, size: Double): NimbleEmojiProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[NimbleEmojiProps]
    }
    
    extension [Self <: NimbleEmojiProps](x: Self) {
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[NimbleEmojiProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsComponentsEmojiNimbleEmojiMod.foo` */
  override def _to: FC[NimbleEmojiProps] = default
}
