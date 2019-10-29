package typings.ethers

import typings.ethers.distTypesUtilsTypesMod.Arrayish
import typings.ethers.distTypesUtilsTypesMod.Signature
import typings.ethers.distTypesUtilsTypesMod.Transaction
import typings.ethers.distTypesUtilsTypesMod.UnsignedTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/transaction", JSImport.Namespace)
@js.native
object distTypesUtilsTransactionMod extends js.Object {
  def parse(rawTransaction: Arrayish): Transaction = js.native
  def serialize(transaction: UnsignedTransaction): String = js.native
  def serialize(transaction: UnsignedTransaction, signature: Arrayish): String = js.native
  def serialize(transaction: UnsignedTransaction, signature: Signature): String = js.native
}

