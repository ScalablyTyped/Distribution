package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterBackend extends js.Object {
  var resources: Resources = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: stdLib.HTMLCanvasElement,
    sourceWidth: scala.Double,
    sourceHeight: scala.Double,
    targetCanvas: stdLib.HTMLCanvasElement
  ): js.Any = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: stdLib.HTMLCanvasElement,
    sourceWidth: scala.Double,
    sourceHeight: scala.Double,
    targetCanvas: stdLib.HTMLCanvasElement,
    cacheKey: java.lang.String
  ): js.Any = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: stdLib.HTMLImageElement,
    sourceWidth: scala.Double,
    sourceHeight: scala.Double,
    targetCanvas: stdLib.HTMLCanvasElement
  ): js.Any = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: stdLib.HTMLImageElement,
    sourceWidth: scala.Double,
    sourceHeight: scala.Double,
    targetCanvas: stdLib.HTMLCanvasElement,
    cacheKey: java.lang.String
  ): js.Any = js.native
  def clearWebGLCaches(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def evictCachesForKey(cacheKey: java.lang.String): scala.Unit = js.native
}

