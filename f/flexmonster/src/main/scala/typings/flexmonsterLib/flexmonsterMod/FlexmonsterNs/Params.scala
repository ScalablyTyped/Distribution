package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  // events
  var afterchartdraw: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var aftergriddraw: js.UndefOr[js.Function1[/* param */ js.Object, scala.Unit]] = js.undefined
  var beforegriddraw: js.UndefOr[js.Function1[/* param */ js.Object, scala.Unit]] = js.undefined
  var beforetoolbarcreated: js.UndefOr[js.Function1[/* toolbar */ Toolbar, scala.Unit]] = js.undefined
  var cellclick: js.UndefOr[js.Function1[/* cell */ CellData, scala.Unit]] = js.undefined
  var celldoubleclick: js.UndefOr[js.Function1[/* cell */ CellData, scala.Unit]] = js.undefined
  var componentFolder: js.UndefOr[java.lang.String] = js.undefined
  // other
  var container: js.UndefOr[java.lang.String] = js.undefined
  var customizeCell: js.UndefOr[js.Function2[/* cell */ CellBuilder, /* data */ CellData, scala.Unit]] = js.undefined
  var customizeContextMenu: js.UndefOr[
    js.Function3[
      /* items */ js.Array[ContextMenuItem], 
      /* data */ CellData | ChartData, 
      /* viewType */ java.lang.String, 
      js.Array[ContextMenuItem]
    ]
  ] = js.undefined
  var datachanged: js.UndefOr[js.Function1[/* param */ js.Object, scala.Unit]] = js.undefined
  var dataerror: js.UndefOr[js.Function1[/* param */ js.Object, scala.Unit]] = js.undefined
  var datafilecancelled: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var dataloaded: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var exportcomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var exportstart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fieldslistclose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fieldslistopen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var filterclose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var filteropen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var global: js.UndefOr[Report] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var licenseKey: js.UndefOr[java.lang.String] = js.undefined
  var loadingdata: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var loadinglocalization: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var loadingolapstructure: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var loadingreportfile: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var localizationerror: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var localizationloaded: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var olapstructureerror: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var olapstructureloaded: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var openingreportfile: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var printcomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var printstart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var querycomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var queryerror: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var ready: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var report: js.UndefOr[Report | java.lang.String] = js.undefined
  var reportchange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var reportcomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var reportfilecancelled: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var reportfileerror: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var runningquery: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // params
  var toolbar: js.UndefOr[scala.Boolean] = js.undefined
  var update: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    afterchartdraw: js.Function0[scala.Unit] = null,
    aftergriddraw: js.Function1[/* param */ js.Object, scala.Unit] = null,
    beforegriddraw: js.Function1[/* param */ js.Object, scala.Unit] = null,
    beforetoolbarcreated: js.Function1[/* toolbar */ Toolbar, scala.Unit] = null,
    cellclick: js.Function1[/* cell */ CellData, scala.Unit] = null,
    celldoubleclick: js.Function1[/* cell */ CellData, scala.Unit] = null,
    componentFolder: java.lang.String = null,
    container: java.lang.String = null,
    customizeCell: js.Function2[/* cell */ CellBuilder, /* data */ CellData, scala.Unit] = null,
    customizeContextMenu: js.Function3[
      /* items */ js.Array[ContextMenuItem], 
      /* data */ CellData | ChartData, 
      /* viewType */ java.lang.String, 
      js.Array[ContextMenuItem]
    ] = null,
    datachanged: js.Function1[/* param */ js.Object, scala.Unit] = null,
    dataerror: js.Function1[/* param */ js.Object, scala.Unit] = null,
    datafilecancelled: js.Function0[scala.Unit] = null,
    dataloaded: js.Function0[scala.Unit] = null,
    exportcomplete: js.Function0[scala.Unit] = null,
    exportstart: js.Function0[scala.Unit] = null,
    fieldslistclose: js.Function0[scala.Unit] = null,
    fieldslistopen: js.Function0[scala.Unit] = null,
    filterclose: js.Function0[scala.Unit] = null,
    filteropen: js.Function0[scala.Unit] = null,
    global: Report = null,
    height: java.lang.String | scala.Double = null,
    licenseKey: java.lang.String = null,
    loadingdata: js.Function0[scala.Unit] = null,
    loadinglocalization: js.Function0[scala.Unit] = null,
    loadingolapstructure: js.Function0[scala.Unit] = null,
    loadingreportfile: js.Function0[scala.Unit] = null,
    localizationerror: js.Function0[scala.Unit] = null,
    localizationloaded: js.Function0[scala.Unit] = null,
    olapstructureerror: js.Function0[scala.Unit] = null,
    olapstructureloaded: js.Function0[scala.Unit] = null,
    openingreportfile: js.Function0[scala.Unit] = null,
    printcomplete: js.Function0[scala.Unit] = null,
    printstart: js.Function0[scala.Unit] = null,
    querycomplete: js.Function0[scala.Unit] = null,
    queryerror: js.Function0[scala.Unit] = null,
    ready: js.Function0[scala.Unit] = null,
    report: Report | java.lang.String = null,
    reportchange: js.Function0[scala.Unit] = null,
    reportcomplete: js.Function0[scala.Unit] = null,
    reportfilecancelled: js.Function0[scala.Unit] = null,
    reportfileerror: js.Function0[scala.Unit] = null,
    runningquery: js.Function0[scala.Unit] = null,
    toolbar: js.UndefOr[scala.Boolean] = js.undefined,
    update: js.Function0[scala.Unit] = null,
    width: java.lang.String | scala.Double = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (afterchartdraw != null) __obj.updateDynamic("afterchartdraw")(afterchartdraw)
    if (aftergriddraw != null) __obj.updateDynamic("aftergriddraw")(aftergriddraw)
    if (beforegriddraw != null) __obj.updateDynamic("beforegriddraw")(beforegriddraw)
    if (beforetoolbarcreated != null) __obj.updateDynamic("beforetoolbarcreated")(beforetoolbarcreated)
    if (cellclick != null) __obj.updateDynamic("cellclick")(cellclick)
    if (celldoubleclick != null) __obj.updateDynamic("celldoubleclick")(celldoubleclick)
    if (componentFolder != null) __obj.updateDynamic("componentFolder")(componentFolder)
    if (container != null) __obj.updateDynamic("container")(container)
    if (customizeCell != null) __obj.updateDynamic("customizeCell")(customizeCell)
    if (customizeContextMenu != null) __obj.updateDynamic("customizeContextMenu")(customizeContextMenu)
    if (datachanged != null) __obj.updateDynamic("datachanged")(datachanged)
    if (dataerror != null) __obj.updateDynamic("dataerror")(dataerror)
    if (datafilecancelled != null) __obj.updateDynamic("datafilecancelled")(datafilecancelled)
    if (dataloaded != null) __obj.updateDynamic("dataloaded")(dataloaded)
    if (exportcomplete != null) __obj.updateDynamic("exportcomplete")(exportcomplete)
    if (exportstart != null) __obj.updateDynamic("exportstart")(exportstart)
    if (fieldslistclose != null) __obj.updateDynamic("fieldslistclose")(fieldslistclose)
    if (fieldslistopen != null) __obj.updateDynamic("fieldslistopen")(fieldslistopen)
    if (filterclose != null) __obj.updateDynamic("filterclose")(filterclose)
    if (filteropen != null) __obj.updateDynamic("filteropen")(filteropen)
    if (global != null) __obj.updateDynamic("global")(global)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (licenseKey != null) __obj.updateDynamic("licenseKey")(licenseKey)
    if (loadingdata != null) __obj.updateDynamic("loadingdata")(loadingdata)
    if (loadinglocalization != null) __obj.updateDynamic("loadinglocalization")(loadinglocalization)
    if (loadingolapstructure != null) __obj.updateDynamic("loadingolapstructure")(loadingolapstructure)
    if (loadingreportfile != null) __obj.updateDynamic("loadingreportfile")(loadingreportfile)
    if (localizationerror != null) __obj.updateDynamic("localizationerror")(localizationerror)
    if (localizationloaded != null) __obj.updateDynamic("localizationloaded")(localizationloaded)
    if (olapstructureerror != null) __obj.updateDynamic("olapstructureerror")(olapstructureerror)
    if (olapstructureloaded != null) __obj.updateDynamic("olapstructureloaded")(olapstructureloaded)
    if (openingreportfile != null) __obj.updateDynamic("openingreportfile")(openingreportfile)
    if (printcomplete != null) __obj.updateDynamic("printcomplete")(printcomplete)
    if (printstart != null) __obj.updateDynamic("printstart")(printstart)
    if (querycomplete != null) __obj.updateDynamic("querycomplete")(querycomplete)
    if (queryerror != null) __obj.updateDynamic("queryerror")(queryerror)
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (report != null) __obj.updateDynamic("report")(report.asInstanceOf[js.Any])
    if (reportchange != null) __obj.updateDynamic("reportchange")(reportchange)
    if (reportcomplete != null) __obj.updateDynamic("reportcomplete")(reportcomplete)
    if (reportfilecancelled != null) __obj.updateDynamic("reportfilecancelled")(reportfilecancelled)
    if (reportfileerror != null) __obj.updateDynamic("reportfileerror")(reportfileerror)
    if (runningquery != null) __obj.updateDynamic("runningquery")(runningquery)
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar)
    if (update != null) __obj.updateDynamic("update")(update)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

