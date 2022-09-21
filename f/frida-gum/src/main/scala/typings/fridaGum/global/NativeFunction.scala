package typings.fridaGum.global

import typings.fridaGum.GetNativeFunctionArgumentValue
import typings.fridaGum.GetNativeFunctionReturnValue
import typings.fridaGum.NativeABI
import typings.fridaGum.NativeFunctionArgumentType
import typings.fridaGum.NativeFunctionConstructor
import typings.fridaGum.NativeFunctionOptions
import typings.fridaGum.NativeFunctionReturnType
import typings.fridaGum.NativePointerValue
import typings.fridaGum.ResolveVariadic
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("NativeFunction")
@js.native
open class NativeFunction[RetType /* <: NativeFunctionReturnType */, ArgTypes /* <: js.Array[Any | NativeFunctionArgumentType] */] protected ()
  extends StObject
     with typings.fridaGum.NativeFunction[
      GetNativeFunctionReturnValue[RetType], 
      ResolveVariadic[Extract[GetNativeFunctionArgumentValue[ArgTypes], js.Array[Any]]]
    ] {
  def this(address: NativePointerValue, retType: RetType, argTypes: ArgTypes) = this()
  def this(address: NativePointerValue, retType: RetType, argTypes: ArgTypes, abiOrOptions: NativeABI) = this()
  def this(
    address: NativePointerValue,
    retType: RetType,
    argTypes: ArgTypes,
    abiOrOptions: NativeFunctionOptions
  ) = this()
}
object NativeFunction {
  
  inline def apply: NativeFunctionConstructor = js.Dynamic.global.selectDynamic("NativeFunction").asInstanceOf[NativeFunctionConstructor]
}
