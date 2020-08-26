package typings.diff2html.Diff2Html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  var header: String = js.native
  var lines: js.Array[Line] = js.native
  var newStartLine: Double = js.native
  var oldStartLine: Double = js.native
  var oldStartLine2: js.UndefOr[Double] = js.native
}

object Block {
  @scala.inline
  def apply(header: String, lines: js.Array[Line], newStartLine: Double, oldStartLine: Double): Block = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], newStartLine = newStartLine.asInstanceOf[js.Any], oldStartLine = oldStartLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
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
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinesVarargs(value: Line*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[Line]): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewStartLine(value: Double): Self = this.set("newStartLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldStartLine(value: Double): Self = this.set("oldStartLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldStartLine2(value: Double): Self = this.set("oldStartLine2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldStartLine2: Self = this.set("oldStartLine2", js.undefined)
  }
  
}

