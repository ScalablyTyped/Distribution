package typings.fridaGum.global

import org.scalablytyped.runtime.StringDictionary
import typings.fridaGum.GlobalAccessHandler
import typings.fridaGum.ScheduledCallback
import typings.fridaGum.ScriptRuntime
import typings.fridaGum.WeakRefCallback
import typings.fridaGum.WeakRefId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Script {
  
  @JSGlobal("Script")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Starts monitoring the lifetime of `target`. Calls `callback` as soon as
    * value has been garbage-collected, or the script is about to get
    * unloaded.
    *
    * Useful when you're building a language-binding where you need to free
    * native resources when a JS value is no longer needed.
    *
    * Be careful so `callback` is not a closure that accidentally captures
    * `target` and keeps it alive beyond its intended lifetime.
    *
    * @param target Heap-allocated JavaScript value to monitor lifetime of.
    * @param callback Function to call when `target` gets GCed.
    */
  inline def bindWeak(target: Any, callback: WeakRefCallback): WeakRefId = (^.asInstanceOf[js.Dynamic].applyDynamic("bindWeak")(target.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WeakRefId]
  
  /**
    * Evaluates the given JavaScript `source` in the global scope. Useful for
    * agents that want to support loading user-provided scripts inside their
    * own script. The two benefits over simply using `eval()` is that the
    * script filename can be provided, and source maps are supported — both
    * inline and through `Script.registerSourceMap()`.
    *
    * @param name Name used in future stack traces, e.g. `/plugins/tty.js`.
    * @param source JavaScript source code to be evaluated.
    * @returns The resulting value of the evaluated code.
    */
  inline def evaluate(name: String, source: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(name.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Compiles and evaluates the given JavaScript `source` as an ES module.
    * Useful for agents that want to support loading user-provided scripts
    * inside their own script. This API offers the same benefits over `eval()`
    * as `Script.evaluate()`, in addition to encapsulating the user-provided
    * code in its own ES module. This means values may be exported, and
    * subsequently imported by other modules. The parent script may also export
    * values that can be imported from the loaded child script. This requires
    * that the parent uses the new ES module bundle format used by newer
    * versions of frida-compile.
    *
    * @param name UNIX-style virtual filesystem name visible to other modules,
    *             e.g. `/plugins/screenshot.js`.
    * @param source JavaScript source code.
    * @returns The module's namespace object.
    */
  inline def load(name: String, source: String): js.Promise[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StringDictionary[Any]]]
  
  /**
    * Runs `func` on the next tick, i.e. when the current native thread exits
    * the JavaScript runtime. Any additional `params` are passed to it.
    */
  inline def nextTick(func: ScheduledCallback, params: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(scala.List(func.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  /**
    * Temporarily prevents the current script from being unloaded.
    * This is reference-counted, so there must be one matching `unpin()`
    * happening at a later point.
    *
    * Typically used in the callback of `Script.bindWeak()` when you need to
    * schedule cleanup on another thread.
    */
  inline def pin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pin")().asInstanceOf[Unit]
  
  /**
    * Registers a source map for the specified script `name`. Should ideally
    * be called before the given script gets loaded, so stack traces created
    * during load can make use of the source map.
    *
    * @param name Name of the script that the source map is for, e.g.
    *             `/plugins/screenshot.js`.
    * @param json Source map contents as JSON.
    */
  inline def registerSourceMap(name: String, json: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSourceMap")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
    * Stops monitoring the value passed to `Script.bindWeak()` and calls the
    * callback immediately.
    *
    * @param id ID returned by a previous call to `Script.bindWeak()`.
    */
  inline def unbindWeak(id: WeakRefId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbindWeak")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Reverses a previous `pin()` so the current script may be unloaded.
    */
  inline def unpin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unpin")().asInstanceOf[Unit]
}
