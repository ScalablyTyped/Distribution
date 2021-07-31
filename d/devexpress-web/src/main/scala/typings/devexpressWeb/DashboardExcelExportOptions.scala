package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains options related to exporting a dashboard/dashboard item to the Excel format.
  */
trait DashboardExcelExportOptions extends StObject {
  
  /**
    * Gets or sets a character used to separate values in a CSV document.
    */
  var CsvValueSeparator: String
  
  /**
    * Gets or sets the position of the dashboard state (such as master filter or current parameter values) in the exported document.
    */
  var DashboardStatePosition: String
  
  /**
    * Gets or sets whether to add the state of master filter items to the exported document.
    */
  var ExportFilters: Boolean
  
  /**
    * Gets or sets whether to add current parameter values to the exported document.
    */
  var ExportParameters: Boolean
  
  /**
    * Gets or sets the Excel format in which the dashboard item is exported.
    */
  var Format: String
  
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    */
  var IncludeHiddenParameters: Boolean
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
  implicit class DashboardExcelExportOptionsMutableBuilder[Self <: DashboardExcelExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsvValueSeparator(value: String): Self = StObject.set(x, "CsvValueSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardStatePosition(value: String): Self = StObject.set(x, "DashboardStatePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFilters(value: Boolean): Self = StObject.set(x, "ExportFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportParameters(value: Boolean): Self = StObject.set(x, "ExportParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeHiddenParameters(value: Boolean): Self = StObject.set(x, "IncludeHiddenParameters", value.asInstanceOf[js.Any])
  }
}
