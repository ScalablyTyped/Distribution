package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeFunction extends NativePointer {
  
  def apply(args: NativeArgumentValue*): NativeReturnValue = js.native
  
  @JSName("apply")
  def apply(thisArg: js.UndefOr[scala.Nothing], args: js.Array[NativeArgumentValue]): NativeReturnValue = js.native
  @JSName("apply")
  def apply(thisArg: Null, args: js.Array[NativeArgumentValue]): NativeReturnValue = js.native
  @JSName("apply")
  def apply(thisArg: NativePointerValue, args: js.Array[NativeArgumentValue]): NativeReturnValue = js.native
  
  def call(thisArg: js.UndefOr[scala.Nothing], args: NativeArgumentValue*): NativeReturnValue = js.native
  def call(thisArg: Null, args: NativeArgumentValue*): NativeReturnValue = js.native
  def call(thisArg: NativePointerValue, args: NativeArgumentValue*): NativeReturnValue = js.native
}
