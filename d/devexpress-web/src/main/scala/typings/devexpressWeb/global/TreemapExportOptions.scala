package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Treemap dashboard item is Printing and Exporting.
  */
@JSGlobal("TreemapExportOptions")
@js.native
class TreemapExportOptions ()
  extends typings.devexpressWeb.TreemapExportOptions {
  /** @deprecated The TreemapExportOptions.AutomaticPageLayout property is obsolete now. Use the DashboardPdfExportOptions.TreemapAutomaticPageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the page orientation used to export a Treemap dashboard item is selected automatically.
    */
  /* CompleteClass */
  override var AutomaticPageLayout: Boolean = js.native
  /** @deprecated The TreemapExportOptions.SizeMode property is obsolete now. Use the DashboardPdfExportOptions.TreemapSizeMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the export size mode for the Treemap dashboard item.
    */
  /* CompleteClass */
  override var SizeMode: String = js.native
}

