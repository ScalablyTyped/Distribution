package typings
package emojiDashFlagsLib.emojiDashFlagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryData extends js.Object {
  var code: java.lang.String
  var emoji: java.lang.String
  var name: java.lang.String
  var title: java.lang.String
  var unicode: java.lang.String
}

object CountryData {
  @scala.inline
  def apply(
    code: java.lang.String,
    emoji: java.lang.String,
    name: java.lang.String,
    title: java.lang.String,
    unicode: java.lang.String
  ): CountryData = {
    val __obj = js.Dynamic.literal(code = code, emoji = emoji, name = name, title = title, unicode = unicode)
  
    __obj.asInstanceOf[CountryData]
  }
}

