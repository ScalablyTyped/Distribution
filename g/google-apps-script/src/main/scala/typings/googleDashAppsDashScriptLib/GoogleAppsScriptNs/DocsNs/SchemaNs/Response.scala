package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

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
    if (createNamedRange != null) __obj.updateDynamic("createNamedRange")(createNamedRange)
    if (insertInlineImage != null) __obj.updateDynamic("insertInlineImage")(insertInlineImage)
    if (insertInlineSheetsChart != null) __obj.updateDynamic("insertInlineSheetsChart")(insertInlineSheetsChart)
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText)
    __obj.asInstanceOf[Response]
  }
}

