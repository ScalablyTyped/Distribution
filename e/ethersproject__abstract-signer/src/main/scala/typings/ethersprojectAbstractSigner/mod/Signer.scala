package typings.ethersprojectAbstractSigner.mod

import typings.ethersprojectAbstractProvider.mod.BlockTag
import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.ethersprojectAbstractSigner.anon.DeferrableTransactionRequ
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectBytes.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abstract-signer", "Signer")
@js.native
abstract class Signer () extends js.Object {
  
  def _checkProvider(): Unit = js.native
  def _checkProvider(operation: String): Unit = js.native
  
  val _isSigner: Boolean = js.native
  
  def call(transaction: DeferrableTransactionRequ): js.Promise[String] = js.native
  def call(transaction: DeferrableTransactionRequ, blockTag: BlockTag): js.Promise[String] = js.native
  
  def checkTransaction(transaction: DeferrableTransactionRequ): DeferrableTransactionRequ = js.native
  
  def connect(provider: Provider): Signer = js.native
  
  def estimateGas(transaction: DeferrableTransactionRequ): js.Promise[BigNumber] = js.native
  
  def getAddress(): js.Promise[String] = js.native
  
  def getBalance(): js.Promise[BigNumber] = js.native
  def getBalance(blockTag: BlockTag): js.Promise[BigNumber] = js.native
  
  def getChainId(): js.Promise[Double] = js.native
  
  def getGasPrice(): js.Promise[BigNumber] = js.native
  
  def getTransactionCount(): js.Promise[Double] = js.native
  def getTransactionCount(blockTag: BlockTag): js.Promise[Double] = js.native
  
  def populateTransaction(transaction: DeferrableTransactionRequ): js.Promise[TransactionRequest] = js.native
  
  val provider: js.UndefOr[Provider] = js.native
  
  def resolveName(name: String): js.Promise[String] = js.native
  
  def sendTransaction(transaction: DeferrableTransactionRequ): js.Promise[TransactionResponse] = js.native
  
  def signMessage(message: String): js.Promise[String] = js.native
  def signMessage(message: Bytes): js.Promise[String] = js.native
  
  def signTransaction(transaction: DeferrableTransactionRequ): js.Promise[String] = js.native
}
/* static members */
@JSImport("@ethersproject/abstract-signer", "Signer")
@js.native
object Signer extends js.Object {
  
  def isSigner(value: js.Any): /* is @ethersproject/abstract-signer.@ethersproject/abstract-signer.Signer */ Boolean = js.native
}
