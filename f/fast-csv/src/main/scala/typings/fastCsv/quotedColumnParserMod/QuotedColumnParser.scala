package typings.fastCsv.quotedColumnParserMod

import typings.fastCsv.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotedColumnParser extends js.Object {
  var checkForMalformedColumn: js.Any
  val columnFormatter: js.Any
  var gatherDataBetweenQuotes: js.Any
  val parserOptions: js.Any
  def parse(scanner: Scanner): String | Null
}

object QuotedColumnParser {
  @scala.inline
  def apply(
    checkForMalformedColumn: js.Any,
    columnFormatter: js.Any,
    gatherDataBetweenQuotes: js.Any,
    parse: Scanner => String | Null,
    parserOptions: js.Any
  ): QuotedColumnParser = {
    val __obj = js.Dynamic.literal(checkForMalformedColumn = checkForMalformedColumn.asInstanceOf[js.Any], columnFormatter = columnFormatter.asInstanceOf[js.Any], gatherDataBetweenQuotes = gatherDataBetweenQuotes.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), parserOptions = parserOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QuotedColumnParser]
  }
}

