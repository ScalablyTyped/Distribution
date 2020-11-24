package typings.ethereumjsVm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-vm", JSImport.Default)
@js.native
/**
  * Instantiates a new [[VM]] Object.
  * @param opts - Default values for the options are:
  *  - `chain`: 'mainnet'
  *  - `hardfork`: 'petersburg' [supported: 'byzantium', 'constantinople', 'petersburg', 'istanbul' (DRAFT) (will throw on unsupported)]
  *  - `activatePrecompiles`: false
  *  - `allowUnlimitedContractSize`: false [ONLY set to `true` during debugging]
  */
class default () extends VM {
  def this(opts: VMOpts) = this()
}
