package typings.fridaGum.global

import typings.fridaGum.WeakRefCallback
import typings.fridaGum.WeakRefId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Monitors the lifetime of a heap-allocated JavaScript value.
  *
  * Useful when you're building a language-binding where you need to free
  * native resources when a JS value is no longer needed.
  */
object WeakRef {
  
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
  @JSGlobal("WeakRef.bind")
  @js.native
  def bind(target: js.Any, callback: WeakRefCallback): WeakRefId = js.native
  
  /**
    * Stops monitoring the value passed to `WeakRef.bind()` and calls the
    * callback immediately.
    *
    * @param id ID returned by a previous call to `WeakRef.bind()`.
    */
  @JSGlobal("WeakRef.unbind")
  @js.native
  def unbind(id: WeakRefId): Unit = js.native
}
