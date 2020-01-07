package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single response from an update.
  */
@js.native
trait Schema$Response extends js.Object {
  /**
    * The result of creating a named range.
    */
  var createNamedRange: js.UndefOr[Schema$CreateNamedRangeResponse] = js.native
  /**
    * The result of inserting an inline image.
    */
  var insertInlineImage: js.UndefOr[Schema$InsertInlineImageResponse] = js.native
  /**
    * The result of inserting an inline Google Sheets chart.
    */
  var insertInlineSheetsChart: js.UndefOr[Schema$InsertInlineSheetsChartResponse] = js.native
  /**
    * The result of replacing text.
    */
  var replaceAllText: js.UndefOr[Schema$ReplaceAllTextResponse] = js.native
}

object Schema$Response {
  @scala.inline
  def apply(
    createNamedRange: Schema$CreateNamedRangeResponse = null,
    insertInlineImage: Schema$InsertInlineImageResponse = null,
    insertInlineSheetsChart: Schema$InsertInlineSheetsChartResponse = null,
    replaceAllText: Schema$ReplaceAllTextResponse = null
  ): Schema$Response = {
    val __obj = js.Dynamic.literal()
    if (createNamedRange != null) __obj.updateDynamic("createNamedRange")(createNamedRange.asInstanceOf[js.Any])
    if (insertInlineImage != null) __obj.updateDynamic("insertInlineImage")(insertInlineImage.asInstanceOf[js.Any])
    if (insertInlineSheetsChart != null) __obj.updateDynamic("insertInlineSheetsChart")(insertInlineSheetsChart.asInstanceOf[js.Any])
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Response]
  }
}

