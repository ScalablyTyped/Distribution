package typings.emojiDashMart.distDashEsUtilsDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  var emojis: js.Array[String]
  var id: String
  var name: String
}

object Category {
  @scala.inline
  def apply(emojis: js.Array[String], id: String, name: String): Category = {
    val __obj = js.Dynamic.literal(emojis = emojis, id = id, name = name)
  
    __obj.asInstanceOf[Category]
  }
}

