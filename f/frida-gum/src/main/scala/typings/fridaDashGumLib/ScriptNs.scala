package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Script")
@js.native
object ScriptNs extends js.Object {
  /**
    * File name of the current script.
    */
  val fileName: java.lang.String = js.native
  /**
    * Runtime being used.
    */
  val runtime: fridaDashGumLib.ScriptRuntime = js.native
  /**
    * Source map of the current script.
    */
  val sourceMap: fridaDashGumLib.SourceMap = js.native
  /**
    * Runs `func` on the next tick, i.e. when the current native thread exits
    * the JavaScript runtime. Any additional `params` are passed to it.
    */
  def nextTick(func: fridaDashGumLib.ScheduledCallback, params: js.Any*): scala.Unit = js.native
  /**
    * Temporarily prevents the current script from being unloaded.
    * This is reference-counted, so there must be one matching `unpin()`
    * happening at a later point.
    *
    * Typically used in the callback of `WeakRef.bind()` when you need to
    * schedule cleanup on another thread.
    */
  def pin(): scala.Unit = js.native
  def setGlobalAccessHandler(): scala.Unit = js.native
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
  def setGlobalAccessHandler(handler: fridaDashGumLib.GlobalAccessHandler): scala.Unit = js.native
  /**
    * Reverses a previous `pin()` so the current script may be unloaded.
    */
  def unpin(): scala.Unit = js.native
}

