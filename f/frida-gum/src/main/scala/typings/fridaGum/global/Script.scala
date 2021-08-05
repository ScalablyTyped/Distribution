package typings.fridaGum.global

import typings.fridaGum.GlobalAccessHandler
import typings.fridaGum.ScheduledCallback
import typings.fridaGum.ScriptRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Script {
  
  @JSGlobal("Script")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def nextTick(func: ScheduledCallback, params: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(func.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Temporarily prevents the current script from being unloaded.
    * This is reference-counted, so there must be one matching `unpin()`
    * happening at a later point.
    *
    * Typically used in the callback of `WeakRef.bind()` when you need to
    * schedule cleanup on another thread.
    */
  inline def pin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pin")().asInstanceOf[Unit]
  
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
  inline def setGlobalAccessHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalAccessHandler")().asInstanceOf[Unit]
  inline def setGlobalAccessHandler(handler: GlobalAccessHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalAccessHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Source map of the current script.
    */
  @JSGlobal("Script.sourceMap")
  @js.native
  val sourceMap: typings.fridaGum.SourceMap = js.native
  
  /**
    * Reverses a previous `pin()` so the current script may be unloaded.
    */
  inline def unpin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unpin")().asInstanceOf[Unit]
}
