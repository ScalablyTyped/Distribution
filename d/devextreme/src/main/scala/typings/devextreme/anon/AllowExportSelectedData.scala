package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowExportSelectedData extends js.Object {
  var allowExportSelectedData: js.UndefOr[Boolean] = js.undefined
  var customizeExcelCell: js.UndefOr[js.Function1[/* options */ FillPatternColor, _]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var excelFilterEnabled: js.UndefOr[Boolean] = js.undefined
  var excelWrapTextEnabled: js.UndefOr[Boolean] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var ignoreExcelErrors: js.UndefOr[Boolean] = js.undefined
  var proxyUrl: js.UndefOr[String] = js.undefined
  var texts: js.UndefOr[ExportAll] = js.undefined
}

object AllowExportSelectedData {
  @scala.inline
  def apply(
    allowExportSelectedData: js.UndefOr[Boolean] = js.undefined,
    customizeExcelCell: /* options */ FillPatternColor => _ = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    excelFilterEnabled: js.UndefOr[Boolean] = js.undefined,
    excelWrapTextEnabled: js.UndefOr[Boolean] = js.undefined,
    fileName: String = null,
    ignoreExcelErrors: js.UndefOr[Boolean] = js.undefined,
    proxyUrl: String = null,
    texts: ExportAll = null
  ): AllowExportSelectedData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowExportSelectedData)) __obj.updateDynamic("allowExportSelectedData")(allowExportSelectedData.get.asInstanceOf[js.Any])
    if (customizeExcelCell != null) __obj.updateDynamic("customizeExcelCell")(js.Any.fromFunction1(customizeExcelCell))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(excelFilterEnabled)) __obj.updateDynamic("excelFilterEnabled")(excelFilterEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(excelWrapTextEnabled)) __obj.updateDynamic("excelWrapTextEnabled")(excelWrapTextEnabled.get.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExcelErrors)) __obj.updateDynamic("ignoreExcelErrors")(ignoreExcelErrors.get.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowExportSelectedData]
  }
}

