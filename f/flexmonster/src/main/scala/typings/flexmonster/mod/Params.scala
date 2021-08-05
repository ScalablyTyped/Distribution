package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  // events
  var afterchartdraw: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var aftergriddraw: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.undefined
  
  var beforegriddraw: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.undefined
  
  var beforetoolbarcreated: js.UndefOr[js.Function1[/* toolbar */ Toolbar, Unit]] = js.undefined
  
  var cellclick: js.UndefOr[js.Function1[/* cell */ CellData, Unit]] = js.undefined
  
  var celldoubleclick: js.UndefOr[js.Function1[/* cell */ CellData, Unit]] = js.undefined
  
  var chartclick: js.UndefOr[js.Function1[/* data */ ChartData, Unit]] = js.undefined
  
  var componentFolder: js.UndefOr[String] = js.undefined
  
  // other
  var container: js.UndefOr[String] = js.undefined
  
  var customizeCell: js.UndefOr[js.Function2[/* cell */ CellBuilder, /* data */ CellData, Unit]] = js.undefined
  
  var customizeContextMenu: js.UndefOr[
    js.Function3[
      /* items */ js.Array[ContextMenuItem], 
      /* data */ CellData | ChartData, 
      /* viewType */ String, 
      js.Array[ContextMenuItem]
    ]
  ] = js.undefined
  
  var datachanged: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.undefined
  
  var dataerror: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.undefined
  
  var datafilecancelled: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var dataloaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var exportcomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var exportstart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fieldslistclose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fieldslistopen: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var filterclose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var filteropen: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var global: js.UndefOr[Report] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var licenseKey: js.UndefOr[String] = js.undefined
  
  var loadingdata: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var loadinglocalization: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var loadingolapstructure: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var loadingreportfile: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var localizationerror: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var localizationloaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var olapstructureerror: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var olapstructureloaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var openingreportfile: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var printcomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var printstart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var querycomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var queryerror: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var report: js.UndefOr[Report | String] = js.undefined
  
  var reportchange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var reportcomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var reportfilecancelled: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var reportfileerror: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var reportfileloaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var runningquery: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  // params
  var toolbar: js.UndefOr[Boolean] = js.undefined
  
  var update: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object Params {
  
  inline def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  extension [Self <: Params](x: Self) {
    
    inline def setAfterchartdraw(value: () => Unit): Self = StObject.set(x, "afterchartdraw", js.Any.fromFunction0(value))
    
    inline def setAfterchartdrawUndefined: Self = StObject.set(x, "afterchartdraw", js.undefined)
    
    inline def setAftergriddraw(value: /* param */ js.Object => Unit): Self = StObject.set(x, "aftergriddraw", js.Any.fromFunction1(value))
    
    inline def setAftergriddrawUndefined: Self = StObject.set(x, "aftergriddraw", js.undefined)
    
    inline def setBeforegriddraw(value: /* param */ js.Object => Unit): Self = StObject.set(x, "beforegriddraw", js.Any.fromFunction1(value))
    
    inline def setBeforegriddrawUndefined: Self = StObject.set(x, "beforegriddraw", js.undefined)
    
    inline def setBeforetoolbarcreated(value: /* toolbar */ Toolbar => Unit): Self = StObject.set(x, "beforetoolbarcreated", js.Any.fromFunction1(value))
    
    inline def setBeforetoolbarcreatedUndefined: Self = StObject.set(x, "beforetoolbarcreated", js.undefined)
    
    inline def setCellclick(value: /* cell */ CellData => Unit): Self = StObject.set(x, "cellclick", js.Any.fromFunction1(value))
    
    inline def setCellclickUndefined: Self = StObject.set(x, "cellclick", js.undefined)
    
    inline def setCelldoubleclick(value: /* cell */ CellData => Unit): Self = StObject.set(x, "celldoubleclick", js.Any.fromFunction1(value))
    
    inline def setCelldoubleclickUndefined: Self = StObject.set(x, "celldoubleclick", js.undefined)
    
    inline def setChartclick(value: /* data */ ChartData => Unit): Self = StObject.set(x, "chartclick", js.Any.fromFunction1(value))
    
    inline def setChartclickUndefined: Self = StObject.set(x, "chartclick", js.undefined)
    
    inline def setComponentFolder(value: String): Self = StObject.set(x, "componentFolder", value.asInstanceOf[js.Any])
    
    inline def setComponentFolderUndefined: Self = StObject.set(x, "componentFolder", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCustomizeCell(value: (/* cell */ CellBuilder, /* data */ CellData) => Unit): Self = StObject.set(x, "customizeCell", js.Any.fromFunction2(value))
    
    inline def setCustomizeCellUndefined: Self = StObject.set(x, "customizeCell", js.undefined)
    
    inline def setCustomizeContextMenu(
      value: (/* items */ js.Array[ContextMenuItem], /* data */ CellData | ChartData, /* viewType */ String) => js.Array[ContextMenuItem]
    ): Self = StObject.set(x, "customizeContextMenu", js.Any.fromFunction3(value))
    
    inline def setCustomizeContextMenuUndefined: Self = StObject.set(x, "customizeContextMenu", js.undefined)
    
    inline def setDatachanged(value: /* param */ js.Object => Unit): Self = StObject.set(x, "datachanged", js.Any.fromFunction1(value))
    
    inline def setDatachangedUndefined: Self = StObject.set(x, "datachanged", js.undefined)
    
    inline def setDataerror(value: /* param */ js.Object => Unit): Self = StObject.set(x, "dataerror", js.Any.fromFunction1(value))
    
    inline def setDataerrorUndefined: Self = StObject.set(x, "dataerror", js.undefined)
    
    inline def setDatafilecancelled(value: () => Unit): Self = StObject.set(x, "datafilecancelled", js.Any.fromFunction0(value))
    
    inline def setDatafilecancelledUndefined: Self = StObject.set(x, "datafilecancelled", js.undefined)
    
    inline def setDataloaded(value: () => Unit): Self = StObject.set(x, "dataloaded", js.Any.fromFunction0(value))
    
    inline def setDataloadedUndefined: Self = StObject.set(x, "dataloaded", js.undefined)
    
    inline def setExportcomplete(value: () => Unit): Self = StObject.set(x, "exportcomplete", js.Any.fromFunction0(value))
    
    inline def setExportcompleteUndefined: Self = StObject.set(x, "exportcomplete", js.undefined)
    
    inline def setExportstart(value: () => Unit): Self = StObject.set(x, "exportstart", js.Any.fromFunction0(value))
    
    inline def setExportstartUndefined: Self = StObject.set(x, "exportstart", js.undefined)
    
    inline def setFieldslistclose(value: () => Unit): Self = StObject.set(x, "fieldslistclose", js.Any.fromFunction0(value))
    
    inline def setFieldslistcloseUndefined: Self = StObject.set(x, "fieldslistclose", js.undefined)
    
    inline def setFieldslistopen(value: () => Unit): Self = StObject.set(x, "fieldslistopen", js.Any.fromFunction0(value))
    
    inline def setFieldslistopenUndefined: Self = StObject.set(x, "fieldslistopen", js.undefined)
    
    inline def setFilterclose(value: () => Unit): Self = StObject.set(x, "filterclose", js.Any.fromFunction0(value))
    
    inline def setFiltercloseUndefined: Self = StObject.set(x, "filterclose", js.undefined)
    
    inline def setFilteropen(value: () => Unit): Self = StObject.set(x, "filteropen", js.Any.fromFunction0(value))
    
    inline def setFilteropenUndefined: Self = StObject.set(x, "filteropen", js.undefined)
    
    inline def setGlobal(value: Report): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLicenseKey(value: String): Self = StObject.set(x, "licenseKey", value.asInstanceOf[js.Any])
    
    inline def setLicenseKeyUndefined: Self = StObject.set(x, "licenseKey", js.undefined)
    
    inline def setLoadingdata(value: () => Unit): Self = StObject.set(x, "loadingdata", js.Any.fromFunction0(value))
    
    inline def setLoadingdataUndefined: Self = StObject.set(x, "loadingdata", js.undefined)
    
    inline def setLoadinglocalization(value: () => Unit): Self = StObject.set(x, "loadinglocalization", js.Any.fromFunction0(value))
    
    inline def setLoadinglocalizationUndefined: Self = StObject.set(x, "loadinglocalization", js.undefined)
    
    inline def setLoadingolapstructure(value: () => Unit): Self = StObject.set(x, "loadingolapstructure", js.Any.fromFunction0(value))
    
    inline def setLoadingolapstructureUndefined: Self = StObject.set(x, "loadingolapstructure", js.undefined)
    
    inline def setLoadingreportfile(value: () => Unit): Self = StObject.set(x, "loadingreportfile", js.Any.fromFunction0(value))
    
    inline def setLoadingreportfileUndefined: Self = StObject.set(x, "loadingreportfile", js.undefined)
    
    inline def setLocalizationerror(value: () => Unit): Self = StObject.set(x, "localizationerror", js.Any.fromFunction0(value))
    
    inline def setLocalizationerrorUndefined: Self = StObject.set(x, "localizationerror", js.undefined)
    
    inline def setLocalizationloaded(value: () => Unit): Self = StObject.set(x, "localizationloaded", js.Any.fromFunction0(value))
    
    inline def setLocalizationloadedUndefined: Self = StObject.set(x, "localizationloaded", js.undefined)
    
    inline def setOlapstructureerror(value: () => Unit): Self = StObject.set(x, "olapstructureerror", js.Any.fromFunction0(value))
    
    inline def setOlapstructureerrorUndefined: Self = StObject.set(x, "olapstructureerror", js.undefined)
    
    inline def setOlapstructureloaded(value: () => Unit): Self = StObject.set(x, "olapstructureloaded", js.Any.fromFunction0(value))
    
    inline def setOlapstructureloadedUndefined: Self = StObject.set(x, "olapstructureloaded", js.undefined)
    
    inline def setOpeningreportfile(value: () => Unit): Self = StObject.set(x, "openingreportfile", js.Any.fromFunction0(value))
    
    inline def setOpeningreportfileUndefined: Self = StObject.set(x, "openingreportfile", js.undefined)
    
    inline def setPrintcomplete(value: () => Unit): Self = StObject.set(x, "printcomplete", js.Any.fromFunction0(value))
    
    inline def setPrintcompleteUndefined: Self = StObject.set(x, "printcomplete", js.undefined)
    
    inline def setPrintstart(value: () => Unit): Self = StObject.set(x, "printstart", js.Any.fromFunction0(value))
    
    inline def setPrintstartUndefined: Self = StObject.set(x, "printstart", js.undefined)
    
    inline def setQuerycomplete(value: () => Unit): Self = StObject.set(x, "querycomplete", js.Any.fromFunction0(value))
    
    inline def setQuerycompleteUndefined: Self = StObject.set(x, "querycomplete", js.undefined)
    
    inline def setQueryerror(value: () => Unit): Self = StObject.set(x, "queryerror", js.Any.fromFunction0(value))
    
    inline def setQueryerrorUndefined: Self = StObject.set(x, "queryerror", js.undefined)
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setReport(value: Report | String): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setReportchange(value: () => Unit): Self = StObject.set(x, "reportchange", js.Any.fromFunction0(value))
    
    inline def setReportchangeUndefined: Self = StObject.set(x, "reportchange", js.undefined)
    
    inline def setReportcomplete(value: () => Unit): Self = StObject.set(x, "reportcomplete", js.Any.fromFunction0(value))
    
    inline def setReportcompleteUndefined: Self = StObject.set(x, "reportcomplete", js.undefined)
    
    inline def setReportfilecancelled(value: () => Unit): Self = StObject.set(x, "reportfilecancelled", js.Any.fromFunction0(value))
    
    inline def setReportfilecancelledUndefined: Self = StObject.set(x, "reportfilecancelled", js.undefined)
    
    inline def setReportfileerror(value: () => Unit): Self = StObject.set(x, "reportfileerror", js.Any.fromFunction0(value))
    
    inline def setReportfileerrorUndefined: Self = StObject.set(x, "reportfileerror", js.undefined)
    
    inline def setReportfileloaded(value: () => Unit): Self = StObject.set(x, "reportfileloaded", js.Any.fromFunction0(value))
    
    inline def setReportfileloadedUndefined: Self = StObject.set(x, "reportfileloaded", js.undefined)
    
    inline def setRunningquery(value: () => Unit): Self = StObject.set(x, "runningquery", js.Any.fromFunction0(value))
    
    inline def setRunningqueryUndefined: Self = StObject.set(x, "runningquery", js.undefined)
    
    inline def setToolbar(value: Boolean): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
