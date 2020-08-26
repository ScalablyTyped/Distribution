package typings.emojiFlags.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountryData extends js.Object {
  var code: String = js.native
  var emoji: String = js.native
  var name: String = js.native
  var title: String = js.native
  var unicode: String = js.native
}

object CountryData {
  @scala.inline
  def apply(code: String, emoji: String, name: String, title: String, unicode: String): CountryData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryData]
  }
  @scala.inline
  implicit class CountryDataOps[Self <: CountryData] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmoji(value: String): Self = this.set("emoji", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnicode(value: String): Self = this.set("unicode", value.asInstanceOf[js.Any])
  }
  
}

