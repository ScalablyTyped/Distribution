package typings.fridaGum.global

import typings.fridaGum.NativeABI
import typings.fridaGum.NativeFunctionOptions
import typings.fridaGum.NativePointerValue
import typings.fridaGum.NativeType
import typings.fridaGum.SystemFunctionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SystemFunction")
@js.native
class SystemFunction protected ()
  extends StObject
     with typings.fridaGum.SystemFunction {
  def this(address: NativePointerValue, retType: NativeType, argTypes: js.Array[NativeType]) = this()
  def this(
    address: NativePointerValue,
    retType: NativeType,
    argTypes: js.Array[NativeType],
    abiOrOptions: NativeABI
  ) = this()
  def this(
    address: NativePointerValue,
    retType: NativeType,
    argTypes: js.Array[NativeType],
    abiOrOptions: NativeFunctionOptions
  ) = this()
}
object SystemFunction {
  
  @scala.inline
  def apply: SystemFunctionConstructor = js.Dynamic.global.selectDynamic("SystemFunction").asInstanceOf[SystemFunctionConstructor]
}
