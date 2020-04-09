package typings.exceljs

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
  var headers: js.UndefOr[
    Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HeaderTransformFunction */ js.Any)
  ] = js.undefined
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
    headers: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HeaderTransformFunction */ js.Any) = null,
    ignoreEmpty: js.UndefOr[Boolean] = js.undefined,
    ltrim: js.UndefOr[Boolean] = js.undefined,
    maxRows: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    quote: String = null,
    renameHeaders: js.UndefOr[Boolean] = js.undefined,
    rtrim: js.UndefOr[Boolean] = js.undefined,
    skipLines: Int | Double = null,
    skipRows: Int | Double = null,
    strictColumnHandling: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
  ): PartialFastCsvParserOptio = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(discardUnmappedColumns)) __obj.updateDynamic("discardUnmappedColumns")(discardUnmappedColumns.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmpty)) __obj.updateDynamic("ignoreEmpty")(ignoreEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(ltrim)) __obj.updateDynamic("ltrim")(ltrim.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (!js.isUndefined(renameHeaders)) __obj.updateDynamic("renameHeaders")(renameHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(rtrim)) __obj.updateDynamic("rtrim")(rtrim.asInstanceOf[js.Any])
    if (skipLines != null) __obj.updateDynamic("skipLines")(skipLines.asInstanceOf[js.Any])
    if (skipRows != null) __obj.updateDynamic("skipRows")(skipRows.asInstanceOf[js.Any])
    if (!js.isUndefined(strictColumnHandling)) __obj.updateDynamic("strictColumnHandling")(strictColumnHandling.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFastCsvParserOptio]
  }
}

