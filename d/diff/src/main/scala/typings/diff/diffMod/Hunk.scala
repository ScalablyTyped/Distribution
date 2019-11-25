package typings.diff.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hunk extends js.Object {
  var linedelimiters: js.Array[String]
  var lines: js.Array[String]
  var newLines: Double
  var newStart: Double
  var oldLines: Double
  var oldStart: Double
}

object Hunk {
  @scala.inline
  def apply(
    linedelimiters: js.Array[String],
    lines: js.Array[String],
    newLines: Double,
    newStart: Double,
    oldLines: Double,
    oldStart: Double
  ): Hunk = {
    val __obj = js.Dynamic.literal(linedelimiters = linedelimiters.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], newLines = newLines.asInstanceOf[js.Any], newStart = newStart.asInstanceOf[js.Any], oldLines = oldLines.asInstanceOf[js.Any], oldStart = oldStart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Hunk]
  }
}

