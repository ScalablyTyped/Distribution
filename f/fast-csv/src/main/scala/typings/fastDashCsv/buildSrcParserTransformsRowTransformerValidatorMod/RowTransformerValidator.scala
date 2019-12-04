package typings.fastDashCsv.buildSrcParserTransformsRowTransformerValidatorMod

import typings.fastDashCsv.buildSrcParserTypesMod.Row
import typings.fastDashCsv.buildSrcParserTypesMod.RowTransformFunction
import typings.fastDashCsv.buildSrcParserTypesMod.RowValidate
import typings.fastDashCsv.buildSrcParserTypesMod.RowValidatorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowTransformerValidator extends js.Object {
  var _rowTransform: js.Any
  var _rowValidator: js.Any
  var callTransformer: js.Any
  var callValidator: js.Any
  var rowTransform: RowTransformFunction
  var rowValidator: RowValidate
  def transformAndValidate(row: Row, cb: RowValidatorCallback): Unit
}

object RowTransformerValidator {
  @scala.inline
  def apply(
    _rowTransform: js.Any,
    _rowValidator: js.Any,
    callTransformer: js.Any,
    callValidator: js.Any,
    rowTransform: RowTransformFunction,
    rowValidator: RowValidate,
    transformAndValidate: (Row, RowValidatorCallback) => Unit
  ): RowTransformerValidator = {
    val __obj = js.Dynamic.literal(_rowTransform = _rowTransform.asInstanceOf[js.Any], _rowValidator = _rowValidator.asInstanceOf[js.Any], callTransformer = callTransformer.asInstanceOf[js.Any], callValidator = callValidator.asInstanceOf[js.Any], rowTransform = rowTransform.asInstanceOf[js.Any], rowValidator = rowValidator.asInstanceOf[js.Any], transformAndValidate = js.Any.fromFunction2(transformAndValidate))
  
    __obj.asInstanceOf[RowTransformerValidator]
  }
}

