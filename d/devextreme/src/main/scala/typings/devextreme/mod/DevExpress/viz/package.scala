package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typings.devextreme.anon.Days
  - typings.devextreme.mod.DevExpress.common.charts.TimeInterval
*/
type VizTimeInterval = _VizTimeInterval | Double

/* Rewritten from type alias, can be one of: 
  - typings.devextreme.mod.DevExpress.viz.dxChart
  - typings.devextreme.mod.DevExpress.viz.dxPieChart
  - typings.devextreme.mod.DevExpress.viz.dxFunnel
  - typings.devextreme.mod.DevExpress.viz.dxSankey
  - typings.devextreme.mod.DevExpress.viz.dxTreeMap
  - typings.devextreme.mod.DevExpress.viz.dxVectorMap
  - typings.devextreme.mod.DevExpress.viz.dxSparkline
  - typings.devextreme.mod.DevExpress.viz.dxBullet
  - typings.devextreme.mod.DevExpress.viz.dxBarGauge
*/
type VizWidget = _VizWidget | dxBullet

type dxBullet = BaseSparkline[dxBulletOptions]

type dxChartSeries = ChartSeries

type dxCircularGauge = BaseGauge[dxCircularGaugeOptions]

type dxLinearGauge = BaseGauge[dxLinearGaugeOptions]

type dxPieChartSeries = PieChartSeries

type dxPolarChartSeries = PolarChartSeries

type polarChartSeriesObject = baseSeriesObject

type polarPointObject = basePointObject
