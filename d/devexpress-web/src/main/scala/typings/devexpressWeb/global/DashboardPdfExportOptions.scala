package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains options related to exporting a dashboard/dashboard item to the PDF format.
  */
@JSGlobal("DashboardPdfExportOptions")
@js.native
open class DashboardPdfExportOptions ()
  extends StObject
     with typings.devexpressWeb.DashboardPdfExportOptions {
  
  /**
    * Gets or sets the number of horizontal/vertical pages spanning the total width/height of a dashboard/dashboard item.
    */
  /* CompleteClass */
  var AutoFitPageCount: Double = js.native
  
  /**
    * Gets or sets whether cards within the Card dashboard item are arranged automatically on the exported page.
    */
  /* CompleteClass */
  var CardAutoArrangeContent: Boolean = js.native
  
  /**
    * Gets or sets whether the page orientation used to export the Chart dashboard item is selected automatically.
    */
  /* CompleteClass */
  var ChartAutomaticPageLayout: Boolean = js.native
  
  /**
    * Gets or sets the export size mode for the Chart dashboard item.
    */
  /* CompleteClass */
  var ChartSizeMode: String = js.native
  
  /**
    * Gets or sets whether the page orientation used to export a dashboard is selected automatically.
    */
  /* CompleteClass */
  var DashboardAutomaticPageLayout: Boolean = js.native
  
  /**
    * Gets or sets a position of the dashboard state (such as master filter or current parameter values) in the exported document.
    */
  /* CompleteClass */
  var DashboardStatePosition: String = js.native
  
  /**
    * Gets or sets the mode for scaling a dashboard/dashboard item in the exported document.
    */
  /* CompleteClass */
  var DocumentScaleMode: String = js.native
  
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
    * Gets or sets whether gauges within the Gauge dashboard item are arranged automatically on the exported page.
    */
  /* CompleteClass */
  var GaugeAutoArrangeContent: Boolean = js.native
  
  /**
    * Gets or sets whether the size of the Grid dashboard item is changed according to the width of the exported page.
    */
  /* CompleteClass */
  var GridFitToPageWidth: Boolean = js.native
  
  /**
    * Gets or sets whether to add column headers of the Grid dashboard item to every page.
    */
  /* CompleteClass */
  var GridPrintHeadersOnEveryPage: Boolean = js.native
  
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    */
  /* CompleteClass */
  var IncludeHiddenParameters: Boolean = js.native
  
  /**
    * Gets or sets whether the page orientation used to export the Map dashboard item is selected automatically.
    */
  /* CompleteClass */
  var MapAutomaticPageLayout: Boolean = js.native
  
  /**
    * Gets or sets the export size mode for the Map dashboard item.
    */
  /* CompleteClass */
  var MapSizeMode: String = js.native
  
  /**
    * Gets or sets the page orientation used to export a dashboard/dashboard item.
    */
  /* CompleteClass */
  var PageLayout: String = js.native
  
  /**
    * Gets or sets the type of paper for the exported document.
    */
  /* CompleteClass */
  var PaperKind: String = js.native
  
  /**
    * Gets or sets whether pies within the Pie dashboard item are arranged automatically on the exported page.
    */
  /* CompleteClass */
  var PieAutoArrangeContent: Boolean = js.native
  
  /**
    * Gets or sets whether to add column headers of the Pivot dashboard item to every page.
    */
  /* CompleteClass */
  var PivotPrintHeadersOnEveryPage: Boolean = js.native
  
  /**
    * Gets or sets whether the page orientation used to export the Range Filter dashboard item is selected automatically.
    */
  /* CompleteClass */
  var RangeFilterAutomaticPageLayout: Boolean = js.native
  
  /**
    * Gets or sets the export size mode for the Range Filter dashboard item.
    */
  /* CompleteClass */
  var RangeFilterSizeMode: String = js.native
  
  /**
    * Gets or sets the scale factor (in fractions of 1), by which a dashboard/dashboard item is scaled in the exported document.
    */
  /* CompleteClass */
  var ScaleFactor: Double = js.native
  
  /** @deprecated The ScaleMode property is obsolete now. Use the DocumentScaleMode and DashboardAutomaticPageLayout property instead. */
  /**
    * Gets or sets the mode for scaling a dashboard/dashboard item in the exported document.
    */
  /* CompleteClass */
  var ScaleMode: String = js.native
  
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    */
  /* CompleteClass */
  var ShowTitle: Boolean = js.native
  
  /**
    * Gets or sets the title of the exported document.
    */
  /* CompleteClass */
  var Title: String = js.native
  
  /**
    * Gets or sets whether the page orientation used to export the Treemap dashboard item is selected automatically.
    */
  /* CompleteClass */
  var TreemapAutomaticPageLayout: Boolean = js.native
  
  /**
    * Gets or sets the export size mode for the Treemap dashboard item.
    */
  /* CompleteClass */
  var TreemapSizeMode: String = js.native
}
