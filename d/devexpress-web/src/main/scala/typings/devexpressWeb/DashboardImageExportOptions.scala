package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains options related to exporting a dashboard/dashboard item to an image.
  */
trait DashboardImageExportOptions extends StObject {
  
  /**
    * Gets or sets whether to add the state of master filter items to the exported document.
    */
  var ExportFilters: Boolean
  
  /**
    * Gets or sets whether to add current parameter values to the exported document.
    */
  var ExportParameters: Boolean
  
  /**
    * Provides access to the font settings of the exported document.
    */
  var FontInfo: ExportFontInfo
  
  /**
    * Gets or sets an image format in which the dashboard/dashboard item is exported.
    */
  var Format: String
  
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    */
  var IncludeHiddenParameters: Boolean
  
  /**
    * Gets or sets the resolution (in dpi) used to export a dashboard/dashboard item to an image.
    */
  var Resolution: Double
  
  /**
    * Gets or sets the scale factor (in fractions of 1), by which a dashboard/dashboard item is scaled in the exported document.
    */
  var ScaleFactor: Double
  
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    */
  var ShowTitle: Boolean
  
  /**
    * Gets or sets a title of the exported document.
    */
  var Title: String
}
object DashboardImageExportOptions {
  
  @scala.inline
  def apply(
    ExportFilters: Boolean,
    ExportParameters: Boolean,
    FontInfo: ExportFontInfo,
    Format: String,
    IncludeHiddenParameters: Boolean,
    Resolution: Double,
    ScaleFactor: Double,
    ShowTitle: Boolean,
    Title: String
  ): DashboardImageExportOptions = {
    val __obj = js.Dynamic.literal(ExportFilters = ExportFilters.asInstanceOf[js.Any], ExportParameters = ExportParameters.asInstanceOf[js.Any], FontInfo = FontInfo.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], IncludeHiddenParameters = IncludeHiddenParameters.asInstanceOf[js.Any], Resolution = Resolution.asInstanceOf[js.Any], ScaleFactor = ScaleFactor.asInstanceOf[js.Any], ShowTitle = ShowTitle.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardImageExportOptions]
  }
  
  @scala.inline
  implicit class DashboardImageExportOptionsMutableBuilder[Self <: DashboardImageExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportFilters(value: Boolean): Self = StObject.set(x, "ExportFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportParameters(value: Boolean): Self = StObject.set(x, "ExportParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontInfo(value: ExportFontInfo): Self = StObject.set(x, "FontInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeHiddenParameters(value: Boolean): Self = StObject.set(x, "IncludeHiddenParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "ScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = StObject.set(x, "ShowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
