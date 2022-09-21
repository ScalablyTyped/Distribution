package typings.ethJsonRpcMiddleware

import typings.ethJsonRpcMiddleware.anon.SuppressUnauthorized
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walletMod {
  
  @JSImport("eth-json-rpc-middleware/dist/wallet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWalletMiddleware(
    hasGetAccountsProcessDecryptMessageProcessEncryptionPublicKeyProcessEthSignMessageProcessPersonalMessageProcessTransactionProcessSignTransactionProcessTypedMessageProcessTypedMessageV3ProcessTypedMessageV4: WalletMiddlewareOptions
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createWalletMiddleware")(hasGetAccountsProcessDecryptMessageProcessEncryptionPublicKeyProcessEthSignMessageProcessPersonalMessageProcessTransactionProcessSignTransactionProcessTypedMessageProcessTypedMessageV3ProcessTypedMessageV4.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait MessageParams
    extends StObject
       with TransactionParams {
    
    var data: String
  }
  object MessageParams {
    
    inline def apply(data: String, from: String): MessageParams = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageParams]
    }
    
    extension [Self <: MessageParams](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransactionParams extends StObject {
    
    var from: String
  }
  object TransactionParams {
    
    inline def apply(from: String): TransactionParams = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionParams]
    }
    
    extension [Self <: TransactionParams](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypedMessageParams
    extends StObject
       with MessageParams {
    
    var version: String
  }
  object TypedMessageParams {
    
    inline def apply(data: String, from: String, version: String): TypedMessageParams = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypedMessageParams]
    }
    
    extension [Self <: TypedMessageParams](x: Self) {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WalletMiddlewareOptions extends StObject {
    
    def getAccounts(
      req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<unknown> */ Any
    ): js.Promise[js.Array[String]] = js.native
    def getAccounts(
      req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<unknown> */ Any,
      options: SuppressUnauthorized
    ): js.Promise[js.Array[String]] = js.native
    
    var processDecryptMessage: js.UndefOr[
        js.Function2[
          /* msgParams */ MessageParams, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<unknown> */ /* req */ Any, 
          js.Promise[Record[String, Any]]
        ]
      ] = js.native
    
    var processEncryptionPublicKey: js.UndefOr[
        js.Function2[
          /* address */ String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<unknown> */ /* req */ Any, 
          js.Promise[Record[String, Any]]
        ]
      ] = js.native
    
    var processEthSignMessage: js.UndefOr[
        js.Function2[
          /* msgParams */ MessageParams, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<unknown> */ /* req */ Any, 
          js.Promise[Record[String, Any]]
        ]
      ] = js.native
    
    var processPersonalMessage: js.UndefOr[
        js.Function2[
          /* msgParams */ MessageParams, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<unknown> */ /* req */ Any, 
          js.Promise[String]
        ]
      ] = js.native
    
    var processSignTransaction: js.UndefOr[
        js.Function2[
          /* txParams */ TransactionParams, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<unknown> */ /* req */ Any, 
          js.Promise[String]
        ]
      ] = js.native
    
    var processTransaction: js.UndefOr[
        js.Function2[
          /* txParams */ TransactionParams, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<unknown> */ /* req */ Any, 
          js.Promise[String]
        ]
      ] = js.native
    
    var processTypedMessage: js.UndefOr[
        js.Function3[
          /* msgParams */ MessageParams, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<unknown> */ /* req */ Any, 
          /* version */ String, 
          js.Promise[String]
        ]
      ] = js.native
    
    var processTypedMessageV3: js.UndefOr[
        js.Function3[
          /* msgParams */ TypedMessageParams, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<unknown> */ /* req */ Any, 
          /* version */ String, 
          js.Promise[Record[String, Any]]
        ]
      ] = js.native
    
    var processTypedMessageV4: js.UndefOr[
        js.Function3[
          /* msgParams */ TypedMessageParams, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<unknown> */ /* req */ Any, 
          /* version */ String, 
          js.Promise[Record[String, Any]]
        ]
      ] = js.native
  }
}
