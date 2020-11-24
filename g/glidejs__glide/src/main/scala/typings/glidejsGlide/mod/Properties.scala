package typings.glidejsGlide.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Properties extends js.Object {
  
  /**
    * Destroy instance and undo all modifications which have been made to
    * the DOM. It also unbinds added event listeners.
    */
  def destroy(): Unit = js.native
  
  /**
    * Disable instance interaction. Blocks ability to manually change
    * slides via controls or API.
    */
  def disable(): Unit = js.native
  
  /**
    * Holds state of the ability to interact.
    */
  var disabled: Boolean = js.native
  
  /**
    * Enable previously disabled instance. Start responding to interaction.
    */
  def enable(): Unit = js.native
  
  /**
    * Make movement based on the defined pattern. A pattern must be in the
    * special format
    */
  def go(pattern: Pattern): Unit = js.native
  
  /**
    * Holds currently active zero-based slide index.
    */
  var index: Double = js.native
  
  /**
    * Verify the type of a Glide instance.
    */
  def isType(`type`: Type): Boolean = js.native
  
  /**
    * Stop auto-playing. Hold changing slides after a defined interval.
    */
  def pause(): Unit = js.native
  
  /**
    * Force to run auto-playing with passed interval
    */
  def play(): Unit = js.native
  def play(force: Double): Unit = js.native
  
  /**
    * Holds instance initialization settings.
    */
  var settings: Options = js.native
  
  /**
    * Holds type of the Glide instance.
    */
  var `type`: Type = js.native
  
  /**
    * Update settings for the Glide instance.
    */
  def update(settings: Options): Unit = js.native
}
