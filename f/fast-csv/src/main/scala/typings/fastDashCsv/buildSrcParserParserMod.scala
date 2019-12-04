package typings.fastDashCsv

import typings.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptions
import typings.fastDashCsv.buildSrcParserParserParserMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser", JSImport.Namespace)
@js.native
object buildSrcParserParserMod extends js.Object {
  @js.native
  class Parser protected () extends default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class RowParser protected ()
    extends typings.fastDashCsv.buildSrcParserParserRowParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  /* static members */
  @js.native
  object Parser extends js.Object {
    var removeBOM: js.Any = js.native
  }
  
}

