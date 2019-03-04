package typings
package emojiDashMartLib.distDashEsUtilsDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  var emojis: js.Array[java.lang.String]
  var id: java.lang.String
  var name: java.lang.String
}

object Category {
  @scala.inline
  def apply(emojis: js.Array[java.lang.String], id: java.lang.String, name: java.lang.String): Category = {
    val __obj = js.Dynamic.literal(emojis = emojis, id = id, name = name)
  
    __obj.asInstanceOf[Category]
  }
}

