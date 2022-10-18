package typings.fastCsvParse

import typings.fastCsvParse.buildSrcParserOptionsMod.ParserOptions
import typings.fastCsvParse.buildSrcParserScannerMod.Scanner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcParserColumnQuotedColumnParserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/column/QuotedColumnParser", "QuotedColumnParser")
  @js.native
  open class QuotedColumnParser protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    /* private */ var checkForMalformedColumn: Any = js.native
    
    /* private */ val columnFormatter: Any = js.native
    
    /* private */ var gatherDataBetweenQuotes: Any = js.native
    
    def parse(scanner: Scanner): String | Null = js.native
    
    /* private */ val parserOptions: Any = js.native
  }
}
