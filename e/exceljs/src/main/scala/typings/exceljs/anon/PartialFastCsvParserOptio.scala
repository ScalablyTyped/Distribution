package typings.exceljs.anon

import typings.exceljs.mod.HeaderArray
import typings.exceljs.mod.HeaderTransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.FastCsvParserOptionsArgs> */
trait PartialFastCsvParserOptio extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var discardUnmappedColumns: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var escape: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[Boolean | HeaderTransformFunction | HeaderArray] = js.undefined
  var ignoreEmpty: js.UndefOr[Boolean] = js.undefined
  var ltrim: js.UndefOr[Boolean] = js.undefined
  var maxRows: js.UndefOr[Double] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
  var quote: js.UndefOr[String] = js.undefined
  var renameHeaders: js.UndefOr[Boolean] = js.undefined
  var rtrim: js.UndefOr[Boolean] = js.undefined
  var skipLines: js.UndefOr[Double] = js.undefined
  var skipRows: js.UndefOr[Double] = js.undefined
  var strictColumnHandling: js.UndefOr[Boolean] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
}

object PartialFastCsvParserOptio {
  @scala.inline
  def apply(
    comment: String = null,
    delimiter: String = null,
    discardUnmappedColumns: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    escape: String = null,
    headers: Boolean | HeaderTransformFunction | HeaderArray = null,
    ignoreEmpty: js.UndefOr[Boolean] = js.undefined,
    ltrim: js.UndefOr[Boolean] = js.undefined,
    maxRows: js.UndefOr[Double] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    quote: String = null,
    renameHeaders: js.UndefOr[Boolean] = js.undefined,
    rtrim: js.UndefOr[Boolean] = js.undefined,
    skipLines: js.UndefOr[Double] = js.undefined,
    skipRows: js.UndefOr[Double] = js.undefined,
    strictColumnHandling: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
  ): PartialFastCsvParserOptio = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(discardUnmappedColumns)) __obj.updateDynamic("discardUnmappedColumns")(discardUnmappedColumns.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmpty)) __obj.updateDynamic("ignoreEmpty")(ignoreEmpty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ltrim)) __obj.updateDynamic("ltrim")(ltrim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRows)) __obj.updateDynamic("maxRows")(maxRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.get.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (!js.isUndefined(renameHeaders)) __obj.updateDynamic("renameHeaders")(renameHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtrim)) __obj.updateDynamic("rtrim")(rtrim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipLines)) __obj.updateDynamic("skipLines")(skipLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipRows)) __obj.updateDynamic("skipRows")(skipRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictColumnHandling)) __obj.updateDynamic("strictColumnHandling")(strictColumnHandling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFastCsvParserOptio]
  }
}

