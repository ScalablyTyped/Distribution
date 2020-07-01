package typings.fastCsvParse

import typings.fastCsvParse.nonQuotedColumnParserMod.NonQuotedColumnParser
import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.quotedColumnParserMod.QuotedColumnParser
import typings.fastCsvParse.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/parse/build/src/parser/column/ColumnParser", JSImport.Namespace)
@js.native
object columnParserMod extends js.Object {
  @js.native
  class ColumnParser protected () extends js.Object {
    def this(parserOptions: ParserOptions) = this()
    val nonQuotedColumnParser: NonQuotedColumnParser = js.native
    val parserOptions: js.Any = js.native
    val quotedColumnParser: QuotedColumnParser = js.native
    def parse(scanner: Scanner): String | Null = js.native
  }
  
}

