package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains options related to exporting a dashboard/dashboard item to the Excel format.
  */
@JSGlobal("DashboardExcelExportOptions")
@js.native
class DashboardExcelExportOptions ()
  extends StObject
     with typings.devexpressWeb.DashboardExcelExportOptions {
  
  /**
    * Gets or sets a character used to separate values in a CSV document.
    */
  /* CompleteClass */
  var CsvValueSeparator: String = js.native
  
  /**
    * Gets or sets the position of the dashboard state (such as master filter or current parameter values) in the exported document.
    */
  /* CompleteClass */
  var DashboardStatePosition: String = js.native
  
  /**
    * Gets or sets whether to add the state of master filter items to the exported document.
    */
  /* CompleteClass */
  var ExportFilters: Boolean = js.native
  
  /**
    * Gets or sets whether to add current parameter values to the exported document.
    */
  /* CompleteClass */
  var ExportParameters: Boolean = js.native
  
  /**
    * Gets or sets the Excel format in which the dashboard item is exported.
    */
  /* CompleteClass */
  var Format: String = js.native
  
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    */
  /* CompleteClass */
  var IncludeHiddenParameters: Boolean = js.native
}
