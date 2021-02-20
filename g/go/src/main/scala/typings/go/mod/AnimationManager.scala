package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class handles animations in a Diagram.  Each Diagram has one, the Diagram.animationManager.
  */
@JSImport("go", "AnimationManager")
@js.native
/**You do not normally need to create an instance of this class because one already exists as the Diagram.animationManager, which you can modify.*/
class AnimationManager () extends StObject {
  
  /**Gets or sets the duration for animations, in milliseconds. The default value is 600 milliseconds.*/
  var duration: Double = js.native
  
  /**This read-only property is true when the AnimationManager is currently animating.*/
  var isAnimating: Boolean = js.native
  
  /**Gets or sets whether this AnimationManager operates. The default value is true.*/
  var isEnabled: Boolean = js.native
  
  /** Gets or sets whether an animation is performed on an initial layout. The default value is true.*/
  var isInitial: Boolean = js.native
  
  /**This read-only property is true when the animation manager is in the middle of an animation tick.*/
  var isTicking: Boolean = js.native
  
  /**
    * Stops any running animation and updates the Diagram to its final state.
    */
  def stopAnimation(): Unit = js.native
}
