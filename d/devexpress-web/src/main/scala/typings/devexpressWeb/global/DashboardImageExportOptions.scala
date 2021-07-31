package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains options related to exporting a dashboard/dashboard item to an image.
  */
@JSGlobal("DashboardImageExportOptions")
@js.native
class DashboardImageExportOptions ()
  extends StObject
     with typings.devexpressWeb.DashboardImageExportOptions {
  
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
    * Provides access to the font settings of the exported document.
    */
  /* CompleteClass */
  var FontInfo: typings.devexpressWeb.ExportFontInfo = js.native
  
  /**
    * Gets or sets an image format in which the dashboard/dashboard item is exported.
    */
  /* CompleteClass */
  var Format: String = js.native
  
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    */
  /* CompleteClass */
  var IncludeHiddenParameters: Boolean = js.native
  
  /**
    * Gets or sets the resolution (in dpi) used to export a dashboard/dashboard item to an image.
    */
  /* CompleteClass */
  var Resolution: Double = js.native
  
  /**
    * Gets or sets the scale factor (in fractions of 1), by which a dashboard/dashboard item is scaled in the exported document.
    */
  /* CompleteClass */
  var ScaleFactor: Double = js.native
  
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    */
  /* CompleteClass */
  var ShowTitle: Boolean = js.native
  
  /**
    * Gets or sets a title of the exported document.
    */
  /* CompleteClass */
  var Title: String = js.native
}
