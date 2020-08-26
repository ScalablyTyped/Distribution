package typings.flexmonster.mod

import typings.flexmonster.anon.Blocking
import typings.flexmonster.anon.GetAxisFormat
import typings.flexmonster.anon.GetData
import typings.flexmonster.anon.GetNumberFormat
import typings.flexmonster.anon.IgnoreScroll
import typings.flexmonster.anon.IsRemoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pivot extends js.Object {
  var fusioncharts: js.UndefOr[GetData] = js.native
  var googlecharts: js.UndefOr[GetNumberFormat] = js.native
  var highcharts: js.UndefOr[GetAxisFormat] = js.native
  var toolbar: Toolbar = js.native
  var version: String = js.native
  def addCalculatedMeasure(measure: Measure): Unit = js.native
  def addCondition(condition: ConditionalFormat): Unit = js.native
  def addJSON(json: js.Array[js.Object]): Unit = js.native
  def alert(options: Blocking): Unit = js.native
  def clear(): Unit = js.native
  def clearFilter(hierarchyName: String): Unit = js.native
  def clearXMLACache(
    proxyUrl: String,
    databaseId: String,
    callbackHandler: String,
    cubeId: String,
    measuresGroupId: String
  ): Unit = js.native
  def clearXMLACache(
    proxyUrl: String,
    databaseId: String,
    callbackHandler: String,
    cubeId: String,
    measuresGroupId: String,
    username: js.UndefOr[scala.Nothing],
    password: String
  ): Unit = js.native
  def clearXMLACache(
    proxyUrl: String,
    databaseId: String,
    callbackHandler: String,
    cubeId: String,
    measuresGroupId: String,
    username: String
  ): Unit = js.native
  def clearXMLACache(
    proxyUrl: String,
    databaseId: String,
    callbackHandler: String,
    cubeId: String,
    measuresGroupId: String,
    username: String,
    password: String
  ): Unit = js.native
  def clearXMLACache(
    proxyUrl: String,
    databaseId: String,
    callbackHandler: js.Function1[/* reponse */ js.Object, Unit],
    cubeId: String,
    measuresGroupId: String
  ): Unit = js.native
  def clearXMLACache(
    proxyUrl: String,
    databaseId: String,
    callbackHandler: js.Function1[/* reponse */ js.Object, Unit],
    cubeId: String,
    measuresGroupId: String,
    username: js.UndefOr[scala.Nothing],
    password: String
  ): Unit = js.native
  def clearXMLACache(
    proxyUrl: String,
    databaseId: String,
    callbackHandler: js.Function1[/* reponse */ js.Object, Unit],
    cubeId: String,
    measuresGroupId: String,
    username: String
  ): Unit = js.native
  def clearXMLACache(
    proxyUrl: String,
    databaseId: String,
    callbackHandler: js.Function1[/* reponse */ js.Object, Unit],
    cubeId: String,
    measuresGroupId: String,
    username: String,
    password: String
  ): Unit = js.native
  def closeFieldsList(): Unit = js.native
  def collapseAllData(): Unit = js.native
  def collapseData(hierarchyName: String): Unit = js.native
  def connectTo(`object`: DataSource): Unit = js.native
  def customizeCell(customizeCellFunction: js.Function2[/* cell */ CellBuilder, /* data */ CellData, Unit]): Unit = js.native
  def customizeContextMenu(
    customizeFunction: js.Function3[
      /* items */ js.Array[ContextMenuItem], 
      /* data */ CellData | ChartData, 
      /* viewType */ String, 
      js.Array[ContextMenuItem]
    ]
  ): Unit = js.native
  def dispose(): Unit = js.native
  def expandAllData(): Unit = js.native
  def expandAllData(withAllChildren: Boolean): Unit = js.native
  def expandData(hierarchyName: String): Unit = js.native
  def exportTo(`type`: String): Unit = js.native
  def exportTo(`type`: String, exportOptions: js.UndefOr[scala.Nothing], callbackHandler: String): Unit = js.native
  def exportTo(
    `type`: String,
    exportOptions: js.UndefOr[scala.Nothing],
    callbackHandler: js.Function1[/* result */ js.Object, Unit]
  ): Unit = js.native
  def exportTo(`type`: String, exportOptions: ExportOptions): Unit = js.native
  def exportTo(`type`: String, exportOptions: ExportOptions, callbackHandler: String): Unit = js.native
  def exportTo(
    `type`: String,
    exportOptions: ExportOptions,
    callbackHandler: js.Function1[/* result */ js.Object, Unit]
  ): Unit = js.native
  def getAllConditions(): js.Array[ConditionalFormat] = js.native
  def getAllHierarchies(): js.Array[Hierarchy] = js.native
  def getAllMeasures(): js.Array[Measure] = js.native
  def getCell(rowIdx: Double, colIdx: Double): CellData = js.native
  def getColumns(): js.Array[Hierarchy] = js.native
  def getCondition(id: String): ConditionalFormat = js.native
  def getData(options: typings.flexmonster.anon.Slice, callbackHandler: String): Unit = js.native
  def getData(options: typings.flexmonster.anon.Slice, callbackHandler: String, updateHandler: String): Unit = js.native
  def getData(
    options: typings.flexmonster.anon.Slice,
    callbackHandler: String,
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: typings.flexmonster.anon.Slice,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: typings.flexmonster.anon.Slice,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: String
  ): Unit = js.native
  def getData(
    options: typings.flexmonster.anon.Slice,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getFilter(hierarchyName: String): Filter = js.native
  def getFormat(measureName: String): Format = js.native
  def getMeasures(): js.Array[Measure] = js.native
  def getMembers(hierarchyName: String, memberName: String, callbackHandler: String): js.Array[Member] = js.native
  def getMembers(
    hierarchyName: String,
    memberName: String,
    callbackHandler: js.Function1[/* members */ js.Array[Member], Unit]
  ): js.Array[Member] = js.native
  def getOptions(): Options = js.native
  def getReport(): Report | String = js.native
  def getReport(format: String): Report | String = js.native
  def getReportFilters(): js.Array[Hierarchy] = js.native
  def getRows(): js.Array[Hierarchy] = js.native
  def getSelectedCell(): CellData | js.Array[CellData] = js.native
  def getSort(hierarchyName: String): String = js.native
  def getXMLACatalogs(proxyURL: String, dataSource: String, callbackHandler: String): Unit = js.native
  def getXMLACatalogs(
    proxyURL: String,
    dataSource: String,
    callbackHandler: String,
    username: js.UndefOr[scala.Nothing],
    password: String
  ): Unit = js.native
  def getXMLACatalogs(proxyURL: String, dataSource: String, callbackHandler: String, username: String): Unit = js.native
  def getXMLACatalogs(proxyURL: String, dataSource: String, callbackHandler: String, username: String, password: String): Unit = js.native
  def getXMLACatalogs(proxyURL: String, dataSource: String, callbackHandler: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def getXMLACatalogs(
    proxyURL: String,
    dataSource: String,
    callbackHandler: js.Function1[/* response */ js.Any, Unit],
    username: js.UndefOr[scala.Nothing],
    password: String
  ): Unit = js.native
  def getXMLACatalogs(
    proxyURL: String,
    dataSource: String,
    callbackHandler: js.Function1[/* response */ js.Any, Unit],
    username: String
  ): Unit = js.native
  def getXMLACatalogs(
    proxyURL: String,
    dataSource: String,
    callbackHandler: js.Function1[/* response */ js.Any, Unit],
    username: String,
    password: String
  ): Unit = js.native
  def getXMLACubes(proxyURL: String, dataSource: String, catalog: String, callbackHandler: String): Unit = js.native
  def getXMLACubes(
    proxyURL: String,
    dataSource: String,
    catalog: String,
    callbackHandler: String,
    username: js.UndefOr[scala.Nothing],
    password: String
  ): Unit = js.native
  def getXMLACubes(proxyURL: String, dataSource: String, catalog: String, callbackHandler: String, username: String): Unit = js.native
  def getXMLACubes(
    proxyURL: String,
    dataSource: String,
    catalog: String,
    callbackHandler: String,
    username: String,
    password: String
  ): Unit = js.native
  def getXMLACubes(
    proxyURL: String,
    dataSource: String,
    catalog: String,
    callbackHandler: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def getXMLACubes(
    proxyURL: String,
    dataSource: String,
    catalog: String,
    callbackHandler: js.Function1[/* response */ js.Any, Unit],
    username: js.UndefOr[scala.Nothing],
    password: String
  ): Unit = js.native
  def getXMLACubes(
    proxyURL: String,
    dataSource: String,
    catalog: String,
    callbackHandler: js.Function1[/* response */ js.Any, Unit],
    username: String
  ): Unit = js.native
  def getXMLACubes(
    proxyURL: String,
    dataSource: String,
    catalog: String,
    callbackHandler: js.Function1[/* response */ js.Any, Unit],
    username: String,
    password: String
  ): Unit = js.native
  def getXMLADataSources(proxyURL: String, callbackHandler: String): Unit = js.native
  def getXMLADataSources(proxyURL: String, callbackHandler: String, username: js.UndefOr[scala.Nothing], password: String): Unit = js.native
  def getXMLADataSources(proxyURL: String, callbackHandler: String, username: String): Unit = js.native
  def getXMLADataSources(proxyURL: String, callbackHandler: String, username: String, password: String): Unit = js.native
  def getXMLADataSources(proxyURL: String, callbackHandler: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def getXMLADataSources(
    proxyURL: String,
    callbackHandler: js.Function1[/* response */ js.Any, Unit],
    username: js.UndefOr[scala.Nothing],
    password: String
  ): Unit = js.native
  def getXMLADataSources(proxyURL: String, callbackHandler: js.Function1[/* response */ js.Any, Unit], username: String): Unit = js.native
  def getXMLADataSources(
    proxyURL: String,
    callbackHandler: js.Function1[/* response */ js.Any, Unit],
    username: String,
    password: String
  ): Unit = js.native
  def getXMLAProviderName(proxyURL: String, callbackHandler: String): String = js.native
  def getXMLAProviderName(proxyURL: String, callbackHandler: String, username: js.UndefOr[scala.Nothing], password: String): String = js.native
  def getXMLAProviderName(proxyURL: String, callbackHandler: String, username: String): String = js.native
  def getXMLAProviderName(proxyURL: String, callbackHandler: String, username: String, password: String): String = js.native
  def getXMLAProviderName(proxyURL: String, callbackHandler: js.Function1[/* response */ js.Any, Unit]): String = js.native
  def getXMLAProviderName(
    proxyURL: String,
    callbackHandler: js.Function1[/* response */ js.Any, Unit],
    username: js.UndefOr[scala.Nothing],
    password: String
  ): String = js.native
  def getXMLAProviderName(proxyURL: String, callbackHandler: js.Function1[/* response */ js.Any, Unit], username: String): String = js.native
  def getXMLAProviderName(
    proxyURL: String,
    callbackHandler: js.Function1[/* response */ js.Any, Unit],
    username: String,
    password: String
  ): String = js.native
  def load(url: String): Unit = js.native
  def load(url: String, componentFolder: String): Unit = js.native
  def off(eventType: String): Unit = js.native
  def off(eventType: String, handler: String): Unit = js.native
  def off(eventType: String, handler: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def on(eventType: String, handler: String): Unit = js.native
  def on(eventType: String, handler: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def open(): Unit = js.native
  def openCalculatedValueEditor(): Unit = js.native
  def openCalculatedValueEditor(uniqueName: js.UndefOr[scala.Nothing], callbackHandler: String): Unit = js.native
  def openCalculatedValueEditor(
    uniqueName: js.UndefOr[scala.Nothing],
    callbackHandler: js.Function1[/* response */ IsRemoved, Unit]
  ): Unit = js.native
  def openCalculatedValueEditor(uniqueName: String): Unit = js.native
  def openCalculatedValueEditor(uniqueName: String, callbackHandler: String): Unit = js.native
  def openCalculatedValueEditor(uniqueName: String, callbackHandler: js.Function1[/* response */ IsRemoved, Unit]): Unit = js.native
  def openFieldsList(): Unit = js.native
  def openFilter(hierarchyName: String): Unit = js.native
  def print(): Unit = js.native
  def print(options: PrintOptions): Unit = js.native
  def refresh(): Unit = js.native
  def removeAllCalculatedMeasures(): Unit = js.native
  def removeAllConditions(): Unit = js.native
  def removeCalculatedMeasure(uniqueName: String): Unit = js.native
  def removeCondition(id: String): Unit = js.native
  def removeSelection(): Unit = js.native
  def runQuery(slice: Slice): Unit = js.native
  def save(filename: String, destination: String): String = js.native
  def save(
    filename: String,
    destination: String,
    callbackHandler: js.UndefOr[scala.Nothing],
    url: js.UndefOr[scala.Nothing],
    embedData: Boolean
  ): String = js.native
  def save(filename: String, destination: String, callbackHandler: js.UndefOr[scala.Nothing], url: String): String = js.native
  def save(
    filename: String,
    destination: String,
    callbackHandler: js.UndefOr[scala.Nothing],
    url: String,
    embedData: Boolean
  ): String = js.native
  def save(filename: String, destination: String, callbackHandler: String): String = js.native
  def save(
    filename: String,
    destination: String,
    callbackHandler: String,
    url: js.UndefOr[scala.Nothing],
    embedData: Boolean
  ): String = js.native
  def save(filename: String, destination: String, callbackHandler: String, url: String): String = js.native
  def save(filename: String, destination: String, callbackHandler: String, url: String, embedData: Boolean): String = js.native
  def save(filename: String, destination: String, callbackHandler: js.Function0[Unit]): String = js.native
  def save(
    filename: String,
    destination: String,
    callbackHandler: js.Function0[Unit],
    url: js.UndefOr[scala.Nothing],
    embedData: Boolean
  ): String = js.native
  def save(filename: String, destination: String, callbackHandler: js.Function0[Unit], url: String): String = js.native
  def save(
    filename: String,
    destination: String,
    callbackHandler: js.Function0[Unit],
    url: String,
    embedData: Boolean
  ): String = js.native
  def setFilter(hierarchyName: String, filter: Filter): Unit = js.native
  def setFormat(format: Format, measureName: String): Unit = js.native
  def setOptions(options: Options): Unit = js.native
  def setReport(report: Report): Unit = js.native
  def setSort(hierarchyName: String, sortName: String): Unit = js.native
  def setSort(hierarchyName: String, sortName: String, customSorting: js.Array[String]): Unit = js.native
  def showCharts(): Unit = js.native
  def showCharts(`type`: js.UndefOr[scala.Nothing], multiple: Boolean): Unit = js.native
  def showCharts(`type`: String): Unit = js.native
  def showCharts(`type`: String, multiple: Boolean): Unit = js.native
  def showGrid(): Unit = js.native
  def showGridAndCharts(): Unit = js.native
  def showGridAndCharts(`type`: js.UndefOr[scala.Nothing], position: js.UndefOr[scala.Nothing], multiple: Boolean): Unit = js.native
  def showGridAndCharts(`type`: js.UndefOr[scala.Nothing], position: String): Unit = js.native
  def showGridAndCharts(`type`: js.UndefOr[scala.Nothing], position: String, multiple: Boolean): Unit = js.native
  def showGridAndCharts(`type`: String): Unit = js.native
  def showGridAndCharts(`type`: String, position: js.UndefOr[scala.Nothing], multiple: Boolean): Unit = js.native
  def showGridAndCharts(`type`: String, position: String): Unit = js.native
  def showGridAndCharts(`type`: String, position: String, multiple: Boolean): Unit = js.native
  def sortValues(axisName: String, `type`: String, tuple: js.Array[Double], measure: MeasureObject): Unit = js.native
  def sortingMethod(hierarchyName: String, compareFunction: js.Function2[/* a */ String, /* b */ String, Double]): Unit = js.native
  def updateData(`object`: js.Array[js.Object]): Unit = js.native
  def updateData(`object`: js.Array[js.Object], options: IgnoreScroll): Unit = js.native
  def updateData(`object`: DataSource): Unit = js.native
  def updateData(`object`: DataSource, options: IgnoreScroll): Unit = js.native
}

