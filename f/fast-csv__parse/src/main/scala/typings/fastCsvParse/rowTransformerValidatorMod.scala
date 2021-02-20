package typings.fastCsvParse

import typings.fastCsvParse.typesMod.Row
import typings.fastCsvParse.typesMod.RowTransformFunction
import typings.fastCsvParse.typesMod.RowValidate
import typings.fastCsvParse.typesMod.RowValidatorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowTransformerValidatorMod {
  
  @JSImport("@fast-csv/parse/build/src/transforms/RowTransformerValidator", "RowTransformerValidator")
  @js.native
  class RowTransformerValidator[I /* <: Row[_] */, O /* <: Row[_] */] () extends StObject {
    
    var _rowTransform: js.Any = js.native
    
    var _rowValidator: js.Any = js.native
    
    var callTransformer: js.Any = js.native
    
    var callValidator: js.Any = js.native
    
    def rowTransform_=(transformFunction: RowTransformFunction[I, O]): Unit = js.native
    
    def rowValidator_=(validateFunction: RowValidate[O]): Unit = js.native
    
    def transformAndValidate(row: I, cb: RowValidatorCallback[O]): Unit = js.native
  }
  /* static members */
  object RowTransformerValidator {
    
    @JSImport("@fast-csv/parse/build/src/transforms/RowTransformerValidator", "RowTransformerValidator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse/build/src/transforms/RowTransformerValidator", "RowTransformerValidator.createTransform")
    @js.native
    def createTransform: js.Any = js.native
    @scala.inline
    def createTransform_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTransform")(x.asInstanceOf[js.Any])
    
    @JSImport("@fast-csv/parse/build/src/transforms/RowTransformerValidator", "RowTransformerValidator.createValidator")
    @js.native
    def createValidator: js.Any = js.native
    @scala.inline
    def createValidator_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createValidator")(x.asInstanceOf[js.Any])
  }
}
