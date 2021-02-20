package typings.fridaGum.global

import typings.fridaGum.GlobalAccessHandler
import typings.fridaGum.ScheduledCallback
import typings.fridaGum.ScriptRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Script {
  
  /**
    * File name of the current script.
    */
  @JSGlobal("Script.fileName")
  @js.native
  val fileName: String = js.native
  
  /**
    * Runs `func` on the next tick, i.e. when the current native thread exits
    * the JavaScript runtime. Any additional `params` are passed to it.
    */
  @JSGlobal("Script.nextTick")
  @js.native
  def nextTick(func: ScheduledCallback, params: js.Any*): Unit = js.native
  
  /**
    * Temporarily prevents the current script from being unloaded.
    * This is reference-counted, so there must be one matching `unpin()`
    * happening at a later point.
    *
    * Typically used in the callback of `WeakRef.bind()` when you need to
    * schedule cleanup on another thread.
    */
  @JSGlobal("Script.pin")
  @js.native
  def pin(): Unit = js.native
  
  /**
    * Runtime being used.
    */
  @JSGlobal("Script.runtime")
  @js.native
  val runtime: ScriptRuntime = js.native
  
  /**
    * Installs or uninstalls a handler that is used to resolve attempts to
    * access non-existent global variables.
    *
    * Useful for implementing a REPL where unknown identifiers may be fetched
    * lazily from a database.
    *
    * @param handler The handler to install, or `null` to uninstall a
    *                previously installed handler.
    */
  @JSGlobal("Script.setGlobalAccessHandler")
  @js.native
  def setGlobalAccessHandler(): Unit = js.native
  @JSGlobal("Script.setGlobalAccessHandler")
  @js.native
  def setGlobalAccessHandler(handler: GlobalAccessHandler): Unit = js.native
  
  /**
    * Source map of the current script.
    */
  @JSGlobal("Script.sourceMap")
  @js.native
  val sourceMap: typings.fridaGum.SourceMap = js.native
  
  /**
    * Reverses a previous `pin()` so the current script may be unloaded.
    */
  @JSGlobal("Script.unpin")
  @js.native
  def unpin(): Unit = js.native
}
