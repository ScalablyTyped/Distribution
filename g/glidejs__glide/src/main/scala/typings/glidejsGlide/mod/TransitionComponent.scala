package typings.glidejsGlide.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionComponent
  extends StObject
     with Component {
  
  /**
    * Call specified callback after a transition.
    */
  def after(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Returns a value of CSS transition property based on duration.
    */
  def compose(property: String): String = js.native
  
  /**
    * Disables transitions.
    *
    * The instance will make immediate jumps to indexes instead of smooth movements
    */
  def disable(): Unit = js.native
  
  /**
    * Holds duration of the transition based on currently running animation type.
    */
  val duration: Double = js.native
  
  /**
    * Enables previously disabled transitions.
    */
  def enable(): Unit = js.native
  
  /**
    * Clears transition declarations from wrapper HTML element.
    */
  def remove(): Unit = js.native
  
  /**
    * Applies transition declaration to wrapper HTML element.
    */
  def set(): Unit = js.native
  def set(property: String): Unit = js.native
}
