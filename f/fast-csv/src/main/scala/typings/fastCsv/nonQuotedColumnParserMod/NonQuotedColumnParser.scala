package typings.fastCsv.nonQuotedColumnParserMod

import typings.fastCsv.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonQuotedColumnParser extends js.Object {
  val columnFormatter: js.Any
  val parserOptions: js.Any
  def parse(scanner: Scanner): String | Null
}

object NonQuotedColumnParser {
  @scala.inline
  def apply(columnFormatter: js.Any, parse: Scanner => String | Null, parserOptions: js.Any): NonQuotedColumnParser = {
    val __obj = js.Dynamic.literal(columnFormatter = columnFormatter.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), parserOptions = parserOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonQuotedColumnParser]
  }
}

