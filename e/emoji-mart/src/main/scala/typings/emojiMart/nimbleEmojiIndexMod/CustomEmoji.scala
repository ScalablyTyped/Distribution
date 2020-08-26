package typings.emojiMart.nimbleEmojiIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEmoji extends EmojiData {
  // colons is overridden by :id:
  var colons: js.UndefOr[String] = js.native
  var emoticons: js.UndefOr[js.Array[String]] = js.native
  // id is overridden by short_names[0]
  var id: js.UndefOr[String] = js.native
  var imageUrl: String = js.native
  var keywords: js.UndefOr[js.Array[String]] = js.native
  var name: String = js.native
  /** Must contain at least one name. The first name is used as the unique id. */
  var short_names: js.Array[String] = js.native
}

object CustomEmoji {
  @scala.inline
  def apply(imageUrl: String, name: String, short_names: js.Array[String]): CustomEmoji = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEmoji]
  }
  @scala.inline
  implicit class CustomEmojiOps[Self <: CustomEmoji] (val x: Self) extends AnyVal {
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
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort_namesVarargs(value: String*): Self = this.set("short_names", js.Array(value :_*))
    @scala.inline
    def setShort_names(value: js.Array[String]): Self = this.set("short_names", value.asInstanceOf[js.Any])
    @scala.inline
    def setColons(value: String): Self = this.set("colons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColons: Self = this.set("colons", js.undefined)
    @scala.inline
    def setEmoticonsVarargs(value: String*): Self = this.set("emoticons", js.Array(value :_*))
    @scala.inline
    def setEmoticons(value: js.Array[String]): Self = this.set("emoticons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmoticons: Self = this.set("emoticons", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
  }
  
}

