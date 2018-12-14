package typings
package fusionchartsLib.fusionchartsMod.FusionChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FusionChartStatic
  extends org.scalablytyped.runtime.Instantiable1[(/* chartObject */ ChartObject) | (/* chartObject */ js.Object), FusionCharts] {
  var debugger: Debugger = js.native
  var version: js.Array[java.lang.String] = js.native
  def apply(chartId: java.lang.String): FusionCharts = js.native
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
  def batchExport(options: js.Object): scala.Unit = js.native
  def formatNumber(num: scala.Double): stdLib.Element = js.native
  def formatNumber(num: scala.Double, `type`: java.lang.String): stdLib.Element = js.native
  def formatNumber(num: scala.Double, `type`: java.lang.String, config: js.Object): stdLib.Element = js.native
  def getCurrentRenderer(): java.lang.String = js.native
  def getObjectReference(elementId: java.lang.String): stdLib.Element = js.native
  def ready(callback: js.Function1[/* fusionChartStatic */ js.UndefOr[this.type], _]): FusionChartStatic = js.native
  def ready(callback: js.Function1[/* fusionChartStatic */ js.UndefOr[this.type], _], context: js.Any): FusionChartStatic = js.native
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
  def render(options: ChartObject): FusionCharts = js.native
  def render(options: ChartObject, callback: js.Function0[_]): FusionCharts = js.native
  def setCurrentRenderer(name: java.lang.String): scala.Unit = js.native
  def transcodeData(
    data: java.lang.String,
    source: ChartDataFormats,
    target: ChartDataFormats,
    advanced: scala.Boolean
  ): js.Any = js.native
  def transcodeData(data: js.Object, source: ChartDataFormats, target: ChartDataFormats, advanced: scala.Boolean): js.Any = js.native
}

