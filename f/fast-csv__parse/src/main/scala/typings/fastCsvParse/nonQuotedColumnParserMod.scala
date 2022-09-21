package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.scannerMod.Scanner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonQuotedColumnParserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/column/NonQuotedColumnParser", "NonQuotedColumnParser")
  @js.native
  open class NonQuotedColumnParser protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    /* private */ val columnFormatter: Any = js.native
    
    def parse(scanner: Scanner): String | Null = js.native
    
    /* private */ val parserOptions: Any = js.native
  }
}
