package typings.ethereumjsVm

import org.scalablytyped.runtime.StringDictionary
import typings.ethereumjsVm.typesMod.PrecompileFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-vm/dist/evm/precompiles", JSImport.Namespace)
@js.native
object precompilesMod extends js.Object {
  
  def getPrecompile(address: String): PrecompileFunc = js.native
  
  val precompiles: Precompiles_ = js.native
  
  val ripemdPrecompileAddress: /* "0000000000000000000000000000000000000003" */ String = js.native
  
  type Precompiles_ = StringDictionary[PrecompileFunc]
}
