package typings.fastCsvParse

import typings.fastCsvParse.buildSrcParserColumnNonQuotedColumnParserMod.NonQuotedColumnParser
import typings.fastCsvParse.buildSrcParserColumnQuotedColumnParserMod.QuotedColumnParser
import typings.fastCsvParse.buildSrcParserOptionsMod.ParserOptions
import typings.fastCsvParse.buildSrcParserScannerMod.Scanner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcParserColumnColumnParserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/column/ColumnParser", "ColumnParser")
  @js.native
  open class ColumnParser protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    val nonQuotedColumnParser: NonQuotedColumnParser = js.native
    
    def parse(scanner: Scanner): String | Null = js.native
    
    /* private */ val parserOptions: Any = js.native
    
    val quotedColumnParser: QuotedColumnParser = js.native
  }
}
