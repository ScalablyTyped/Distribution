package typings.ethereumjsVm

import typings.ethereumjsVm.evmMod.ExecResult
import typings.ethereumjsVm.typesMod.PrecompileInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `01EcrecoverMod` {
  
  @JSImport("ethereumjs-vm/dist/evm/precompiles/01-ecrecover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(opts: PrecompileInput): ExecResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[ExecResult]
}
