package typings.ethers

import typings.ethers.typesAddressMod.Addressable
import typings.ethers.typesAddressMod.NameResolver
import typings.ethers.typesHashTypedDataMod.TypedDataDomain
import typings.ethers.typesHashTypedDataMod.TypedDataField
import typings.ethers.typesProvidersContractsMod.ContractRunner
import typings.ethers.typesProvidersProviderMod.BlockTag
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import typings.ethers.typesProvidersProviderMod.TransactionResponse
import typings.ethers.typesTransactionTransactionMod.TransactionLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersSignerMod {
  
  @js.native
  trait Signer
    extends StObject
       with Addressable
       with ContractRunner
       with NameResolver {
    
    /**
      *  Evaluates the //tx// by running it against the current Blockchain state. This
      *  cannot change state and has no cost in ether, as it is effectively simulating
      *  execution.
      *
      *  This can be used to have the Blockchain perform computations based on its state
      *  (e.g. running a Contract's getters) or to simulate the effect of a transaction
      *  before actually performing an operation.
      */
    @JSName("call")
    def call_MSigner(tx: TransactionRequest): js.Promise[String] = js.native
    
    /**
      *  Returns a new instance of this Signer connected to //provider// or detached
      *  from any Provider if null.
      */
    def connect(): Signer = js.native
    def connect(provider: Provider): Signer = js.native
    
    /**
      *  Estimates the required gas required to execute //tx// on the Blockchain. This
      *  will be the expected amount a transaction will require as its ``gasLimit``
      *  to successfully run all the necessary computations and store the needed state
      *  that the transaction intends.
      *
      *  Keep in mind that this is **best efforts**, since the state of the Blockchain
      *  is in flux, which could affect transaction gas requirements.
      *
      *  @throws UNPREDICTABLE_GAS_LIMIT A transaction that is believed by the node to likely
      *          fail will throw an error during gas estimation. This could indicate that it
      *          will actually fail or that the circumstances are simply too complex for the
      *          node to take into account. In these cases, a manually determined ``gasLimit``
      *          will need to be made.
      */
    @JSName("estimateGas")
    def estimateGas_MSigner(tx: TransactionRequest): js.Promise[js.BigInt] = js.native
    
    /**
      *  Gets the next nonce required for this Signer to send a transaction.
      *
      *  @param blockTag - The blocktag to base the transaction count on, keep in mind
      *         many nodes do not honour this value and silently ignore it [default: ``"latest"``]
      */
    def getNonce(): js.Promise[Double] = js.native
    def getNonce(blockTag: BlockTag): js.Promise[Double] = js.native
    
    /**
      *  Prepares a {@link TransactionRequest} for calling:
      *  - resolves ``to`` and ``from`` addresses
      *  - if ``from`` is specified , check that it matches this Signer
      *
      *  @param tx - The call to prepare
      */
    def populateCall(tx: TransactionRequest): js.Promise[TransactionLike[String]] = js.native
    
    /**
      *  Prepares a {@link TransactionRequest} for sending to the network by
      *  populating any missing properties:
      *  - resolves ``to`` and ``from`` addresses
      *  - if ``from`` is specified , check that it matches this Signer
      *  - populates ``nonce`` via ``signer.getNonce("pending")``
      *  - populates ``gasLimit`` via ``signer.estimateGas(tx)``
      *  - populates ``chainId`` via ``signer.provider.getNetwork()``
      *  - populates ``type`` and relevant fee data for that type (``gasPrice``
      *    for legacy transactions, ``maxFeePerGas`` for EIP-1559, etc)
      *
      *  @note Some Signer implementations may skip populating properties that
      *        are populated downstream; for example JsonRpcSigner defers to the
      *        node to populate the nonce and fee data.
      *
      *  @param tx - The call to prepare
      */
    def populateTransaction(tx: TransactionRequest): js.Promise[TransactionLike[String]] = js.native
    
    /**
      *  Resolves an ENS Name to an address.
      */
    @JSName("resolveName")
    def resolveName_MSigner(name: String): js.Promise[Null | String] = js.native
    
    /**
      *  Sends %%tx%% to the Network. The ``signer.populateTransaction(tx)``
      *  is called first to ensure all necessary properties for the
      *  transaction to be valid have been popualted first.
      */
    @JSName("sendTransaction")
    def sendTransaction_MSigner(tx: TransactionRequest): js.Promise[TransactionResponse] = js.native
    
    /**
      *  Signers an [[link-eip-191]] prefixed personal message.
      *
      *  If the %%message%% is a string, it is signed as UTF-8 encoded bytes. It is **not**
      *  interpretted as a [[BytesLike]]; so the string ``"0x1234"`` is signed as six
      *  characters, **not** two bytes.
      *
      *  To sign that example as two bytes, the Uint8Array should be used
      *  (i.e. ``new Uint8Array([ 0x12, 0x34 ])``).
      */
    def signMessage(message: String): js.Promise[String] = js.native
    def signMessage(message: js.typedarray.Uint8Array): js.Promise[String] = js.native
    
    /**
      *  Signs %%tx%%, returning the fully signed transaction. This does not
      *  populate any additional properties within the transaction.
      */
    def signTransaction(tx: TransactionRequest): js.Promise[String] = js.native
    
    /**
      *  Signs the [[link-eip-712]] typed data.
      */
    def signTypedData(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): js.Promise[String] = js.native
  }
}
