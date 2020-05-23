package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the dashboard (dashboard item) is exported.
  */
@JSGlobal("ASPxClientDashboardExportOptions")
@js.native
class ASPxClientDashboardExportOptions ()
  extends typings.devexpressWeb.ASPxClientDashboardExportOptions {
  /** @deprecated This AutoFitPageCount property is obsolete now. Use the DashboardPdfExportOptions.AutoFitPageCount property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the number of horizontal/vertical pages spanning the total width/height of a dashboard (dashboard item).
    */
  /* CompleteClass */
  override var AutoFitPageCount: Double = js.native
  /** @deprecated The CardOptions property is obsolete now. Use properties with the 'Card' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Card dashboard item.
    */
  /* CompleteClass */
  override var CardOptions: typings.devexpressWeb.CardExportOptions = js.native
  /** @deprecated The ChartOptions property is obsolete now. Use properties with the 'Chart' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Chart dashboard item.
    */
  /* CompleteClass */
  override var ChartOptions: typings.devexpressWeb.ChartExportOptions = js.native
  /** @deprecated The ExcelOptions property is obsolete now. Use properties exposed by the DashboardExcelExportOptions class instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting individual dashboard items in Excel format.
    */
  /* CompleteClass */
  override var ExcelOptions: typings.devexpressWeb.ExcelFormatOptions = js.native
  /** @deprecated This property is obsolete now. Instead use the ExportFilters/DashboardStatePosition properties exposed by the DashboardPdfExportOptions/DashboardImageExportOptions classes. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the filter state's location on the exported document.
    */
  /* CompleteClass */
  override var FilterState: String = js.native
  /** @deprecated The GaugeOptions property is obsolete now. Use properties with the 'Gauge' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Gauge dashboard item.
    */
  /* CompleteClass */
  override var GaugeOptions: typings.devexpressWeb.GaugeExportOptions = js.native
  /** @deprecated The GridOptions property is obsolete now. Use properties with the 'Grid' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Grid dashboard item.
    */
  /* CompleteClass */
  override var GridOptions: typings.devexpressWeb.GridExportOptions = js.native
  /** @deprecated The ImageOptions property is obsolete now. Use properties exposed by the DashboardImageExportOptions class instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a dashboard or individual items in Image format.
    */
  /* CompleteClass */
  override var ImageOptions: typings.devexpressWeb.ImageFormatOptions = js.native
  /** @deprecated The MapOptions property is obsolete now. Use properties with the 'Map' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting map dashboard items.
    */
  /* CompleteClass */
  override var MapOptions: typings.devexpressWeb.MapExportOptions = js.native
  /** @deprecated The PageLayout property is obsolete now. Use the DashboardPdfExportOptions.PageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the page orientation used to export a dashboard (dashboard item).
    */
  /* CompleteClass */
  override var PageLayout: String = js.native
  /** @deprecated The PaperKind property is obsolete now. Use the DashboardPdfExportOptions.PaperKind property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the standard paper size.
    */
  /* CompleteClass */
  override var PaperKind: String = js.native
  /** @deprecated The PieOptions property is obsolete now. Use properties with the 'Pie' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Pie dashboard item.
    */
  /* CompleteClass */
  override var PieOptions: typings.devexpressWeb.PieExportOptions = js.native
  /** @deprecated The PivotOptions property is obsolete now. Use properties with the 'Pivot' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Pivot dashboard item.
    */
  /* CompleteClass */
  override var PivotOptions: typings.devexpressWeb.PivotExportOptions = js.native
  /** @deprecated The RangeFilterOptions property is obsolete now. Use properties with the 'RangeFilter' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Range Filter dashboard item.
    */
  /* CompleteClass */
  override var RangeFilterOptions: typings.devexpressWeb.RangeFilterExportOptions = js.native
  /** @deprecated The ScaleFactor property is obsolete now. Use the DashboardPdfExportOptions.ScaleFactor and DashboardImageExportOptions.ScaleFactor properties instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the scale factor (in fractions of 1) by which a dashboard (dashboard item) is scaled.
    */
  /* CompleteClass */
  override var ScaleFactor: Double = js.native
  /** @deprecated The ScaleMode property is obsolete now. Use the DashboardPdfExportOptions.ScaleMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the mode for scaling when exporting a dashboard (dashboard item).
    */
  /* CompleteClass */
  override var ScaleMode: String = js.native
  /** @deprecated The ShowTitle property is obsolete now. Use the DashboardPdfExportOptions.ShowTitle and DashboardImageExportOptions.ShowTitle properties instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    */
  /* CompleteClass */
  override var ShowTitle: Boolean = js.native
  /** @deprecated The Title property is obsolete now. Use the DashboardPdfExportOptions.Title and DashboardImageExportOptions.Title properties instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the title of the exported document.
    */
  /* CompleteClass */
  override var Title: String = js.native
  /** @deprecated The TreemapOptions property is obsolete now. Use properties with the 'Treemap' prefix exposed by the DashboardPdfExportOptions class. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Provides access to options for exporting a Treemap dashboard item.
    */
  /* CompleteClass */
  override var TreemapOptions: typings.devexpressWeb.TreemapExportOptions = js.native
}

