package typings.domScreenWakeLock

import typings.std.Event
import typings.std.EventTarget
import typings.std.WakeLockType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WakeLockSentinel
  extends StObject
     with EventTarget {
  
  /**
    * Called when the WakeLockSentinel's handle is released. Note that the
    * WakeLockSentinel's handle being released does not necessarily mean that
    * the underlying wake lock has been released.
    */
  var onrelease: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** Releases the WakeLockSentinel's lock on the screen. */
  def release(): js.Promise[Unit] = js.native
  
  /** Whether the WakeLockSentinel's handle has been released. */
  val released: Boolean = js.native
  
  /** The WakeLockSentinel's wake lock type. */
  val `type`: WakeLockType = js.native
}
