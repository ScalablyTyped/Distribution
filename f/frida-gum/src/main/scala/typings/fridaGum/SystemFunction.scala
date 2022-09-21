package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemFunction[RetType /* <: NativeFunctionReturnValue */, ArgTypes /* <: js.Array[Any | NativeFunctionArgumentValue] */]
  extends StObject
     with NativePointer {
  
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgTypes is not an array type */ args: ArgTypes
  ): SystemFunctionResult[RetType] = js.native
  
  @JSName("apply")
  def apply(thisArg: Null, args: ArgTypes): SystemFunctionResult[RetType] = js.native
  @JSName("apply")
  def apply(thisArg: Unit, args: ArgTypes): SystemFunctionResult[RetType] = js.native
  @JSName("apply")
  def apply(thisArg: NativePointerValue, args: ArgTypes): SystemFunctionResult[RetType] = js.native
  
  def call(
    thisArg: Null,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgTypes is not an array type */ args: ArgTypes
  ): SystemFunctionResult[RetType] = js.native
  def call(
    thisArg: Unit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgTypes is not an array type */ args: ArgTypes
  ): SystemFunctionResult[RetType] = js.native
  def call(
    thisArg: NativePointerValue,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgTypes is not an array type */ args: ArgTypes
  ): SystemFunctionResult[RetType] = js.native
}
