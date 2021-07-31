package typings.domScreenWakeLock

import typings.std.Event
import typings.std.EventListener
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WakeLockSentinel provides a handle to a platform wake lock, and it holds on
  * to it until it is either manually released or until the underlying platform
  * wake lock is released. Its existence keeps a platform wake lock for a given
  * wake lock type active, and releasing all WakeLockSentinel instances of a
  * given wake lock type will cause the underlying platform wake lock to be
  * released.
  */
@js.native
trait WakeLockSentinel
  extends StObject
     with EventTarget {
  
  /**
    * Called when the WakeLockSentinel's handle is released. Note that the
    * WakeLockSentinel's handle being released does not necessarily mean that
    * the underlying wake lock has been released.
    */
  def onrelease(evt: Event): Unit = js.native
  /**
    * Called when the WakeLockSentinel's handle is released. Note that the
    * WakeLockSentinel's handle being released does not necessarily mean that
    * the underlying wake lock has been released.
    */
  @JSName("onrelease")
  var onrelease_Original: EventListener = js.native
  
  /** Releases the WakeLockSentinel's lock on the screen. */
  def release(): js.Promise[Unit] = js.native
  
  /** Whether the WakeLockSentinel's handle has been released. */
  val released: Boolean = js.native
  
  /** The WakeLockSentinel's wake lock type. */
  val `type`: WakeLockType = js.native
}
