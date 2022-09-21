package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnFormatterMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/column/ColumnFormatter", "ColumnFormatter")
  @js.native
  open class ColumnFormatter protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    def format(col: String): String = js.native
  }
}
