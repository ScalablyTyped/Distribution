package typings.fastDashCsv.buildSrcParserParserColumnColumnParserMod

import typings.fastDashCsv.buildSrcParserParserScannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnParser extends js.Object {
  val nonQuotedColumnParser: typings.fastDashCsv.buildSrcParserParserColumnNonQuotedColumnParserMod.default
  val parserOptions: js.Any
  val quotedColumnParser: typings.fastDashCsv.buildSrcParserParserColumnQuotedColumnParserMod.default
  def parse(scanner: Scanner): String | Null
}

object ColumnParser {
  @scala.inline
  def apply(
    nonQuotedColumnParser: typings.fastDashCsv.buildSrcParserParserColumnNonQuotedColumnParserMod.default,
    parse: Scanner => String | Null,
    parserOptions: js.Any,
    quotedColumnParser: typings.fastDashCsv.buildSrcParserParserColumnQuotedColumnParserMod.default
  ): ColumnParser = {
    val __obj = js.Dynamic.literal(nonQuotedColumnParser = nonQuotedColumnParser.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), parserOptions = parserOptions.asInstanceOf[js.Any], quotedColumnParser = quotedColumnParser.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColumnParser]
  }
}

