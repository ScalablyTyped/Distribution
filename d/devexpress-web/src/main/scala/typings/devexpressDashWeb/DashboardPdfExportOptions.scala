package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains options related to exporting a dashboard/dashboard item to the PDF format.
  */
trait DashboardPdfExportOptions extends js.Object {
  /**
    * Gets or sets the number of horizontal/vertical pages spanning the total width/height of a dashboard/dashboard item.
    * Value: An integer value that specifies the number of horizontal/vertical pages spanning the total width/height of a dashboard/dashboard item.
    */
  var AutoFitPageCount: Double
  /**
    * Gets or sets whether cards within the Card dashboard item are arranged automatically on the exported page.
    * Value: true, to arrange cards automatically on the exported page; otherwise, false.
    */
  var CardAutoArrangeContent: Boolean
  /**
    * Gets or sets whether the page orientation used to export the Chart dashboard item is selected automatically.
    * Value: true, to automatically select the page orientation used to export the Chart dashboard item; otherwise, false.
    */
  var ChartAutomaticPageLayout: Boolean
  /**
    * Gets or sets the export size mode for the Chart dashboard item.
    * Value: A ChartExportSizeMode value that specifies the export size mode for the Chart dashboard item.
    */
  var ChartSizeMode: String
  /**
    * Gets or sets whether the page orientation used to export a dashboard is selected automatically.
    * Value: true, to automatically select the page orientation used to export a dashboard; otherwise, false.
    */
  var DashboardAutomaticPageLayout: Boolean
  /**
    * Gets or sets a position of the dashboard state (such as master filter or current parameter values) in the exported document.
    * Value: A DashboardStateExportPosition object that specifies the position of the dashboard state in the exported document.
    */
  var DashboardStatePosition: String
  /**
    * Gets or sets the mode for scaling a dashboard/dashboard item in the exported document.
    * Value: A DashboardExportDocumentScaleMode value that specifies the mode for scaling a dashboard/dashboard item in the exported document.
    */
  var DocumentScaleMode: String
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
    * Gets or sets whether gauges within the Gauge dashboard item are arranged automatically on the exported page.
    * Value: true, to arrange gauges automatically on the exported page; otherwise, false.
    */
  var GaugeAutoArrangeContent: Boolean
  /**
    * Gets or sets whether the size of the Grid dashboard item is changed according to the width of the exported page.
    * Value: true, to change the size of the Grid dashboard item according to the width of the exported page; otherwise, false.
    */
  var GridFitToPageWidth: Boolean
  /**
    * Gets or sets whether to add column headers of the Grid dashboard item to every page.
    * Value: true, to add column headers to every page; otherwise, false.
    */
  var GridPrintHeadersOnEveryPage: Boolean
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    * Value: true, to add current values of a hidden parameter to the exported document; otherwise, false.
    */
  var IncludeHiddenParameters: Boolean
  /**
    * Gets or sets whether the page orientation used to export the Map dashboard item is selected automatically.
    * Value: true, to automatically select the page orientation used to export the Map dashboard item; otherwise, false.
    */
  var MapAutomaticPageLayout: Boolean
  /**
    * Gets or sets the export size mode for the Map dashboard item.
    * Value: A MapExportSizeMode value that specifies the export size mode for the Map dashboard item.
    */
  var MapSizeMode: String
  /**
    * Gets or sets the page orientation used to export a dashboard/dashboard item.
    * Value: A DashboardExportPageLayout value that specifies the page orientation used to export a dashboard/dashboard item.
    */
  var PageLayout: String
  /**
    * Gets or sets the type of paper for the exported document.
    * Value: A DashboardExportPaperKind value that specifies the type of paper for the exported document.
    */
  var PaperKind: String
  /**
    * Gets or sets whether pies within the Pie dashboard item are arranged automatically on the exported page.
    * Value: true, to arrange pies automatically on the exported page; otherwise, false.
    */
  var PieAutoArrangeContent: Boolean
  /**
    * Gets or sets whether to add column headers of the Pivot dashboard item to every page.
    * Value: true, to add column headers to every page; otherwise, false.
    */
  var PivotPrintHeadersOnEveryPage: Boolean
  /**
    * Gets or sets whether the page orientation used to export the Range Filter dashboard item is selected automatically.
    * Value: true, to automatically select the page orientation used to export the Range Filter dashboard item; otherwise, false.
    */
  var RangeFilterAutomaticPageLayout: Boolean
  /**
    * Gets or sets the export size mode for the Range Filter dashboard item.
    * Value: A RangeFilterExportSizeMode value that specifies the export size mode for the Range Filter dashboard item.
    */
  var RangeFilterSizeMode: String
  /**
    * Gets or sets the scale factor (in fractions of 1), by which a dashboard/dashboard item is scaled in the exported document.
    * Value: A Single value that specifies the scale factor by which a dashboard/dashboard item is scaled in the exported document.
    */
  var ScaleFactor: Double
  /**
    * Gets or sets the mode for scaling a dashboard/dashboard item in the exported document.
    * Value: A DashboardExportScaleMode value that specifies the mode for scaling a dashboard/dashboard item in the exported document.
    */
  var ScaleMode: String
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    * Value: A boolean value that specifies whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    */
  var ShowTitle: Boolean
  /**
    * Gets or sets the title of the exported document.
    * Value: A string value that specifies the title of the exported document.
    */
  var Title: String
  /**
    * Gets or sets whether the page orientation used to export the Treemap dashboard item is selected automatically.
    * Value: true, to automatically select the page orientation used to export the Treemap dashboard item; otherwise, false.
    */
  var TreemapAutomaticPageLayout: Boolean
  /**
    * Gets or sets the export size mode for the Treemap dashboard item.
    * Value: A TreemapExportSizeMode value that specifies the export size mode for the Treemap dashboard item.
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
    val __obj = js.Dynamic.literal(AutoFitPageCount = AutoFitPageCount, CardAutoArrangeContent = CardAutoArrangeContent, ChartAutomaticPageLayout = ChartAutomaticPageLayout, ChartSizeMode = ChartSizeMode, DashboardAutomaticPageLayout = DashboardAutomaticPageLayout, DashboardStatePosition = DashboardStatePosition, DocumentScaleMode = DocumentScaleMode, ExportFilters = ExportFilters, ExportParameters = ExportParameters, FontInfo = FontInfo, GaugeAutoArrangeContent = GaugeAutoArrangeContent, GridFitToPageWidth = GridFitToPageWidth, GridPrintHeadersOnEveryPage = GridPrintHeadersOnEveryPage, IncludeHiddenParameters = IncludeHiddenParameters, MapAutomaticPageLayout = MapAutomaticPageLayout, MapSizeMode = MapSizeMode, PageLayout = PageLayout, PaperKind = PaperKind, PieAutoArrangeContent = PieAutoArrangeContent, PivotPrintHeadersOnEveryPage = PivotPrintHeadersOnEveryPage, RangeFilterAutomaticPageLayout = RangeFilterAutomaticPageLayout, RangeFilterSizeMode = RangeFilterSizeMode, ScaleFactor = ScaleFactor, ScaleMode = ScaleMode, ShowTitle = ShowTitle, Title = Title, TreemapAutomaticPageLayout = TreemapAutomaticPageLayout, TreemapSizeMode = TreemapSizeMode)
  
    __obj.asInstanceOf[DashboardPdfExportOptions]
  }
}

