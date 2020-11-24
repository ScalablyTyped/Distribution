package typings.emojiMart.anon

import typings.emojiMart.nimbleEmojiIndexMod.EmojiData
import typings.emojiMart.nimbleEmojiIndexMod.EmojiEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ variant in emoji-mart.emoji-mart/dist-es/utils/emoji-index/nimble-emoji-index.EmojiSkin ]: emoji-mart.emoji-mart/dist-es/utils/emoji-index/nimble-emoji-index.EmojiData} */
@js.native
trait variantinEmojiSkinEmojiDa extends EmojiEntry {
  
  var `1`: EmojiData = js.native
  
  var `2`: EmojiData = js.native
  
  var `3`: EmojiData = js.native
  
  var `4`: EmojiData = js.native
  
  var `5`: EmojiData = js.native
  
  var `6`: EmojiData = js.native
}
object variantinEmojiSkinEmojiDa {
  
  @scala.inline
  def apply(`1`: EmojiData, `2`: EmojiData, `3`: EmojiData, `4`: EmojiData, `5`: EmojiData, `6`: EmojiData): variantinEmojiSkinEmojiDa = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.asInstanceOf[variantinEmojiSkinEmojiDa]
  }
  
  @scala.inline
  implicit class variantinEmojiSkinEmojiDaOps[Self <: variantinEmojiSkinEmojiDa] (val x: Self) extends AnyVal {
    
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
    def set1(value: EmojiData): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: EmojiData): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3(value: EmojiData): Self = this.set("3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4(value: EmojiData): Self = this.set("4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set5(value: EmojiData): Self = this.set("5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set6(value: EmojiData): Self = this.set("6", value.asInstanceOf[js.Any])
  }
}
