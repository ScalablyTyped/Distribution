package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.scannerMod.Scanner
import typings.fastCsvParse.typesMod.RowArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fast-csv/parse/build/src/parser/RowParser", JSImport.Namespace)
@js.native
object rowParserMod extends js.Object {
  
  @js.native
  class RowParser protected () extends js.Object {
    def this(parserOptions: ParserOptions) = this()
    
    val columnParser: js.Any = js.native
    
    var getStartToken: js.Any = js.native
    
    def parse(scanner: Scanner): RowArray[_] | Null = js.native
    
    val parserOptions: js.Any = js.native
    
    var shouldSkipColumnParse: js.Any = js.native
  }
}
