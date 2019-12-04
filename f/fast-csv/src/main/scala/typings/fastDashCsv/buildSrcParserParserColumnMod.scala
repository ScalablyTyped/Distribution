package typings.fastDashCsv

import typings.fastDashCsv.buildSrcParserParserColumnColumnFormatterMod.default
import typings.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser/column", JSImport.Namespace)
@js.native
object buildSrcParserParserColumnMod extends js.Object {
  @js.native
  class ColumnFormatter protected () extends default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class ColumnParser protected ()
    extends typings.fastDashCsv.buildSrcParserParserColumnColumnParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class NonQuotedColumnParser protected ()
    extends typings.fastDashCsv.buildSrcParserParserColumnNonQuotedColumnParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class QuotedColumnParser protected ()
    extends typings.fastDashCsv.buildSrcParserParserColumnQuotedColumnParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
}

