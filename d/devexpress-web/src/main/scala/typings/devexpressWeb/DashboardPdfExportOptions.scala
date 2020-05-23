package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains options related to exporting a dashboard/dashboard item to the PDF format.
  */
trait DashboardPdfExportOptions extends js.Object {
  /**
    * Gets or sets the number of horizontal/vertical pages spanning the total width/height of a dashboard/dashboard item.
    */
  var AutoFitPageCount: Double
  /**
    * Gets or sets whether cards within the Card dashboard item are arranged automatically on the exported page.
    */
  var CardAutoArrangeContent: Boolean
  /**
    * Gets or sets whether the page orientation used to export the Chart dashboard item is selected automatically.
    */
  var ChartAutomaticPageLayout: Boolean
  /**
    * Gets or sets the export size mode for the Chart dashboard item.
    */
  var ChartSizeMode: String
  /**
    * Gets or sets whether the page orientation used to export a dashboard is selected automatically.
    */
  var DashboardAutomaticPageLayout: Boolean
  /**
    * Gets or sets a position of the dashboard state (such as master filter or current parameter values) in the exported document.
    */
  var DashboardStatePosition: String
  /**
    * Gets or sets the mode for scaling a dashboard/dashboard item in the exported document.
    */
  var DocumentScaleMode: String
  /**
    * Gets or sets whether to add the state of master filter items to the exported document.
    */
  var ExportFilters: Boolean
  /**
    * Gets or sets whether to add current parameter values to the exported document.
    */
  var ExportParameters: Boolean
  var FontInfo: ExportFontInfo
  /**
    * Gets or sets whether gauges within the Gauge dashboard item are arranged automatically on the exported page.
    */
  var GaugeAutoArrangeContent: Boolean
  /**
    * Gets or sets whether the size of the Grid dashboard item is changed according to the width of the exported page.
    */
  var GridFitToPageWidth: Boolean
  /**
    * Gets or sets whether to add column headers of the Grid dashboard item to every page.
    */
  var GridPrintHeadersOnEveryPage: Boolean
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    */
  var IncludeHiddenParameters: Boolean
  /**
    * Gets or sets whether the page orientation used to export the Map dashboard item is selected automatically.
    */
  var MapAutomaticPageLayout: Boolean
  /**
    * Gets or sets the export size mode for the Map dashboard item.
    */
  var MapSizeMode: String
  /**
    * Gets or sets the page orientation used to export a dashboard/dashboard item.
    */
  var PageLayout: String
  /**
    * Gets or sets the type of paper for the exported document.
    */
  var PaperKind: String
  /**
    * Gets or sets whether pies within the Pie dashboard item are arranged automatically on the exported page.
    */
  var PieAutoArrangeContent: Boolean
  /**
    * Gets or sets whether to add column headers of the Pivot dashboard item to every page.
    */
  var PivotPrintHeadersOnEveryPage: Boolean
  /**
    * Gets or sets whether the page orientation used to export the Range Filter dashboard item is selected automatically.
    */
  var RangeFilterAutomaticPageLayout: Boolean
  /**
    * Gets or sets the export size mode for the Range Filter dashboard item.
    */
  var RangeFilterSizeMode: String
  /**
    * Gets or sets the scale factor (in fractions of 1), by which a dashboard/dashboard item is scaled in the exported document.
    */
  var ScaleFactor: Double
  /** @deprecated The ScaleMode property is obsolete now. Use the DocumentScaleMode and DashboardAutomaticPageLayout property instead. */
  /**
    * Gets or sets the mode for scaling a dashboard/dashboard item in the exported document.
    */
  var ScaleMode: String
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    */
  var ShowTitle: Boolean
  /**
    * Gets or sets the title of the exported document.
    */
  var Title: String
  /**
    * Gets or sets whether the page orientation used to export the Treemap dashboard item is selected automatically.
    */
  var TreemapAutomaticPageLayout: Boolean
  /**
    * Gets or sets the export size mode for the Treemap dashboard item.
    */
  var TreemapSizeMode: String
}

object DashboardPdfExportOptions {
  @scala.inline
  def apply(
    AutoFitPageCount: Double,
    CardAutoArrangeContent: Boolean,
    ChartAutomaticPageLayout: Boolean,
    ChartSizeMode: String,
    DashboardAutomaticPageLayout: Boolean,
    DashboardStatePosition: String,
    DocumentScaleMode: String,
    ExportFilters: Boolean,
    ExportParameters: Boolean,
    FontInfo: ExportFontInfo,
    GaugeAutoArrangeContent: Boolean,
    GridFitToPageWidth: Boolean,
    GridPrintHeadersOnEveryPage: Boolean,
    IncludeHiddenParameters: Boolean,
    MapAutomaticPageLayout: Boolean,
    MapSizeMode: String,
    PageLayout: String,
    PaperKind: String,
    PieAutoArrangeContent: Boolean,
    PivotPrintHeadersOnEveryPage: Boolean,
    RangeFilterAutomaticPageLayout: Boolean,
    RangeFilterSizeMode: String,
    ScaleFactor: Double,
    ScaleMode: String,
    ShowTitle: Boolean,
    Title: String,
    TreemapAutomaticPageLayout: Boolean,
    TreemapSizeMode: String
  ): DashboardPdfExportOptions = {
    val __obj = js.Dynamic.literal(AutoFitPageCount = AutoFitPageCount.asInstanceOf[js.Any], CardAutoArrangeContent = CardAutoArrangeContent.asInstanceOf[js.Any], ChartAutomaticPageLayout = ChartAutomaticPageLayout.asInstanceOf[js.Any], ChartSizeMode = ChartSizeMode.asInstanceOf[js.Any], DashboardAutomaticPageLayout = DashboardAutomaticPageLayout.asInstanceOf[js.Any], DashboardStatePosition = DashboardStatePosition.asInstanceOf[js.Any], DocumentScaleMode = DocumentScaleMode.asInstanceOf[js.Any], ExportFilters = ExportFilters.asInstanceOf[js.Any], ExportParameters = ExportParameters.asInstanceOf[js.Any], FontInfo = FontInfo.asInstanceOf[js.Any], GaugeAutoArrangeContent = GaugeAutoArrangeContent.asInstanceOf[js.Any], GridFitToPageWidth = GridFitToPageWidth.asInstanceOf[js.Any], GridPrintHeadersOnEveryPage = GridPrintHeadersOnEveryPage.asInstanceOf[js.Any], IncludeHiddenParameters = IncludeHiddenParameters.asInstanceOf[js.Any], MapAutomaticPageLayout = MapAutomaticPageLayout.asInstanceOf[js.Any], MapSizeMode = MapSizeMode.asInstanceOf[js.Any], PageLayout = PageLayout.asInstanceOf[js.Any], PaperKind = PaperKind.asInstanceOf[js.Any], PieAutoArrangeContent = PieAutoArrangeContent.asInstanceOf[js.Any], PivotPrintHeadersOnEveryPage = PivotPrintHeadersOnEveryPage.asInstanceOf[js.Any], RangeFilterAutomaticPageLayout = RangeFilterAutomaticPageLayout.asInstanceOf[js.Any], RangeFilterSizeMode = RangeFilterSizeMode.asInstanceOf[js.Any], ScaleFactor = ScaleFactor.asInstanceOf[js.Any], ScaleMode = ScaleMode.asInstanceOf[js.Any], ShowTitle = ShowTitle.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], TreemapAutomaticPageLayout = TreemapAutomaticPageLayout.asInstanceOf[js.Any], TreemapSizeMode = TreemapSizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardPdfExportOptions]
  }
}

