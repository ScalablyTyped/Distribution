package typings.fastCsvParse

import typings.fastCsvParse.nonQuotedColumnParserMod.NonQuotedColumnParser
import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.quotedColumnParserMod.QuotedColumnParser
import typings.fastCsvParse.scannerMod.Scanner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnParserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/column/ColumnParser", "ColumnParser")
  @js.native
  class ColumnParser protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    val nonQuotedColumnParser: NonQuotedColumnParser = js.native
    
    def parse(scanner: Scanner): String | Null = js.native
    
    val parserOptions: js.Any = js.native
    
    val quotedColumnParser: QuotedColumnParser = js.native
  }
}
