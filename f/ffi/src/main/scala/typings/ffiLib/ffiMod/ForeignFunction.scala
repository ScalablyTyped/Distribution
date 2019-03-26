package typings
package ffiLib.ffiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForeignFunction extends js.Object {
  def apply(args: js.Any*): js.Any = js.native
  def async(args: js.Any*): scala.Unit = js.native
}

@JSImport("ffi", "ForeignFunction")
@js.native
class ForeignFunctionCls protected () extends ForeignFunction {
  def this(ptr: ffiLib.Buffer, retType: java.lang.String, argTypes: js.Array[_]) = this()
  def this(ptr: ffiLib.Buffer, retType: refLib.refMod.Type, argTypes: js.Array[_]) = this()
  def this(ptr: ffiLib.Buffer, retType: java.lang.String, argTypes: js.Array[_], abi: scala.Double) = this()
  def this(ptr: ffiLib.Buffer, retType: refLib.refMod.Type, argTypes: js.Array[_], abi: scala.Double) = this()
}

