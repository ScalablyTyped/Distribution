package typings.ethereumjsVm

import typings.ethereumjsVm.distEvmEvmMod.ExecResult
import typings.ethereumjsVm.distEvmPrecompilesTypesMod.PrecompileInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEvmPrecompiles02Sha256Mod {
  
  @JSImport("ethereumjs-vm/dist/evm/precompiles/02-sha256", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: PrecompileInput): ExecResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[ExecResult]
}
