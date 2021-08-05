package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.scannerMod.Scanner
import typings.fastCsvParse.typesMod.RowArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowParserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/RowParser", "RowParser")
  @js.native
  class RowParser protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    /* private */ val columnParser: js.Any = js.native
    
    /* private */ var getStartToken: js.Any = js.native
    
    def parse(scanner: Scanner): RowArray[js.Any] | Null = js.native
    
    /* private */ val parserOptions: js.Any = js.native
    
    /* private */ var shouldSkipColumnParse: js.Any = js.native
  }
}
