package typings.fusioncharts.mod

import typings.std.Element
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FusionCharts extends js.Object {
  def addEventListener(
    `type`: String,
    listener: js.Function2[
      /* eventObject */ js.UndefOr[EventObject], 
      /* eventArgs */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: js.Array[String],
    listener: js.Function2[
      /* eventObject */ js.UndefOr[EventObject], 
      /* eventArgs */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Unit = js.native
  def addVariable(): Unit = js.native
  def centerLabel(labelText: String): Unit = js.native
  def centerLabel(labelText: String, options: js.Object): Unit = js.native
  def chartType(): String = js.native
  def chartType(value: js.UndefOr[scala.Nothing], options: js.Any): String = js.native
  def chartType(value: String): String = js.native
  def chartType(value: String, options: js.Any): String = js.native
  def clearChart(): Unit = js.native
  def clone(overrides: js.UndefOr[scala.Nothing], argsOnly: Boolean): js.Any = js.native
  def clone(overrides: js.Object): js.Any = js.native
  def clone(overrides: js.Object, argsOnly: Boolean): js.Any = js.native
  def configure(options: js.Object): Unit = js.native
  def configureLink(param: js.Array[_]): Unit = js.native
  def configureLink(param: js.Array[_], level: Double): Unit = js.native
  def configureLink(param: js.Object): Unit = js.native
  def configureLink(param: js.Object, level: Double): Unit = js.native
  def dataReady(): Boolean = js.native
  def dataReady(available: Boolean): Boolean = js.native
  def dispose(): Unit = js.native
  def exportChart(): Unit = js.native
  def exportChart(options: js.Object): Unit = js.native
  def feedData(stream: String): Unit = js.native
  def getCSVData(): js.Any = js.native
  def getChartAttribute(): ChartObject = js.native
  def getChartAttribute(attribute: String): ChartObject = js.native
  def getChartAttribute(attribute: js.Array[String]): ChartObject = js.native
  def getChartData(format: ChartDataFormats): js.Any = js.native
  def getData(): js.Any = js.native
  def getDataAsCSV(): js.Any = js.native
  def getDataWithId(): js.Any = js.native
  def getJSONData(): JSON = js.native
  def getSVGString(): String = js.native
  def getSWFHTML(): js.Any = js.native
  def getViewEndIndex(): Double = js.native
  def getViewStartIndex(): Double = js.native
  def getXML(): js.Any = js.native
  def getXMLData(): js.Any = js.native
  def hasRendered(): Boolean = js.native
  def isActive(): Boolean = js.native
  def isPlotItemSliced(index: Double): Boolean = js.native
  def isUpdateActive(): Boolean = js.native
  def lockResize(state: Boolean): Boolean = js.native
  def print(): Unit = js.native
  def print(options: js.Object): Unit = js.native
  def removeEventListener(
    `type`: String,
    listener: js.Function2[
      /* eventObject */ js.UndefOr[EventObject], 
      /* eventArgs */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Unit = js.native
  def removeEventListener(
    `type`: js.Array[String],
    listener: js.Function2[
      /* eventObject */ js.UndefOr[EventObject], 
      /* eventArgs */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Unit = js.native
  def render(): FusionCharts = js.native
  def render(
    containerElement: js.UndefOr[scala.Nothing],
    insertMode: js.UndefOr[scala.Nothing],
    callback: js.Function0[_]
  ): FusionCharts = js.native
  def render(containerElement: js.UndefOr[scala.Nothing], insertMode: String): FusionCharts = js.native
  def render(containerElement: js.UndefOr[scala.Nothing], insertMode: String, callback: js.Function0[_]): FusionCharts = js.native
  def render(containerElement: String): FusionCharts = js.native
  def render(containerElement: String, insertMode: js.UndefOr[scala.Nothing], callback: js.Function0[_]): FusionCharts = js.native
  def render(containerElement: String, insertMode: String): FusionCharts = js.native
  def render(containerElement: String, insertMode: String, callback: js.Function0[_]): FusionCharts = js.native
  def render(containerElement: Element): FusionCharts = js.native
  def render(containerElement: Element, insertMode: js.UndefOr[scala.Nothing], callback: js.Function0[_]): FusionCharts = js.native
  def render(containerElement: Element, insertMode: String): FusionCharts = js.native
  def render(containerElement: Element, insertMode: String, callback: js.Function0[_]): FusionCharts = js.native
  def resetChart(): Unit = js.native
  def resizeTo(width: String, height: String): js.Any = js.native
  def resizeTo(width: String, height: Double): js.Any = js.native
  def resizeTo(width: Double, height: String): js.Any = js.native
  def resizeTo(width: Double, height: Double): js.Any = js.native
  def restartUpdate(): Unit = js.native
  def setChartAttribute(attributes: String): Unit = js.native
  def setChartAttribute(attributes: String, value: String): Unit = js.native
  def setChartAttribute(attributes: ChartObject): Unit = js.native
  def setChartAttribute(attributes: ChartObject, value: String): Unit = js.native
  def setChartData(data: String, format: ChartDataFormats): Unit = js.native
  def setChartData(data: js.Object, format: ChartDataFormats): Unit = js.native
  def setChartDataUrl(url: String, format: ChartDataFormats): Unit = js.native
  def setData(value: Double, label: String): Unit = js.native
  def setDataURL(url: String): Unit = js.native
  def setDataXML(data: String): Unit = js.native
  def setDataXML(data: js.Object): Unit = js.native
  def setJSONData(data: String): Unit = js.native
  def setJSONData(data: js.Object): Unit = js.native
  def setJSONUrl(url: String): Unit = js.native
  def setTransparent(): Unit = js.native
  def setTransparent(transparency: Boolean): Unit = js.native
  def setXMLData(data: String): Unit = js.native
  def setXMLData(data: js.Object): Unit = js.native
  def setXMLUrl(url: String): Unit = js.native
  def setZoomMode(yes: Boolean): Unit = js.native
  def showChartMessage(text: String): Unit = js.native
  def showChartMessage(text: String, modal: js.UndefOr[scala.Nothing], cancelable: Boolean): Unit = js.native
  def showChartMessage(text: String, modal: Boolean): Unit = js.native
  def showChartMessage(text: String, modal: Boolean, cancelable: Boolean): Unit = js.native
  def slicePlotItem(index: Double, slice: Boolean): Unit = js.native
  def startingAngle(): Unit = js.native
  def startingAngle(angle: js.UndefOr[scala.Nothing], relative: Boolean): Unit = js.native
  def startingAngle(angle: Double): Unit = js.native
  def startingAngle(angle: Double, relative: Boolean): Unit = js.native
  def stopUpdate(): Unit = js.native
  def zoomOut(): Unit = js.native
  def zoomTo(startIndex: Double, endIndex: Double): Unit = js.native
}

