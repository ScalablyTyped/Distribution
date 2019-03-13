package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pivot extends js.Object {
  var fusioncharts: js.UndefOr[flexmonsterLib.Anon_CallbackHandler] = js.native
  var googlecharts: js.UndefOr[flexmonsterLib.Anon_CallbackHandlerFormat] = js.native
  var highcharts: js.UndefOr[flexmonsterLib.Anon_CallbackHandlerFormatGetAxisFormat] = js.native
  var toolbar: Toolbar = js.native
  var version: java.lang.String = js.native
  def addCalculatedMeasure(measure: Measure): scala.Unit = js.native
  def addCondition(condition: ConditionalFormat): scala.Unit = js.native
  def addJSON(json: js.Array[js.Object]): scala.Unit = js.native
  def alert(options: flexmonsterLib.Anon_Blocking): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def clearFilter(hierarchyName: java.lang.String): scala.Unit = js.native
  def clearXMLACache(
    proxyUrl: java.lang.String,
    databaseId: java.lang.String,
    callbackHandler: java.lang.String,
    cubeId: java.lang.String,
    measuresGroupId: java.lang.String
  ): scala.Unit = js.native
  def clearXMLACache(
    proxyUrl: java.lang.String,
    databaseId: java.lang.String,
    callbackHandler: java.lang.String,
    cubeId: java.lang.String,
    measuresGroupId: java.lang.String,
    username: java.lang.String
  ): scala.Unit = js.native
  def clearXMLACache(
    proxyUrl: java.lang.String,
    databaseId: java.lang.String,
    callbackHandler: java.lang.String,
    cubeId: java.lang.String,
    measuresGroupId: java.lang.String,
    username: java.lang.String,
    password: java.lang.String
  ): scala.Unit = js.native
  def clearXMLACache(
    proxyUrl: java.lang.String,
    databaseId: java.lang.String,
    callbackHandler: js.Function1[/* reponse */ js.Object, scala.Unit],
    cubeId: java.lang.String,
    measuresGroupId: java.lang.String
  ): scala.Unit = js.native
  def clearXMLACache(
    proxyUrl: java.lang.String,
    databaseId: java.lang.String,
    callbackHandler: js.Function1[/* reponse */ js.Object, scala.Unit],
    cubeId: java.lang.String,
    measuresGroupId: java.lang.String,
    username: java.lang.String
  ): scala.Unit = js.native
  def clearXMLACache(
    proxyUrl: java.lang.String,
    databaseId: java.lang.String,
    callbackHandler: js.Function1[/* reponse */ js.Object, scala.Unit],
    cubeId: java.lang.String,
    measuresGroupId: java.lang.String,
    username: java.lang.String,
    password: java.lang.String
  ): scala.Unit = js.native
  def closeFieldsList(): scala.Unit = js.native
  def collapseAllData(): scala.Unit = js.native
  def collapseData(hierarchyName: java.lang.String): scala.Unit = js.native
  def connectTo(`object`: DataSource): scala.Unit = js.native
  def customizeCell(customizeCellFunction: js.Function2[/* cell */ CellBuilder, /* data */ CellData, scala.Unit]): scala.Unit = js.native
  def customizeContextMenu(
    customizeFunction: js.Function3[
      /* items */ js.Array[ContextMenuItem], 
      /* data */ CellData | ChartData, 
      /* viewType */ java.lang.String, 
      js.Array[ContextMenuItem]
    ]
  ): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def expandAllData(): scala.Unit = js.native
  def expandAllData(withAllChildren: scala.Boolean): scala.Unit = js.native
  def expandData(hierarchyName: java.lang.String): scala.Unit = js.native
  def exportTo(`type`: java.lang.String): scala.Unit = js.native
  def exportTo(`type`: java.lang.String, exportOptions: ExportOptions): scala.Unit = js.native
  def exportTo(`type`: java.lang.String, exportOptions: ExportOptions, callbackHandler: java.lang.String): scala.Unit = js.native
  def exportTo(
    `type`: java.lang.String,
    exportOptions: ExportOptions,
    callbackHandler: js.Function1[/* result */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def getAllConditions(): js.Array[ConditionalFormat] = js.native
  def getAllHierarchies(): js.Array[Hierarchy] = js.native
  def getAllMeasures(): js.Array[Measure] = js.native
  def getCell(rowIdx: scala.Double, colIdx: scala.Double): CellData = js.native
  def getColumns(): js.Array[Hierarchy] = js.native
  def getCondition(id: java.lang.String): ConditionalFormat = js.native
  def getData(options: flexmonsterLib.Anon_Slice, callbackHandler: java.lang.String): scala.Unit = js.native
  def getData(
    options: flexmonsterLib.Anon_Slice,
    callbackHandler: java.lang.String,
    updateHandler: java.lang.String
  ): scala.Unit = js.native
  def getData(
    options: flexmonsterLib.Anon_Slice,
    callbackHandler: java.lang.String,
    updateHandler: js.Function1[/* rawData */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getData(
    options: flexmonsterLib.Anon_Slice,
    callbackHandler: js.Function1[/* rawData */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getData(
    options: flexmonsterLib.Anon_Slice,
    callbackHandler: js.Function1[/* rawData */ js.Any, scala.Unit],
    updateHandler: java.lang.String
  ): scala.Unit = js.native
  def getData(
    options: flexmonsterLib.Anon_Slice,
    callbackHandler: js.Function1[/* rawData */ js.Any, scala.Unit],
    updateHandler: js.Function1[/* rawData */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getFilter(hierarchyName: java.lang.String): Filter = js.native
  def getFormat(measureName: java.lang.String): Format = js.native
  def getMeasures(): js.Array[Measure] = js.native
  def getMembers(hierarchyName: java.lang.String, memberName: java.lang.String, callbackHandler: java.lang.String): js.Array[Member] = js.native
  def getMembers(
    hierarchyName: java.lang.String,
    memberName: java.lang.String,
    callbackHandler: js.Function1[/* members */ js.Array[Member], scala.Unit]
  ): js.Array[Member] = js.native
  def getOptions(): Options = js.native
  def getReport(): Report | java.lang.String = js.native
  def getReport(format: java.lang.String): Report | java.lang.String = js.native
  def getReportFilters(): js.Array[Hierarchy] = js.native
  def getRows(): js.Array[Hierarchy] = js.native
  def getSelectedCell(): CellData | js.Array[CellData] = js.native
  def getSort(hierarchyName: java.lang.String): java.lang.String = js.native
  def getXMLACatalogs(proxyURL: java.lang.String, dataSource: java.lang.String, callbackHandler: java.lang.String): scala.Unit = js.native
  def getXMLACatalogs(
    proxyURL: java.lang.String,
    dataSource: java.lang.String,
    callbackHandler: java.lang.String,
    username: java.lang.String
  ): scala.Unit = js.native
  def getXMLACatalogs(
    proxyURL: java.lang.String,
    dataSource: java.lang.String,
    callbackHandler: java.lang.String,
    username: java.lang.String,
    password: java.lang.String
  ): scala.Unit = js.native
  def getXMLACatalogs(
    proxyURL: java.lang.String,
    dataSource: java.lang.String,
    callbackHandler: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getXMLACatalogs(
    proxyURL: java.lang.String,
    dataSource: java.lang.String,
    callbackHandler: js.Function1[/* response */ js.Any, scala.Unit],
    username: java.lang.String
  ): scala.Unit = js.native
  def getXMLACatalogs(
    proxyURL: java.lang.String,
    dataSource: java.lang.String,
    callbackHandler: js.Function1[/* response */ js.Any, scala.Unit],
    username: java.lang.String,
    password: java.lang.String
  ): scala.Unit = js.native
  def getXMLACubes(
    proxyURL: java.lang.String,
    dataSource: java.lang.String,
    catalog: java.lang.String,
    callbackHandler: java.lang.String
  ): scala.Unit = js.native
  def getXMLACubes(
    proxyURL: java.lang.String,
    dataSource: java.lang.String,
    catalog: java.lang.String,
    callbackHandler: java.lang.String,
    username: java.lang.String
  ): scala.Unit = js.native
  def getXMLACubes(
    proxyURL: java.lang.String,
    dataSource: java.lang.String,
    catalog: java.lang.String,
    callbackHandler: java.lang.String,
    username: java.lang.String,
    password: java.lang.String
  ): scala.Unit = js.native
  def getXMLACubes(
    proxyURL: java.lang.String,
    dataSource: java.lang.String,
    catalog: java.lang.String,
    callbackHandler: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getXMLACubes(
    proxyURL: java.lang.String,
    dataSource: java.lang.String,
    catalog: java.lang.String,
    callbackHandler: js.Function1[/* response */ js.Any, scala.Unit],
    username: java.lang.String
  ): scala.Unit = js.native
  def getXMLACubes(
    proxyURL: java.lang.String,
    dataSource: java.lang.String,
    catalog: java.lang.String,
    callbackHandler: js.Function1[/* response */ js.Any, scala.Unit],
    username: java.lang.String,
    password: java.lang.String
  ): scala.Unit = js.native
  def getXMLADataSources(proxyURL: java.lang.String, callbackHandler: java.lang.String): scala.Unit = js.native
  def getXMLADataSources(proxyURL: java.lang.String, callbackHandler: java.lang.String, username: java.lang.String): scala.Unit = js.native
  def getXMLADataSources(
    proxyURL: java.lang.String,
    callbackHandler: java.lang.String,
    username: java.lang.String,
    password: java.lang.String
  ): scala.Unit = js.native
  def getXMLADataSources(proxyURL: java.lang.String, callbackHandler: js.Function1[/* response */ js.Any, scala.Unit]): scala.Unit = js.native
  def getXMLADataSources(
    proxyURL: java.lang.String,
    callbackHandler: js.Function1[/* response */ js.Any, scala.Unit],
    username: java.lang.String
  ): scala.Unit = js.native
  def getXMLADataSources(
    proxyURL: java.lang.String,
    callbackHandler: js.Function1[/* response */ js.Any, scala.Unit],
    username: java.lang.String,
    password: java.lang.String
  ): scala.Unit = js.native
  def getXMLAProviderName(proxyURL: java.lang.String, callbackHandler: java.lang.String): java.lang.String = js.native
  def getXMLAProviderName(proxyURL: java.lang.String, callbackHandler: java.lang.String, username: java.lang.String): java.lang.String = js.native
  def getXMLAProviderName(
    proxyURL: java.lang.String,
    callbackHandler: java.lang.String,
    username: java.lang.String,
    password: java.lang.String
  ): java.lang.String = js.native
  def getXMLAProviderName(proxyURL: java.lang.String, callbackHandler: js.Function1[/* response */ js.Any, scala.Unit]): java.lang.String = js.native
  def getXMLAProviderName(
    proxyURL: java.lang.String,
    callbackHandler: js.Function1[/* response */ js.Any, scala.Unit],
    username: java.lang.String
  ): java.lang.String = js.native
  def getXMLAProviderName(
    proxyURL: java.lang.String,
    callbackHandler: js.Function1[/* response */ js.Any, scala.Unit],
    username: java.lang.String,
    password: java.lang.String
  ): java.lang.String = js.native
  def load(url: java.lang.String): scala.Unit = js.native
  def load(url: java.lang.String, componentFolder: java.lang.String): scala.Unit = js.native
  def off(eventType: java.lang.String): scala.Unit = js.native
  def off(eventType: java.lang.String, handler: java.lang.String): scala.Unit = js.native
  def off(eventType: java.lang.String, handler: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def on(eventType: java.lang.String, handler: java.lang.String): scala.Unit = js.native
  def on(eventType: java.lang.String, handler: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def openFieldsList(): scala.Unit = js.native
  def openFilter(hierarchyName: java.lang.String): scala.Unit = js.native
  def print(): scala.Unit = js.native
  def print(options: PrintOptions): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def removeAllCalculatedMeasures(): scala.Unit = js.native
  def removeAllConditions(): scala.Unit = js.native
  def removeCalculatedMeasure(uniqueName: java.lang.String): scala.Unit = js.native
  def removeCondition(id: java.lang.String): scala.Unit = js.native
  def removeSelection(): scala.Unit = js.native
  def runQuery(slice: Slice): scala.Unit = js.native
  def save(filename: java.lang.String, destination: java.lang.String): java.lang.String = js.native
  def save(filename: java.lang.String, destination: java.lang.String, callbackHandler: java.lang.String): java.lang.String = js.native
  def save(
    filename: java.lang.String,
    destination: java.lang.String,
    callbackHandler: java.lang.String,
    url: java.lang.String
  ): java.lang.String = js.native
  def save(
    filename: java.lang.String,
    destination: java.lang.String,
    callbackHandler: java.lang.String,
    url: java.lang.String,
    embedData: scala.Boolean
  ): java.lang.String = js.native
  def save(
    filename: java.lang.String,
    destination: java.lang.String,
    callbackHandler: js.Function0[scala.Unit]
  ): java.lang.String = js.native
  def save(
    filename: java.lang.String,
    destination: java.lang.String,
    callbackHandler: js.Function0[scala.Unit],
    url: java.lang.String
  ): java.lang.String = js.native
  def save(
    filename: java.lang.String,
    destination: java.lang.String,
    callbackHandler: js.Function0[scala.Unit],
    url: java.lang.String,
    embedData: scala.Boolean
  ): java.lang.String = js.native
  def setFilter(hierarchyName: java.lang.String, filter: Filter): scala.Unit = js.native
  def setFormat(format: Format, measureName: java.lang.String): scala.Unit = js.native
  def setOptions(options: Options): scala.Unit = js.native
  def setReport(report: Report): scala.Unit = js.native
  def setSort(hierarchyName: java.lang.String, sortName: java.lang.String): scala.Unit = js.native
  def setSort(
    hierarchyName: java.lang.String,
    sortName: java.lang.String,
    customSorting: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def showCharts(): scala.Unit = js.native
  def showCharts(`type`: java.lang.String): scala.Unit = js.native
  def showCharts(`type`: java.lang.String, multiple: scala.Boolean): scala.Unit = js.native
  def showGrid(): scala.Unit = js.native
  def showGridAndCharts(): scala.Unit = js.native
  def showGridAndCharts(`type`: java.lang.String): scala.Unit = js.native
  def showGridAndCharts(`type`: java.lang.String, position: java.lang.String): scala.Unit = js.native
  def showGridAndCharts(`type`: java.lang.String, position: java.lang.String, multiple: scala.Boolean): scala.Unit = js.native
  def sortValues(
    axisName: java.lang.String,
    `type`: java.lang.String,
    tuple: js.Array[scala.Double],
    measure: MeasureObject
  ): scala.Unit = js.native
  def sortingMethod(
    hierarchyName: java.lang.String,
    compareFunction: js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Boolean]
  ): scala.Unit = js.native
  def updateData(`object`: DataSource): scala.Unit = js.native
  def updateData(`object`: js.Array[js.Object]): scala.Unit = js.native
}

