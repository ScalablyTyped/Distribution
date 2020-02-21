package typings.emscripten

import typings.emscripten.Emscripten.EnvironmentType
import typings.emscripten.Emscripten.WebAssemblyExports
import typings.emscripten.Emscripten.WebAssemblyImports
import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.MessageEvent
import typings.std.Partial
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmscriptenModule extends js.Object {
  var FAST_MEMORY: Double = js.native
  var FHEAP: Float64Array = js.native
  // USE_TYPED_ARRAYS == 1
  var HEAP: Int32Array = js.native
  var HEAP16: Int16Array = js.native
  var HEAP32: Int32Array = js.native
  // USE_TYPED_ARRAYS == 2
  var HEAP8: Int8Array = js.native
  var HEAPF32: Float32Array = js.native
  var HEAPF64: Float64Array = js.native
  var HEAPU16: Uint16Array = js.native
  var HEAPU32: Uint32Array = js.native
  var HEAPU8: Uint8Array = js.native
  var IHEAP: Int32Array = js.native
  var TOTAL_MEMORY: Double = js.native
  var TOTAL_STACK: Double = js.native
  var arguments: js.Array[String] = js.native
  var environment: EnvironmentType = js.native
  var filePackagePrefixURL: String = js.native
  var logReadFiles: Boolean = js.native
  var noExitRuntime: Boolean = js.native
  var noInitialRun: Boolean = js.native
  var postRun: js.Array[js.Function0[Unit]] = js.native
  var preInit: js.Array[js.Function0[Unit]] = js.native
  var preRun: js.Array[js.Function0[Unit]] = js.native
  var preinitializedWebGLContext: WebGLRenderingContext = js.native
  var preloadedAudios: js.Any = js.native
  var preloadedImages: js.Any = js.native
  var wasmBinary: ArrayBuffer = js.native
  /**
    * Initializes an EmscriptenModule object and returns it. The initialized
    * obejct will be passed to then(). Works only when -s MODULARIZE=1 is
    * enabled. This is default exported function when -s EXPORT_ES6=1 is
    * enabled.
    * https://emscripten.org/docs/getting_started/FAQ.html#how-can-i-tell-when-the-page-is-fully-loaded-and-it-is-safe-to-call-compiled-functions
    * @param moduleOverrides Properties of an initialized module to override.
    */
  def apply(): this.type = js.native
  def apply(moduleOverrides: Partial[this.type]): this.type = js.native
  def _free(ptr: Double): Unit = js.native
  def _malloc(size: Double): Double = js.native
  def addOnExit(cb: js.Function0[_]): Unit = js.native
  def addOnInit(cb: js.Function0[_]): Unit = js.native
  def addOnPostRun(cb: js.Function0[_]): Unit = js.native
  def addOnPreMain(cb: js.Function0[_]): Unit = js.native
  def addOnPreRun(cb: js.Function0[_]): Unit = js.native
  def destroy(`object`: js.Object): Unit = js.native
  def getPreloadedPackage(remotePackageName: String, remotePackageSize: Double): ArrayBuffer = js.native
  def instantiateWasm(
    imports: WebAssemblyImports,
    successCallback: js.Function1[/* module */ typings.emscripten.WebAssembly.Module, Unit]
  ): WebAssemblyExports = js.native
  def locateFile(url: String, scriptDirectory: String): String = js.native
  def onAbort(what: js.Any): Unit = js.native
  def onCustomMessage(event: MessageEvent): Unit = js.native
  def onRuntimeInitialized(): Unit = js.native
  def print(str: String): Unit = js.native
  def printErr(str: String): Unit = js.native
  /**
    * Promise-like then() inteface.
    * WRANGING: Emscripten's then() is not really promise-based 'thenable'.
    * Don't try to use it with Promise.resolve() or in an async function
    * without deleting delete Module["then"] in the callback.
    * https://github.com/kripken/emscripten/issues/5820
    * Works only when -s MODULARIZE=1 is enabled.
    * @param callback A callback chained from Module() with an Module instance.
    */
  def `then`(callback: js.Function1[/* module */ this.type, Unit]): this.type = js.native
}

