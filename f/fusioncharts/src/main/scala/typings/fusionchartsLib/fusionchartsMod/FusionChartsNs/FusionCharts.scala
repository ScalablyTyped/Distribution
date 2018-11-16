package typings
package fusionchartsLib.fusionchartsMod.FusionChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FusionCharts extends js.Object {
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function2[
      /* eventObject */ js.UndefOr[EventObject], 
      /* eventArgs */ js.UndefOr[js.Object], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addEventListener(
    `type`: js.Array[java.lang.String],
    listener: js.Function2[
      /* eventObject */ js.UndefOr[EventObject], 
      /* eventArgs */ js.UndefOr[js.Object], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addVariable(): scala.Unit = js.native
  def centerLabel(labelText: java.lang.String): scala.Unit = js.native
  def centerLabel(labelText: java.lang.String, options: js.Object): scala.Unit = js.native
  def chartType(): java.lang.String = js.native
  def chartType(value: java.lang.String): java.lang.String = js.native
  def chartType(value: java.lang.String, options: js.Any): java.lang.String = js.native
  def clearChart(): scala.Unit = js.native
  def clone(overrides: js.Object): js.Any = js.native
  def clone(overrides: js.Object, argsOnly: scala.Boolean): js.Any = js.native
  def configure(options: js.Object): scala.Unit = js.native
  def configureLink(param: js.Array[_]): scala.Unit = js.native
  def configureLink(param: js.Array[_], level: scala.Double): scala.Unit = js.native
  def configureLink(param: js.Object): scala.Unit = js.native
  def configureLink(param: js.Object, level: scala.Double): scala.Unit = js.native
  def dataReady(): scala.Boolean = js.native
  def dataReady(available: scala.Boolean): scala.Boolean = js.native
  def dispose(): scala.Unit = js.native
  def exportChart(): scala.Unit = js.native
  def exportChart(options: js.Object): scala.Unit = js.native
  def feedData(stream: java.lang.String): scala.Unit = js.native
  def getCSVData(): js.Any = js.native
  def getChartAttribute(): ChartObject = js.native
  def getChartAttribute(attribute: java.lang.String): ChartObject = js.native
  def getChartAttribute(attribute: js.Array[java.lang.String]): ChartObject = js.native
  def getChartData(format: ChartDataFormats): js.Any = js.native
  def getData(): js.Any = js.native
  def getDataAsCSV(): js.Any = js.native
  def getDataWithId(): js.Any = js.native
  def getJSONData(): stdLib.JSON = js.native
  def getSVGString(): java.lang.String = js.native
  def getSWFHTML(): js.Any = js.native
  def getViewEndIndex(): scala.Double = js.native
  def getViewStartIndex(): scala.Double = js.native
  def getXML(): js.Any = js.native
  def getXMLData(): js.Any = js.native
  def hasRendered(): scala.Boolean = js.native
  def isActive(): scala.Boolean = js.native
  def isPlotItemSliced(index: scala.Double): scala.Boolean = js.native
  def isUpdateActive(): scala.Boolean = js.native
  def lockResize(state: scala.Boolean): scala.Boolean = js.native
  def print(): scala.Unit = js.native
  def print(options: js.Object): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function2[
      /* eventObject */ js.UndefOr[EventObject], 
      /* eventArgs */ js.UndefOr[js.Object], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def removeEventListener(
    `type`: js.Array[java.lang.String],
    listener: js.Function2[
      /* eventObject */ js.UndefOr[EventObject], 
      /* eventArgs */ js.UndefOr[js.Object], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def render(): FusionCharts = js.native
  def render(containerElement: java.lang.String): FusionCharts = js.native
  def render(containerElement: java.lang.String, insertMode: java.lang.String): FusionCharts = js.native
  def render(containerElement: java.lang.String, insertMode: java.lang.String, callback: js.Function0[_]): FusionCharts = js.native
  def render(containerElement: stdLib.Element): FusionCharts = js.native
  def render(containerElement: stdLib.Element, insertMode: java.lang.String): FusionCharts = js.native
  def render(containerElement: stdLib.Element, insertMode: java.lang.String, callback: js.Function0[_]): FusionCharts = js.native
  def resetChart(): scala.Unit = js.native
  def resizeTo(width: java.lang.String, height: java.lang.String): js.Any = js.native
  def resizeTo(width: java.lang.String, height: scala.Double): js.Any = js.native
  def resizeTo(width: scala.Double, height: java.lang.String): js.Any = js.native
  def resizeTo(width: scala.Double, height: scala.Double): js.Any = js.native
  def restartUpdate(): scala.Unit = js.native
  def setChartAttribute(attributes: ChartObject): scala.Unit = js.native
  def setChartAttribute(attributes: ChartObject, value: java.lang.String): scala.Unit = js.native
  def setChartAttribute(attributes: java.lang.String): scala.Unit = js.native
  def setChartAttribute(attributes: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setChartData(data: java.lang.String, format: ChartDataFormats): scala.Unit = js.native
  def setChartData(data: js.Object, format: ChartDataFormats): scala.Unit = js.native
  def setChartDataUrl(url: java.lang.String, format: ChartDataFormats): scala.Unit = js.native
  def setData(value: scala.Double, label: java.lang.String): scala.Unit = js.native
  def setDataURL(url: java.lang.String): scala.Unit = js.native
  def setDataXML(data: java.lang.String): scala.Unit = js.native
  def setDataXML(data: js.Object): scala.Unit = js.native
  def setJSONData(data: java.lang.String): scala.Unit = js.native
  def setJSONData(data: js.Object): scala.Unit = js.native
  def setJSONUrl(url: java.lang.String): scala.Unit = js.native
  def setTransparent(): scala.Unit = js.native
  def setTransparent(transparency: scala.Boolean): scala.Unit = js.native
  def setXMLData(data: java.lang.String): scala.Unit = js.native
  def setXMLData(data: js.Object): scala.Unit = js.native
  def setXMLUrl(url: java.lang.String): scala.Unit = js.native
  def setZoomMode(yes: scala.Boolean): scala.Unit = js.native
  def showChartMessage(text: java.lang.String): scala.Unit = js.native
  def showChartMessage(text: java.lang.String, modal: scala.Boolean): scala.Unit = js.native
  def showChartMessage(text: java.lang.String, modal: scala.Boolean, cancelable: scala.Boolean): scala.Unit = js.native
  def slicePlotItem(index: scala.Double, slice: scala.Boolean): scala.Unit = js.native
  def startingAngle(): scala.Unit = js.native
  def startingAngle(angle: scala.Double): scala.Unit = js.native
  def startingAngle(angle: scala.Double, relative: scala.Boolean): scala.Unit = js.native
  def stopUpdate(): scala.Unit = js.native
  def zoomOut(): scala.Unit = js.native
  def zoomTo(startIndex: scala.Double, endIndex: scala.Double): scala.Unit = js.native
}

