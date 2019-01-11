package typings
package ffiLib.ffiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Callback: ffiLib.ffiMod.Callback = js.native
  val DynamicLibrary: ffiLib.Anon_FLAGS = js.native
  val FFI_BAD_ABI: scala.Double = js.native
  val FFI_BAD_TYPEDEF: scala.Double = js.native
  val FFI_DEFAULT_ABI: scala.Double = js.native
  val FFI_FASTCALL: scala.Double = js.native
  val FFI_FIRST_ABI: scala.Double = js.native
  val FFI_LAST_ABI: scala.Double = js.native
  val FFI_OK: scala.Double = js.native
  val FFI_STDCALL: scala.Double = js.native
  val FFI_SYSV: scala.Double = js.native
  val FFI_THISCALL: scala.Double = js.native
  val FFI_TYPE: refDashStructLib.refDashStructMod.StructType = js.native
  val FFI_UNIX64: scala.Double = js.native
  val FFI_VFP: scala.Double = js.native
  val FFI_WIN64: scala.Double = js.native
  val ForeignFunction: ffiLib.Anon_AbiArgTypes = js.native
  val Function: ffiLib.Anon_Abi = js.native
  val HAS_OBJC: scala.Boolean = js.native
  val LIB_EXT: java.lang.String = js.native
  val Library: ffiLib.ffiMod.Library = js.native
  val RTLD_DEFAULT: ffiLib.Buffer = js.native
  val RTLD_GLOBAL: scala.Double = js.native
  val RTLD_LAZY: scala.Double = js.native
  val RTLD_LOCAL: scala.Double = js.native
  val RTLD_NEXT: ffiLib.Buffer = js.native
  val RTLD_NODELETE: scala.Double = js.native
  val RTLD_NOLOAD: scala.Double = js.native
  val RTLD_NOW: scala.Double = js.native
  val VariadicForeignFunction: ffiLib.Anon_AbiFixedArgs = js.native
  val ffiType: ffiLib.Anon_Arg = js.native
  val types: ffiLib.Anon_Bool = js.native
  def CIF(retType: js.Any, types: js.Array[_]): ffiLib.Buffer = js.native
  def CIF(retType: js.Any, types: js.Array[_], abi: js.Any): ffiLib.Buffer = js.native
  def CIF_var(retType: js.Any, types: js.Array[_], numFixedArgs: scala.Double): ffiLib.Buffer = js.native
  def CIF_var(retType: js.Any, types: js.Array[_], numFixedArgs: scala.Double, abi: js.Any): ffiLib.Buffer = js.native
  def errno(): scala.Double = js.native
}

