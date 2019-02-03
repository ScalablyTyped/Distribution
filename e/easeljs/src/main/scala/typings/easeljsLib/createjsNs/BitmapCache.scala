package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.BitmapCache")
@js.native
class BitmapCache () extends js.Object {
  // properties
  var cacheID: scala.Double = js.native
  def define(target: DisplayObject, x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def define(
    target: DisplayObject,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    scale: scala.Double
  ): scala.Unit = js.native
  def draw(ctx: stdLib.CanvasRenderingContext2D): scala.Boolean = js.native
  def getCacheDataURL(): java.lang.String = js.native
  def release(): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def update(compositeOperation: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("createjs.BitmapCache")
@js.native
object BitmapCache extends js.Object {
  // methods
  def getFilterBounds(target: easeljsLib.createjsNs.DisplayObject): easeljsLib.createjsNs.Rectangle = js.native
  def getFilterBounds(target: easeljsLib.createjsNs.DisplayObject, output: easeljsLib.createjsNs.Rectangle): easeljsLib.createjsNs.Rectangle = js.native
}

