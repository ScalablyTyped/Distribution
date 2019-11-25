package typings.emojiDashFlags.emojiDashFlagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryData extends js.Object {
  var code: String
  var emoji: String
  var name: String
  var title: String
  var unicode: String
}

object CountryData {
  @scala.inline
  def apply(code: String, emoji: String, name: String, title: String, unicode: String): CountryData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CountryData]
  }
}

