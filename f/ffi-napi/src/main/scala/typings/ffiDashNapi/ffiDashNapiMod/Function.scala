package typings.ffiDashNapi.ffiDashNapiMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.ffiDashNapi.Buffer
import typings.refDashNapi.refDashNapiMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Function extends Type {
  var abi: Double = js.native
  /** The type of arguments. */
  var argTypes: js.Array[Type] = js.native
  /** Is set for node-ffi functions. */
  var ffi_type: Buffer = js.native
  /** The type of return value. */
  var retType: Type = js.native
  /** Get a `ForeignFunction` of this function type. */
  def toFunction(buf: Buffer): ForeignFunction = js.native
  /** Get a `Callback` pointer of this function type. */
  def toPointer(fn: js.Function1[/* repeated */ js.Any, _]): Buffer = js.native
}

@JSImport("ffi-napi", "Function")
@js.native
class FunctionCls protected () extends Function {
  def this(retType: String, argTypes: js.Array[_]) = this()
  def this(retType: Type, argTypes: js.Array[_]) = this()
  def this(retType: String, argTypes: js.Array[_], abi: Double) = this()
  def this(retType: Type, argTypes: js.Array[_], abi: Double) = this()
  /** The current level of indirection of the buffer. */
  /* CompleteClass */
  override var indirection: Double = js.native
  /** The size in bytes required to hold this datatype. */
  /* CompleteClass */
  override var size: Double = js.native
  /** To invoke when `ref.get` is invoked on a buffer of this type. */
  /* CompleteClass */
  override def get(buffer: typings.node.Buffer, offset: Double): js.Any = js.native
  /** To invoke when `ref.set` is invoked on a buffer of this type. */
  /* CompleteClass */
  override def set(buffer: typings.node.Buffer, offset: Double, value: js.Any): Unit = js.native
}

@JSImport("ffi-napi", "Function")
@js.native
object Function
  extends Instantiable2[
      (/* retType */ String) | (/* retType */ Type), 
      /* argTypes */ js.Array[js.Any], 
      Function
    ]
     with Instantiable3[
      (/* retType */ String) | (/* retType */ Type), 
      /* argTypes */ js.Array[js.Any], 
      /* abi */ Double, 
      Function
    ] {
  def apply(retType: String, argTypes: js.Array[_]): Function = js.native
  def apply(retType: String, argTypes: js.Array[_], abi: Double): Function = js.native
  def apply(retType: Type, argTypes: js.Array[_]): Function = js.native
  def apply(retType: Type, argTypes: js.Array[_], abi: Double): Function = js.native
}

