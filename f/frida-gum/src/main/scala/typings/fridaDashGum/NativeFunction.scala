package typings.fridaDashGum

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeFunction extends NativePointer {
  def apply(args: NativeArgumentValue*): NativeReturnValue = js.native
  @JSName("apply")
  def apply(thisArg: js.UndefOr[scala.Nothing], args: js.Array[NativeArgumentValue]): NativeReturnValue = js.native
  @JSName("apply")
  def apply(thisArg: Null, args: js.Array[NativeArgumentValue]): NativeReturnValue = js.native
  @JSName("apply")
  def apply(thisArg: NativePointerValue, args: js.Array[NativeArgumentValue]): NativeReturnValue = js.native
  def call(): NativeReturnValue = js.native
  def call(args: NativeArgumentValue*): NativeReturnValue = js.native
  def call(thisArg: NativePointerValue, args: NativeArgumentValue*): NativeReturnValue = js.native
}

@JSGlobal("NativeFunction")
@js.native
object NativeFunction extends TopLevel[NativeFunctionConstructor]

