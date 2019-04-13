package typings
package ffiDashNapiLib.ffiDashNapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffi-napi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Callback: ffiDashNapiLib.ffiDashNapiMod.Callback = js.native
  val FFI_BAD_ABI: scala.Double = js.native
  val FFI_BAD_TYPEDEF: scala.Double = js.native
  val FFI_DEFAULT_ABI: scala.Double = js.native
  val FFI_FIRST_ABI: scala.Double = js.native
  val FFI_LAST_ABI: scala.Double = js.native
  val FFI_OK: scala.Double = js.native
  val FFI_SYSV: scala.Double = js.native
  val FFI_TYPE: refDashStructDashDiLib.refDashStructDashDiMod.StructType = js.native
  val FFI_UNIX64: scala.Double = js.native
  val HAS_OBJC: scala.Boolean = js.native
  val LIB_EXT: java.lang.String = js.native
  val Library: ffiDashNapiLib.ffiDashNapiMod.Library = js.native
  val RTLD_DEFAULT: ffiDashNapiLib.Buffer = js.native
  val RTLD_GLOBAL: scala.Double = js.native
  val RTLD_LAZY: scala.Double = js.native
  val RTLD_LOCAL: scala.Double = js.native
  val RTLD_NEXT: ffiDashNapiLib.Buffer = js.native
  val RTLD_NODELETE: scala.Double = js.native
  val RTLD_NOLOAD: scala.Double = js.native
  val RTLD_NOW: scala.Double = js.native
  def CIF(retType: js.Any, types: js.Array[_]): ffiDashNapiLib.Buffer = js.native
  def CIF(retType: js.Any, types: js.Array[_], abi: js.Any): ffiDashNapiLib.Buffer = js.native
  def CIF_var(retType: js.Any, types: js.Array[_], numFixedArgs: scala.Double): ffiDashNapiLib.Buffer = js.native
  def CIF_var(retType: js.Any, types: js.Array[_], numFixedArgs: scala.Double, abi: js.Any): ffiDashNapiLib.Buffer = js.native
  def errno(): scala.Double = js.native
}

