package typings.fastCsv.rowFormatterMod

import typings.fastCsv.typesMod.Row
import typings.fastCsv.typesMod.RowTransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowFormatter extends js.Object {
  var _rowTransform: js.UndefOr[js.Any] = js.undefined
  var callTransformer: js.Any
  var checkHeaders: js.Any
  val fieldFormatter: js.Any
  var formatColumns: js.Any
  val formatterOptions: js.Any
  var gatherColumns: js.Any
  var hasWrittenHeaders: js.Any
  var headers: js.Any
  var rowCount: js.Any
  var shouldWriteHeaders: js.Any
  def finish(cb: RowFormatterCallback): Unit
  def format(row: Row, cb: RowFormatterCallback): Unit
  def rowTransform(transformFunction: RowTransformFunction): js.Any
}

object RowFormatter {
  @scala.inline
  def apply(
    callTransformer: js.Any,
    checkHeaders: js.Any,
    fieldFormatter: js.Any,
    finish: RowFormatterCallback => Unit,
    format: (Row, RowFormatterCallback) => Unit,
    formatColumns: js.Any,
    formatterOptions: js.Any,
    gatherColumns: js.Any,
    hasWrittenHeaders: js.Any,
    headers: js.Any,
    rowCount: js.Any,
    rowTransform: RowTransformFunction => js.Any,
    shouldWriteHeaders: js.Any,
    _rowTransform: js.Any = null
  ): RowFormatter = {
    val __obj = js.Dynamic.literal(callTransformer = callTransformer.asInstanceOf[js.Any], checkHeaders = checkHeaders.asInstanceOf[js.Any], fieldFormatter = fieldFormatter.asInstanceOf[js.Any], finish = js.Any.fromFunction1(finish), format = js.Any.fromFunction2(format), formatColumns = formatColumns.asInstanceOf[js.Any], formatterOptions = formatterOptions.asInstanceOf[js.Any], gatherColumns = gatherColumns.asInstanceOf[js.Any], hasWrittenHeaders = hasWrittenHeaders.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowTransform = js.Any.fromFunction1(rowTransform), shouldWriteHeaders = shouldWriteHeaders.asInstanceOf[js.Any])
    if (_rowTransform != null) __obj.updateDynamic("_rowTransform")(_rowTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowFormatter]
  }
}

