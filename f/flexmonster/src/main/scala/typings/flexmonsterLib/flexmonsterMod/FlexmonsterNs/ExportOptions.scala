package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportOptions extends js.Object {
  var destinationType: js.UndefOr[java.lang.String] = js.undefined
  var excelExportAll: js.UndefOr[scala.Boolean] = js.undefined
  var excelSheetName: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var footer: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var pageOrientation: js.UndefOr[java.lang.String] = js.undefined
  var showFilters: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var useCustomizeCellForData: js.UndefOr[scala.Boolean] = js.undefined
  var useOlapFormattingInExcel: js.UndefOr[scala.Boolean] = js.undefined
}

object ExportOptions {
  @scala.inline
  def apply(
    destinationType: java.lang.String = null,
    excelExportAll: js.UndefOr[scala.Boolean] = js.undefined,
    excelSheetName: java.lang.String = null,
    filename: java.lang.String = null,
    footer: java.lang.String = null,
    header: java.lang.String = null,
    pageOrientation: java.lang.String = null,
    showFilters: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null,
    useCustomizeCellForData: js.UndefOr[scala.Boolean] = js.undefined,
    useOlapFormattingInExcel: js.UndefOr[scala.Boolean] = js.undefined
  ): ExportOptions = {
    val __obj = js.Dynamic.literal()
    if (destinationType != null) __obj.updateDynamic("destinationType")(destinationType)
    if (!js.isUndefined(excelExportAll)) __obj.updateDynamic("excelExportAll")(excelExportAll)
    if (excelSheetName != null) __obj.updateDynamic("excelSheetName")(excelSheetName)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation)
    if (!js.isUndefined(showFilters)) __obj.updateDynamic("showFilters")(showFilters)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(useCustomizeCellForData)) __obj.updateDynamic("useCustomizeCellForData")(useCustomizeCellForData)
    if (!js.isUndefined(useOlapFormattingInExcel)) __obj.updateDynamic("useOlapFormattingInExcel")(useOlapFormattingInExcel)
    __obj.asInstanceOf[ExportOptions]
  }
}

