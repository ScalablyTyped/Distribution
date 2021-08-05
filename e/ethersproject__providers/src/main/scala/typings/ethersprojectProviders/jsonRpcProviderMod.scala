package typings.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.ethersprojectAbstractSigner.mod.Signer
import typings.ethersprojectAbstractSigner.mod.TypedDataDomain
import typings.ethersprojectAbstractSigner.mod.TypedDataField
import typings.ethersprojectAbstractSigner.mod.TypedDataSigner
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.anon.DeferrableTransactionRequ
import typings.ethersprojectProviders.baseProviderMod.BaseProvider
import typings.ethersprojectWeb.mod.ConnectionInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonRpcProviderMod {
  
  @JSImport("@ethersproject/providers/lib/json-rpc-provider", "JsonRpcProvider")
  @js.native
  class JsonRpcProvider () extends BaseProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: Unit, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
    
    var _nextId: Double = js.native
    
    var _pendingFilter: js.Promise[Double] = js.native
    
    def _startPending(): Unit = js.native
    
    val connection: ConnectionInfo = js.native
    
    def getSigner(): JsonRpcSigner = js.native
    def getSigner(addressOrIndex: String): JsonRpcSigner = js.native
    def getSigner(addressOrIndex: Double): JsonRpcSigner = js.native
    
    def getUncheckedSigner(): UncheckedJsonRpcSigner = js.native
    def getUncheckedSigner(addressOrIndex: String): UncheckedJsonRpcSigner = js.native
    def getUncheckedSigner(addressOrIndex: Double): UncheckedJsonRpcSigner = js.native
    
    def listAccounts(): js.Promise[js.Array[String]] = js.native
    
    def prepareRequest(method: String, params: js.Any): js.Tuple2[String, js.Array[js.Any]] = js.native
    
    def send(method: String, params: js.Array[js.Any]): js.Promise[js.Any] = js.native
  }
  /* static members */
  object JsonRpcProvider {
    
    @JSImport("@ethersproject/providers/lib/json-rpc-provider", "JsonRpcProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUrl")().asInstanceOf[String]
    
    inline def hexlifyTransaction(transaction: TransactionRequest): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlifyTransaction")(transaction.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
    inline def hexlifyTransaction(transaction: TransactionRequest, allowExtra: StringDictionary[Boolean]): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlifyTransaction")(transaction.asInstanceOf[js.Any], allowExtra.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  }
  
  @JSImport("@ethersproject/providers/lib/json-rpc-provider", "JsonRpcSigner")
  @js.native
  class JsonRpcSigner protected ()
    extends Signer
       with TypedDataSigner {
    def this(constructorGuard: js.Any, provider: JsonRpcProvider) = this()
    def this(constructorGuard: js.Any, provider: JsonRpcProvider, addressOrIndex: String) = this()
    def this(constructorGuard: js.Any, provider: JsonRpcProvider, addressOrIndex: Double) = this()
    
    var _address: String = js.native
    
    var _index: Double = js.native
    
    /* CompleteClass */
    override def _signTypedData(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, js.Any]
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
