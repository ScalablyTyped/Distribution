package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphemeLines extends js.Object {
  var _unwrappedLines: js.Array[String] = js.native
  var graphemeLines: js.Array[String] = js.native
  var graphemeText: js.Array[String] = js.native
  var lines: js.Array[String] = js.native
}

object GraphemeLines {
  @scala.inline
  def apply(
    _unwrappedLines: js.Array[String],
    graphemeLines: js.Array[String],
    graphemeText: js.Array[String],
    lines: js.Array[String]
  ): GraphemeLines = {
    val __obj = js.Dynamic.literal(_unwrappedLines = _unwrappedLines.asInstanceOf[js.Any], graphemeLines = graphemeLines.asInstanceOf[js.Any], graphemeText = graphemeText.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphemeLines]
  }
  @scala.inline
  implicit class GraphemeLinesOps[Self <: GraphemeLines] (val x: Self) extends AnyVal {
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
    def set_unwrappedLinesVarargs(value: String*): Self = this.set("_unwrappedLines", js.Array(value :_*))
    @scala.inline
    def set_unwrappedLines(value: js.Array[String]): Self = this.set("_unwrappedLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraphemeLinesVarargs(value: String*): Self = this.set("graphemeLines", js.Array(value :_*))
    @scala.inline
    def setGraphemeLines(value: js.Array[String]): Self = this.set("graphemeLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraphemeTextVarargs(value: String*): Self = this.set("graphemeText", js.Array(value :_*))
    @scala.inline
    def setGraphemeText(value: js.Array[String]): Self = this.set("graphemeText", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinesVarargs(value: String*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[String]): Self = this.set("lines", value.asInstanceOf[js.Any])
  }
  
}

