package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class handles animations in a Diagram.  Each Diagram has one, the Diagram.animationManager.
  */
@JSImport("go", "AnimationManager")
@js.native
/**You do not normally need to create an instance of this class because one already exists as the Diagram.animationManager, which you can modify.*/
class AnimationManager () extends js.Object {
  /**Gets or sets the duration for animations, in milliseconds. The default value is 600 milliseconds.*/
  var duration: scala.Double = js.native
  /**This read-only property is true when the AnimationManager is currently animating.*/
  var isAnimating: scala.Boolean = js.native
  /**Gets or sets whether this AnimationManager operates. The default value is true.*/
  var isEnabled: scala.Boolean = js.native
  /** Gets or sets whether an animation is performed on an initial layout. The default value is true.*/
  var isInitial: scala.Boolean = js.native
  /**This read-only property is true when the animation manager is in the middle of an animation tick.*/
  var isTicking: scala.Boolean = js.native
  /**
    * Stops any running animation and updates the Diagram to its final state.
    */
  def stopAnimation(): scala.Unit = js.native
}

