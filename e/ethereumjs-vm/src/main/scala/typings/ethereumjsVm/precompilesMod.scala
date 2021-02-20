package typings.ethereumjsVm

import org.scalablytyped.runtime.StringDictionary
import typings.ethereumjsVm.typesMod.PrecompileFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precompilesMod {
  
  @JSImport("ethereumjs-vm/dist/evm/precompiles", "getPrecompile")
  @js.native
  def getPrecompile(address: String): PrecompileFunc = js.native
  
  @JSImport("ethereumjs-vm/dist/evm/precompiles", "precompiles")
  @js.native
  val precompiles: Precompiles_ = js.native
  
  @JSImport("ethereumjs-vm/dist/evm/precompiles", "ripemdPrecompileAddress")
  @js.native
  val ripemdPrecompileAddress: /* "0000000000000000000000000000000000000003" */ String = js.native
  
  type Precompiles_ = StringDictionary[PrecompileFunc]
}
