package typings.ffi.mod

import typings.ffi.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ffi", "CIF")
@js.native
object CIF extends js.Object {
  
  def apply(retType: js.Any, types: js.Array[_]): Buffer = js.native
  def apply(retType: js.Any, types: js.Array[_], abi: js.Any): Buffer = js.native
}
