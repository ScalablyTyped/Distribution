package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeFunction extends NativePointer {
  def apply(args: NativeArgumentValue*): NativeReturnValue = js.native
  @JSName("apply")
  def apply(thisArg: js.UndefOr[NativePointerValue | Null], args: js.Array[NativeArgumentValue]): NativeReturnValue = js.native
  def call(): NativeReturnValue = js.native
  def call(args: NativeArgumentValue*): NativeReturnValue = js.native
  def call(thisArg: NativePointerValue, args: NativeArgumentValue*): NativeReturnValue = js.native
}

