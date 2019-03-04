package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hunk extends js.Object {
  var lines: js.Array[java.lang.String]
  var newLines: scala.Double
  var newStart: scala.Double
  var oldLines: scala.Double
  var oldStart: scala.Double
}

object Hunk {
  @scala.inline
  def apply(
    lines: js.Array[java.lang.String],
    newLines: scala.Double,
    newStart: scala.Double,
    oldLines: scala.Double,
    oldStart: scala.Double
  ): Hunk = {
    val __obj = js.Dynamic.literal(lines = lines, newLines = newLines, newStart = newStart, oldLines = oldLines, oldStart = oldStart)
  
    __obj.asInstanceOf[Hunk]
  }
}

