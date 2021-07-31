package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/column", "ColumnFormatter")
  @js.native
  class ColumnFormatter protected ()
    extends typings.fastCsvParse.columnFormatterMod.ColumnFormatter {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser/column", "ColumnParser")
  @js.native
  class ColumnParser protected ()
    extends typings.fastCsvParse.columnParserMod.ColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser/column", "NonQuotedColumnParser")
  @js.native
  class NonQuotedColumnParser protected ()
    extends typings.fastCsvParse.nonQuotedColumnParserMod.NonQuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser/column", "QuotedColumnParser")
  @js.native
  class QuotedColumnParser protected ()
    extends typings.fastCsvParse.quotedColumnParserMod.QuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
}
