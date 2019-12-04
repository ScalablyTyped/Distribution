package typings.fastDashCsv

import typings.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptions
import typings.fastDashCsv.buildSrcParserTransformsHeaderTransformerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/transforms", JSImport.Namespace)
@js.native
object buildSrcParserTransformsMod extends js.Object {
  @js.native
  class HeaderTransformer protected () extends default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class RowTransformerValidator ()
    extends typings.fastDashCsv.buildSrcParserTransformsRowTransformerValidatorMod.default
  
  /* static members */
  @js.native
  object RowTransformerValidator extends js.Object {
    var createTransform: js.Any = js.native
    var createValidator: js.Any = js.native
  }
  
}

