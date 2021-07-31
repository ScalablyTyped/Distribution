package typings.easeljs.createjs

import typings.createjsLib.createjs.EventDispatcher
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayObject
  extends StObject
     with EventDispatcher {
  
  // properties
  var alpha: Double = js.native
  
  var bitmapCache: BitmapCache = js.native
  
  // methods
  def cache(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def cache(x: Double, y: Double, width: Double, height: Double, scale: Double): Unit = js.native
  
  var cacheCanvas: HTMLCanvasElement | js.Object = js.native
  
  var cacheID: Double = js.native
  
  var compositeOperation: String = js.native
  
  var cursor: String = js.native
  
  def draw(ctx: CanvasRenderingContext2D): Boolean = js.native
  def draw(ctx: CanvasRenderingContext2D, ignoreCache: Boolean): Boolean = js.native
  
  var filters: js.Array[Filter] = js.native
  
  def getBounds(): Rectangle = js.native
  
  def getCacheDataURL(): String = js.native
  
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
  
  def globalToLocal(x: Double, y: Double): Point = js.native
  def globalToLocal(x: Double, y: Double, pt: js.Object): Point = js.native
  def globalToLocal(x: Double, y: Double, pt: Point): Point = js.native
  
  var hitArea: DisplayObject = js.native
  
  def hitTest(x: Double, y: Double): Boolean = js.native
  
  var id: Double = js.native
  
  def isVisible(): Boolean = js.native
  
  def localToGlobal(x: Double, y: Double): Point = js.native
  def localToGlobal(x: Double, y: Double, pt: js.Object): Point = js.native
  def localToGlobal(x: Double, y: Double, pt: Point): Point = js.native
  
  def localToLocal(x: Double, y: Double, target: DisplayObject): Point = js.native
  def localToLocal(x: Double, y: Double, target: DisplayObject, pt: js.Object): Point = js.native
  def localToLocal(x: Double, y: Double, target: DisplayObject, pt: Point): Point = js.native
  
  var mask: Shape = js.native
  
  var mouseEnabled: Boolean = js.native
  
  var name: String = js.native
  
  var parent: Container = js.native
  
  var regX: Double = js.native
  
  var regY: Double = js.native
  
  var rotation: Double = js.native
  
  var scaleX: Double = js.native
  
  var scaleY: Double = js.native
  
  def set(props: js.Object): DisplayObject = js.native
  
  def setBounds(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  def setTransform(
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    scaleX: js.UndefOr[Double],
    scaleY: js.UndefOr[Double],
    rotation: js.UndefOr[Double],
    skewX: js.UndefOr[Double],
    skewY: js.UndefOr[Double],
    regX: js.UndefOr[Double],
    regY: js.UndefOr[Double]
  ): DisplayObject = js.native
  
  var shadow: Shadow = js.native
  
  var skewX: Double = js.native
  
  var skewY: Double = js.native
  
  var snapToPixel: Boolean = js.native
  
  var stage: Stage = js.native
  
  var tickEnabled: Boolean = js.native
  
  var transformMatrix: Matrix2D = js.native
  
  def uncache(): Unit = js.native
  
  def updateCache(): Unit = js.native
  def updateCache(compositeOperation: String): Unit = js.native
  
  def updateContext(ctx: CanvasRenderingContext2D): Unit = js.native
  
  var visible: Boolean = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
