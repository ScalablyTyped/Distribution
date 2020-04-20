package typings.fastCsv.columnParserMod

import typings.fastCsv.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnParser extends js.Object {
  val nonQuotedColumnParser: typings.fastCsv.nonQuotedColumnParserMod.default
  val parserOptions: js.Any
  val quotedColumnParser: typings.fastCsv.quotedColumnParserMod.default
  def parse(scanner: Scanner): String | Null
}

object ColumnParser {
  @scala.inline
  def apply(
    nonQuotedColumnParser: typings.fastCsv.nonQuotedColumnParserMod.default,
    parse: Scanner => String | Null,
    parserOptions: js.Any,
    quotedColumnParser: typings.fastCsv.quotedColumnParserMod.default
  ): ColumnParser = {
    val __obj = js.Dynamic.literal(nonQuotedColumnParser = nonQuotedColumnParser.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), parserOptions = parserOptions.asInstanceOf[js.Any], quotedColumnParser = quotedColumnParser.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnParser]
  }
}

