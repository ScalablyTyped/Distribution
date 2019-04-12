package typings
package emscriptenLib.ModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Module")
@js.native
object ^ extends js.Object {
  var ALLOC_DYNAMIC: scala.Double = js.native
  var ALLOC_NONE: scala.Double = js.native
  var ALLOC_NORMAL: scala.Double = js.native
  var ALLOC_STACK: scala.Double = js.native
  var ALLOC_STATIC: scala.Double = js.native
  var FAST_MEMORY: scala.Double = js.native
  var FHEAP: stdLib.Float64Array = js.native
  // USE_TYPED_ARRAYS == 1
  var HEAP: stdLib.Int32Array = js.native
  var HEAP16: stdLib.Int16Array = js.native
  var HEAP32: stdLib.Int32Array = js.native
  // USE_TYPED_ARRAYS == 2
  var HEAP8: stdLib.Int8Array = js.native
  var HEAPF32: stdLib.Float32Array = js.native
  var HEAPF64: stdLib.Float64Array = js.native
  var HEAPU16: stdLib.Uint16Array = js.native
  var HEAPU32: stdLib.Uint32Array = js.native
  var HEAPU8: stdLib.Uint8Array = js.native
  var IHEAP: stdLib.Int32Array = js.native
  var Runtime: js.Any = js.native
  var TOTAL_MEMORY: scala.Double = js.native
  var TOTAL_STACK: scala.Double = js.native
  var arguments: js.Array[java.lang.String] = js.native
  var environment: EnvironmentType = js.native
  var filePackagePrefixURL: java.lang.String = js.native
  var logReadFiles: scala.Boolean = js.native
  var noExitRuntime: scala.Boolean = js.native
  var noInitialRun: scala.Boolean = js.native
  var postRun: js.Array[emscriptenLib.Anon_Void] = js.native
  var preInit: js.Array[emscriptenLib.Anon_Void] = js.native
  var preRun: js.Array[emscriptenLib.Anon_Void] = js.native
  var preinitializedWebGLContext: stdLib.WebGLRenderingContext = js.native
  var preloadedAudios: js.Any = js.native
  var preloadedImages: js.Any = js.native
  var wasmBinary: stdLib.ArrayBuffer = js.native
  def Pointer_stringify(ptr: scala.Double): java.lang.String = js.native
  def Pointer_stringify(ptr: scala.Double, length: scala.Double): java.lang.String = js.native
  def UTF16ToString(ptr: scala.Double): java.lang.String = js.native
  def UTF32ToString(ptr: scala.Double): java.lang.String = js.native
  def _free(ptr: scala.Double): scala.Unit = js.native
  def _malloc(size: scala.Double): scala.Double = js.native
  def addOnExit(cb: js.Function0[_]): scala.Unit = js.native
  def addOnInit(cb: js.Function0[_]): scala.Unit = js.native
  def addOnPostRun(cb: js.Function0[_]): scala.Unit = js.native
  def addOnPreMain(cb: js.Function0[_]): scala.Unit = js.native
  def addOnPreRun(cb: js.Function0[_]): scala.Unit = js.native
  def addRunDependency(id: js.Any): scala.Unit = js.native
  def allocate(slab: js.Any, types: java.lang.String, allocator: scala.Double, ptr: scala.Double): scala.Double = js.native
  def allocate(slab: js.Any, types: js.Array[java.lang.String], allocator: scala.Double, ptr: scala.Double): scala.Double = js.native
  def ccall(
    ident: java.lang.String,
    returnType: java.lang.String,
    argTypes: js.Array[java.lang.String],
    args: js.Array[_]
  ): js.Any = js.native
  def ccall(
    ident: java.lang.String,
    returnType: scala.Null,
    argTypes: js.Array[java.lang.String],
    args: js.Array[_]
  ): js.Any = js.native
  def cwrap(ident: java.lang.String, returnType: java.lang.String, argTypes: js.Array[java.lang.String]): js.Any = js.native
  def cwrap(ident: java.lang.String, returnType: scala.Null, argTypes: js.Array[java.lang.String]): js.Any = js.native
  def destroy(`object`: js.Object): scala.Unit = js.native
  def getPreloadedPackage(remotePackageName: java.lang.String, remotePackageSize: scala.Double): stdLib.ArrayBuffer = js.native
  def getValue(ptr: scala.Double, `type`: java.lang.String): scala.Double = js.native
  def getValue(ptr: scala.Double, `type`: java.lang.String, noSafe: scala.Boolean): scala.Double = js.native
  def instantiateWasm(
    imports: WebAssemblyImports,
    successCallback: js.Function1[/* module */ emscriptenLib.WebAssemblyNs.Module, scala.Unit]
  ): WebAssemblyExports = js.native
  // Tools
  def intArrayFromString(stringy: java.lang.String): js.Array[scala.Double] = js.native
  def intArrayFromString(stringy: java.lang.String, dontAddNull: scala.Boolean): js.Array[scala.Double] = js.native
  def intArrayFromString(stringy: java.lang.String, dontAddNull: scala.Boolean, length: scala.Double): js.Array[scala.Double] = js.native
  def intArrayToString(array: js.Array[scala.Double]): java.lang.String = js.native
  def locateFile(url: java.lang.String): java.lang.String = js.native
  def onCustomMessage(event: stdLib.MessageEvent): scala.Unit = js.native
  def print(str: java.lang.String): scala.Unit = js.native
  def printErr(str: java.lang.String): scala.Unit = js.native
  def removeRunDependency(id: js.Any): scala.Unit = js.native
  def setValue(ptr: scala.Double, value: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def setValue(ptr: scala.Double, value: js.Any, `type`: java.lang.String, noSafe: scala.Boolean): scala.Unit = js.native
  def stringToUTF16(str: java.lang.String, outPtr: scala.Double): scala.Unit = js.native
  def stringToUTF32(str: java.lang.String, outPtr: scala.Double): scala.Unit = js.native
  def writeArrayToMemory(array: js.Array[scala.Double], buffer: scala.Double): scala.Unit = js.native
  def writeAsciiToMemory(str: java.lang.String, buffer: scala.Double, dontAddNull: scala.Boolean): scala.Unit = js.native
  def writeStringToMemory(str: java.lang.String, buffer: scala.Double, dontAddNull: scala.Boolean): scala.Unit = js.native
}

