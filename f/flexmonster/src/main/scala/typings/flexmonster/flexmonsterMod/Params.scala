package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
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
  @scala.inline
  def apply(
    afterchartdraw: () => Unit = null,
    aftergriddraw: /* param */ js.Object => Unit = null,
    beforegriddraw: /* param */ js.Object => Unit = null,
    beforetoolbarcreated: /* toolbar */ Toolbar => Unit = null,
    cellclick: /* cell */ CellData => Unit = null,
    celldoubleclick: /* cell */ CellData => Unit = null,
    chartclick: /* data */ ChartData => Unit = null,
    componentFolder: String = null,
    container: String = null,
    customizeCell: (/* cell */ CellBuilder, /* data */ CellData) => Unit = null,
    customizeContextMenu: (/* items */ js.Array[ContextMenuItem], /* data */ CellData | ChartData, /* viewType */ String) => js.Array[ContextMenuItem] = null,
    datachanged: /* param */ js.Object => Unit = null,
    dataerror: /* param */ js.Object => Unit = null,
    datafilecancelled: () => Unit = null,
    dataloaded: () => Unit = null,
    exportcomplete: () => Unit = null,
    exportstart: () => Unit = null,
    fieldslistclose: () => Unit = null,
    fieldslistopen: () => Unit = null,
    filterclose: () => Unit = null,
    filteropen: () => Unit = null,
    global: Report = null,
    height: String | Double = null,
    licenseKey: String = null,
    loadingdata: () => Unit = null,
    loadinglocalization: () => Unit = null,
    loadingolapstructure: () => Unit = null,
    loadingreportfile: () => Unit = null,
    localizationerror: () => Unit = null,
    localizationloaded: () => Unit = null,
    olapstructureerror: () => Unit = null,
    olapstructureloaded: () => Unit = null,
    openingreportfile: () => Unit = null,
    printcomplete: () => Unit = null,
    printstart: () => Unit = null,
    querycomplete: () => Unit = null,
    queryerror: () => Unit = null,
    ready: () => Unit = null,
    report: Report | String = null,
    reportchange: () => Unit = null,
    reportcomplete: () => Unit = null,
    reportfilecancelled: () => Unit = null,
    reportfileerror: () => Unit = null,
    reportfileloaded: () => Unit = null,
    runningquery: () => Unit = null,
    toolbar: js.UndefOr[Boolean] = js.undefined,
    update: () => Unit = null,
    width: String | Double = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (afterchartdraw != null) __obj.updateDynamic("afterchartdraw")(js.Any.fromFunction0(afterchartdraw))
    if (aftergriddraw != null) __obj.updateDynamic("aftergriddraw")(js.Any.fromFunction1(aftergriddraw))
    if (beforegriddraw != null) __obj.updateDynamic("beforegriddraw")(js.Any.fromFunction1(beforegriddraw))
    if (beforetoolbarcreated != null) __obj.updateDynamic("beforetoolbarcreated")(js.Any.fromFunction1(beforetoolbarcreated))
    if (cellclick != null) __obj.updateDynamic("cellclick")(js.Any.fromFunction1(cellclick))
    if (celldoubleclick != null) __obj.updateDynamic("celldoubleclick")(js.Any.fromFunction1(celldoubleclick))
    if (chartclick != null) __obj.updateDynamic("chartclick")(js.Any.fromFunction1(chartclick))
    if (componentFolder != null) __obj.updateDynamic("componentFolder")(componentFolder)
    if (container != null) __obj.updateDynamic("container")(container)
    if (customizeCell != null) __obj.updateDynamic("customizeCell")(js.Any.fromFunction2(customizeCell))
    if (customizeContextMenu != null) __obj.updateDynamic("customizeContextMenu")(js.Any.fromFunction3(customizeContextMenu))
    if (datachanged != null) __obj.updateDynamic("datachanged")(js.Any.fromFunction1(datachanged))
    if (dataerror != null) __obj.updateDynamic("dataerror")(js.Any.fromFunction1(dataerror))
    if (datafilecancelled != null) __obj.updateDynamic("datafilecancelled")(js.Any.fromFunction0(datafilecancelled))
    if (dataloaded != null) __obj.updateDynamic("dataloaded")(js.Any.fromFunction0(dataloaded))
    if (exportcomplete != null) __obj.updateDynamic("exportcomplete")(js.Any.fromFunction0(exportcomplete))
    if (exportstart != null) __obj.updateDynamic("exportstart")(js.Any.fromFunction0(exportstart))
    if (fieldslistclose != null) __obj.updateDynamic("fieldslistclose")(js.Any.fromFunction0(fieldslistclose))
    if (fieldslistopen != null) __obj.updateDynamic("fieldslistopen")(js.Any.fromFunction0(fieldslistopen))
    if (filterclose != null) __obj.updateDynamic("filterclose")(js.Any.fromFunction0(filterclose))
    if (filteropen != null) __obj.updateDynamic("filteropen")(js.Any.fromFunction0(filteropen))
    if (global != null) __obj.updateDynamic("global")(global)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (licenseKey != null) __obj.updateDynamic("licenseKey")(licenseKey)
    if (loadingdata != null) __obj.updateDynamic("loadingdata")(js.Any.fromFunction0(loadingdata))
    if (loadinglocalization != null) __obj.updateDynamic("loadinglocalization")(js.Any.fromFunction0(loadinglocalization))
    if (loadingolapstructure != null) __obj.updateDynamic("loadingolapstructure")(js.Any.fromFunction0(loadingolapstructure))
    if (loadingreportfile != null) __obj.updateDynamic("loadingreportfile")(js.Any.fromFunction0(loadingreportfile))
    if (localizationerror != null) __obj.updateDynamic("localizationerror")(js.Any.fromFunction0(localizationerror))
    if (localizationloaded != null) __obj.updateDynamic("localizationloaded")(js.Any.fromFunction0(localizationloaded))
    if (olapstructureerror != null) __obj.updateDynamic("olapstructureerror")(js.Any.fromFunction0(olapstructureerror))
    if (olapstructureloaded != null) __obj.updateDynamic("olapstructureloaded")(js.Any.fromFunction0(olapstructureloaded))
    if (openingreportfile != null) __obj.updateDynamic("openingreportfile")(js.Any.fromFunction0(openingreportfile))
    if (printcomplete != null) __obj.updateDynamic("printcomplete")(js.Any.fromFunction0(printcomplete))
    if (printstart != null) __obj.updateDynamic("printstart")(js.Any.fromFunction0(printstart))
    if (querycomplete != null) __obj.updateDynamic("querycomplete")(js.Any.fromFunction0(querycomplete))
    if (queryerror != null) __obj.updateDynamic("queryerror")(js.Any.fromFunction0(queryerror))
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    if (report != null) __obj.updateDynamic("report")(report.asInstanceOf[js.Any])
    if (reportchange != null) __obj.updateDynamic("reportchange")(js.Any.fromFunction0(reportchange))
    if (reportcomplete != null) __obj.updateDynamic("reportcomplete")(js.Any.fromFunction0(reportcomplete))
    if (reportfilecancelled != null) __obj.updateDynamic("reportfilecancelled")(js.Any.fromFunction0(reportfilecancelled))
    if (reportfileerror != null) __obj.updateDynamic("reportfileerror")(js.Any.fromFunction0(reportfileerror))
    if (reportfileloaded != null) __obj.updateDynamic("reportfileloaded")(js.Any.fromFunction0(reportfileloaded))
    if (runningquery != null) __obj.updateDynamic("runningquery")(js.Any.fromFunction0(runningquery))
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar)
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction0(update))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

