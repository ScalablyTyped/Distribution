package typings.fridaGum.global

import typings.fridaGum.GetNativeCallbackArgumentValue
import typings.fridaGum.GetNativeCallbackReturnValue
import typings.fridaGum.NativeABI
import typings.fridaGum.NativeCallbackArgumentType
import typings.fridaGum.NativeCallbackImplementation
import typings.fridaGum.NativeCallbackReturnType
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("NativeCallback")
@js.native
open class NativeCallback[RetType /* <: NativeCallbackReturnType */, ArgTypes /* <: js.Array[Any | NativeCallbackArgumentType] */] protected ()
  extends StObject
     with typings.fridaGum.NativePointer {
  def this(
    func: NativeCallbackImplementation[
        GetNativeCallbackReturnValue[RetType], 
        Extract[GetNativeCallbackArgumentValue[ArgTypes], js.Array[Any]]
      ],
    retType: RetType,
    argTypes: ArgTypes
  ) = this()
  def this(
    func: NativeCallbackImplementation[
        GetNativeCallbackReturnValue[RetType], 
        Extract[GetNativeCallbackArgumentValue[ArgTypes], js.Array[Any]]
      ],
    retType: RetType,
    argTypes: ArgTypes,
    abi: NativeABI
  ) = this()
}
