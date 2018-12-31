package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.DisplayObject")
@js.native
class DisplayObject ()
  extends createjsDashLibLib.createjsNs.EventDispatcher {
  // properties
  var alpha: scala.Double = js.native
  var bitmapCache: BitmapCache = js.native
  var cacheCanvas: stdLib.HTMLCanvasElement | js.Object = js.native
  var cacheID: scala.Double = js.native
  var compositeOperation: java.lang.String = js.native
  var cursor: java.lang.String = js.native
  var filters: js.Array[Filter] = js.native
  var hitArea: DisplayObject = js.native
  var id: scala.Double = js.native
  var mask: Shape = js.native
  var mouseEnabled: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var parent: Container = js.native
  var regX: scala.Double = js.native
  var regY: scala.Double = js.native
  var rotation: scala.Double = js.native
  var scaleX: scala.Double = js.native
  var scaleY: scala.Double = js.native
  var shadow: Shadow = js.native
  var skewX: scala.Double = js.native
  var skewY: scala.Double = js.native
  var snapToPixel: scala.Boolean = js.native
  var stage: Stage = js.native
  var tickEnabled: scala.Boolean = js.native
  var transformMatrix: Matrix2D = js.native
  var visible: scala.Boolean = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  // methods
  def cache(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def cache(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, scale: scala.Double): scala.Unit = js.native
  def draw(ctx: stdLib.CanvasRenderingContext2D): scala.Boolean = js.native
  def draw(ctx: stdLib.CanvasRenderingContext2D, ignoreCache: scala.Boolean): scala.Boolean = js.native
  def getBounds(): Rectangle = js.native
  def getCacheDataURL(): java.lang.String = js.native
  def getConcatenatedDisplayProps(): DisplayProps = js.native
  def getConcatenatedDisplayProps(props: DisplayProps): DisplayProps = js.native
  def getConcatenatedMatrix(): Matrix2D = js.native
  def getConcatenatedMatrix(mtx: Matrix2D): Matrix2D = js.native
  def getMatrix(): Matrix2D = js.native
  def getMatrix(matrix: Matrix2D): Matrix2D = js.native
  /**
    * @deprecated
    */
  def getStage(): Stage = js.native
  def getTransformedBounds(): Rectangle = js.native
  def globalToLocal(x: scala.Double, y: scala.Double): Point = js.native
  def globalToLocal(x: scala.Double, y: scala.Double, pt: Point): Point = js.native
  def globalToLocal(x: scala.Double, y: scala.Double, pt: js.Object): Point = js.native
  def hitTest(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def localToGlobal(x: scala.Double, y: scala.Double): Point = js.native
  def localToGlobal(x: scala.Double, y: scala.Double, pt: Point): Point = js.native
  def localToGlobal(x: scala.Double, y: scala.Double, pt: js.Object): Point = js.native
  def localToLocal(x: scala.Double, y: scala.Double, target: DisplayObject): Point = js.native
  def localToLocal(x: scala.Double, y: scala.Double, target: DisplayObject, pt: Point): Point = js.native
  def localToLocal(x: scala.Double, y: scala.Double, target: DisplayObject, pt: js.Object): Point = js.native
  def set(props: js.Object): DisplayObject = js.native
  def setBounds(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setTransform(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    scaleX: js.UndefOr[scala.Double],
    scaleY: js.UndefOr[scala.Double],
    rotation: js.UndefOr[scala.Double],
    skewX: js.UndefOr[scala.Double],
    skewY: js.UndefOr[scala.Double],
    regX: js.UndefOr[scala.Double],
    regY: js.UndefOr[scala.Double]
  ): DisplayObject = js.native
  def uncache(): scala.Unit = js.native
  def updateCache(): scala.Unit = js.native
  def updateCache(compositeOperation: java.lang.String): scala.Unit = js.native
  def updateContext(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
}

@JSGlobal("createjs.DisplayObject")
@js.native
object DisplayObject extends js.Object {
  var suppressCrossDomainErrors: scala.Boolean = js.native
}

