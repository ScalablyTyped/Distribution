package typings.ejWebAll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdatavisualization extends js.Object {
  
  val Barcode: TypeofBarcode = js.native
  
  val BulletGraph: TypeofBulletGraph = js.native
  
  val Chart: TypeofChart = js.native
  
  val CircularGauge: TypeofCircularGauge = js.native
  
  val Diagram: TypeofDiagram = js.native
  
  val DigitalGauge: TypeofDigitalGauge = js.native
  
  val HeatMap: TypeofHeatMap = js.native
  
  val HeatMapLegend: TypeofHeatMapLegend = js.native
  
  val LinearGauge: TypeofLinearGauge = js.native
  
  val Map: TypeofMap = js.native
  
  val Overview: TypeofOverview = js.native
  
  val RangeNavigator: TypeofRangeNavigator = js.native
  
  val Sparkline: TypeofSparklineInstantiable = js.native
  
  val Sunburst: js.Any = js.native
  
  val SunburstChart: TypeofSunburstChartInstantiable = js.native
  
  val SymbolPalette: TypeofSymbolPalette = js.native
  
  val TreeMap: TypeofTreeMap = js.native
}
object Typeofdatavisualization {
  
  @scala.inline
  def apply(
    Barcode: TypeofBarcode,
    BulletGraph: TypeofBulletGraph,
    Chart: TypeofChart,
    CircularGauge: TypeofCircularGauge,
    Diagram: TypeofDiagram,
    DigitalGauge: TypeofDigitalGauge,
    HeatMap: TypeofHeatMap,
    HeatMapLegend: TypeofHeatMapLegend,
    LinearGauge: TypeofLinearGauge,
    Map: TypeofMap,
    Overview: TypeofOverview,
    RangeNavigator: TypeofRangeNavigator,
    Sparkline: TypeofSparklineInstantiable,
    Sunburst: js.Any,
    SunburstChart: TypeofSunburstChartInstantiable,
    SymbolPalette: TypeofSymbolPalette,
    TreeMap: TypeofTreeMap
  ): Typeofdatavisualization = {
    val __obj = js.Dynamic.literal(Barcode = Barcode.asInstanceOf[js.Any], BulletGraph = BulletGraph.asInstanceOf[js.Any], Chart = Chart.asInstanceOf[js.Any], CircularGauge = CircularGauge.asInstanceOf[js.Any], Diagram = Diagram.asInstanceOf[js.Any], DigitalGauge = DigitalGauge.asInstanceOf[js.Any], HeatMap = HeatMap.asInstanceOf[js.Any], HeatMapLegend = HeatMapLegend.asInstanceOf[js.Any], LinearGauge = LinearGauge.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Overview = Overview.asInstanceOf[js.Any], RangeNavigator = RangeNavigator.asInstanceOf[js.Any], Sparkline = Sparkline.asInstanceOf[js.Any], Sunburst = Sunburst.asInstanceOf[js.Any], SunburstChart = SunburstChart.asInstanceOf[js.Any], SymbolPalette = SymbolPalette.asInstanceOf[js.Any], TreeMap = TreeMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdatavisualization]
  }
  
  @scala.inline
  implicit class TypeofdatavisualizationOps[Self <: Typeofdatavisualization] (val x: Self) extends AnyVal {
    
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
    def setBarcode(value: TypeofBarcode): Self = this.set("Barcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletGraph(value: TypeofBulletGraph): Self = this.set("BulletGraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: TypeofChart): Self = this.set("Chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircularGauge(value: TypeofCircularGauge): Self = this.set("CircularGauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagram(value: TypeofDiagram): Self = this.set("Diagram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitalGauge(value: TypeofDigitalGauge): Self = this.set("DigitalGauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeatMap(value: TypeofHeatMap): Self = this.set("HeatMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeatMapLegend(value: TypeofHeatMapLegend): Self = this.set("HeatMapLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearGauge(value: TypeofLinearGauge): Self = this.set("LinearGauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: TypeofMap): Self = this.set("Map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverview(value: TypeofOverview): Self = this.set("Overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNavigator(value: TypeofRangeNavigator): Self = this.set("RangeNavigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSparkline(value: TypeofSparklineInstantiable): Self = this.set("Sparkline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSunburst(value: js.Any): Self = this.set("Sunburst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSunburstChart(value: TypeofSunburstChartInstantiable): Self = this.set("SunburstChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolPalette(value: TypeofSymbolPalette): Self = this.set("SymbolPalette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeMap(value: TypeofTreeMap): Self = this.set("TreeMap", value.asInstanceOf[js.Any])
  }
}
