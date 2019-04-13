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

@JSImport("ffi-napi", "ForeignFunction")
@js.native
object ForeignFunction
  extends org.scalablytyped.runtime.Instantiable3[
      /* ptr */ ffiDashNapiLib.Buffer, 
      (/* retType */ java.lang.String) | (/* retType */ refDashNapiLib.refDashNapiMod.Type), 
      /* argTypes */ js.Array[js.Any], 
      ForeignFunction
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* ptr */ ffiDashNapiLib.Buffer, 
      (/* retType */ java.lang.String) | (/* retType */ refDashNapiLib.refDashNapiMod.Type), 
      /* argTypes */ js.Array[js.Any], 
      /* abi */ scala.Double, 
      ForeignFunction
    ] {
  def apply(ptr: ffiDashNapiLib.Buffer, retType: java.lang.String, argTypes: js.Array[_]): ffiDashNapiLib.ffiDashNapiMod.ForeignFunction = js.native
  def apply(ptr: ffiDashNapiLib.Buffer, retType: java.lang.String, argTypes: js.Array[_], abi: scala.Double): ffiDashNapiLib.ffiDashNapiMod.ForeignFunction = js.native
  def apply(ptr: ffiDashNapiLib.Buffer, retType: refDashNapiLib.refDashNapiMod.Type, argTypes: js.Array[_]): ffiDashNapiLib.ffiDashNapiMod.ForeignFunction = js.native
  def apply(
    ptr: ffiDashNapiLib.Buffer,
    retType: refDashNapiLib.refDashNapiMod.Type,
    argTypes: js.Array[_],
    abi: scala.Double
  ): ffiDashNapiLib.ffiDashNapiMod.ForeignFunction = js.native
}

