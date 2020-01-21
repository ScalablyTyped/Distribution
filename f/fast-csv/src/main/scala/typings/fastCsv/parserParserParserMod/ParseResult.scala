package typings.fastCsv.parserParserParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  var line: String
  var rows: js.Array[js.Array[String]]
}

object ParseResult {
  @scala.inline
  def apply(line: String, rows: js.Array[js.Array[String]]): ParseResult = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseResult]
  }
}

