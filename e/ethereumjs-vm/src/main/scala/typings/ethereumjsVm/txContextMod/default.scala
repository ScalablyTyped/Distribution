package typings.ethereumjsVm.txContextMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-vm/dist/evm/txContext", JSImport.Default)
@js.native
class default protected () extends TxContext {
  def this(gasPrice: Buffer, origin: Buffer) = this()
}
