package typings.emojiMart.nimbleEmojiIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseEmoji extends EmojiData {
  var colons: String = js.native
  /** Reverse mapping to keyof emoticons */
  var emoticons: js.Array[String] = js.native
  var id: String = js.native
  var name: String = js.native
  var native: String = js.native
  var skin: EmojiSkin | Null = js.native
  var unified: String = js.native
}

object BaseEmoji {
  @scala.inline
  def apply(
    colons: String,
    emoticons: js.Array[String],
    id: String,
    name: String,
    native: String,
    unified: String
  ): BaseEmoji = {
    val __obj = js.Dynamic.literal(colons = colons.asInstanceOf[js.Any], emoticons = emoticons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEmoji]
  }
  @scala.inline
  implicit class BaseEmojiOps[Self <: BaseEmoji] (val x: Self) extends AnyVal {
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
    def setColons(value: String): Self = this.set("colons", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmoticonsVarargs(value: String*): Self = this.set("emoticons", js.Array(value :_*))
    @scala.inline
    def setEmoticons(value: js.Array[String]): Self = this.set("emoticons", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNative(value: String): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnified(value: String): Self = this.set("unified", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkin(value: EmojiSkin): Self = this.set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkinNull: Self = this.set("skin", null)
  }
  
}

