package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sprite extends DisplayObject {
  
  // methods
  def advance(): Unit = js.native
  def advance(time: Double): Unit = js.native
  
  // properties
  var currentAnimation: String = js.native
  
  var currentAnimationFrame: Double = js.native
  
  var currentFrame: Double = js.native
  
  var framerate: Double = js.native
  
  def gotoAndPlay(frameOrAnimation: String): Unit = js.native
  def gotoAndPlay(frameOrAnimation: Double): Unit = js.native
  
  def gotoAndStop(frameOrAnimation: String): Unit = js.native
  def gotoAndStop(frameOrAnimation: Double): Unit = js.native
  
  /**
    * @deprecated
    */
  var offset: Double = js.native
  
  var paused: Boolean = js.native
  
  def play(): Unit = js.native
  
  var spriteSheet: SpriteSheet = js.native
  
  def stop(): Unit = js.native
}
