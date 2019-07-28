package typings.ffi.ffiMod

import typings.ffi.Buffer
import typings.refDashStruct.refDashStructMod.StructType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Callback: typings.ffi.ffiMod.Callback = js.native
  val FFI_BAD_ABI: Double = js.native
  val FFI_BAD_TYPEDEF: Double = js.native
  val FFI_DEFAULT_ABI: Double = js.native
  val FFI_FASTCALL: Double = js.native
  val FFI_FIRST_ABI: Double = js.native
  val FFI_LAST_ABI: Double = js.native
  val FFI_OK: Double = js.native
  val FFI_STDCALL: Double = js.native
  val FFI_SYSV: Double = js.native
  val FFI_THISCALL: Double = js.native
  val FFI_TYPE: StructType = js.native
  val FFI_UNIX64: Double = js.native
  val FFI_VFP: Double = js.native
  val FFI_WIN64: Double = js.native
  val HAS_OBJC: Boolean = js.native
  val LIB_EXT: String = js.native
  val Library: typings.ffi.ffiMod.Library = js.native
  val RTLD_DEFAULT: Buffer = js.native
  val RTLD_GLOBAL: Double = js.native
  val RTLD_LAZY: Double = js.native
  val RTLD_LOCAL: Double = js.native
  val RTLD_NEXT: Buffer = js.native
  val RTLD_NODELETE: Double = js.native
  val RTLD_NOLOAD: Double = js.native
  val RTLD_NOW: Double = js.native
  def CIF(retType: js.Any, types: js.Array[_]): Buffer = js.native
  def CIF(retType: js.Any, types: js.Array[_], abi: js.Any): Buffer = js.native
  def CIF_var(retType: js.Any, types: js.Array[_], numFixedArgs: Double): Buffer = js.native
  def CIF_var(retType: js.Any, types: js.Array[_], numFixedArgs: Double, abi: js.Any): Buffer = js.native
  def errno(): Double = js.native
}

