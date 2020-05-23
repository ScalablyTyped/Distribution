package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains options related to exporting a dashboard/dashboard item to an image.
  */
@JSGlobal("DashboardImageExportOptions")
@js.native
class DashboardImageExportOptions ()
  extends typings.devexpressWeb.DashboardImageExportOptions {
  /**
    * Gets or sets whether to add the state of master filter items to the exported document.
    */
  /* CompleteClass */
  override var ExportFilters: Boolean = js.native
  /**
    * Gets or sets whether to add current parameter values to the exported document.
    */
  /* CompleteClass */
  override var ExportParameters: Boolean = js.native
  /* CompleteClass */
  override var FontInfo: typings.devexpressWeb.ExportFontInfo = js.native
  /**
    * Gets or sets an image format in which the dashboard/dashboard item is exported.
    */
  /* CompleteClass */
  override var Format: String = js.native
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    */
  /* CompleteClass */
  override var IncludeHiddenParameters: Boolean = js.native
  /**
    * Gets or sets the resolution (in dpi) used to export a dashboard/dashboard item to an image.
    */
  /* CompleteClass */
  override var Resolution: Double = js.native
  /**
    * Gets or sets the scale factor (in fractions of 1), by which a dashboard/dashboard item is scaled in the exported document.
    */
  /* CompleteClass */
  override var ScaleFactor: Double = js.native
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    */
  /* CompleteClass */
  override var ShowTitle: Boolean = js.native
  /**
    * Gets or sets a title of the exported document.
    */
  /* CompleteClass */
  override var Title: String = js.native
}

