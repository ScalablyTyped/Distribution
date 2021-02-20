package typings.ethereumjsVm

import typings.ethereumjsVm.evmMod.ExecResult
import typings.ethereumjsVm.typesMod.PrecompileInput
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `09Blake2fMod` {
  
  @JSImport("ethereumjs-vm/dist/evm/precompiles/09-blake2f", JSImport.Default)
  @js.native
  def default(opts: PrecompileInput): ExecResult = js.native
  
  @JSImport("ethereumjs-vm/dist/evm/precompiles/09-blake2f", "F")
  @js.native
  def F(h: Uint32Array, m: Uint32Array, t: Uint32Array, f: Boolean, rounds: Double): Unit = js.native
}
