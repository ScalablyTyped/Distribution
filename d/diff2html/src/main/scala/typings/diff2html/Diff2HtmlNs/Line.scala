package typings.diff2html.Diff2HtmlNs

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
    val __obj = js.Dynamic.literal(content = content, newNumber = newNumber, oldNumber = oldNumber)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Line]
  }
}

