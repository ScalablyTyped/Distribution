package typings.easeljs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Sprite")
@js.native
class Sprite protected () extends DisplayObject {
  def this(spriteSheet: SpriteSheet) = this()
  def this(spriteSheet: SpriteSheet, frameOrAnimation: String) = this()
  def this(spriteSheet: SpriteSheet, frameOrAnimation: Double) = this()
  // properties
  var currentAnimation: String = js.native
  var currentAnimationFrame: Double = js.native
  var currentFrame: Double = js.native
  var framerate: Double = js.native
  /**
    * @deprecated
    */
  var offset: Double = js.native
  var paused: Boolean = js.native
  var spriteSheet: SpriteSheet = js.native
  // methods
  def advance(): Unit = js.native
  def advance(time: Double): Unit = js.native
  def gotoAndPlay(frameOrAnimation: String): Unit = js.native
  def gotoAndPlay(frameOrAnimation: Double): Unit = js.native
  def gotoAndStop(frameOrAnimation: String): Unit = js.native
  def gotoAndStop(frameOrAnimation: Double): Unit = js.native
  def play(): Unit = js.native
  def stop(): Unit = js.native
}

