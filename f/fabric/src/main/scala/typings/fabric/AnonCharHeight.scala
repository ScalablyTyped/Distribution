package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharHeight extends js.Object {
  var charHeight: Double
  var fontSize: String
  var left: String
  var top: String
}

object AnonCharHeight {
  @scala.inline
  def apply(charHeight: Double, fontSize: String, left: String, top: String): AnonCharHeight = {
    val __obj = js.Dynamic.literal(charHeight = charHeight.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCharHeight]
  }
}

