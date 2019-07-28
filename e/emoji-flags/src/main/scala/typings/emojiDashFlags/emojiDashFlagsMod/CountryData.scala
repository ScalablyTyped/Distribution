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
    val __obj = js.Dynamic.literal(code = code, emoji = emoji, name = name, title = title, unicode = unicode)
  
    __obj.asInstanceOf[CountryData]
  }
}

