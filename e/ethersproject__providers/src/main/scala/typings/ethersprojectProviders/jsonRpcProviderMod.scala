package typings.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.ethersprojectAbstractSigner.mod.Signer
import typings.ethersprojectAbstractSigner.mod.TypedDataDomain
import typings.ethersprojectAbstractSigner.mod.TypedDataField
import typings.ethersprojectAbstractSigner.mod.TypedDataSigner
import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.anon.DeferrableTransactionRequ
import typings.ethersprojectProviders.baseProviderMod.BaseProvider
import typings.ethersprojectTransactions.mod.AccessList
import typings.ethersprojectWeb.mod.ConnectionInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonRpcProviderMod {
  
  @JSImport("@ethersproject/providers/lib/json-rpc-provider", "JsonRpcProvider")
  @js.native
  open class JsonRpcProvider () extends BaseProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: Unit, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
    
    def _cache: Record[String, js.Promise[Any]] = js.native
    
    var _eventLoopCache: Record[String, js.Promise[Any]] = js.native
    
    var _nextId: Double = js.native
    
    var _pendingFilter: js.Promise[Double] = js.native
    
    def _startPending(): Unit = js.native
    
    def _uncachedDetectNetwork(): js.Promise[Network] = js.native
    
    val connection: ConnectionInfo = js.native
    
    def getSigner(): JsonRpcSigner = js.native
    def getSigner(addressOrIndex: String): JsonRpcSigner = js.native
    def getSigner(addressOrIndex: Double): JsonRpcSigner = js.native
    
    def getUncheckedSigner(): UncheckedJsonRpcSigner = js.native
    def getUncheckedSigner(addressOrIndex: String): UncheckedJsonRpcSigner = js.native
    def getUncheckedSigner(addressOrIndex: Double): UncheckedJsonRpcSigner = js.native
    
    def listAccounts(): js.Promise[js.Array[String]] = js.native
    
    def prepareRequest(method: String, params: Any): js.Tuple2[String, js.Array[Any]] = js.native
    
    def send(method: String, params: js.Array[Any]): js.Promise[Any] = js.native
  }
  /* static members */
  object JsonRpcProvider {
    
    @JSImport("@ethersproject/providers/lib/json-rpc-provider", "JsonRpcProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUrl")().asInstanceOf[String]
    
    inline def hexlifyTransaction(transaction: TransactionRequest): StringDictionary[String | AccessList] = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlifyTransaction")(transaction.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String | AccessList]]
    inline def hexlifyTransaction(transaction: TransactionRequest, allowExtra: StringDictionary[Boolean]): StringDictionary[String | AccessList] = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlifyTransaction")(transaction.asInstanceOf[js.Any], allowExtra.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String | AccessList]]
  }
  
  @JSImport("@ethersproject/providers/lib/json-rpc-provider", "JsonRpcSigner")
  @js.native
  open class JsonRpcSigner protected ()
    extends Signer
       with TypedDataSigner {
    def this(constructorGuard: Any, provider: JsonRpcProvider) = this()
    def this(constructorGuard: Any, provider: JsonRpcProvider, addressOrIndex: String) = this()
    def this(constructorGuard: Any, provider: JsonRpcProvider, addressOrIndex: Double) = this()
    
    var _address: String = js.native
    
    var _index: Double = js.native
    
    def _legacySignMessage(message: String): js.Promise[String] = js.native
    def _legacySignMessage(message: Bytes): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def _signTypedData(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): js.Promise[String] = js.native
    
    def connectUnchecked(): JsonRpcSigner = js.native
    
    @JSName("provider")
    val provider_JsonRpcSigner: JsonRpcProvider = js.native
    
    def sendTransaction(transaction: DeferrableTransactionRequ): js.Promise[TransactionResponse] = js.native
    
    def sendUncheckedTransaction(transaction: DeferrableTransactionRequ): js.Promise[String] = js.native
    
    def signTransaction(transaction: DeferrableTransactionRequ): js.Promise[String] = js.native
    
    def unlock(password: String): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait UncheckedJsonRpcSigner extends JsonRpcSigner
}
