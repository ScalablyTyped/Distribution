package typings.dojo.dojox

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.gesture")
@js.native
object gesture extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/gesture/Base.html
    *
    *
    * @param args
    */
  @js.native
  class Base protected () extends js.Object {
    def this(args: js.Any) = this()
    /**
      * Default event e.g. 'tap' is a default event of dojox.gesture.tap
      *
      */
    var defaultEvent: String = js.native
    /**
      * A list of sub events e.g ['hold', 'doubletap'],
      * used by being combined with defaultEvent like 'tap.hold', 'tap.doubletap' etc.
      *
      */
    var subEvents: js.Array[_] = js.native
    /**
      * Whether the gesture is touch-device only
      *
      */
    var touchOnly: Boolean = js.native
    /**
      * Process the 'cancel' phase of a gesture
      *
      * @param data
      * @param e
      */
    def cancel(data: js.Any, e: js.Any): Unit = js.native
    /**
      * Release all handlers and resources
      *
      */
    def destroy(): Unit = js.native
    /**
      * Fire a gesture event and invoke registered listeners
      * a simulated GestureEvent will also be sent along
      *
      * @param node Target node to fire the gesture
      * @param event An object containing specific gesture info e.g {type: 'tap.hold'|'swipe.left'), ...}all these properties will be put into a simulated GestureEvent when fired.Note - Default properties in a native Event won't be overwritten, see on.emit() for more details.
      */
    def fire(node: HTMLElement, event: js.Object): Unit = js.native
    /**
      * Initialization works
      *
      */
    def init(): Unit = js.native
    /**
      * Check if the node is locked, isLocked(node) means
      * whether it's a descendant of the currently locked node.
      *
      * @param node
      */
    def isLocked(node: js.Any): Boolean = js.native
    /**
      * Lock all descendants of the node.
      *
      * @param node
      */
    def lock(node: HTMLElement): Unit = js.native
    /**
      * Process the 'move' phase of a gesture
      *
      * @param data
      * @param e
      */
    def move(data: js.Any, e: js.Any): Unit = js.native
    /**
      * Process the 'press' phase of a gesture
      *
      * @param data
      * @param e
      */
    def press(data: js.Any, e: js.Any): Unit = js.native
    /**
      * Process the 'release' phase of a gesture
      *
      * @param data
      * @param e
      */
    def release(data: js.Any, e: js.Any): Unit = js.native
    /**
      * Release the lock
      *
      */
    def unLock(): Unit = js.native
  }
  
}

