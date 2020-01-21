package typings.fastCsv.rowTransformerValidatorMod

import typings.fastCsv.parserTypesMod.Row
import typings.fastCsv.parserTypesMod.RowTransformFunction
import typings.fastCsv.parserTypesMod.RowValidate
import typings.fastCsv.parserTypesMod.RowValidatorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/transforms/RowTransformerValidator", JSImport.Default)
@js.native
class default () extends RowTransformerValidator {
  /* CompleteClass */
  override var _rowTransform: js.Any = js.native
  /* CompleteClass */
  override var _rowValidator: js.Any = js.native
  /* CompleteClass */
  override var callTransformer: js.Any = js.native
  /* CompleteClass */
  override var callValidator: js.Any = js.native
  /* CompleteClass */
  override def rowTransform(transformFunction: RowTransformFunction): js.Any = js.native
  /* CompleteClass */
  override def rowValidator(validateFunction: RowValidate): js.Any = js.native
  /* CompleteClass */
  override def transformAndValidate(row: Row, cb: RowValidatorCallback): Unit = js.native
}

/* static members */
@JSImport("fast-csv/build/src/parser/transforms/RowTransformerValidator", JSImport.Default)
@js.native
object default extends js.Object {
  var createTransform: js.Any = js.native
  var createValidator: js.Any = js.native
}

