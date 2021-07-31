package typings.ethereumjsVm

import typings.ethereumjsVm.evmMod.ExecResult
import typings.ethereumjsVm.typesMod.PrecompileInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `02Sha256Mod` {
  
  @JSImport("ethereumjs-vm/dist/evm/precompiles/02-sha256", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(opts: PrecompileInput): ExecResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[ExecResult]
}
