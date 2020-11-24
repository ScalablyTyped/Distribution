package typings.emojiMart.categoryMod

import typings.emojiMart.nimbleEmojiIndexMod.EmojiData
import typings.emojiMart.sharedPropsMod.CategoryName
import typings.emojiMart.sharedPropsMod.EmojiProps
import typings.emojiMart.sharedPropsMod.I18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var emojiProps: EmojiProps = js.native
  
  var emojis: js.UndefOr[js.Array[String | EmojiData]] = js.native
  
  var hasStickyPosition: js.UndefOr[Boolean] = js.native
  
  var i18n: I18n = js.native
  
  var id: CategoryName = js.native
  
  var name: String = js.native
  
  var native: Boolean = js.native
  
  var perLine: Double = js.native
  
  var recent: js.UndefOr[js.Array[String]] = js.native
}
object Props {
  
  @scala.inline
  def apply(
    emojiProps: EmojiProps,
    i18n: I18n,
    id: CategoryName,
    name: String,
    native: Boolean,
    perLine: Double
  ): Props = {
    val __obj = js.Dynamic.literal(emojiProps = emojiProps.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], perLine = perLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setEmojiProps(value: EmojiProps): Self = this.set("emojiProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18n(value: I18n): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: CategoryName): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: Boolean): Self = this.set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerLine(value: Double): Self = this.set("perLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmojisVarargs(value: (String | EmojiData)*): Self = this.set("emojis", js.Array(value :_*))
    
    @scala.inline
    def setEmojis(value: js.Array[String | EmojiData]): Self = this.set("emojis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmojis: Self = this.set("emojis", js.undefined)
    
    @scala.inline
    def setHasStickyPosition(value: Boolean): Self = this.set("hasStickyPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasStickyPosition: Self = this.set("hasStickyPosition", js.undefined)
    
    @scala.inline
    def setRecentVarargs(value: String*): Self = this.set("recent", js.Array(value :_*))
    
    @scala.inline
    def setRecent(value: js.Array[String]): Self = this.set("recent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecent: Self = this.set("recent", js.undefined)
  }
}
