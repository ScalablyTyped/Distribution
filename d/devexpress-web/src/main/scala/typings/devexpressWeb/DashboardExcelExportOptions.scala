package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains options related to exporting a dashboard/dashboard item to the Excel format.
  */
@js.native
trait DashboardExcelExportOptions extends js.Object {
  /**
    * Gets or sets a character used to separate values in a CSV document.
    */
  var CsvValueSeparator: String = js.native
  /**
    * Gets or sets the position of the dashboard state (such as master filter or current parameter values) in the exported document.
    */
  var DashboardStatePosition: String = js.native
  /**
    * Gets or sets whether to add the state of master filter items to the exported document.
    */
  var ExportFilters: Boolean = js.native
  /**
    * Gets or sets whether to add current parameter values to the exported document.
    */
  var ExportParameters: Boolean = js.native
  /**
    * Gets or sets the Excel format in which the dashboard item is exported.
    */
  var Format: String = js.native
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    */
  var IncludeHiddenParameters: Boolean = js.native
}

object DashboardExcelExportOptions {
  @scala.inline
  def apply(
    CsvValueSeparator: String,
    DashboardStatePosition: String,
    ExportFilters: Boolean,
    ExportParameters: Boolean,
    Format: String,
    IncludeHiddenParameters: Boolean
  ): DashboardExcelExportOptions = {
    val __obj = js.Dynamic.literal(CsvValueSeparator = CsvValueSeparator.asInstanceOf[js.Any], DashboardStatePosition = DashboardStatePosition.asInstanceOf[js.Any], ExportFilters = ExportFilters.asInstanceOf[js.Any], ExportParameters = ExportParameters.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], IncludeHiddenParameters = IncludeHiddenParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardExcelExportOptions]
  }
  @scala.inline
  implicit class DashboardExcelExportOptionsOps[Self <: DashboardExcelExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCsvValueSeparator(value: String): Self = this.set("CsvValueSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashboardStatePosition(value: String): Self = this.set("DashboardStatePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportFilters(value: Boolean): Self = this.set("ExportFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportParameters(value: Boolean): Self = this.set("ExportParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeHiddenParameters(value: Boolean): Self = this.set("IncludeHiddenParameters", value.asInstanceOf[js.Any])
  }
  
}

