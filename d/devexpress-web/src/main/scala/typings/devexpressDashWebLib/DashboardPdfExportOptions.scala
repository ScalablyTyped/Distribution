package typings
package devexpressDashWebLib

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
  var AutoFitPageCount: scala.Double
  /**
    * Gets or sets whether cards within the Card dashboard item are arranged automatically on the exported page.
    * Value: true, to arrange cards automatically on the exported page; otherwise, false.
    */
  var CardAutoArrangeContent: scala.Boolean
  /**
    * Gets or sets whether the page orientation used to export the Chart dashboard item is selected automatically.
    * Value: true, to automatically select the page orientation used to export the Chart dashboard item; otherwise, false.
    */
  var ChartAutomaticPageLayout: scala.Boolean
  /**
    * Gets or sets the export size mode for the Chart dashboard item.
    * Value: A ChartExportSizeMode value that specifies the export size mode for the Chart dashboard item.
    */
  var ChartSizeMode: java.lang.String
  /**
    * Gets or sets whether the page orientation used to export a dashboard is selected automatically.
    * Value: true, to automatically select the page orientation used to export a dashboard; otherwise, false.
    */
  var DashboardAutomaticPageLayout: scala.Boolean
  /**
    * Gets or sets a position of the dashboard state (such as master filter or current parameter values) in the exported document.
    * Value: A DashboardStateExportPosition object that specifies the position of the dashboard state in the exported document.
    */
  var DashboardStatePosition: java.lang.String
  /**
    * Gets or sets the mode for scaling a dashboard/dashboard item in the exported document.
    * Value: A DashboardExportDocumentScaleMode value that specifies the mode for scaling a dashboard/dashboard item in the exported document.
    */
  var DocumentScaleMode: java.lang.String
  /**
    * Gets or sets whether to add the state of master filter items to the exported document.
    * Value: true, to add the state of master filter items to the exported document; otherwise, false.
    */
  var ExportFilters: scala.Boolean
  /**
    * Gets or sets whether to add current parameter values to the exported document.
    * Value: true, to add current parameter values to the exported document; otherwise, false.
    */
  var ExportParameters: scala.Boolean
  var FontInfo: ExportFontInfo
  /**
    * Gets or sets whether gauges within the Gauge dashboard item are arranged automatically on the exported page.
    * Value: true, to arrange gauges automatically on the exported page; otherwise, false.
    */
  var GaugeAutoArrangeContent: scala.Boolean
  /**
    * Gets or sets whether the size of the Grid dashboard item is changed according to the width of the exported page.
    * Value: true, to change the size of the Grid dashboard item according to the width of the exported page; otherwise, false.
    */
  var GridFitToPageWidth: scala.Boolean
  /**
    * Gets or sets whether to add column headers of the Grid dashboard item to every page.
    * Value: true, to add column headers to every page; otherwise, false.
    */
  var GridPrintHeadersOnEveryPage: scala.Boolean
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    * Value: true, to add current values of a hidden parameter to the exported document; otherwise, false.
    */
  var IncludeHiddenParameters: scala.Boolean
  /**
    * Gets or sets whether the page orientation used to export the Map dashboard item is selected automatically.
    * Value: true, to automatically select the page orientation used to export the Map dashboard item; otherwise, false.
    */
  var MapAutomaticPageLayout: scala.Boolean
  /**
    * Gets or sets the export size mode for the Map dashboard item.
    * Value: A MapExportSizeMode value that specifies the export size mode for the Map dashboard item.
    */
  var MapSizeMode: java.lang.String
  /**
    * Gets or sets the page orientation used to export a dashboard/dashboard item.
    * Value: A DashboardExportPageLayout value that specifies the page orientation used to export a dashboard/dashboard item.
    */
  var PageLayout: java.lang.String
  /**
    * Gets or sets the type of paper for the exported document.
    * Value: A DashboardExportPaperKind value that specifies the type of paper for the exported document.
    */
  var PaperKind: java.lang.String
  /**
    * Gets or sets whether pies within the Pie dashboard item are arranged automatically on the exported page.
    * Value: true, to arrange pies automatically on the exported page; otherwise, false.
    */
  var PieAutoArrangeContent: scala.Boolean
  /**
    * Gets or sets whether to add column headers of the Pivot dashboard item to every page.
    * Value: true, to add column headers to every page; otherwise, false.
    */
  var PivotPrintHeadersOnEveryPage: scala.Boolean
  /**
    * Gets or sets whether the page orientation used to export the Range Filter dashboard item is selected automatically.
    * Value: true, to automatically select the page orientation used to export the Range Filter dashboard item; otherwise, false.
    */
  var RangeFilterAutomaticPageLayout: scala.Boolean
  /**
    * Gets or sets the export size mode for the Range Filter dashboard item.
    * Value: A RangeFilterExportSizeMode value that specifies the export size mode for the Range Filter dashboard item.
    */
  var RangeFilterSizeMode: java.lang.String
  /**
    * Gets or sets the scale factor (in fractions of 1), by which a dashboard/dashboard item is scaled in the exported document.
    * Value: A Single value that specifies the scale factor by which a dashboard/dashboard item is scaled in the exported document.
    */
  var ScaleFactor: scala.Double
  /**
    * Gets or sets the mode for scaling a dashboard/dashboard item in the exported document.
    * Value: A DashboardExportScaleMode value that specifies the mode for scaling a dashboard/dashboard item in the exported document.
    */
  var ScaleMode: java.lang.String
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    * Value: A boolean value that specifies whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    */
  var ShowTitle: scala.Boolean
  /**
    * Gets or sets the title of the exported document.
    * Value: A string value that specifies the title of the exported document.
    */
  var Title: java.lang.String
  /**
    * Gets or sets whether the page orientation used to export the Treemap dashboard item is selected automatically.
    * Value: true, to automatically select the page orientation used to export the Treemap dashboard item; otherwise, false.
    */
  var TreemapAutomaticPageLayout: scala.Boolean
  /**
    * Gets or sets the export size mode for the Treemap dashboard item.
    * Value: A TreemapExportSizeMode value that specifies the export size mode for the Treemap dashboard item.
    */
  var TreemapSizeMode: java.lang.String
}

object DashboardPdfExportOptions {
  @scala.inline
  def apply(
    AutoFitPageCount: scala.Double,
    CardAutoArrangeContent: scala.Boolean,
    ChartAutomaticPageLayout: scala.Boolean,
    ChartSizeMode: java.lang.String,
    DashboardAutomaticPageLayout: scala.Boolean,
    DashboardStatePosition: java.lang.String,
    DocumentScaleMode: java.lang.String,
    ExportFilters: scala.Boolean,
    ExportParameters: scala.Boolean,
    FontInfo: ExportFontInfo,
    GaugeAutoArrangeContent: scala.Boolean,
    GridFitToPageWidth: scala.Boolean,
    GridPrintHeadersOnEveryPage: scala.Boolean,
    IncludeHiddenParameters: scala.Boolean,
    MapAutomaticPageLayout: scala.Boolean,
    MapSizeMode: java.lang.String,
    PageLayout: java.lang.String,
    PaperKind: java.lang.String,
    PieAutoArrangeContent: scala.Boolean,
    PivotPrintHeadersOnEveryPage: scala.Boolean,
    RangeFilterAutomaticPageLayout: scala.Boolean,
    RangeFilterSizeMode: java.lang.String,
    ScaleFactor: scala.Double,
    ScaleMode: java.lang.String,
    ShowTitle: scala.Boolean,
    Title: java.lang.String,
    TreemapAutomaticPageLayout: scala.Boolean,
    TreemapSizeMode: java.lang.String
  ): DashboardPdfExportOptions = {
    val __obj = js.Dynamic.literal(AutoFitPageCount = AutoFitPageCount, CardAutoArrangeContent = CardAutoArrangeContent, ChartAutomaticPageLayout = ChartAutomaticPageLayout, ChartSizeMode = ChartSizeMode, DashboardAutomaticPageLayout = DashboardAutomaticPageLayout, DashboardStatePosition = DashboardStatePosition, DocumentScaleMode = DocumentScaleMode, ExportFilters = ExportFilters, ExportParameters = ExportParameters, FontInfo = FontInfo, GaugeAutoArrangeContent = GaugeAutoArrangeContent, GridFitToPageWidth = GridFitToPageWidth, GridPrintHeadersOnEveryPage = GridPrintHeadersOnEveryPage, IncludeHiddenParameters = IncludeHiddenParameters, MapAutomaticPageLayout = MapAutomaticPageLayout, MapSizeMode = MapSizeMode, PageLayout = PageLayout, PaperKind = PaperKind, PieAutoArrangeContent = PieAutoArrangeContent, PivotPrintHeadersOnEveryPage = PivotPrintHeadersOnEveryPage, RangeFilterAutomaticPageLayout = RangeFilterAutomaticPageLayout, RangeFilterSizeMode = RangeFilterSizeMode, ScaleFactor = ScaleFactor, ScaleMode = ScaleMode, ShowTitle = ShowTitle, Title = Title, TreemapAutomaticPageLayout = TreemapAutomaticPageLayout, TreemapSizeMode = TreemapSizeMode)
  
    __obj.asInstanceOf[DashboardPdfExportOptions]
  }
}

