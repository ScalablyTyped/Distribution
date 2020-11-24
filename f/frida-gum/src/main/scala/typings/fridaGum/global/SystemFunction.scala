package typings.fridaGum.global

import org.scalablytyped.runtime.TopLevel
import typings.fridaGum.NativeABI
import typings.fridaGum.NativeFunctionOptions
import typings.fridaGum.NativePointerValue
import typings.fridaGum.NativeType
import typings.fridaGum.SystemFunctionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SystemFunction")
@js.native
class SystemFunction protected ()
  extends typings.fridaGum.SystemFunction {
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
@JSGlobal("SystemFunction")
@js.native
object SystemFunction extends TopLevel[SystemFunctionConstructor]
