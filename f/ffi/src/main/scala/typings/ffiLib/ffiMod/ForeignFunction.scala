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

@JSImport("ffi", "ForeignFunction")
@js.native
object ForeignFunction
  extends org.scalablytyped.runtime.Instantiable3[
      /* ptr */ ffiLib.Buffer, 
      (/* retType */ java.lang.String) | (/* retType */ refLib.refMod.Type), 
      /* argTypes */ js.Array[js.Any], 
      ForeignFunction
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* ptr */ ffiLib.Buffer, 
      (/* retType */ java.lang.String) | (/* retType */ refLib.refMod.Type), 
      /* argTypes */ js.Array[js.Any], 
      /* abi */ scala.Double, 
      ForeignFunction
    ] {
  def apply(ptr: ffiLib.Buffer, retType: java.lang.String, argTypes: js.Array[_]): ffiLib.ffiMod.ForeignFunction = js.native
  def apply(ptr: ffiLib.Buffer, retType: java.lang.String, argTypes: js.Array[_], abi: scala.Double): ffiLib.ffiMod.ForeignFunction = js.native
  def apply(ptr: ffiLib.Buffer, retType: refLib.refMod.Type, argTypes: js.Array[_]): ffiLib.ffiMod.ForeignFunction = js.native
  def apply(ptr: ffiLib.Buffer, retType: refLib.refMod.Type, argTypes: js.Array[_], abi: scala.Double): ffiLib.ffiMod.ForeignFunction = js.native
}

