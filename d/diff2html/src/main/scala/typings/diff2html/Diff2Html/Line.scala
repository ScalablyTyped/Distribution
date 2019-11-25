package typings.diff2html.Diff2Html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var content: String
  var newNumber: Double
  var oldNumber: Double
  var `type`: String
}

object Line {
  @scala.inline
  def apply(content: String, newNumber: Double, oldNumber: Double, `type`: String): Line = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], newNumber = newNumber.asInstanceOf[js.Any], oldNumber = oldNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

