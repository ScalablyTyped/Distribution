package typings.emojiMart.dataMod

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
    val __obj = js.Dynamic.literal(emojis = emojis.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Category]
  }
}

