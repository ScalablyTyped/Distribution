package typings.devextreme.mod.default

import typings.devextreme.anon.BaseColorSet
import typings.devextreme.anon.GridLayout
import typings.devextreme.anon.OnExported
import typings.devextreme.mod.DevExpress.common.charts.Palette
import typings.devextreme.mod.DevExpress.core.DefaultOptionsRule
import typings.devextreme.mod.DevExpress.viz.VectorMapProjection
import typings.devextreme.mod.DevExpress.viz.VectorMapProjectionConfig
import typings.devextreme.mod.DevExpress.viz.VizWidget
import typings.devextreme.mod.DevExpress.viz.dxBulletOptions
import typings.devextreme.mod.DevExpress.viz.dxCircularGaugeOptions
import typings.devextreme.mod.DevExpress.viz.dxLinearGaugeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viz {
  
  @JSImport("devextreme", "default.viz")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("devextreme", "default.viz.BaseChart")
  @js.native
  open class BaseChart[TProperties] ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseChart[TProperties]
  
  @JSImport("devextreme", "default.viz.BaseGauge")
  @js.native
  open class BaseGauge[TProperties] ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseGauge[TProperties]
  
  @JSImport("devextreme", "default.viz.BaseSparkline")
  @js.native
  open class BaseSparkline[TProperties] ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseSparkline[TProperties]
  
  @JSImport("devextreme", "default.viz.BaseWidget")
  @js.native
  open class BaseWidget[TProperties] ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseWidget[TProperties]
  /* static members */
  object BaseWidget {
    
    @JSImport("devextreme", "default.viz.BaseWidget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 
      * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
      */
    inline def defaultOptions[TProperties](rule: DefaultOptionsRule[TProperties]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")(rule.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def currentPalette(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("currentPalette")().asInstanceOf[String]
  inline def currentPalette(paletteName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("currentPalette")(paletteName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def currentTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("currentTheme")().asInstanceOf[String]
  inline def currentTheme(platform: String, colorScheme: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("currentTheme")(platform.asInstanceOf[js.Any], colorScheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def currentTheme(theme: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("currentTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("devextreme", "default.viz.dxBarGauge")
  @js.native
  open class dxBarGauge ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxBarGauge
  
  @JSImport("devextreme", "default.viz.dxBullet")
  @js.native
  open class dxBullet ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseSparkline[dxBulletOptions]
  
  @JSImport("devextreme", "default.viz.dxChart")
  @js.native
  open class dxChart ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxChart
  
  @JSImport("devextreme", "default.viz.dxCircularGauge")
  @js.native
  open class dxCircularGauge ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseGauge[dxCircularGaugeOptions]
  
  @JSImport("devextreme", "default.viz.dxFunnel")
  @js.native
  open class dxFunnel ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxFunnel
  
  @JSImport("devextreme", "default.viz.dxLinearGauge")
  @js.native
  open class dxLinearGauge ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.BaseGauge[dxLinearGaugeOptions]
  
  @JSImport("devextreme", "default.viz.dxPieChart")
  @js.native
  open class dxPieChart ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxPieChart
  
  @JSImport("devextreme", "default.viz.dxPolarChart")
  @js.native
  open class dxPolarChart ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxPolarChart
  
  @JSImport("devextreme", "default.viz.dxRangeSelector")
  @js.native
  open class dxRangeSelector ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxRangeSelector
  
  @JSImport("devextreme", "default.viz.dxSankey")
  @js.native
  open class dxSankey ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxSankey
  
  @JSImport("devextreme", "default.viz.dxSparkline")
  @js.native
  open class dxSparkline ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxSparkline
  
  @JSImport("devextreme", "default.viz.dxTreeMap")
  @js.native
  open class dxTreeMap ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxTreeMap
  
  @JSImport("devextreme", "default.viz.dxVectorMap")
  @js.native
  open class dxVectorMap ()
    extends StObject
       with typings.devextreme.mod.DevExpress.viz.dxVectorMap
  
  inline def exportFromMarkup(markup: String, options: OnExported): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exportFromMarkup")(markup.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def exportWidgets(widgetInstances: js.Array[js.Array[VizWidget] | VizWidget]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exportWidgets")(widgetInstances.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def exportWidgets(widgetInstances: js.Array[js.Array[VizWidget] | VizWidget], options: GridLayout): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exportWidgets")(widgetInstances.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def exportWidgets(widgetInstances: VizWidget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exportWidgets")(widgetInstances.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def exportWidgets(widgetInstances: VizWidget, options: GridLayout): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exportWidgets")(widgetInstances.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def generateColors(palette: js.Array[String], count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def generateColors(palette: Palette, count: Double, options: BaseColorSet): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateColors")(palette.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getMarkup(widgetInstances: js.Array[js.Array[VizWidget] | VizWidget]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMarkup")(widgetInstances.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getMarkup(widgetInstances: VizWidget): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMarkup")(widgetInstances.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPalette(paletteName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPalette")(paletteName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getTheme(theme: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object map {
    
    object projection {
      
      inline def apply(data: VectorMapProjectionConfig): Any = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      @JSImport("devextreme", "default.viz.map.projection")
      @js.native
      val ^ : js.Any = js.native
      
      inline def add(name: String, projection: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /**
        * Adds a new projection to the internal projection storage.
        */
      inline def add(name: String, projection: VectorMapProjectionConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def get(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
      /**
        * Gets a predefined or custom projection from the projection storage.
        */
      inline def get(name: VectorMapProjection): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    }
  }
  
  inline def refreshPaths(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshPaths")().asInstanceOf[Unit]
  
  inline def refreshTheme(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshTheme")().asInstanceOf[Unit]
  
  inline def registerPalette(paletteName: String, palette: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPalette")(paletteName.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerTheme(customTheme: Any, baseTheme: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTheme")(customTheme.asInstanceOf[js.Any], baseTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
