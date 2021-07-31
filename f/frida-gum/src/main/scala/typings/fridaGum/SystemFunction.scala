package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemFunction
  extends StObject
     with NativePointer {
  
  def apply(args: NativeArgumentValue*): SystemFunctionResult = js.native
  
  @JSName("apply")
  def apply(thisArg: Null, args: js.Array[NativeArgumentValue]): SystemFunctionResult = js.native
  @JSName("apply")
  def apply(thisArg: Unit, args: js.Array[NativeArgumentValue]): SystemFunctionResult = js.native
  @JSName("apply")
  def apply(thisArg: NativePointerValue, args: js.Array[NativeArgumentValue]): SystemFunctionResult = js.native
  
  def call(thisArg: Null, args: NativeArgumentValue*): SystemFunctionResult = js.native
  def call(thisArg: Unit, args: NativeArgumentValue*): SystemFunctionResult = js.native
  def call(thisArg: NativePointerValue, args: NativeArgumentValue*): SystemFunctionResult = js.native
}
