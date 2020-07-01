package typings.ecmarkup.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var col: Double
  var endOffset: Double
  var line: Double
  var startOffset: Double
}

object Location {
  @scala.inline
  def apply(col: Double, endOffset: Double, line: Double, startOffset: Double): Location = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

