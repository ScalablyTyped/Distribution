package typings.ethers

import typings.ethers.distTypesUtilsTypesMod.EventType
import typings.ethers.distTypesUtilsTypesMod.Listener
import typings.ethers.distTypesUtilsTypesMod.MinimalProvider
import typings.ethers.distTypesUtilsTypesMod.Network
import typings.ethers.distTypesUtilsTypesMod.Networkish
import typings.ethers.distTypesUtilsTypesMod.Transaction
import typings.ethers.distTypesUtilsTypesMod.TransactionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/providers/provider", JSImport.Namespace)
@js.native
object distTypesProvidersProviderMod extends js.Object {
  @js.native
  class Provider protected () extends MinimalProvider {
    def this(network: js.Promise[Network]) = this()
    def this(network: Networkish) = this()
    var _addEventListener: js.Any = js.native
    var _balances: js.Any = js.native
    var _doPoll: js.Any = js.native
    var _emitted: js.Any = js.native
    var _events: js.Any = js.native
    var _getResolver: js.Any = js.native
    var _lastBlockNumber: js.Any = js.native
    var _network: js.Any = js.native
    var _poller: js.Any = js.native
    var _pollingInterval: js.Any = js.native
    var _resolveNames: js.Any = js.native
    val blockNumber: Double = js.native
    val network: Network = js.native
    var polling: Boolean = js.native
    var pollingInterval: Double = js.native
    /**
      *  ready
      *
      *  A Promise<Network> that resolves only once the provider is ready.
      *
      *  Sub-classes that call the super with a network without a chainId
      *  MUST set this. Standard named networks have a known chainId.
      *
      */
    var ready: js.Promise[Network] = js.native
    /* protected */ def _startPending(): Unit = js.native
    /* protected */ def _stopPending(): Unit = js.native
    def _wrapTransaction(tx: Transaction): TransactionResponse = js.native
    def _wrapTransaction(tx: Transaction, hash: String): TransactionResponse = js.native
    def addEventListener(eventName: EventType, listener: Listener): Provider = js.native
    def doPoll(): Unit = js.native
    def emit(eventName: EventType, args: js.Any*): Boolean = js.native
    def getEtherPrice(): js.Promise[Double] = js.native
    def perform(method: String, params: js.Any): js.Promise[_] = js.native
    def resetEventsBlock(blockNumber: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Provider extends js.Object {
    def checkTransactionResponse(transaction: js.Any): TransactionResponse = js.native
  }
  
}

