package typings.devextreme.mod.default

import typings.devextreme.anon.BackgroundColor
import typings.devextreme.anon.BaseColorSet
import typings.devextreme.anon.FileName
import typings.devextreme.devextremeStrings.Bright
import typings.devextreme.devextremeStrings.Carmine
import typings.devextreme.devextremeStrings.Material
import typings.devextreme.devextremeStrings.Ocean
import typings.devextreme.devextremeStrings.Office
import typings.devextreme.devextremeStrings.Pastel
import typings.devextreme.devextremeStrings.Soft
import typings.devextreme.devextremeStrings.Vintage
import typings.devextreme.devextremeStrings.Violet
import typings.devextreme.devextremeStrings.`Dark Moon`
import typings.devextreme.devextremeStrings.`Dark Violet`
import typings.devextreme.devextremeStrings.`Green Mist`
import typings.devextreme.devextremeStrings.`Harmony Light`
import typings.devextreme.devextremeStrings.`Soft Blue`
import typings.devextreme.devextremeStrings.`Soft Pastel`
import typings.devextreme.devextremeStrings.equirectangular
import typings.devextreme.devextremeStrings.lambert
import typings.devextreme.devextremeStrings.mercator
import typings.devextreme.devextremeStrings.miller
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.viz.BaseChartOptions
import typings.devextreme.mod.DevExpress.viz.BaseGaugeOptions
import typings.devextreme.mod.DevExpress.viz.BaseSparklineOptions
import typings.devextreme.mod.DevExpress.viz.BaseWidgetOptions
import typings.devextreme.mod.DevExpress.viz.VectorMapProjectionConfig
import typings.devextreme.mod.DevExpress.viz.dxBarGaugeOptions
import typings.devextreme.mod.DevExpress.viz.dxBulletOptions
import typings.devextreme.mod.DevExpress.viz.dxChartOptions
import typings.devextreme.mod.DevExpress.viz.dxCircularGaugeOptions
import typings.devextreme.mod.DevExpress.viz.dxFunnelOptions
import typings.devextreme.mod.DevExpress.viz.dxLinearGaugeOptions
import typings.devextreme.mod.DevExpress.viz.dxPieChartOptions
import typings.devextreme.mod.DevExpress.viz.dxPolarChartOptions
import typings.devextreme.mod.DevExpress.viz.dxRangeSelectorOptions
import typings.devextreme.mod.DevExpress.viz.dxSankeyOptions
import typings.devextreme.mod.DevExpress.viz.dxSparklineOptions
import typings.devextreme.mod.DevExpress.viz.dxTreeMapOptions
import typings.devextreme.mod.DevExpress.viz.dxVectorMapOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.viz")
@js.native
class viz ()
  extends StObject
     with typings.devextreme.mod.DevExpress.viz
/* static members */
object viz {
  
  @JSImport("devextreme", "default.viz")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("devextreme", "default.viz.BaseChart")
  @js.native
  class BaseChart protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseChart {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: BaseChartOptions[typings.devextreme.mod.DevExpress.viz.BaseChart]) = this()
    def this(element: Element, options: BaseChartOptions[typings.devextreme.mod.DevExpress.viz.BaseChart]) = this()
  }
  
  @JSImport("devextreme", "default.viz.BaseGauge")
  @js.native
  class BaseGauge protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseGauge {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: BaseGaugeOptions[typings.devextreme.mod.DevExpress.viz.BaseGauge]) = this()
    def this(element: Element, options: BaseGaugeOptions[typings.devextreme.mod.DevExpress.viz.BaseGauge]) = this()
  }
  
  @JSImport("devextreme", "default.viz.BaseSparkline")
  @js.native
  class BaseSparkline protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseWidget {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(
      element: JQuery,
      options: BaseSparklineOptions[typings.devextreme.mod.DevExpress.viz.BaseSparkline]
    ) = this()
    def this(
      element: Element,
      options: BaseSparklineOptions[typings.devextreme.mod.DevExpress.viz.BaseSparkline]
    ) = this()
  }
  
  @JSImport("devextreme", "default.viz.BaseWidget")
  @js.native
  class BaseWidget protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseWidget {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: BaseWidgetOptions[typings.devextreme.mod.DevExpress.viz.BaseWidget]) = this()
    def this(element: Element, options: BaseWidgetOptions[typings.devextreme.mod.DevExpress.viz.BaseWidget]) = this()
  }
  
  @JSImport("devextreme", "default.viz.MapLayer")
  @js.native
  class MapLayer ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.MapLayer {
    
    /**
      * [descr:MapLayer.clearSelection()]
      */
    /* CompleteClass */
    override def clearSelection(): Unit = js.native
    
    /**
      * [descr:MapLayer.getDataSource()]
      */
    /* CompleteClass */
    override def getDataSource(): DataSource = js.native
    
    /**
      * [descr:MapLayer.getElements()]
      */
    /* CompleteClass */
    override def getElements(): js.Array[typings.devextreme.mod.DevExpress.viz.MapLayerElement] = js.native
  }
  
  @JSImport("devextreme", "default.viz.MapLayerElement")
  @js.native
  class MapLayerElement ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.MapLayerElement
  
  @JSImport("devextreme", "default.viz.baseLabelObject")
  @js.native
  class baseLabelObject ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.baseLabelObject
  
  @JSImport("devextreme", "default.viz.basePointObject")
  @js.native
  class basePointObject ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.basePointObject {
    
    /**
      * [descr:basePointObject.clearHover()]
      */
    /* CompleteClass */
    override def clearHover(): Unit = js.native
    
    /**
      * [descr:basePointObject.clearSelection()]
      */
    /* CompleteClass */
    override def clearSelection(): Unit = js.native
    
    /**
      * [descr:basePointObject.getColor()]
      */
    /* CompleteClass */
    override def getColor(): String = js.native
    
    /**
      * [descr:basePointObject.getLabel()]
      */
    /* CompleteClass */
    override def getLabel(): typings.devextreme.mod.DevExpress.viz.baseLabelObject & js.Array[typings.devextreme.mod.DevExpress.viz.baseLabelObject] = js.native
    
    /**
      * [descr:basePointObject.hideTooltip()]
      */
    /* CompleteClass */
    override def hideTooltip(): Unit = js.native
    
    /**
      * [descr:basePointObject.hover()]
      */
    /* CompleteClass */
    override def hover(): Unit = js.native
    
    /**
      * [descr:basePointObject.isHovered()]
      */
    /* CompleteClass */
    override def isHovered(): Boolean = js.native
    
    /**
      * [descr:basePointObject.isSelected()]
      */
    /* CompleteClass */
    override def isSelected(): Boolean = js.native
    
    /**
      * [descr:basePointObject.select()]
      */
    /* CompleteClass */
    override def select(): Unit = js.native
    
    /**
      * [descr:basePointObject.showTooltip()]
      */
    /* CompleteClass */
    override def showTooltip(): Unit = js.native
  }
  
  @JSImport("devextreme", "default.viz.baseSeriesObject")
  @js.native
  class baseSeriesObject ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.baseSeriesObject
  
  @JSImport("devextreme", "default.viz.chartAxisObject")
  @js.native
  class chartAxisObject ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.chartAxisObject
  
  @JSImport("devextreme", "default.viz.chartPointObject")
  @js.native
  class chartPointObject ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.chartPointObject {
    
    /**
      * [descr:basePointObject.clearHover()]
      */
    /* CompleteClass */
    override def clearHover(): Unit = js.native
    
    /**
      * [descr:basePointObject.clearSelection()]
      */
    /* CompleteClass */
    override def clearSelection(): Unit = js.native
    
    /**
      * [descr:chartPointObject.getBoundingRect()]
      */
    /* CompleteClass */
    override def getBoundingRect(): js.Any = js.native
    
    /**
      * [descr:basePointObject.getColor()]
      */
    /* CompleteClass */
    override def getColor(): String = js.native
    
    /**
      * [descr:basePointObject.getLabel()]
      */
    /* CompleteClass */
    override def getLabel(): typings.devextreme.mod.DevExpress.viz.baseLabelObject & js.Array[typings.devextreme.mod.DevExpress.viz.baseLabelObject] = js.native
    
    /**
      * [descr:basePointObject.hideTooltip()]
      */
    /* CompleteClass */
    override def hideTooltip(): Unit = js.native
    
    /**
      * [descr:basePointObject.hover()]
      */
    /* CompleteClass */
    override def hover(): Unit = js.native
    
    /**
      * [descr:basePointObject.isHovered()]
      */
    /* CompleteClass */
    override def isHovered(): Boolean = js.native
    
    /**
      * [descr:basePointObject.isSelected()]
      */
    /* CompleteClass */
    override def isSelected(): Boolean = js.native
    
    /**
      * [descr:basePointObject.select()]
      */
    /* CompleteClass */
    override def select(): Unit = js.native
    
    /**
      * [descr:basePointObject.showTooltip()]
      */
    /* CompleteClass */
    override def showTooltip(): Unit = js.native
  }
  
  @JSImport("devextreme", "default.viz.chartSeriesObject")
  @js.native
  class chartSeriesObject ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.chartSeriesObject
  
  /**
    * [descr:viz.currentPalette()]
    */
  @scala.inline
  def currentPalette(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("currentPalette")().asInstanceOf[String]
  /**
    * [descr:viz.currentPalette(paletteName)]
    */
  @scala.inline
  def currentPalette(paletteName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("currentPalette")(paletteName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * [descr:viz.currentTheme()]
    */
  @scala.inline
  def currentTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("currentTheme")().asInstanceOf[String]
  /**
    * [descr:viz.currentTheme(platform, colorScheme)]
    */
  @scala.inline
  def currentTheme(platform: String, colorScheme: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("currentTheme")(platform.asInstanceOf[js.Any], colorScheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * [descr:viz.currentTheme(theme)]
    */
  @scala.inline
  def currentTheme(theme: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("currentTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("devextreme", "default.viz.dxBarGauge")
  @js.native
  class dxBarGauge protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxBarGauge {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxBarGaugeOptions) = this()
    def this(element: Element, options: dxBarGaugeOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxBullet")
  @js.native
  class dxBullet protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseWidget {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxBulletOptions) = this()
    def this(element: Element, options: dxBulletOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxChart")
  @js.native
  class dxChart protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxChart {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxChartOptions) = this()
    def this(element: Element, options: dxChartOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxCircularGauge")
  @js.native
  class dxCircularGauge protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseGauge {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxCircularGaugeOptions) = this()
    def this(element: Element, options: dxCircularGaugeOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxFunnel")
  @js.native
  class dxFunnel protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxFunnel {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxFunnelOptions) = this()
    def this(element: Element, options: dxFunnelOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxFunnelItem")
  @js.native
  class dxFunnelItem ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxFunnelItem {
    
    /**
      * [descr:dxFunnelItem.getColor()]
      */
    /* CompleteClass */
    override def getColor(): String = js.native
    
    /**
      * [descr:dxFunnelItem.hover(state)]
      */
    /* CompleteClass */
    override def hover(state: Boolean): Unit = js.native
    
    /**
      * [descr:dxFunnelItem.isHovered()]
      */
    /* CompleteClass */
    override def isHovered(): Boolean = js.native
    
    /**
      * [descr:dxFunnelItem.isSelected()]
      */
    /* CompleteClass */
    override def isSelected(): Boolean = js.native
    
    /**
      * [descr:dxFunnelItem.select(state)]
      */
    /* CompleteClass */
    override def select(state: Boolean): Unit = js.native
    
    /**
      * [descr:dxFunnelItem.showTooltip()]
      */
    /* CompleteClass */
    override def showTooltip(): Unit = js.native
  }
  
  @JSImport("devextreme", "default.viz.dxLinearGauge")
  @js.native
  class dxLinearGauge protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseGauge {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxLinearGaugeOptions) = this()
    def this(element: Element, options: dxLinearGaugeOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxPieChart")
  @js.native
  class dxPieChart protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxPieChart {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxPieChartOptions) = this()
    def this(element: Element, options: dxPieChartOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxPolarChart")
  @js.native
  class dxPolarChart protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxPolarChart {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxPolarChartOptions) = this()
    def this(element: Element, options: dxPolarChartOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxRangeSelector")
  @js.native
  class dxRangeSelector protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxRangeSelector {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxRangeSelectorOptions) = this()
    def this(element: Element, options: dxRangeSelectorOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxSankey")
  @js.native
  class dxSankey protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxSankey {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxSankeyOptions) = this()
    def this(element: Element, options: dxSankeyOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxSankeyLink")
  @js.native
  class dxSankeyLink ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxSankeyLink {
    
    /**
      * [descr:dxSankeyLink.hideTooltip()]
      */
    /* CompleteClass */
    override def hideTooltip(): Unit = js.native
    
    /**
      * [descr:dxSankeyLink.hover(state)]
      */
    /* CompleteClass */
    override def hover(state: Boolean): Unit = js.native
    
    /**
      * [descr:dxSankeyLink.isHovered()]
      */
    /* CompleteClass */
    override def isHovered(): Boolean = js.native
    
    /**
      * [descr:dxSankeyLink.showTooltip()]
      */
    /* CompleteClass */
    override def showTooltip(): Unit = js.native
  }
  
  @JSImport("devextreme", "default.viz.dxSankeyNode")
  @js.native
  class dxSankeyNode ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxSankeyNode {
    
    /**
      * [descr:dxSankeyNode.hideTooltip()]
      */
    /* CompleteClass */
    override def hideTooltip(): Unit = js.native
    
    /**
      * [descr:dxSankeyNode.hover(state)]
      */
    /* CompleteClass */
    override def hover(state: Boolean): Unit = js.native
    
    /**
      * [descr:dxSankeyNode.isHovered()]
      */
    /* CompleteClass */
    override def isHovered(): Boolean = js.native
    
    /**
      * [descr:dxSankeyNode.showTooltip()]
      */
    /* CompleteClass */
    override def showTooltip(): Unit = js.native
  }
  
  @JSImport("devextreme", "default.viz.dxSparkline")
  @js.native
  class dxSparkline protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxSparkline {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxSparklineOptions) = this()
    def this(element: Element, options: dxSparklineOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxTreeMap")
  @js.native
  class dxTreeMap protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxTreeMap {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxTreeMapOptions) = this()
    def this(element: Element, options: dxTreeMapOptions) = this()
  }
  
  @JSImport("devextreme", "default.viz.dxTreeMapNode")
  @js.native
  class dxTreeMapNode ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxTreeMapNode
  
  @JSImport("devextreme", "default.viz.dxVectorMap")
  @js.native
  class dxVectorMap protected ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxVectorMap {
    def this(element: JQuery) = this()
    def this(element: Element) = this()
    def this(element: JQuery, options: dxVectorMapOptions) = this()
    def this(element: Element, options: dxVectorMapOptions) = this()
  }
  
  /**
    * [descr:viz.exportFromMarkup(markup, options)]
    */
  @scala.inline
  def exportFromMarkup(markup: String, options: BackgroundColor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exportFromMarkup")(markup.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * [descr:viz.exportWidgets(widgetInstances)]
    */
  @scala.inline
  def exportWidgets(widgetInstances: js.Array[js.Array[typings.devextreme.mod.DevExpress.DOMComponent]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exportWidgets")(widgetInstances.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * [descr:viz.exportWidgets(widgetInstances, options)]
    */
  @scala.inline
  def exportWidgets(
    widgetInstances: js.Array[js.Array[typings.devextreme.mod.DevExpress.DOMComponent]],
    options: FileName
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exportWidgets")(widgetInstances.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def generateColors(palette: js.Array[String], count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * [descr:viz.generateColors(palette, count, options)]
    */
  @scala.inline
  def generateColors_Bright(palette: Bright, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_Carmine(palette: Carmine, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_DarkMoon(palette: `Dark Moon`, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_DarkViolet(palette: `Dark Violet`, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_GreenMist(palette: `Green Mist`, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_HarmonyLight(palette: `Harmony Light`, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_Material(palette: Material, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_Ocean(palette: Ocean, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_Office(palette: Office, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_Pastel(palette: Pastel, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_Soft(palette: Soft, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_SoftBlue(palette: `Soft Blue`, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_SoftPastel(palette: `Soft Pastel`, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_Vintage(palette: Vintage, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def generateColors_Violet(palette: Violet, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * [descr:viz.getMarkup(widgetInstances)]
    */
  @scala.inline
  def getMarkup(widgetInstances: js.Array[typings.devextreme.mod.DevExpress.DOMComponent]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMarkup")(widgetInstances.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * [descr:viz.getPalette(paletteName)]
    */
  @scala.inline
  def getPalette(paletteName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPalette")(paletteName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * [descr:viz.getTheme(theme)]
    */
  @scala.inline
  def getTheme(theme: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  object map {
    
    object projection {
      
      @scala.inline
      def apply(data: VectorMapProjectionConfig): js.Any = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("devextreme", "default.viz.map.projection")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def add(name: String, projection: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def add(name: String, projection: VectorMapProjectionConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def get(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @scala.inline
      def get_equirectangular(name: equirectangular): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @scala.inline
      def get_lambert(name: lambert): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @scala.inline
      def get_mercator(name: mercator): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @scala.inline
      def get_miller(name: miller): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    }
  }
  
  @JSImport("devextreme", "default.viz.pieChartSeriesObject")
  @js.native
  class pieChartSeriesObject ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.baseSeriesObject
  
  @JSImport("devextreme", "default.viz.piePointObject")
  @js.native
  class piePointObject ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.piePointObject {
    
    /**
      * [descr:basePointObject.clearHover()]
      */
    /* CompleteClass */
    override def clearHover(): Unit = js.native
    
    /**
      * [descr:basePointObject.clearSelection()]
      */
    /* CompleteClass */
    override def clearSelection(): Unit = js.native
    
    /**
      * [descr:basePointObject.getColor()]
      */
    /* CompleteClass */
    override def getColor(): String = js.native
    
    /**
      * [descr:basePointObject.getLabel()]
      */
    /* CompleteClass */
    override def getLabel(): typings.devextreme.mod.DevExpress.viz.baseLabelObject & js.Array[typings.devextreme.mod.DevExpress.viz.baseLabelObject] = js.native
    
    /**
      * [descr:piePointObject.hide()]
      */
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /**
      * [descr:basePointObject.hideTooltip()]
      */
    /* CompleteClass */
    override def hideTooltip(): Unit = js.native
    
    /**
      * [descr:basePointObject.hover()]
      */
    /* CompleteClass */
    override def hover(): Unit = js.native
    
    /**
      * [descr:basePointObject.isHovered()]
      */
    /* CompleteClass */
    override def isHovered(): Boolean = js.native
    
    /**
      * [descr:basePointObject.isSelected()]
      */
    /* CompleteClass */
    override def isSelected(): Boolean = js.native
    
    /**
      * [descr:piePointObject.isVisible()]
      */
    /* CompleteClass */
    override def isVisible(): Boolean = js.native
    
    /**
      * [descr:basePointObject.select()]
      */
    /* CompleteClass */
    override def select(): Unit = js.native
    
    /**
      * [descr:piePointObject.show()]
      */
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /**
      * [descr:basePointObject.showTooltip()]
      */
    /* CompleteClass */
    override def showTooltip(): Unit = js.native
  }
  
  @JSImport("devextreme", "default.viz.polarChartSeriesObject")
  @js.native
  class polarChartSeriesObject ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.baseSeriesObject
  
  @JSImport("devextreme", "default.viz.polarPointObject")
  @js.native
  class polarPointObject ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.basePointObject {
    
    /**
      * [descr:basePointObject.clearHover()]
      */
    /* CompleteClass */
    override def clearHover(): Unit = js.native
    
    /**
      * [descr:basePointObject.clearSelection()]
      */
    /* CompleteClass */
    override def clearSelection(): Unit = js.native
    
    /**
      * [descr:basePointObject.getColor()]
      */
    /* CompleteClass */
    override def getColor(): String = js.native
    
    /**
      * [descr:basePointObject.getLabel()]
      */
    /* CompleteClass */
    override def getLabel(): typings.devextreme.mod.DevExpress.viz.baseLabelObject & js.Array[typings.devextreme.mod.DevExpress.viz.baseLabelObject] = js.native
    
    /**
      * [descr:basePointObject.hideTooltip()]
      */
    /* CompleteClass */
    override def hideTooltip(): Unit = js.native
    
    /**
      * [descr:basePointObject.hover()]
      */
    /* CompleteClass */
    override def hover(): Unit = js.native
    
    /**
      * [descr:basePointObject.isHovered()]
      */
    /* CompleteClass */
    override def isHovered(): Boolean = js.native
    
    /**
      * [descr:basePointObject.isSelected()]
      */
    /* CompleteClass */
    override def isSelected(): Boolean = js.native
    
    /**
      * [descr:basePointObject.select()]
      */
    /* CompleteClass */
    override def select(): Unit = js.native
    
    /**
      * [descr:basePointObject.showTooltip()]
      */
    /* CompleteClass */
    override def showTooltip(): Unit = js.native
  }
  
  /**
    * [descr:viz.refreshPaths()]
    */
  @scala.inline
  def refreshPaths(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshPaths")().asInstanceOf[Unit]
  
  /**
    * [descr:viz.refreshTheme()]
    */
  @scala.inline
  def refreshTheme(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshTheme")().asInstanceOf[Unit]
  
  /**
    * [descr:viz.registerPalette(paletteName, palette)]
    */
  @scala.inline
  def registerPalette(paletteName: String, palette: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPalette")(paletteName.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * [descr:viz.registerTheme(customTheme, baseTheme)]
    */
  @scala.inline
  def registerTheme(customTheme: js.Any, baseTheme: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTheme")(customTheme.asInstanceOf[js.Any], baseTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
