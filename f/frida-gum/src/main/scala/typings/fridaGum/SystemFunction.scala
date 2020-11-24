package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemFunction extends NativePointer {
  
  def apply(args: NativeArgumentValue*): SystemFunctionResult = js.native
  
  @JSName("apply")
  def apply(thisArg: js.UndefOr[scala.Nothing], args: js.Array[NativeArgumentValue]): SystemFunctionResult = js.native
  @JSName("apply")
  def apply(thisArg: Null, args: js.Array[NativeArgumentValue]): SystemFunctionResult = js.native
  @JSName("apply")
  def apply(thisArg: NativePointerValue, args: js.Array[NativeArgumentValue]): SystemFunctionResult = js.native
  
  def call(thisArg: js.UndefOr[scala.Nothing], args: NativeArgumentValue*): SystemFunctionResult = js.native
  def call(thisArg: Null, args: NativeArgumentValue*): SystemFunctionResult = js.native
  def call(thisArg: NativePointerValue, args: NativeArgumentValue*): SystemFunctionResult = js.native
}
