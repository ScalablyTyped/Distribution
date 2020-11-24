package typings.ffiNapi.mod

import typings.ffiNapi.Buffer
import typings.refNapi.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ffi-napi", "VariadicForeignFunction")
@js.native
class VariadicForeignFunctionCls protected () extends VariadicForeignFunction {
  def this(ptr: Buffer, ret: String, fixedArgs: js.Array[_]) = this()
  def this(ptr: Buffer, ret: Type, fixedArgs: js.Array[_]) = this()
  def this(ptr: Buffer, ret: String, fixedArgs: js.Array[_], abi: Double) = this()
  def this(ptr: Buffer, ret: Type, fixedArgs: js.Array[_], abi: Double) = this()
}
