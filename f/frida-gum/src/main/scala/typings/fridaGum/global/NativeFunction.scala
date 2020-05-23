package typings.fridaGum.global

import org.scalablytyped.runtime.TopLevel
import typings.fridaGum.NativeABI
import typings.fridaGum.NativeFunctionConstructor
import typings.fridaGum.NativeFunctionOptions
import typings.fridaGum.NativePointerValue
import typings.fridaGum.NativeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("NativeFunction")
@js.native
class NativeFunction protected ()
  extends typings.fridaGum.NativeFunction {
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

@JSGlobal("NativeFunction")
@js.native
object NativeFunction extends TopLevel[NativeFunctionConstructor]

