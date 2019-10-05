package typings.easeljs.createjs

import typings.createjsDashLib.createjs.EventDispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.SpriteSheet")
@js.native
class SpriteSheet protected () extends EventDispatcher {
  def this(data: js.Object) = this()
  // properties
  var animations: js.Array[String] = js.native
  var complete: Boolean = js.native
  var framerate: Double = js.native
  def getAnimation(name: String): SpriteSheetAnimation = js.native
  /**
    * @deprecated - use the 'animations' property instead
    */
  def getAnimations(): js.Array[String] = js.native
  def getFrame(frameIndex: Double): SpriteSheetFrame = js.native
  def getFrameBounds(frameIndex: Double): Rectangle = js.native
  def getFrameBounds(frameIndex: Double, rectangle: Rectangle): Rectangle = js.native
  def getNumFrames(animation: String): Double = js.native
}

