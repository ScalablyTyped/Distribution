package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemFunction extends NativePointer {
  def apply(args: NativeArgumentValue*): SystemFunctionResult = js.native
  @JSName("apply")
  def apply(thisArg: js.UndefOr[scala.Nothing], args: js.Array[NativeArgumentValue]): SystemFunctionResult = js.native
  @JSName("apply")
  def apply(thisArg: Null, args: js.Array[NativeArgumentValue]): SystemFunctionResult = js.native
  @JSName("apply")
  def apply(thisArg: NativePointerValue, args: js.Array[NativeArgumentValue]): SystemFunctionResult = js.native
  def call(): SystemFunctionResult = js.native
  def call(args: NativeArgumentValue*): SystemFunctionResult = js.native
  def call(thisArg: NativePointerValue, args: NativeArgumentValue*): SystemFunctionResult = js.native
}

@JSGlobal("SystemFunction")
@js.native
class SystemFunctionCls protected () extends SystemFunction {
  def this(address: NativePointerValue, retType: NativeType, argTypes: js.Array[NativeType]) = this()
  def this(
    address: NativePointerValue,
    retType: NativeType,
    argTypes: js.Array[NativeType],
    abiOrOptions: NativeABI
  ) = this()
  def this(
    address: NativePointerValue,
    retType: NativeType,
    argTypes: js.Array[NativeType],
    abiOrOptions: NativeFunctionOptions
  ) = this()
}

