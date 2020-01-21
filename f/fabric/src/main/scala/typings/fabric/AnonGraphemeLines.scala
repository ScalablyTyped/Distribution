package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGraphemeLines extends js.Object {
  var _unwrappedLines: js.Array[String]
  var graphemeLines: js.Array[String]
  var graphemeText: js.Array[String]
  var lines: js.Array[String]
}

object AnonGraphemeLines {
  @scala.inline
  def apply(
    _unwrappedLines: js.Array[String],
    graphemeLines: js.Array[String],
    graphemeText: js.Array[String],
    lines: js.Array[String]
  ): AnonGraphemeLines = {
    val __obj = js.Dynamic.literal(_unwrappedLines = _unwrappedLines.asInstanceOf[js.Any], graphemeLines = graphemeLines.asInstanceOf[js.Any], graphemeText = graphemeText.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGraphemeLines]
  }
}

