package typings.easeljs.createjsNs

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.BitmapCache")
@js.native
class BitmapCache () extends js.Object {
  // properties
  var cacheID: Double = js.native
  def define(target: DisplayObject, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def define(target: DisplayObject, x: Double, y: Double, width: Double, height: Double, scale: Double): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D): Boolean = js.native
  def getCacheDataURL(): String = js.native
  def release(): Unit = js.native
  def update(): Unit = js.native
  def update(compositeOperation: String): Unit = js.native
}

/* static members */
@JSGlobal("createjs.BitmapCache")
@js.native
object BitmapCache extends js.Object {
  // methods
  def getFilterBounds(target: DisplayObject): Rectangle = js.native
  def getFilterBounds(target: DisplayObject, output: Rectangle): Rectangle = js.native
}

