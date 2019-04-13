package typings
package ffiLib.ffiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Function
  extends refLib.refMod.Type {
  var abi: scala.Double = js.native
  /** The type of arguments. */
  var argTypes: js.Array[refLib.refMod.Type] = js.native
  /** Is set for node-ffi functions. */
  var ffi_type: ffiLib.Buffer = js.native
  /** The type of return value. */
  var retType: refLib.refMod.Type = js.native
  /** Get a `ForeignFunction` of this function type. */
  def toFunction(buf: ffiLib.Buffer): ForeignFunction = js.native
  /** Get a `Callback` pointer of this function type. */
  def toPointer(fn: js.Function1[/* repeated */ js.Any, _]): ffiLib.Buffer = js.native
}

@JSImport("ffi", "Function")
@js.native
class FunctionCls protected () extends Function {
  def this(retType: java.lang.String, argTypes: js.Array[_]) = this()
  def this(retType: refLib.refMod.Type, argTypes: js.Array[_]) = this()
  def this(retType: java.lang.String, argTypes: js.Array[_], abi: scala.Double) = this()
  def this(retType: refLib.refMod.Type, argTypes: js.Array[_], abi: scala.Double) = this()
  /** The current level of indirection of the buffer. */
  /* CompleteClass */
  override var indirection: scala.Double = js.native
  /** The size in bytes required to hold this datatype. */
  /* CompleteClass */
  override var size: scala.Double = js.native
  /** To invoke when `ref.get` is invoked on a buffer of this type. */
  /* CompleteClass */
  override def get(buffer: nodeLib.Buffer, offset: scala.Double): js.Any = js.native
  /** To invoke when `ref.set` is invoked on a buffer of this type. */
  /* CompleteClass */
  override def set(buffer: nodeLib.Buffer, offset: scala.Double, value: js.Any): scala.Unit = js.native
}

@JSImport("ffi", "Function")
@js.native
object Function
  extends org.scalablytyped.runtime.Instantiable2[
      (/* retType */ java.lang.String) | (/* retType */ refLib.refMod.Type), 
      /* argTypes */ js.Array[js.Any], 
      Function
    ]
     with org.scalablytyped.runtime.Instantiable3[
      (/* retType */ java.lang.String) | (/* retType */ refLib.refMod.Type), 
      /* argTypes */ js.Array[js.Any], 
      /* abi */ scala.Double, 
      Function
    ] {
  def apply(retType: java.lang.String, argTypes: js.Array[_]): ffiLib.ffiMod.Function = js.native
  def apply(retType: java.lang.String, argTypes: js.Array[_], abi: scala.Double): ffiLib.ffiMod.Function = js.native
  def apply(retType: refLib.refMod.Type, argTypes: js.Array[_]): ffiLib.ffiMod.Function = js.native
  def apply(retType: refLib.refMod.Type, argTypes: js.Array[_], abi: scala.Double): ffiLib.ffiMod.Function = js.native
}

