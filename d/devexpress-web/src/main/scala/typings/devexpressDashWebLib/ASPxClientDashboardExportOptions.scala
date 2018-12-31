package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the dashboard (dashboard item) is exported.
  */
trait ASPxClientDashboardExportOptions extends js.Object {
  /**
    * Gets or sets the number of horizontal/vertical pages spanning the total width/height of a dashboard (dashboard item).
    * Value: An integer value that specifies the number of horizontal/vertical pages spanning the total width/height of a dashboard (dashboard item).
    */
  var AutoFitPageCount: scala.Double
  /**
    * Provides access to options for exporting a Card dashboard item.
    * Value: A CardExportOptions object containing settings that specify parameters that affect how Card dashboard items are exported.
    */
  var CardOptions: CardExportOptions
  /**
    * Provides access to options for exporting a Chart dashboard item.
    * Value: A ChartExportOptions object containing settings that specify parameters that affect how Chart dashboard items are exported.
    */
  var ChartOptions: ChartExportOptions
  /**
    * Provides access to options for exporting individual dashboard items in Excel format.
    * Value: An ExcelFormatOptions object containing settings that specify parameters affecting how the dashboard item is exported in Excel format.
    */
  var ExcelOptions: ExcelFormatOptions
  /**
    * Gets or sets the filter state's location on the exported document.
    * Value: A string value returned by the DashboardExportFilterState class that specifies the filter state's location on the exported document.
    */
  var FilterState: java.lang.String
  /**
    * Provides access to options for exporting a Gauge dashboard item.
    * Value: A GaugeExportOptions object containing settings that specify parameters that affect how Gauge dashboard items are exported.
    */
  var GaugeOptions: GaugeExportOptions
  /**
    * Provides access to options for exporting a Grid dashboard item.
    * Value: A GridExportOptions object containing settings that specify parameters that affect how Grid dashboard items are exported.
    */
  var GridOptions: GridExportOptions
  /**
    * Provides access to options for exporting a dashboard or individual items in Image format.
    * Value: An ImageFormatOptions object containing settings that specify parameters affecting how the dashboard or dashboard item is exported in Image format.
    */
  var ImageOptions: ImageFormatOptions
  /**
    * Provides access to options for exporting map dashboard items.
    * Value: A MapExportOptions object containing settings that specify parameters that affect how map dashboard items are exported.
    */
  var MapOptions: MapExportOptions
  /**
    * Gets or sets the page orientation used to export a dashboard (dashboard item).
    * Value: A string value returned by the DashboardExportPageLayout class that specifies the page orientation used to export a dashboard (dashboard item).
    */
  var PageLayout: java.lang.String
  /**
    * Gets or sets the standard paper size.
    * Value: A string value returned by the DashboardExportPaperKind class that specifies the standard paper size.
    */
  var PaperKind: java.lang.String
  /**
    * Provides access to options for exporting a Pie dashboard item.
    * Value: A PieExportOptions object containing settings that specify parameters that affect how Pie dashboard items are exported.
    */
  var PieOptions: PieExportOptions
  /**
    * Provides access to options for exporting a Pivot dashboard item.
    * Value: A PivotExportOptions object containing settings that specify parameters that affect how Pivot dashboard items are exported.
    */
  var PivotOptions: PivotExportOptions
  /**
    * Provides access to options for exporting a Range Filter dashboard item.
    * Value: A RangeFilterExportOptions object containing settings that specify parameters affecting how the Range Filter dashboard item is exported.
    */
  var RangeFilterOptions: RangeFilterExportOptions
  /**
    * Gets or sets the scale factor (in fractions of 1) by which a dashboard (dashboard item) is scaled.
    * Value: A Single value that specifies the scale factor by which a dashboard (dashboard item) is scaled.
    */
  var ScaleFactor: scala.Double
  /**
    * Gets or sets the mode for scaling when exporting a dashboard (dashboard item).
    * Value: A string value returned by the DashboardExportScaleMode class that specifies the mode for scaling when exporting a dashboard (dashboard item).
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
    * Provides access to options for exporting a Treemap dashboard item.
    * Value: A TreemapExportOptions object containing settings that specify parameters affecting how the Treemap dashboard item is exported.
    */
  var TreemapOptions: TreemapExportOptions
}

