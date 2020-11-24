package typings.fastCsvParse.parserParserMod

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fast-csv/parse/build/src/parser/Parser", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(parserOptions: ParserOptions) = this()
  
  def parse(line: String, hasMoreData: Boolean): ParseResult = js.native
  
  var parseRow: js.Any = js.native
  
  var parseWithComments: js.Any = js.native
  
  var parseWithoutComments: js.Any = js.native
  
  val parserOptions: js.Any = js.native
  
  val rowParser: js.Any = js.native
}
/* static members */
@JSImport("@fast-csv/parse/build/src/parser/Parser", "Parser")
@js.native
object Parser extends js.Object {
  
  var removeBOM: js.Any = js.native
}
