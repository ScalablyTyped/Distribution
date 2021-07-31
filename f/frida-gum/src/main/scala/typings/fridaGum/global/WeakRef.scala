package typings.fridaGum.global

import typings.fridaGum.WeakRefCallback
import typings.fridaGum.WeakRefId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Monitors the lifetime of a heap-allocated JavaScript value.
  *
  * Useful when you're building a language-binding where you need to free
  * native resources when a JS value is no longer needed.
  */
object WeakRef {
  
  @JSGlobal("WeakRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Starts monitoring the lifetime of `target`. Calls `callback` as soon as
    * value has been garbage-collected, or the script is about to get
    * unloaded.
    *
    * Be careful so `callback` is not a closure that accidentally captures
    * `target` and keeps it alive beyond its intended lifetime.
    *
    * @param target Heap-allocated JavaScript value to monitor lifetime of.
    * @param callback Function to call when `target` gets GCed.
    */
  @scala.inline
  def bind(target: js.Any, callback: WeakRefCallback): WeakRefId = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WeakRefId]
  
  /**
    * Stops monitoring the value passed to `WeakRef.bind()` and calls the
    * callback immediately.
    *
    * @param id ID returned by a previous call to `WeakRef.bind()`.
    */
  @scala.inline
  def unbind(id: WeakRefId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
