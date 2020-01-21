package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var createNamedRange: js.UndefOr[CreateNamedRangeResponse] = js.undefined
  var insertInlineImage: js.UndefOr[InsertInlineImageResponse] = js.undefined
  var insertInlineSheetsChart: js.UndefOr[InsertInlineSheetsChartResponse] = js.undefined
  var replaceAllText: js.UndefOr[ReplaceAllTextResponse] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    createNamedRange: CreateNamedRangeResponse = null,
    insertInlineImage: InsertInlineImageResponse = null,
    insertInlineSheetsChart: InsertInlineSheetsChartResponse = null,
    replaceAllText: ReplaceAllTextResponse = null
  ): Response = {
    val __obj = js.Dynamic.literal()
    if (createNamedRange != null) __obj.updateDynamic("createNamedRange")(createNamedRange.asInstanceOf[js.Any])
    if (insertInlineImage != null) __obj.updateDynamic("insertInlineImage")(insertInlineImage.asInstanceOf[js.Any])
    if (insertInlineSheetsChart != null) __obj.updateDynamic("insertInlineSheetsChart")(insertInlineSheetsChart.asInstanceOf[js.Any])
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

