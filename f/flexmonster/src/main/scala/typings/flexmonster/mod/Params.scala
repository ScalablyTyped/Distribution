package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  // events
  var afterchartdraw: js.UndefOr[js.Function0[Unit]] = js.native
  var aftergriddraw: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.native
  var beforegriddraw: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.native
  var beforetoolbarcreated: js.UndefOr[js.Function1[/* toolbar */ Toolbar, Unit]] = js.native
  var cellclick: js.UndefOr[js.Function1[/* cell */ CellData, Unit]] = js.native
  var celldoubleclick: js.UndefOr[js.Function1[/* cell */ CellData, Unit]] = js.native
  var chartclick: js.UndefOr[js.Function1[/* data */ ChartData, Unit]] = js.native
  var componentFolder: js.UndefOr[String] = js.native
  // other
  var container: js.UndefOr[String] = js.native
  var customizeCell: js.UndefOr[js.Function2[/* cell */ CellBuilder, /* data */ CellData, Unit]] = js.native
  var customizeContextMenu: js.UndefOr[
    js.Function3[
      /* items */ js.Array[ContextMenuItem], 
      /* data */ CellData | ChartData, 
      /* viewType */ String, 
      js.Array[ContextMenuItem]
    ]
  ] = js.native
  var datachanged: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.native
  var dataerror: js.UndefOr[js.Function1[/* param */ js.Object, Unit]] = js.native
  var datafilecancelled: js.UndefOr[js.Function0[Unit]] = js.native
  var dataloaded: js.UndefOr[js.Function0[Unit]] = js.native
  var exportcomplete: js.UndefOr[js.Function0[Unit]] = js.native
  var exportstart: js.UndefOr[js.Function0[Unit]] = js.native
  var fieldslistclose: js.UndefOr[js.Function0[Unit]] = js.native
  var fieldslistopen: js.UndefOr[js.Function0[Unit]] = js.native
  var filterclose: js.UndefOr[js.Function0[Unit]] = js.native
  var filteropen: js.UndefOr[js.Function0[Unit]] = js.native
  var global: js.UndefOr[Report] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var licenseKey: js.UndefOr[String] = js.native
  var loadingdata: js.UndefOr[js.Function0[Unit]] = js.native
  var loadinglocalization: js.UndefOr[js.Function0[Unit]] = js.native
  var loadingolapstructure: js.UndefOr[js.Function0[Unit]] = js.native
  var loadingreportfile: js.UndefOr[js.Function0[Unit]] = js.native
  var localizationerror: js.UndefOr[js.Function0[Unit]] = js.native
  var localizationloaded: js.UndefOr[js.Function0[Unit]] = js.native
  var olapstructureerror: js.UndefOr[js.Function0[Unit]] = js.native
  var olapstructureloaded: js.UndefOr[js.Function0[Unit]] = js.native
  var openingreportfile: js.UndefOr[js.Function0[Unit]] = js.native
  var printcomplete: js.UndefOr[js.Function0[Unit]] = js.native
  var printstart: js.UndefOr[js.Function0[Unit]] = js.native
  var querycomplete: js.UndefOr[js.Function0[Unit]] = js.native
  var queryerror: js.UndefOr[js.Function0[Unit]] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  var report: js.UndefOr[Report | String] = js.native
  var reportchange: js.UndefOr[js.Function0[Unit]] = js.native
  var reportcomplete: js.UndefOr[js.Function0[Unit]] = js.native
  var reportfilecancelled: js.UndefOr[js.Function0[Unit]] = js.native
  var reportfileerror: js.UndefOr[js.Function0[Unit]] = js.native
  var reportfileloaded: js.UndefOr[js.Function0[Unit]] = js.native
  var runningquery: js.UndefOr[js.Function0[Unit]] = js.native
  // params
  var toolbar: js.UndefOr[Boolean] = js.native
  var update: js.UndefOr[js.Function0[Unit]] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterchartdraw(value: () => Unit): Self = this.set("afterchartdraw", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterchartdraw: Self = this.set("afterchartdraw", js.undefined)
    @scala.inline
    def setAftergriddraw(value: /* param */ js.Object => Unit): Self = this.set("aftergriddraw", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAftergriddraw: Self = this.set("aftergriddraw", js.undefined)
    @scala.inline
    def setBeforegriddraw(value: /* param */ js.Object => Unit): Self = this.set("beforegriddraw", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforegriddraw: Self = this.set("beforegriddraw", js.undefined)
    @scala.inline
    def setBeforetoolbarcreated(value: /* toolbar */ Toolbar => Unit): Self = this.set("beforetoolbarcreated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforetoolbarcreated: Self = this.set("beforetoolbarcreated", js.undefined)
    @scala.inline
    def setCellclick(value: /* cell */ CellData => Unit): Self = this.set("cellclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellclick: Self = this.set("cellclick", js.undefined)
    @scala.inline
    def setCelldoubleclick(value: /* cell */ CellData => Unit): Self = this.set("celldoubleclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCelldoubleclick: Self = this.set("celldoubleclick", js.undefined)
    @scala.inline
    def setChartclick(value: /* data */ ChartData => Unit): Self = this.set("chartclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChartclick: Self = this.set("chartclick", js.undefined)
    @scala.inline
    def setComponentFolder(value: String): Self = this.set("componentFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentFolder: Self = this.set("componentFolder", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCustomizeCell(value: (/* cell */ CellBuilder, /* data */ CellData) => Unit): Self = this.set("customizeCell", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomizeCell: Self = this.set("customizeCell", js.undefined)
    @scala.inline
    def setCustomizeContextMenu(
      value: (/* items */ js.Array[ContextMenuItem], /* data */ CellData | ChartData, /* viewType */ String) => js.Array[ContextMenuItem]
    ): Self = this.set("customizeContextMenu", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCustomizeContextMenu: Self = this.set("customizeContextMenu", js.undefined)
    @scala.inline
    def setDatachanged(value: /* param */ js.Object => Unit): Self = this.set("datachanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDatachanged: Self = this.set("datachanged", js.undefined)
    @scala.inline
    def setDataerror(value: /* param */ js.Object => Unit): Self = this.set("dataerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataerror: Self = this.set("dataerror", js.undefined)
    @scala.inline
    def setDatafilecancelled(value: () => Unit): Self = this.set("datafilecancelled", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDatafilecancelled: Self = this.set("datafilecancelled", js.undefined)
    @scala.inline
    def setDataloaded(value: () => Unit): Self = this.set("dataloaded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDataloaded: Self = this.set("dataloaded", js.undefined)
    @scala.inline
    def setExportcomplete(value: () => Unit): Self = this.set("exportcomplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExportcomplete: Self = this.set("exportcomplete", js.undefined)
    @scala.inline
    def setExportstart(value: () => Unit): Self = this.set("exportstart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExportstart: Self = this.set("exportstart", js.undefined)
    @scala.inline
    def setFieldslistclose(value: () => Unit): Self = this.set("fieldslistclose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFieldslistclose: Self = this.set("fieldslistclose", js.undefined)
    @scala.inline
    def setFieldslistopen(value: () => Unit): Self = this.set("fieldslistopen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFieldslistopen: Self = this.set("fieldslistopen", js.undefined)
    @scala.inline
    def setFilterclose(value: () => Unit): Self = this.set("filterclose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFilterclose: Self = this.set("filterclose", js.undefined)
    @scala.inline
    def setFilteropen(value: () => Unit): Self = this.set("filteropen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFilteropen: Self = this.set("filteropen", js.undefined)
    @scala.inline
    def setGlobal(value: Report): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLicenseKey(value: String): Self = this.set("licenseKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseKey: Self = this.set("licenseKey", js.undefined)
    @scala.inline
    def setLoadingdata(value: () => Unit): Self = this.set("loadingdata", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLoadingdata: Self = this.set("loadingdata", js.undefined)
    @scala.inline
    def setLoadinglocalization(value: () => Unit): Self = this.set("loadinglocalization", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLoadinglocalization: Self = this.set("loadinglocalization", js.undefined)
    @scala.inline
    def setLoadingolapstructure(value: () => Unit): Self = this.set("loadingolapstructure", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLoadingolapstructure: Self = this.set("loadingolapstructure", js.undefined)
    @scala.inline
    def setLoadingreportfile(value: () => Unit): Self = this.set("loadingreportfile", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLoadingreportfile: Self = this.set("loadingreportfile", js.undefined)
    @scala.inline
    def setLocalizationerror(value: () => Unit): Self = this.set("localizationerror", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLocalizationerror: Self = this.set("localizationerror", js.undefined)
    @scala.inline
    def setLocalizationloaded(value: () => Unit): Self = this.set("localizationloaded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLocalizationloaded: Self = this.set("localizationloaded", js.undefined)
    @scala.inline
    def setOlapstructureerror(value: () => Unit): Self = this.set("olapstructureerror", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOlapstructureerror: Self = this.set("olapstructureerror", js.undefined)
    @scala.inline
    def setOlapstructureloaded(value: () => Unit): Self = this.set("olapstructureloaded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOlapstructureloaded: Self = this.set("olapstructureloaded", js.undefined)
    @scala.inline
    def setOpeningreportfile(value: () => Unit): Self = this.set("openingreportfile", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOpeningreportfile: Self = this.set("openingreportfile", js.undefined)
    @scala.inline
    def setPrintcomplete(value: () => Unit): Self = this.set("printcomplete", js.Any.fromFunction0(value))
    @scala.inline
    def deletePrintcomplete: Self = this.set("printcomplete", js.undefined)
    @scala.inline
    def setPrintstart(value: () => Unit): Self = this.set("printstart", js.Any.fromFunction0(value))
    @scala.inline
    def deletePrintstart: Self = this.set("printstart", js.undefined)
    @scala.inline
    def setQuerycomplete(value: () => Unit): Self = this.set("querycomplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteQuerycomplete: Self = this.set("querycomplete", js.undefined)
    @scala.inline
    def setQueryerror(value: () => Unit): Self = this.set("queryerror", js.Any.fromFunction0(value))
    @scala.inline
    def deleteQueryerror: Self = this.set("queryerror", js.undefined)
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    @scala.inline
    def setReport(value: Report | String): Self = this.set("report", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReport: Self = this.set("report", js.undefined)
    @scala.inline
    def setReportchange(value: () => Unit): Self = this.set("reportchange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReportchange: Self = this.set("reportchange", js.undefined)
    @scala.inline
    def setReportcomplete(value: () => Unit): Self = this.set("reportcomplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReportcomplete: Self = this.set("reportcomplete", js.undefined)
    @scala.inline
    def setReportfilecancelled(value: () => Unit): Self = this.set("reportfilecancelled", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReportfilecancelled: Self = this.set("reportfilecancelled", js.undefined)
    @scala.inline
    def setReportfileerror(value: () => Unit): Self = this.set("reportfileerror", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReportfileerror: Self = this.set("reportfileerror", js.undefined)
    @scala.inline
    def setReportfileloaded(value: () => Unit): Self = this.set("reportfileloaded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReportfileloaded: Self = this.set("reportfileloaded", js.undefined)
    @scala.inline
    def setRunningquery(value: () => Unit): Self = this.set("runningquery", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRunningquery: Self = this.set("runningquery", js.undefined)
    @scala.inline
    def setToolbar(value: Boolean): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

