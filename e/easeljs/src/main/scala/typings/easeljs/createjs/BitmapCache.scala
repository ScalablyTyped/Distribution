package typings.easeljs.createjs

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitmapCache extends StObject {
  
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
