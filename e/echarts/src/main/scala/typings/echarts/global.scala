package typings.echarts

import org.scalablytyped.runtime.Shortcut
import typings.echarts.anon.DevicePixelRatio
import typings.echarts.echarts.ECharts
import typings.echarts.echarts.Graphic
import typings.echarts.echarts.MapObj
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import typings.zrender.anon.AddColorStop
import typings.zrender.zrender.ColorStops
import typings.zrender.zrender.GlobalCoords
import typings.zrender.zrender.X
import typings.zrender.zrender.X2
import typings.zrender.zrender.Y
import typings.zrender.zrender.Y2
import typings.zrender.zrenderStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object echarts {
    
    @JSGlobal("echarts")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Connects interaction of multiple chart series. For example:
      *
      ```js
      // set group id of each instance respectively.
      chart1.group = 'group1';
      chart2.group = 'group1';
      echarts.connect('group1');
      // or incoming instance array that need to be linked.
      echarts.connect([chart1, chart2]);
      ```
      *
      * @param group Group id in string, or array of chart instance.
      */
    @scala.inline
    def connect(group: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(group.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def connect(group: js.Array[ECharts]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(group.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Disconnects interaction of multiple chart series. To have one single
      * instance to be removed, you can set `group` of chart instance to be null.
      *
      * @param {string} group Group id in string.
      */
    @scala.inline
    def disConnect(group: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disConnect")(group.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Destroys chart instance, after which the instance cannot be used any
      *     more.
      *
      * @param target Chart instance or container.
      */
    @scala.inline
    def dispose(target: ECharts): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def dispose(target: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def dispose(target: HTMLDivElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def getInstanceByDom(target: HTMLCanvasElement): ECharts = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceByDom")(target.asInstanceOf[js.Any]).asInstanceOf[ECharts]
    /**
      * Returns chart instance of dom container.
      *
      * @param target Chart container.
      */
    @scala.inline
    def getInstanceByDom(target: HTMLDivElement): ECharts = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceByDom")(target.asInstanceOf[js.Any]).asInstanceOf[ECharts]
    
    /**
      * Get a registed map.
      *
      * @param {string} mapName Map name.
      * @return {MapObj} Map data.
      */
    @scala.inline
    def getMap(mapName: String): MapObj = ^.asInstanceOf[js.Dynamic].applyDynamic("getMap")(mapName.asInstanceOf[js.Any]).asInstanceOf[MapObj]
    
    /**
      * Util methods about graphics.
      */
    object graphic extends Shortcut {
      
      @JSGlobal("echarts.graphic")
      @js.native
      val ^ : Graphic = js.native
      
      /**
        * x, y, x2, y2 are all percent from 0 to 1
        */
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("echarts.graphic.LinearGradient")
      @js.native
      class LinearGradient protected ()
        extends StObject
           with AddColorStop {
        def this(
          /** @default 0 */
        x: js.UndefOr[X],
          /** @default 0 */
        y: js.UndefOr[Y],
          /** @default 1 */
        x2: js.UndefOr[X2],
          /** @default 0 */
        y2: js.UndefOr[Y2],
          /** @default [] */
        colorStops: js.UndefOr[ColorStops],
          /** @default false */
        globalCoord: js.UndefOr[GlobalCoords]
        ) = this()
        
        /* CompleteClass */
        override def addColorStop(offset: Double, color: String): Unit = js.native
        
        /* CompleteClass */
        var colorStops: ColorStops = js.native
        
        /* CompleteClass */
        var globalCoord: GlobalCoords = js.native
        
        /* CompleteClass */
        var `type`: linear = js.native
        
        /* CompleteClass */
        var x: X = js.native
        
        /* CompleteClass */
        var x2: X2 = js.native
        
        /* CompleteClass */
        var y: Y = js.native
        
        /* CompleteClass */
        var y2: Y2 = js.native
      }
      
      type _To = Graphic
      
      /* This means you don't have to write `^`, but can instead just say `graphic.foo` */
      override def _to: Graphic = ^
    }
    
    @scala.inline
    def init(dom: HTMLCanvasElement): ECharts = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(dom.asInstanceOf[js.Any]).asInstanceOf[ECharts]
    @scala.inline
    def init(dom: HTMLCanvasElement, theme: String): ECharts = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(dom.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[ECharts]
    @scala.inline
    def init(dom: HTMLCanvasElement, theme: String, opts: DevicePixelRatio): ECharts = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(dom.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ECharts]
    @scala.inline
    def init(dom: HTMLCanvasElement, theme: js.Object): ECharts = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(dom.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[ECharts]
    @scala.inline
    def init(dom: HTMLCanvasElement, theme: js.Object, opts: DevicePixelRatio): ECharts = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(dom.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ECharts]
    @scala.inline
    def init(dom: HTMLCanvasElement, theme: Unit, opts: DevicePixelRatio): ECharts = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(dom.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ECharts]
    /**
      * Creates an ECharts instance, and returns an echartsInstance. You shall
      *     not initialize multiple ECharts instances on a single container.
      *
      * @param {HTMLDivElement | HTMLCanvasElement} dom Instance container,
      *     usually is a `div` element with height and width defined.
      * @param {object | string} [theme] Theme to be applied.
      *     This can be a configuring object of a theme, or a theme name
      *     registered through [echarts.registerTheme](https://echarts.apache.org/api.html#echarts.registerTheme).
      * @param {object} [opts] Chart configurations.
      * @param {number} [opts.devicePixelRatio] Ratio of one physical pixel to
      *     the size of one device independent pixels. Browser's
      *     `window.devicePixelRatio` is used by default.
      * @param {string} [opts.renderer] Supports `'canvas'` or `'svg'`.
      *     See [Render by Canvas or SVG](https://echarts.apache.org/tutorial.html#Render%20by%20Canvas%20or%20SVG).
      * @param {number} [opts.width] Specify width explicitly, in pixel.
      *     If setting to `null`/`undefined`/`'auto'`, width of `dom`
      *     (instance container) will be used.
      * @param {number} [opts.height] Specify height explicitly, in pixel.
      *     If setting to `null`/`undefined`/`'auto'`, height of `dom`
      *     (instance container) will be used.
      */
    @scala.inline
    def init(dom: HTMLDivElement): ECharts = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(dom.asInstanceOf[js.Any]).asInstanceOf[ECharts]
    @scala.inline
    def init(dom: HTMLDivElement, theme: String): ECharts = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(dom.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[ECharts]
    @scala.inline
    def init(dom: HTMLDivElement, theme: String, opts: DevicePixelRatio): ECharts = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(dom.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ECharts]
    @scala.inline
    def init(dom: HTMLDivElement, theme: js.Object): ECharts = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(dom.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[ECharts]
    @scala.inline
    def init(dom: HTMLDivElement, theme: js.Object, opts: DevicePixelRatio): ECharts = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(dom.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ECharts]
    @scala.inline
    def init(dom: HTMLDivElement, theme: Unit, opts: DevicePixelRatio): ECharts = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(dom.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ECharts]
    
    /**
      * Registers available maps. This can only be used after including
      * [geo](https://echarts.apache.org/option.html#geo)
      * component or chart series of
      * [map](https://echarts.apache.org/option.html#series-map).
      *
      * @param {string} mapName Map name, referring to `map` value set in
      *     [geo](https://echarts.apache.org/option.html#geo)
      *     component or
      *     [map](https://echarts.apache.org/option.html#series-map).
      * @param {object} geoJson Data in GeoJson format. See
      *     [http://geojson.org/](http://geojson.org/) for more format information.
      * @param {object} [specialAreas] Zoomed part of a specific area in the map
      *     for better visual effect.
      *     See [USA Population Estimates example](https://echarts.apache.org/examples/en/editor.html?c=map-usa).
      */
    @scala.inline
    def registerMap(mapName: String, geoJson: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMap")(mapName.asInstanceOf[js.Any], geoJson.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def registerMap(mapName: String, geoJson: js.Object, specialAreas: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMap")(mapName.asInstanceOf[js.Any], geoJson.asInstanceOf[js.Any], specialAreas.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Registers a theme, should be specified when
      * [initialize the chart instance](https://echarts.apache.org/api.html#echarts.init).
      *
      * @param {string} themeName Theme name.
      * @param {object} theme Theme configurations.
      */
    @scala.inline
    def registerTheme(themeName: String, theme: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTheme")(themeName.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
