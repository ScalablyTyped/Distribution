package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharHeight extends js.Object {
  var charHeight: Double
  var fontSize: String
  var left: String
  var top: String
}

object CharHeight {
  @scala.inline
  def apply(charHeight: Double, fontSize: String, left: String, top: String): CharHeight = {
    val __obj = js.Dynamic.literal(charHeight = charHeight.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharHeight]
  }
}

