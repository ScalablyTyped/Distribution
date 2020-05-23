package typings.echarts.global.echarts

import typings.echarts.anon.DevicePixelRatio
import typings.echarts.echarts.ECharts
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("echarts.init")
@js.native
object init extends js.Object {
  def apply(dom: HTMLCanvasElement): ECharts = js.native
  def apply(dom: HTMLCanvasElement, theme: String): ECharts = js.native
  def apply(dom: HTMLCanvasElement, theme: String, opts: DevicePixelRatio): ECharts = js.native
  def apply(dom: HTMLCanvasElement, theme: js.Object): ECharts = js.native
  def apply(dom: HTMLCanvasElement, theme: js.Object, opts: DevicePixelRatio): ECharts = js.native
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
  def apply(dom: HTMLDivElement): ECharts = js.native
  def apply(dom: HTMLDivElement, theme: String): ECharts = js.native
  def apply(dom: HTMLDivElement, theme: String, opts: DevicePixelRatio): ECharts = js.native
  def apply(dom: HTMLDivElement, theme: js.Object): ECharts = js.native
  def apply(dom: HTMLDivElement, theme: js.Object, opts: DevicePixelRatio): ECharts = js.native
}

