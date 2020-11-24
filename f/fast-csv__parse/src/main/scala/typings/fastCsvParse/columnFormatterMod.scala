package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fast-csv/parse/build/src/parser/column/ColumnFormatter", JSImport.Namespace)
@js.native
object columnFormatterMod extends js.Object {
  
  @js.native
  class ColumnFormatter protected () extends js.Object {
    def this(parserOptions: ParserOptions) = this()
    
    def format(col: String): String = js.native
  }
}
