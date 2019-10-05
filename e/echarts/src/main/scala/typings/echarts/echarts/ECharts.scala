package typings.echarts.echarts

import typings.echarts.Anon_BackgroundColor
import typings.echarts.Anon_BackgroundColorExcludeComponents
import typings.echarts.Anon_Data
import typings.echarts.echarts.EChartOption.Series
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECharts extends js.Object {
  /**
    * Group name to be used in chart connection
    */
  var group: String = js.native
  /**
    * The method is used in rendering millions of data
    *     (e.g. rendering geo data). In these scenario, the entire size of
    *     data is probably up to 10 or 100 MB, even using binary format.
    *     So chunked load data and rendering is required. When using
    *     `appendData`, the graphic elements that have been rendered will
    *     not be cleared, but keep rendering new graphic elements.
    *
    * @param opts Data options.
    */
  def appendData(opts: Anon_Data): Unit = js.native
  /**
    * Clears current instance; removes all components and charts in
    *     current instance.
    */
  def clear(): Unit = js.native
  /**
    * Determine whether the given point is in the given coordinate systems or series.
    *
    * @param {EChartsConvertFinder} finder Indicate in which coordinate
    *     system conversion is performed.
    *     Generally, index or id or name can be used to specify
    *     coordinate system.
    * @param {string | any[]} value The value to be judged, in pixel
    *     coordinate system.
    */
  def containPixel(finder: EChartsConvertFinder, value: js.Array[_]): Boolean = js.native
  def convertFromPixel(finder: EChartsConvertFinder, value: String): js.Array[_] | String = js.native
  /**
    * Convert a point from pixel coordinate to logical coordinate
    *     (e.g., in geo, cartesian, graph, ...).
    *
    * @param {EChartsConvertFinder} finder Indicate in which coordinate
    *     system conversion is performed.
    *     Generally, index or id or name can be used to specify
    *     coordinate system.
    * @param {string | any[]} value The value to be converted.
    */
  def convertFromPixel(finder: EChartsConvertFinder, value: js.Array[_]): js.Array[_] | String = js.native
  /**
    * Convert a point from logical coordinate (e.g., in geo, cartesian,
    *     graph, ...) to pixel coordinate.
    *
    * @param {EChartsConvertFinder} finder Indicate in which coordinate
    *     system conversion is performed.
    *     Generally, index or id or name can be used to specify
    *     coordinate system.
    * @param {string | any[]} value The value to be converted.
    */
  def convertToPixel(finder: EChartsConvertFinder, value: String): String | js.Array[_] = js.native
  def convertToPixel(finder: EChartsConvertFinder, value: js.Array[_]): String | js.Array[_] = js.native
  /**
    * Triggers chart action, like chart switch `legendToggleSelect`,
    *     zoom data area `dataZoom`, show tooltip `showTip` and so on.
    *     See [action](https://echarts.apache.org/api.html#action) and
    *     [events](https://echarts.apache.org/api.html#events)
    *     for more information.
    *
    * @param payload Trigger multiple actions through `batch` attribute.
    */
  def dispatchAction(payload: js.Object): Unit = js.native
  /**
    * Disposes instance. Once disposed, the instance can not be used again.
    */
  def dispose(): Unit = js.native
  /**
    * Exports connected chart image; returns a base64 url; can be set to
    *     `src` of `Image`. Position of charts in exported image are
    *     related to that of the container.
    *
    * @param opts Options.
    */
  def getConnectedDataURL(opts: Anon_BackgroundColorExcludeComponents): String = js.native
  /**
    * Exports chart image; returns a base64 URL; can be set to `src` of
    *      `Image`.
    *
    * @param opts Options.
    */
  def getDataURL(opts: Anon_BackgroundColor): String = js.native
  /**
    * Gets DOM element of ECharts instance container.
    *
    * @return {HTMLCanvasElement|HTMLDivElement} DOM container.
    */
  def getDom(): HTMLCanvasElement | HTMLDivElement = js.native
  /**
    * Gets height of ECharts instance container.
    *
    * @return {number} Height.
    */
  def getHeight(): Double = js.native
  /**
    * Gets `option` object maintained in current instance, which contains
    *     configuration item and data merged from previous `setOption`
    *     operations by users, along with user interaction states.
    *     For example, switching of legend, zooming area of data zoom,
    *     and so on. Therefore, a new instance that is exactly the same
    *     can be recovered from this option.
    */
  def getOption(): EChartOption[Series] = js.native
  /**
    * Gets width of ECharts instance container.
    *
    * @return {number} Width.
    */
  def getWidth(): Double = js.native
  /**
    * Hides animation loading effect.
    */
  def hideLoading(): Unit = js.native
  /**
    * Returns whether current instance has been disposed.
    *
    * @return {boolean} Whether has been disposed.
    */
  def isDisposed(): Boolean = js.native
  /**
    * Unbind event-handler function.
    *
    * @param {string} eventName Event names are all in lower-cases,
    *     for example, `'click'`, `'mousemove'`, `'legendselected'`
    * @param {Function} [handler] The function to be unbound could be
    *     passed. Otherwise, all event functions of this type will be
    *     unbound.
    */
  def off(eventName: String): Unit = js.native
  def off(eventName: String, handler: js.Function): Unit = js.native
  /**
    * Binds event-handling function.
    *     There are two kinds of events in ECharts, one of which is mouse
    *     events, which will be triggered when the mouse clicks certain
    *     element in the chart, the other kind will be triggered after
    *     `dispatchAction` is called. Every action has a corresponding
    *     event.
    *     If event is triggered externally by `dispatchAction`, and there
    *     is batch attribute in action to trigger batch action, then the
    *     corresponding response event parameters be in batch.
    *
    * @param {string} eventName Event names are all in lower-cases,
    *     for example, `'click'`, `'mousemove'`, `'legendselected'`
    * @param {Function} handler Event-handling function, whose format
    *     is as following:
    ```js
    (event: object)
    ```
    * @param {object} [context] context of callback function, what
    *     `this` refers to.
    */
  def on(eventName: String, handler: js.Function): Unit = js.native
  def on(eventName: String, handler: js.Function, context: js.Object): Unit = js.native
  /**
    * Resizes chart, which should be called manually when container size
    *     changes. When `opts` is not provided, DOM size is used.
    *
    * @param {EChartsResizeOption} opts Specify parameters explicitly.
    */
  def resize(): Unit = js.native
  def resize(opts: EChartsResizeOption): Unit = js.native
  /**
    * Configuration item, data, universal interface, all parameters and
    *     data can all be modified through `setOption`. ECharts will merge
    *     new parameters and data, and then refresh chart.
    *
    * @param {EChartOption} option Configuration item and data. Please
    *     refer to [configuration item manual](https://echarts.apache.org/option.html)
    *     for more information.
    * @param {boolean} [notMerge=false] Whether not to merge with previous
    *     `option`
    * @param {boolean} [lazyUpdate=false] Whether not to update chart
    *     immediately
    */
  def setOption(option: EChartOption[Series]): Unit = js.native
  def setOption(option: EChartOption[Series], notMerge: Boolean): Unit = js.native
  def setOption(option: EChartOption[Series], notMerge: Boolean, lazyUpdate: Boolean): Unit = js.native
  def setOption(option: EChartOption[Series], opts: EChartsOptionConfig): Unit = js.native
  def setOption(option: EChartsResponsiveOption): Unit = js.native
  def setOption(option: EChartsResponsiveOption, notMerge: Boolean): Unit = js.native
  def setOption(option: EChartsResponsiveOption, notMerge: Boolean, lazyUpdate: Boolean): Unit = js.native
  /**
    * Shows loading animation. You can call this interface manually before
    *     data is loaded, and call `hideLoading` to hide loading animation
    *     after data is loaded.
    *
    * @param {string} [type='default']
    * @param {EChartsLoadingOption} [opts]
    */
  def showLoading(): Unit = js.native
  def showLoading(`type`: String): Unit = js.native
  def showLoading(`type`: String, opts: EChartsLoadingOption): Unit = js.native
}

