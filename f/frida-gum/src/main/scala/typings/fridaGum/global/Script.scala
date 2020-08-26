package typings.fridaGum.global

import typings.fridaGum.GlobalAccessHandler
import typings.fridaGum.ScheduledCallback
import typings.fridaGum.ScriptRuntime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Script")
@js.native
object Script extends js.Object {
  /**
    * File name of the current script.
    */
  val fileName: String = js.native
  /**
    * Runtime being used.
    */
  val runtime: ScriptRuntime = js.native
  /**
    * Source map of the current script.
    */
  val sourceMap: typings.fridaGum.SourceMap = js.native
  /**
    * Runs `func` on the next tick, i.e. when the current native thread exits
    * the JavaScript runtime. Any additional `params` are passed to it.
    */
  def nextTick(func: ScheduledCallback, params: js.Any*): Unit = js.native
  /**
    * Temporarily prevents the current script from being unloaded.
    * This is reference-counted, so there must be one matching `unpin()`
    * happening at a later point.
    *
    * Typically used in the callback of `WeakRef.bind()` when you need to
    * schedule cleanup on another thread.
    */
  def pin(): Unit = js.native
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
  def setGlobalAccessHandler(): Unit = js.native
  def setGlobalAccessHandler(handler: GlobalAccessHandler): Unit = js.native
  /**
    * Reverses a previous `pin()` so the current script may be unloaded.
    */
  def unpin(): Unit = js.native
}

