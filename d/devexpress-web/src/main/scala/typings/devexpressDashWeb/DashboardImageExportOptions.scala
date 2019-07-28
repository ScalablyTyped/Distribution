package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains options related to exporting a dashboard/dashboard item to an image.
  */
trait DashboardImageExportOptions extends js.Object {
  /**
    * Gets or sets whether to add the state of master filter items to the exported document.
    * Value: true, to add the state of master filter items to the exported document; otherwise, false.
    */
  var ExportFilters: Boolean
  /**
    * Gets or sets whether to add current parameter values to the exported document.
    * Value: true, to add current parameter values to the exported document; otherwise, false.
    */
  var ExportParameters: Boolean
  var FontInfo: ExportFontInfo
  /**
    * Gets or sets an image format in which the dashboard/dashboard item is exported.
    * Value: A DashboardExportImageFormat value that specifies an image format in which the dashboard/dashboard item is exported.
    */
  var Format: String
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    * Value: true, to add current values of a hidden parameter to the exported document; otherwise, false.
    */
  var IncludeHiddenParameters: Boolean
  /**
    * Gets or sets the resolution (in dpi) used to export a dashboard/dashboard item to an image.
    * Value: An integer value that specifies the resolution (in dpi) used to export a dashboard/dashboard item to an image.
    */
  var Resolution: Double
  /**
    * Gets or sets the scale factor (in fractions of 1), by which a dashboard/dashboard item is scaled in the exported document.
    * Value: A string value that specifies the scale factor by which a dashboard/dashboard item is scaled in the exported document.
    */
  var ScaleFactor: Double
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    * Value: true, to include a dashboard title (or dashboard item's caption) as the exported document title; otherwise, false.
    */
  var ShowTitle: Boolean
  /**
    * Gets or sets a title of the exported document.
    * Value: A string value that specifies the title of the exported document.
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
    val __obj = js.Dynamic.literal(ExportFilters = ExportFilters, ExportParameters = ExportParameters, FontInfo = FontInfo, Format = Format, IncludeHiddenParameters = IncludeHiddenParameters, Resolution = Resolution, ScaleFactor = ScaleFactor, ShowTitle = ShowTitle, Title = Title)
  
    __obj.asInstanceOf[DashboardImageExportOptions]
  }
}

