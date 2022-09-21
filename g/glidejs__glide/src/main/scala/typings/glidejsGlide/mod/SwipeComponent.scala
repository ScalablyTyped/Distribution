package typings.glidejsGlide.mod

import typings.glidejsGlide.glidejsGlideBooleans.`false`
import typings.std.MouseEvent
import typings.std.Touch
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeComponent
  extends StObject
     with Component {
  
  /**
    * Adds listener for swipe end event.
    */
  def bindSwipeEnd(): Unit = js.native
  
  /**
    * Adds a listener for swipe moving event.
    */
  def bindSwipeMove(): Unit = js.native
  
  /**
    * Adds listener for swipe starting event.
    */
  def bindSwipeStart(): Unit = js.native
  
  /**
    * Disables instance swiping events.
    */
  def disable(): this.type = js.native
  
  /**
    * Enables instance swiping events.
    */
  def enable(): this.type = js.native
  
  /**
    *  Handler of swipeend event. Finishes user's tap and decides about instance movement.
    */
  def end(event: MouseEvent): Unit = js.native
  def end(event: TouchEvent): Unit = js.native
  
  @JSName("mount")
  def mount_MSwipeComponent(): Unit = js.native
  
  /**
    * Handler of swipemove event. Calculates user's tap angle and distance.
    */
  def move(event: MouseEvent): Unit = js.native
  def move(event: TouchEvent): Unit = js.native
  
  /**
    * Handler for `swipestart` event. Calculates entry points of the user's tap.
    */
  def start(event: MouseEvent): Unit = js.native
  def start(event: TouchEvent): Unit = js.native
  
  /**
    * Gets value of minimum swipe distance setting based on event type.
    */
  def threshold(event: MouseEvent): Double | `false` = js.native
  def threshold(event: TouchEvent): Double | `false` = js.native
  
  def touches(event: MouseEvent): MouseEvent = js.native
  /**
    * Normalizes event's touches points according to different types.
    */
  def touches(event: TouchEvent): js.UndefOr[Touch] = js.native
  
  /**
    * Removes previously added listener for swipe end event.
    */
  def unbindSwipeEnd(): Unit = js.native
  
  /**
    * Removes previously added listener for swipe moving event.
    */
  def unbindSwipeMove(): Unit = js.native
  
  /**
    * Removes previously added listener for swipe starting event.
    */
  def unbindSwipeStart(): Unit = js.native
}
