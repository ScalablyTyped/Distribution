package typings.emscripten

import typings.emscripten.Emscripten.EnvironmentType
import typings.emscripten.Emscripten.WebAssemblyExports
import typings.emscripten.Emscripten.WebAssemblyImports
import typings.emscripten.WebAssembly.Module
import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.MessageEvent
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmscriptenModule extends js.Object {
  var FAST_MEMORY: Double
  var FHEAP: Float64Array
  // USE_TYPED_ARRAYS == 1
  var HEAP: Int32Array
  var HEAP16: Int16Array
  var HEAP32: Int32Array
  // USE_TYPED_ARRAYS == 2
  var HEAP8: Int8Array
  var HEAPF32: Float32Array
  var HEAPF64: Float64Array
  var HEAPU16: Uint16Array
  var HEAPU32: Uint32Array
  var HEAPU8: Uint8Array
  var IHEAP: Int32Array
  var TOTAL_MEMORY: Double
  var TOTAL_STACK: Double
  var arguments: js.Array[String]
  var environment: EnvironmentType
  var filePackagePrefixURL: String
  var logReadFiles: Boolean
  var noExitRuntime: Boolean
  var noInitialRun: Boolean
  var postRun: js.Array[js.Function0[Unit]]
  var preInit: js.Array[js.Function0[Unit]]
  var preRun: js.Array[js.Function0[Unit]]
  var preinitializedWebGLContext: WebGLRenderingContext
  var preloadedAudios: js.Any
  var preloadedImages: js.Any
  var wasmBinary: ArrayBuffer
  def _free(ptr: Double): Unit
  def _malloc(size: Double): Double
  def addOnExit(cb: js.Function0[_]): Unit
  def addOnInit(cb: js.Function0[_]): Unit
  def addOnPostRun(cb: js.Function0[_]): Unit
  def addOnPreMain(cb: js.Function0[_]): Unit
  def addOnPreRun(cb: js.Function0[_]): Unit
  def destroy(`object`: js.Object): Unit
  def getPreloadedPackage(remotePackageName: String, remotePackageSize: Double): ArrayBuffer
  def instantiateWasm(imports: WebAssemblyImports, successCallback: js.Function1[/* module */ Module, Unit]): WebAssemblyExports
  def locateFile(url: String, scriptDirectory: String): String
  def onAbort(what: js.Any): Unit
  def onCustomMessage(event: MessageEvent): Unit
  def onRuntimeInitialized(): Unit
  def print(str: String): Unit
  def printErr(str: String): Unit
}

object EmscriptenModule {
  @scala.inline
  def apply(
    FAST_MEMORY: Double,
    FHEAP: Float64Array,
    HEAP: Int32Array,
    HEAP16: Int16Array,
    HEAP32: Int32Array,
    HEAP8: Int8Array,
    HEAPF32: Float32Array,
    HEAPF64: Float64Array,
    HEAPU16: Uint16Array,
    HEAPU32: Uint32Array,
    HEAPU8: Uint8Array,
    IHEAP: Int32Array,
    TOTAL_MEMORY: Double,
    TOTAL_STACK: Double,
    _free: Double => Unit,
    _malloc: Double => Double,
    addOnExit: js.Function0[_] => Unit,
    addOnInit: js.Function0[_] => Unit,
    addOnPostRun: js.Function0[_] => Unit,
    addOnPreMain: js.Function0[_] => Unit,
    addOnPreRun: js.Function0[_] => Unit,
    arguments: js.Array[String],
    destroy: js.Object => Unit,
    environment: EnvironmentType,
    filePackagePrefixURL: String,
    getPreloadedPackage: (String, Double) => ArrayBuffer,
    instantiateWasm: (WebAssemblyImports, js.Function1[/* module */ Module, Unit]) => WebAssemblyExports,
    locateFile: (String, String) => String,
    logReadFiles: Boolean,
    noExitRuntime: Boolean,
    noInitialRun: Boolean,
    onAbort: js.Any => Unit,
    onCustomMessage: MessageEvent => Unit,
    onRuntimeInitialized: () => Unit,
    postRun: js.Array[js.Function0[Unit]],
    preInit: js.Array[js.Function0[Unit]],
    preRun: js.Array[js.Function0[Unit]],
    preinitializedWebGLContext: WebGLRenderingContext,
    preloadedAudios: js.Any,
    preloadedImages: js.Any,
    print: String => Unit,
    printErr: String => Unit,
    wasmBinary: ArrayBuffer
  ): EmscriptenModule = {
    val __obj = js.Dynamic.literal(FAST_MEMORY = FAST_MEMORY.asInstanceOf[js.Any], FHEAP = FHEAP.asInstanceOf[js.Any], HEAP = HEAP.asInstanceOf[js.Any], HEAP16 = HEAP16.asInstanceOf[js.Any], HEAP32 = HEAP32.asInstanceOf[js.Any], HEAP8 = HEAP8.asInstanceOf[js.Any], HEAPF32 = HEAPF32.asInstanceOf[js.Any], HEAPF64 = HEAPF64.asInstanceOf[js.Any], HEAPU16 = HEAPU16.asInstanceOf[js.Any], HEAPU32 = HEAPU32.asInstanceOf[js.Any], HEAPU8 = HEAPU8.asInstanceOf[js.Any], IHEAP = IHEAP.asInstanceOf[js.Any], TOTAL_MEMORY = TOTAL_MEMORY.asInstanceOf[js.Any], TOTAL_STACK = TOTAL_STACK.asInstanceOf[js.Any], _free = js.Any.fromFunction1(_free), _malloc = js.Any.fromFunction1(_malloc), addOnExit = js.Any.fromFunction1(addOnExit), addOnInit = js.Any.fromFunction1(addOnInit), addOnPostRun = js.Any.fromFunction1(addOnPostRun), addOnPreMain = js.Any.fromFunction1(addOnPreMain), addOnPreRun = js.Any.fromFunction1(addOnPreRun), arguments = arguments.asInstanceOf[js.Any], destroy = js.Any.fromFunction1(destroy), environment = environment.asInstanceOf[js.Any], filePackagePrefixURL = filePackagePrefixURL.asInstanceOf[js.Any], getPreloadedPackage = js.Any.fromFunction2(getPreloadedPackage), instantiateWasm = js.Any.fromFunction2(instantiateWasm), locateFile = js.Any.fromFunction2(locateFile), logReadFiles = logReadFiles.asInstanceOf[js.Any], noExitRuntime = noExitRuntime.asInstanceOf[js.Any], noInitialRun = noInitialRun.asInstanceOf[js.Any], onAbort = js.Any.fromFunction1(onAbort), onCustomMessage = js.Any.fromFunction1(onCustomMessage), onRuntimeInitialized = js.Any.fromFunction0(onRuntimeInitialized), postRun = postRun.asInstanceOf[js.Any], preInit = preInit.asInstanceOf[js.Any], preRun = preRun.asInstanceOf[js.Any], preinitializedWebGLContext = preinitializedWebGLContext.asInstanceOf[js.Any], preloadedAudios = preloadedAudios.asInstanceOf[js.Any], preloadedImages = preloadedImages.asInstanceOf[js.Any], print = js.Any.fromFunction1(print), printErr = js.Any.fromFunction1(printErr), wasmBinary = wasmBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmscriptenModule]
  }
}

