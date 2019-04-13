package typings
package ffiLib.ffiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariadicForeignFunction extends js.Object {
  /**
    * Return type as a property of the function generator to
    * allow for monkey patching the return value in the very rare case where the
    * return type is variadic as well
    */
  var returnType: js.Any = js.native
  /**
    * What gets returned is another function that needs to be invoked with the rest
    * of the variadic types that are being invoked from the function.
    */
  def apply(args: js.Any*): ForeignFunction = js.native
}

@JSImport("ffi", "VariadicForeignFunction")
@js.native
class VariadicForeignFunctionCls protected () extends VariadicForeignFunction {
  def this(ptr: ffiLib.Buffer, ret: java.lang.String, fixedArgs: js.Array[_]) = this()
  def this(ptr: ffiLib.Buffer, ret: refLib.refMod.Type, fixedArgs: js.Array[_]) = this()
  def this(ptr: ffiLib.Buffer, ret: java.lang.String, fixedArgs: js.Array[_], abi: scala.Double) = this()
  def this(ptr: ffiLib.Buffer, ret: refLib.refMod.Type, fixedArgs: js.Array[_], abi: scala.Double) = this()
}

@JSImport("ffi", "VariadicForeignFunction")
@js.native
object VariadicForeignFunction
  extends org.scalablytyped.runtime.Instantiable3[
      /* ptr */ ffiLib.Buffer, 
      (/* ret */ java.lang.String) | (/* ret */ refLib.refMod.Type), 
      /* fixedArgs */ js.Array[js.Any], 
      VariadicForeignFunction
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* ptr */ ffiLib.Buffer, 
      (/* ret */ java.lang.String) | (/* ret */ refLib.refMod.Type), 
      /* fixedArgs */ js.Array[js.Any], 
      /* abi */ scala.Double, 
      VariadicForeignFunction
    ] {
  def apply(ptr: ffiLib.Buffer, ret: java.lang.String, fixedArgs: js.Array[_]): ffiLib.ffiMod.VariadicForeignFunction = js.native
  def apply(ptr: ffiLib.Buffer, ret: java.lang.String, fixedArgs: js.Array[_], abi: scala.Double): ffiLib.ffiMod.VariadicForeignFunction = js.native
  def apply(ptr: ffiLib.Buffer, ret: refLib.refMod.Type, fixedArgs: js.Array[_]): ffiLib.ffiMod.VariadicForeignFunction = js.native
  def apply(ptr: ffiLib.Buffer, ret: refLib.refMod.Type, fixedArgs: js.Array[_], abi: scala.Double): ffiLib.ffiMod.VariadicForeignFunction = js.native
}

