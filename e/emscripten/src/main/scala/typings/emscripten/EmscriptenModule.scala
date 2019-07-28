package typings.emscripten

import typings.emscripten.EmscriptenNs.EnvironmentType
import typings.emscripten.EmscriptenNs.WebAssemblyExports
import typings.emscripten.EmscriptenNs.WebAssemblyImports
import typings.emscripten.WebAssemblyNs.Module
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

@js.native
trait EmscriptenModule extends js.Object {
  var ALLOC_DYNAMIC: Double = js.native
  var ALLOC_NONE: Double = js.native
  var ALLOC_NORMAL: Double = js.native
  var ALLOC_STACK: Double = js.native
  var ALLOC_STATIC: Double = js.native
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
  var Runtime: js.Any = js.native
  var TOTAL_MEMORY: Double = js.native
  var TOTAL_STACK: Double = js.native
  var arguments: js.Array[String] = js.native
  var environment: EnvironmentType = js.native
  var filePackagePrefixURL: String = js.native
  var logReadFiles: Boolean = js.native
  var noExitRuntime: Boolean = js.native
  var noInitialRun: Boolean = js.native
  var postRun: js.Array[Fn_Void] = js.native
  var preInit: js.Array[Fn_Void] = js.native
  var preRun: js.Array[Fn_Void] = js.native
  var preinitializedWebGLContext: WebGLRenderingContext = js.native
  var preloadedAudios: js.Any = js.native
  var preloadedImages: js.Any = js.native
  var wasmBinary: ArrayBuffer = js.native
  def Pointer_stringify(ptr: Double): String = js.native
  def Pointer_stringify(ptr: Double, length: Double): String = js.native
  def UTF16ToString(ptr: Double): String = js.native
  def UTF32ToString(ptr: Double): String = js.native
  def UTF8ToString(ptr: Double): String = js.native
  def UTF8ToString(ptr: Double, length: Double): String = js.native
  def _free(ptr: Double): Unit = js.native
  def _malloc(size: Double): Double = js.native
  def addOnExit(cb: js.Function0[_]): Unit = js.native
  def addOnInit(cb: js.Function0[_]): Unit = js.native
  def addOnPostRun(cb: js.Function0[_]): Unit = js.native
  def addOnPreMain(cb: js.Function0[_]): Unit = js.native
  def addOnPreRun(cb: js.Function0[_]): Unit = js.native
  def addRunDependency(id: js.Any): Unit = js.native
  def allocate(slab: js.Any, types: String, allocator: Double, ptr: Double): Double = js.native
  def allocate(slab: js.Any, types: js.Array[String], allocator: Double, ptr: Double): Double = js.native
  def ccall(ident: String, returnType: String, argTypes: js.Array[String], args: js.Array[_]): js.Any = js.native
  def ccall(ident: String, returnType: Null, argTypes: js.Array[String], args: js.Array[_]): js.Any = js.native
  def cwrap(ident: String, returnType: String, argTypes: js.Array[String]): js.Any = js.native
  def cwrap(ident: String, returnType: Null, argTypes: js.Array[String]): js.Any = js.native
  def destroy(`object`: js.Object): Unit = js.native
  def getPreloadedPackage(remotePackageName: String, remotePackageSize: Double): ArrayBuffer = js.native
  def getValue(ptr: Double, `type`: String): Double = js.native
  def getValue(ptr: Double, `type`: String, noSafe: Boolean): Double = js.native
  def instantiateWasm(imports: WebAssemblyImports, successCallback: js.Function1[/* module */ Module, Unit]): WebAssemblyExports = js.native
  // Tools
  def intArrayFromString(stringy: String): js.Array[Double] = js.native
  def intArrayFromString(stringy: String, dontAddNull: Boolean): js.Array[Double] = js.native
  def intArrayFromString(stringy: String, dontAddNull: Boolean, length: Double): js.Array[Double] = js.native
  def intArrayToString(array: js.Array[Double]): String = js.native
  def locateFile(url: String): String = js.native
  def onCustomMessage(event: MessageEvent): Unit = js.native
  def print(str: String): Unit = js.native
  def printErr(str: String): Unit = js.native
  def removeRunDependency(id: js.Any): Unit = js.native
  def setValue(ptr: Double, value: js.Any, `type`: String): Unit = js.native
  def setValue(ptr: Double, value: js.Any, `type`: String, noSafe: Boolean): Unit = js.native
  def stringToUTF16(str: String, outPtr: Double): Unit = js.native
  def stringToUTF32(str: String, outPtr: Double): Unit = js.native
  def writeArrayToMemory(array: js.Array[Double], buffer: Double): Unit = js.native
  def writeAsciiToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = js.native
  def writeStringToMemory(str: String, buffer: Double, dontAddNull: Boolean): Unit = js.native
}

