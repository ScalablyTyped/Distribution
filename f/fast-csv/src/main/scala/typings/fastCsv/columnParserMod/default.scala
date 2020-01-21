package typings.fastCsv.columnParserMod

import typings.fastCsv.parserOptionsMod.ParserOptions
import typings.fastCsv.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser/column/ColumnParser", JSImport.Default)
@js.native
class default protected () extends ColumnParser {
  def this(parserOptions: ParserOptions) = this()
  /* CompleteClass */
  override val nonQuotedColumnParser: typings.fastCsv.nonQuotedColumnParserMod.default = js.native
  /* CompleteClass */
  override val parserOptions: js.Any = js.native
  /* CompleteClass */
  override val quotedColumnParser: typings.fastCsv.quotedColumnParserMod.default = js.native
  /* CompleteClass */
  override def parse(scanner: Scanner): String | Null = js.native
}

