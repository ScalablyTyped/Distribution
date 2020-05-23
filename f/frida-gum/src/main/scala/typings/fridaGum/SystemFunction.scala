package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemFunction extends NativePointer {
  def apply(args: NativeArgumentValue*): SystemFunctionResult = js.native
  @JSName("apply")
  def apply(thisArg: js.UndefOr[NativePointerValue | Null], args: js.Array[NativeArgumentValue]): SystemFunctionResult = js.native
  def call(): SystemFunctionResult = js.native
  def call(args: NativeArgumentValue*): SystemFunctionResult = js.native
  def call(thisArg: NativePointerValue, args: NativeArgumentValue*): SystemFunctionResult = js.native
}

