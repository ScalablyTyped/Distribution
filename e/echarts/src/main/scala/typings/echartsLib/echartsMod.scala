package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("echarts", JSImport.Namespace)
@js.native
object echartsMod extends js.Object {
  /**
    * Util methods about graphics.
    */
  val graphic: echartsLib.echartsNs.Graphic = js.native
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
  def connect(group: java.lang.String): scala.Unit = js.native
  def connect(group: js.Array[echartsLib.echartsNs.ECharts]): scala.Unit = js.native
  /**
    * Disconnects interaction of multiple chart series. To have one single
    * instance to be removed, you can set `group` of chart instance to be null.
    *
    * @param {string} group Group id in string.
    */
  def disConnect(group: java.lang.String): scala.Unit = js.native
  /**
    * Destroys chart instance, after which the instance cannot be used any
    *     more.
    *
    * @param target Chart instance or container.
    */
  def dispose(target: echartsLib.echartsNs.ECharts): scala.Unit = js.native
  def dispose(target: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def dispose(target: stdLib.HTMLDivElement): scala.Unit = js.native
  def getInstanceByDom(target: stdLib.HTMLCanvasElement): echartsLib.echartsNs.ECharts = js.native
  /**
    * Returns chart instance of dom container.
    *
    * @param target Chart container.
    */
  def getInstanceByDom(target: stdLib.HTMLDivElement): echartsLib.echartsNs.ECharts = js.native
  /**
    * Get a registed map.
    *
    * @param {string} mapName Map name.
    * @return {MapObj} Map data.
    */
  def getMap(mapName: java.lang.String): echartsLib.echartsNs.MapObj = js.native
  def init(dom: stdLib.HTMLCanvasElement): echartsLib.echartsNs.ECharts = js.native
  def init(dom: stdLib.HTMLCanvasElement, theme: java.lang.String): echartsLib.echartsNs.ECharts = js.native
  def init(dom: stdLib.HTMLCanvasElement, theme: java.lang.String, opts: echartsLib.Anon_DevicePixelRatio): echartsLib.echartsNs.ECharts = js.native
  def init(dom: stdLib.HTMLCanvasElement, theme: js.Object): echartsLib.echartsNs.ECharts = js.native
  def init(dom: stdLib.HTMLCanvasElement, theme: js.Object, opts: echartsLib.Anon_DevicePixelRatio): echartsLib.echartsNs.ECharts = js.native
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
  def init(dom: stdLib.HTMLDivElement): echartsLib.echartsNs.ECharts = js.native
  def init(dom: stdLib.HTMLDivElement, theme: java.lang.String): echartsLib.echartsNs.ECharts = js.native
  def init(dom: stdLib.HTMLDivElement, theme: java.lang.String, opts: echartsLib.Anon_DevicePixelRatio): echartsLib.echartsNs.ECharts = js.native
  def init(dom: stdLib.HTMLDivElement, theme: js.Object): echartsLib.echartsNs.ECharts = js.native
  def init(dom: stdLib.HTMLDivElement, theme: js.Object, opts: echartsLib.Anon_DevicePixelRatio): echartsLib.echartsNs.ECharts = js.native
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
    *     See [USA Population Estimates example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=map-usa).
    */
  def registerMap(mapName: java.lang.String, geoJson: js.Object): scala.Unit = js.native
  def registerMap(mapName: java.lang.String, geoJson: js.Object, specialAreas: js.Object): scala.Unit = js.native
  /**
    * Registers a theme, should be specified when
    * [initialize the chart instance](https://echarts.apache.org/api.html#echarts.init).
    *
    * @param {string} themeName Theme name.
    * @param {object} theme Theme configurations.
    */
  def registerTheme(themeName: java.lang.String, theme: js.Object): scala.Unit = js.native
}

