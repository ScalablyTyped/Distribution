package typings.ethersprojectContracts.mod

import typings.ethersprojectAbi.abstractCoderMod.Result
import typings.ethersprojectAbstractProvider.mod.Block
import typings.ethersprojectAbstractProvider.mod.Log
import typings.ethersprojectAbstractProvider.mod.TransactionReceipt
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends Log {
  
  var args: js.UndefOr[Result] = js.native
  
  var decode: js.UndefOr[js.Function2[/* data */ String, /* topics */ js.UndefOr[js.Array[String]], _]] = js.native
  
  var decodeError: js.UndefOr[Error] = js.native
  
  var event: js.UndefOr[String] = js.native
  
  var eventSignature: js.UndefOr[String] = js.native
  
  def getBlock(): js.Promise[Block] = js.native
  
  def getTransaction(): js.Promise[TransactionResponse] = js.native
  
  def getTransactionReceipt(): js.Promise[TransactionReceipt] = js.native
  
  def removeListener(): Unit = js.native
}
object Event {
  
  @scala.inline
  def apply(
    address: String,
    blockHash: String,
    blockNumber: Double,
    data: String,
    getBlock: () => js.Promise[Block],
    getTransaction: () => js.Promise[TransactionResponse],
    getTransactionReceipt: () => js.Promise[TransactionReceipt],
    logIndex: Double,
    removeListener: () => Unit,
    removed: Boolean,
    topics: js.Array[String],
    transactionHash: String,
    transactionIndex: Double
  ): Event = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getBlock = js.Any.fromFunction0(getBlock), getTransaction = js.Any.fromFunction0(getTransaction), getTransactionReceipt = js.Any.fromFunction0(getTransactionReceipt), logIndex = logIndex.asInstanceOf[js.Any], removeListener = js.Any.fromFunction0(removeListener), removed = removed.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetBlock(value: () => js.Promise[Block]): Self = this.set("getBlock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTransaction(value: () => js.Promise[TransactionResponse]): Self = this.set("getTransaction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTransactionReceipt(value: () => js.Promise[TransactionReceipt]): Self = this.set("getTransactionReceipt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveListener(value: () => Unit): Self = this.set("removeListener", js.Any.fromFunction0(value))
    
    @scala.inline
    def setArgs(value: Result): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setDecode(value: (/* data */ String, /* topics */ js.UndefOr[js.Array[String]]) => _): Self = this.set("decode", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDecode: Self = this.set("decode", js.undefined)
    
    @scala.inline
    def setDecodeError(value: Error): Self = this.set("decodeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeError: Self = this.set("decodeError", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setEventSignature(value: String): Self = this.set("eventSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSignature: Self = this.set("eventSignature", js.undefined)
  }
}
