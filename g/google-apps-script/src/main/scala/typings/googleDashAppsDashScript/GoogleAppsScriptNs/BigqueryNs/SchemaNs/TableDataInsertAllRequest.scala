package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataInsertAllRequest extends js.Object {
  var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Array[TableDataInsertAllRequestRows]] = js.undefined
  var skipInvalidRows: js.UndefOr[Boolean] = js.undefined
  var templateSuffix: js.UndefOr[String] = js.undefined
}

object TableDataInsertAllRequest {
  @scala.inline
  def apply(
    ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    rows: js.Array[TableDataInsertAllRequestRows] = null,
    skipInvalidRows: js.UndefOr[Boolean] = js.undefined,
    templateSuffix: String = null
  ): TableDataInsertAllRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreUnknownValues)) __obj.updateDynamic("ignoreUnknownValues")(ignoreUnknownValues)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (!js.isUndefined(skipInvalidRows)) __obj.updateDynamic("skipInvalidRows")(skipInvalidRows)
    if (templateSuffix != null) __obj.updateDynamic("templateSuffix")(templateSuffix)
    __obj.asInstanceOf[TableDataInsertAllRequest]
  }
}

