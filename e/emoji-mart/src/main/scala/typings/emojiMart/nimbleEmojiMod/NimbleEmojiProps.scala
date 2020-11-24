package typings.emojiMart.nimbleEmojiMod

import typings.emojiMart.dataMod.Data
import typings.emojiMart.nimbleEmojiIndexMod.EmojiData
import typings.emojiMart.sharedPropsMod.EmojiProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class NimbleEmojiPropsOps[Self <: NimbleEmojiProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
