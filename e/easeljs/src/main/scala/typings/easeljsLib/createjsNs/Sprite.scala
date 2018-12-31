package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Sprite")
@js.native
class Sprite protected () extends DisplayObject {
  def this(spriteSheet: SpriteSheet) = this()
  def this(spriteSheet: SpriteSheet, frameOrAnimation: java.lang.String) = this()
  def this(spriteSheet: SpriteSheet, frameOrAnimation: scala.Double) = this()
  // properties
  var currentAnimation: java.lang.String = js.native
  var currentAnimationFrame: scala.Double = js.native
  var currentFrame: scala.Double = js.native
  var framerate: scala.Double = js.native
  /**
    * @deprecated
    */
  var offset: scala.Double = js.native
  var paused: scala.Boolean = js.native
  var spriteSheet: SpriteSheet = js.native
  // methods
  def advance(): scala.Unit = js.native
  def advance(time: scala.Double): scala.Unit = js.native
  def gotoAndPlay(frameOrAnimation: java.lang.String): scala.Unit = js.native
  def gotoAndPlay(frameOrAnimation: scala.Double): scala.Unit = js.native
  def gotoAndStop(frameOrAnimation: java.lang.String): scala.Unit = js.native
  def gotoAndStop(frameOrAnimation: scala.Double): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

