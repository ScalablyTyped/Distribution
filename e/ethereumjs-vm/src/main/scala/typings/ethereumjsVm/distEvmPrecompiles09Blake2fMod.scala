package typings.ethereumjsVm

import typings.ethereumjsVm.distEvmEvmMod.ExecResult
import typings.ethereumjsVm.distEvmPrecompilesTypesMod.PrecompileInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEvmPrecompiles09Blake2fMod {
  
  @JSImport("ethereumjs-vm/dist/evm/precompiles/09-blake2f", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: PrecompileInput): ExecResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[ExecResult]
  
  inline def F(
    h: js.typedarray.Uint32Array,
    m: js.typedarray.Uint32Array,
    t: js.typedarray.Uint32Array,
    f: Boolean,
    rounds: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("F")(h.asInstanceOf[js.Any], m.asInstanceOf[js.Any], t.asInstanceOf[js.Any], f.asInstanceOf[js.Any], rounds.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
