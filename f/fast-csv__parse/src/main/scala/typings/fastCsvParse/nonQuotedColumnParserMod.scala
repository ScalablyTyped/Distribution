package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fast-csv/parse/build/src/parser/column/NonQuotedColumnParser", JSImport.Namespace)
@js.native
object nonQuotedColumnParserMod extends js.Object {
  
  @js.native
  class NonQuotedColumnParser protected () extends js.Object {
    def this(parserOptions: ParserOptions) = this()
    
    val columnFormatter: js.Any = js.native
    
    def parse(scanner: Scanner): String | Null = js.native
    
    val parserOptions: js.Any = js.native
  }
}
