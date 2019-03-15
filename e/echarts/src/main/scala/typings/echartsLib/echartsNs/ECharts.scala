package typings
package echartsLib.echartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECharts extends js.Object {
  /**
    * Group name to be used in chart connection
    */
  var group: java.lang.String = js.native
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
  def appendData(opts: echartsLib.Anon_Data): scala.Unit = js.native
  /**
    * Clears current instance; removes all components and charts in
    *     current instance.
    */
  def clear(): scala.Unit = js.native
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
  def containPixel(finder: EChartsConvertFinder, value: js.Array[_]): scala.Boolean = js.native
  def convertFromPixel(finder: EChartsConvertFinder, value: java.lang.String): js.Array[_] | java.lang.String = js.native
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
  def convertFromPixel(finder: EChartsConvertFinder, value: js.Array[_]): js.Array[_] | java.lang.String = js.native
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
  def convertToPixel(finder: EChartsConvertFinder, value: java.lang.String): java.lang.String | js.Array[_] = js.native
  def convertToPixel(finder: EChartsConvertFinder, value: js.Array[_]): java.lang.String | js.Array[_] = js.native
  /**
    * Triggers chart action, like chart switch `legendToggleSelect`,
    *     zoom data area `dataZoom`, show tooltip `showTip` and so on.
    *     See [action](https://echarts.apache.org/api.html#action) and
    *     [events](https://echarts.apache.org/api.html#events)
    *     for more information.
    *
    * @param payload Trigger multiple actions through `batch` attribute.
    */
  def dispatchAction(payload: js.Object): scala.Unit = js.native
  /**
    * Disposes instance. Once disposed, the instance can not be used again.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Exports connected chart image; returns a base64 url; can be set to
    *     `src` of `Image`. Position of charts in exported image are
    *     related to that of the container.
    *
    * @param opts Options.
    */
  def getConnectedDataURL(opts: echartsLib.Anon_BackgroundColorExcludeComponents): java.lang.String = js.native
  /**
    * Exports chart image; returns a base64 URL; can be set to `src` of
    *      `Image`.
    *
    * @param opts Options.
    */
  def getDataURL(opts: echartsLib.Anon_BackgroundColor): java.lang.String = js.native
  /**
    * Gets DOM element of ECharts instance container.
    *
    * @return {HTMLCanvasElement|HTMLDivElement} DOM container.
    */
  def getDom(): stdLib.HTMLCanvasElement | stdLib.HTMLDivElement = js.native
  /**
    * Gets height of ECharts instance container.
    *
    * @return {number} Height.
    */
  def getHeight(): scala.Double = js.native
  /**
    * Gets `option` object maintained in current instance, which contains
    *     configuration item and data merged from previous `setOption`
    *     operations by users, along with user interaction states.
    *     For example, switching of legend, zooming area of data zoom,
    *     and so on. Therefore, a new instance that is exactly the same
    *     can be recovered from this option.
    */
  def getOption(): EChartOption[echartsLib.echartsNs.EChartOptionNs.Series] = js.native
  /**
    * Gets width of ECharts instance container.
    *
    * @return {number} Width.
    */
  def getWidth(): scala.Double = js.native
  /**
    * Hides animation loading effect.
    */
  def hideLoading(): scala.Unit = js.native
  /**
    * Returns whether current instance has been disposed.
    *
    * @return {boolean} Whether has been disposed.
    */
  def isDisposed(): scala.Boolean = js.native
  /**
    * Unbind event-handler function.
    *
    * @param {string} eventName Event names are all in lower-cases,
    *     for example, `'click'`, `'mousemove'`, `'legendselected'`
    * @param {Function} [handler] The function to be unbound could be
    *     passed. Otherwise, all event functions of this type will be
    *     unbound.
    */
  def off(eventName: java.lang.String): scala.Unit = js.native
  def off(eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
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
  def on(eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(eventName: java.lang.String, handler: js.Function, context: js.Object): scala.Unit = js.native
  /**
    * Resizes chart, which should be called manually when container size
    *     changes. When `opts` is not provided, DOM size is used.
    *
    * @param {EChartsResizeOption} opts Specify parameters explicitly.
    */
  def resize(): scala.Unit = js.native
  def resize(opts: EChartsResizeOption): scala.Unit = js.native
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
  def setOption(option: EChartOption[echartsLib.echartsNs.EChartOptionNs.Series]): scala.Unit = js.native
  def setOption(option: EChartOption[echartsLib.echartsNs.EChartOptionNs.Series], notMerge: scala.Boolean): scala.Unit = js.native
  def setOption(
    option: EChartOption[echartsLib.echartsNs.EChartOptionNs.Series],
    notMerge: scala.Boolean,
    lazyUpdate: scala.Boolean
  ): scala.Unit = js.native
  def setOption(option: EChartOption[echartsLib.echartsNs.EChartOptionNs.Series], opts: EChartsOptionConfig): scala.Unit = js.native
  def setOption(option: EChartsResponsiveOption): scala.Unit = js.native
  def setOption(option: EChartsResponsiveOption, notMerge: scala.Boolean): scala.Unit = js.native
  def setOption(option: EChartsResponsiveOption, notMerge: scala.Boolean, lazyUpdate: scala.Boolean): scala.Unit = js.native
  /**
    * Shows loading animation. You can call this interface manually before
    *     data is loaded, and call `hideLoading` to hide loading animation
    *     after data is loaded.
    *
    * @param {string} [type='default']
    * @param {EChartsLoadingOption} [opts]
    */
  def showLoading(): scala.Unit = js.native
  def showLoading(`type`: java.lang.String): scala.Unit = js.native
  def showLoading(`type`: java.lang.String, opts: EChartsLoadingOption): scala.Unit = js.native
}

