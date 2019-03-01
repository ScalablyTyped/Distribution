package typings
package diff2htmlLib.Diff2HtmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var content: java.lang.String
  var newNumber: scala.Double
  var oldNumber: scala.Double
  var `type`: java.lang.String
}

object Line {
  @scala.inline
  def apply(
    content: java.lang.String,
    newNumber: scala.Double,
    oldNumber: scala.Double,
    `type`: java.lang.String
  ): Line = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("newNumber")(newNumber)
    __obj.updateDynamic("oldNumber")(oldNumber)
    __obj.asInstanceOf[Line]
  }
}

