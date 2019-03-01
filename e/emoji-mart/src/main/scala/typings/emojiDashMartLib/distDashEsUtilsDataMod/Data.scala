package typings
package emojiDashMartLib.distDashEsUtilsDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var aliases: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var categories: js.Array[Category]
  var compressed: scala.Boolean
  var emojis: org.scalablytyped.runtime.StringDictionary[Emoji]
}

object Data {
  @scala.inline
  def apply(
    aliases: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    categories: js.Array[Category],
    compressed: scala.Boolean,
    emojis: org.scalablytyped.runtime.StringDictionary[Emoji]
  ): Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aliases")(aliases)
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("compressed")(compressed)
    __obj.updateDynamic("emojis")(emojis)
    __obj.asInstanceOf[Data]
  }
}

