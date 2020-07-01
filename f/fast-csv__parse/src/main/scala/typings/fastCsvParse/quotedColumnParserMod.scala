package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/parse/build/src/parser/column/QuotedColumnParser", JSImport.Namespace)
@js.native
object quotedColumnParserMod extends js.Object {
  @js.native
  class QuotedColumnParser protected () extends js.Object {
    def this(parserOptions: ParserOptions) = this()
    var checkForMalformedColumn: js.Any = js.native
    val columnFormatter: js.Any = js.native
    var gatherDataBetweenQuotes: js.Any = js.native
    val parserOptions: js.Any = js.native
    def parse(scanner: Scanner): String | Null = js.native
  }
  
}

