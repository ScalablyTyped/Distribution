package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeFunction extends NativePointer {
  def apply(args: NativeArgumentValue*): NativeReturnValue = js.native
  @JSName("apply")
  def apply(thisArg: js.UndefOr[scala.Nothing], args: js.Array[NativeArgumentValue]): NativeReturnValue = js.native
  @JSName("apply")
  def apply(thisArg: NativePointerValue, args: js.Array[NativeArgumentValue]): NativeReturnValue = js.native
  @JSName("apply")
  def apply(thisArg: scala.Null, args: js.Array[NativeArgumentValue]): NativeReturnValue = js.native
  def call(): NativeReturnValue = js.native
  def call(args: NativeArgumentValue*): NativeReturnValue = js.native
  def call(thisArg: NativePointerValue, args: NativeArgumentValue*): NativeReturnValue = js.native
}

@JSGlobal("NativeFunction")
@js.native
class NativeFunctionCls protected () extends NativeFunction {
  def this(address: NativePointerValue, retType: NativeType, argTypes: js.Array[NativeType]) = this()
  def this(address: NativePointerValue, retType: NativeType, argTypes: js.Array[NativeType], abiOrOptions: NativeABI) = this()
  def this(address: NativePointerValue, retType: NativeType, argTypes: js.Array[NativeType], abiOrOptions: NativeFunctionOptions) = this()
}

