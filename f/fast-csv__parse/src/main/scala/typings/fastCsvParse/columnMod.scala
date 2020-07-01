package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/parse/build/src/parser/column", JSImport.Namespace)
@js.native
object columnMod extends js.Object {
  @js.native
  class ColumnFormatter protected ()
    extends typings.fastCsvParse.columnFormatterMod.ColumnFormatter {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class ColumnParser protected ()
    extends typings.fastCsvParse.columnParserMod.ColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class NonQuotedColumnParser protected ()
    extends typings.fastCsvParse.nonQuotedColumnParserMod.NonQuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class QuotedColumnParser protected ()
    extends typings.fastCsvParse.quotedColumnParserMod.QuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
}

