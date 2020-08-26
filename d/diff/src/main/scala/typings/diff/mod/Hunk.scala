package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hunk extends js.Object {
  var linedelimiters: js.Array[String] = js.native
  var lines: js.Array[String] = js.native
  var newLines: Double = js.native
  var newStart: Double = js.native
  var oldLines: Double = js.native
  var oldStart: Double = js.native
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
  @scala.inline
  implicit class HunkOps[Self <: Hunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLinedelimitersVarargs(value: String*): Self = this.set("linedelimiters", js.Array(value :_*))
    @scala.inline
    def setLinedelimiters(value: js.Array[String]): Self = this.set("linedelimiters", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinesVarargs(value: String*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[String]): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewLines(value: Double): Self = this.set("newLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewStart(value: Double): Self = this.set("newStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldLines(value: Double): Self = this.set("oldLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldStart(value: Double): Self = this.set("oldStart", value.asInstanceOf[js.Any])
  }
  
}

