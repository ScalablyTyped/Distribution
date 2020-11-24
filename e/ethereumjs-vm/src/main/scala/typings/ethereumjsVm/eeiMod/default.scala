package typings.ethereumjsVm.eeiMod

import typings.bnJs.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-vm/dist/evm/eei", JSImport.Default)
@js.native
class default protected () extends EEI {
  def this(
    env: Env,
    state: typings.ethereumjsVm.promisifiedMod.default,
    evm: typings.ethereumjsVm.evmMod.default,
    common: typings.ethereumjsCommon.mod.default,
    gasLeft: ^
  ) = this()
}
