package typings.fastDashCsv.buildSrcParserParserColumnQuotedColumnParserMod

import typings.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptions
import typings.fastDashCsv.buildSrcParserParserScannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser/column/QuotedColumnParser", JSImport.Default)
@js.native
class default protected () extends QuotedColumnParser {
  def this(parserOptions: ParserOptions) = this()
  /* CompleteClass */
  override var checkForMalformedColumn: js.Any = js.native
  /* CompleteClass */
  override val columnFormatter: js.Any = js.native
  /* CompleteClass */
  override var gatherDataBetweenQuotes: js.Any = js.native
  /* CompleteClass */
  override val parserOptions: js.Any = js.native
  /* CompleteClass */
  override def parse(scanner: Scanner): String | Null = js.native
}

