package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowExportSelectedData extends js.Object {
  var allowExportSelectedData: js.UndefOr[Boolean] = js.undefined
  var customizeExcelCell: js.UndefOr[js.Function1[/* options */ AnonFillPatternColor, _]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var excelFilterEnabled: js.UndefOr[Boolean] = js.undefined
  var excelWrapTextEnabled: js.UndefOr[Boolean] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var ignoreExcelErrors: js.UndefOr[Boolean] = js.undefined
  var proxyUrl: js.UndefOr[String] = js.undefined
  var texts: js.UndefOr[AnonExportAll] = js.undefined
}

object AnonAllowExportSelectedData {
  @scala.inline
  def apply(
    allowExportSelectedData: js.UndefOr[Boolean] = js.undefined,
    customizeExcelCell: /* options */ AnonFillPatternColor => _ = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    excelFilterEnabled: js.UndefOr[Boolean] = js.undefined,
    excelWrapTextEnabled: js.UndefOr[Boolean] = js.undefined,
    fileName: String = null,
    ignoreExcelErrors: js.UndefOr[Boolean] = js.undefined,
    proxyUrl: String = null,
    texts: AnonExportAll = null
  ): AnonAllowExportSelectedData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowExportSelectedData)) __obj.updateDynamic("allowExportSelectedData")(allowExportSelectedData.asInstanceOf[js.Any])
    if (customizeExcelCell != null) __obj.updateDynamic("customizeExcelCell")(js.Any.fromFunction1(customizeExcelCell))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(excelFilterEnabled)) __obj.updateDynamic("excelFilterEnabled")(excelFilterEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(excelWrapTextEnabled)) __obj.updateDynamic("excelWrapTextEnabled")(excelWrapTextEnabled.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExcelErrors)) __obj.updateDynamic("ignoreExcelErrors")(ignoreExcelErrors.asInstanceOf[js.Any])
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowExportSelectedData]
  }
}

