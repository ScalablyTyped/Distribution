package typings.fastCsvParse

import typings.fastCsvParse.buildSrcParserOptionsMod.ParserOptions
import typings.fastCsvParse.buildSrcTypesMod.Row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTransformsMod {
  
  @JSImport("@fast-csv/parse/build/src/transforms", "HeaderTransformer")
  @js.native
  open class HeaderTransformer[O /* <: Row[Any] */] protected ()
    extends typings.fastCsvParse.buildSrcTransformsHeaderTransformerMod.HeaderTransformer[O] {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/transforms", "RowTransformerValidator")
  @js.native
  open class RowTransformerValidator[I /* <: Row[Any] */, O /* <: Row[Any] */] ()
    extends typings.fastCsvParse.buildSrcTransformsRowTransformerValidatorMod.RowTransformerValidator[I, O]
  /* static members */
  object RowTransformerValidator {
    
    @JSImport("@fast-csv/parse/build/src/transforms", "RowTransformerValidator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse/build/src/transforms", "RowTransformerValidator.createTransform")
    @js.native
    def createTransform: Any = js.native
    inline def createTransform_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTransform")(x.asInstanceOf[js.Any])
    
    @JSImport("@fast-csv/parse/build/src/transforms", "RowTransformerValidator.createValidator")
    @js.native
    def createValidator: Any = js.native
    inline def createValidator_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createValidator")(x.asInstanceOf[js.Any])
  }
}
