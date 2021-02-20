package typings.emojiMart

import org.scalablytyped.runtime.Shortcut
import typings.emojiMart.dataMod.Data
import typings.emojiMart.nimbleEmojiIndexMod.EmojiData
import typings.emojiMart.sharedPropsMod.EmojiProps
import typings.react.mod.SFC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nimbleEmojiMod extends Shortcut {
  
  @JSImport("emoji-mart/dist-es/components/emoji/nimble-emoji", JSImport.Default)
  @js.native
  val default: SFC[NimbleEmojiProps] = js.native
  
  @js.native
  trait NimbleEmojiProps extends EmojiProps {
    
    var data: Data = js.native
  }
  object NimbleEmojiProps {
    
    @scala.inline
    def apply(data: Data, emoji: String | EmojiData, size: Double): NimbleEmojiProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[NimbleEmojiProps]
    }
    
    @scala.inline
    implicit class NimbleEmojiPropsMutableBuilder[Self <: NimbleEmojiProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = SFC[NimbleEmojiProps]
  
  /* This means you don't have to write `default`, but can instead just say `nimbleEmojiMod.foo` */
  override def _to: SFC[NimbleEmojiProps] = default
}
