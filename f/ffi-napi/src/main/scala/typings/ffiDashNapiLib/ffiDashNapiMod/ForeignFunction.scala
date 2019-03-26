package typings
package ffiDashNapiLib.ffiDashNapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForeignFunction extends js.Object {
  def apply(args: js.Any*): js.Any = js.native
  def async(args: js.Any*): scala.Unit = js.native
}

@JSImport("ffi-napi", "ForeignFunction")
@js.native
class ForeignFunctionCls protected () extends ForeignFunction {
  def this(ptr: ffiDashNapiLib.Buffer, retType: java.lang.String, argTypes: js.Array[_]) = this()
  def this(ptr: ffiDashNapiLib.Buffer, retType: refDashNapiLib.refDashNapiMod.Type, argTypes: js.Array[_]) = this()
  def this(ptr: ffiDashNapiLib.Buffer, retType: java.lang.String, argTypes: js.Array[_], abi: scala.Double) = this()
  def this(ptr: ffiDashNapiLib.Buffer, retType: refDashNapiLib.refDashNapiMod.Type, argTypes: js.Array[_], abi: scala.Double) = this()
}

