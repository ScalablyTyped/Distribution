package typings.ethers.ethersMod.utils

import typings.ethersprojectBytes.mod.SignatureLike
import typings.ethersprojectTransactions.mod.UnsignedTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "utils.serializeTransaction")
@js.native
object serializeTransaction extends js.Object {
  
  def apply(transaction: UnsignedTransaction): String = js.native
  def apply(transaction: UnsignedTransaction, signature: SignatureLike): String = js.native
}
