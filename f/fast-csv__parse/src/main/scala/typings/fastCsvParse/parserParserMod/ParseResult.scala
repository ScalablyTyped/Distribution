package typings.fastCsvParse.parserParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseResult extends js.Object {
  var line: String = js.native
  var rows: js.Array[js.Array[String]] = js.native
}

object ParseResult {
  @scala.inline
  def apply(line: String, rows: js.Array[js.Array[String]]): ParseResult = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult]
  }
  @scala.inline
  implicit class ParseResultOps[Self <: ParseResult] (val x: Self) extends AnyVal {
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
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: js.Array[String]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[String]]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

