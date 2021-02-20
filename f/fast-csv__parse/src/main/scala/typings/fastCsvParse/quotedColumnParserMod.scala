package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.scannerMod.Scanner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quotedColumnParserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/column/QuotedColumnParser", "QuotedColumnParser")
  @js.native
  class QuotedColumnParser protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    var checkForMalformedColumn: js.Any = js.native
    
    val columnFormatter: js.Any = js.native
    
    var gatherDataBetweenQuotes: js.Any = js.native
    
    def parse(scanner: Scanner): String | Null = js.native
    
    val parserOptions: js.Any = js.native
  }
}
