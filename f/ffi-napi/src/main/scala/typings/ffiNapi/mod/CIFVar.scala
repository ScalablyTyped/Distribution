package typings.ffiNapi.mod

import typings.ffiNapi.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ffi-napi", "CIF_var")
@js.native
object CIFVar extends js.Object {
  
  def apply(retType: js.Any, types: js.Array[_], numFixedArgs: Double): Buffer = js.native
  def apply(retType: js.Any, types: js.Array[_], numFixedArgs: Double, abi: js.Any): Buffer = js.native
}
