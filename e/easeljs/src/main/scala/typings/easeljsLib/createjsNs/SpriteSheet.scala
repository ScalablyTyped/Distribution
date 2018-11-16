package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.SpriteSheet")
@js.native
class SpriteSheet protected ()
  extends createjsDashLibLib.createjsNs.EventDispatcher {
  def this(data: js.Object) = this()
  // properties
  var animations: js.Array[java.lang.String] = js.native
  var complete: scala.Boolean = js.native
  var framerate: scala.Double = js.native
  def getAnimation(name: java.lang.String): SpriteSheetAnimation = js.native
  /**
           * @deprecated - use the 'animations' property instead
           */
  def getAnimations(): js.Array[java.lang.String] = js.native
  def getFrame(frameIndex: scala.Double): SpriteSheetFrame = js.native
  def getFrameBounds(frameIndex: scala.Double): Rectangle = js.native
  def getFrameBounds(frameIndex: scala.Double, rectangle: Rectangle): Rectangle = js.native
  def getNumFrames(animation: java.lang.String): scala.Double = js.native
}

