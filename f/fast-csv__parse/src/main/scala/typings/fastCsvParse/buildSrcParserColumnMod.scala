package typings.fastCsvParse

import typings.fastCsvParse.buildSrcParserOptionsMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcParserColumnMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/column", "ColumnFormatter")
  @js.native
  open class ColumnFormatter protected ()
    extends typings.fastCsvParse.buildSrcParserColumnColumnFormatterMod.ColumnFormatter {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser/column", "ColumnParser")
  @js.native
  open class ColumnParser protected ()
    extends typings.fastCsvParse.buildSrcParserColumnColumnParserMod.ColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser/column", "NonQuotedColumnParser")
  @js.native
  open class NonQuotedColumnParser protected ()
    extends typings.fastCsvParse.buildSrcParserColumnNonQuotedColumnParserMod.NonQuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser/column", "QuotedColumnParser")
  @js.native
  open class QuotedColumnParser protected ()
    extends typings.fastCsvParse.buildSrcParserColumnQuotedColumnParserMod.QuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
}
