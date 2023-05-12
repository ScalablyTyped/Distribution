package typings.ethers

import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import typings.ethers.typesProvidersProviderMod.TransactionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersContractsMod {
  
  trait ContractRunner extends StObject {
    
    var call: js.UndefOr[js.Function1[/* tx */ TransactionRequest, js.Promise[String]]] = js.undefined
    
    var estimateGas: js.UndefOr[js.Function1[/* tx */ TransactionRequest, js.Promise[js.BigInt]]] = js.undefined
    
    var provider: Null | Provider
    
    var resolveName: js.UndefOr[js.Function1[/* name */ String, js.Promise[Null | String]]] = js.undefined
    
    var sendTransaction: js.UndefOr[js.Function1[/* tx */ TransactionRequest, js.Promise[TransactionResponse]]] = js.undefined
  }
  object ContractRunner {
    
    inline def apply(): ContractRunner = {
      val __obj = js.Dynamic.literal(provider = null)
      __obj.asInstanceOf[ContractRunner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContractRunner] (val x: Self) extends AnyVal {
      
      inline def setCall(value: /* tx */ TransactionRequest => js.Promise[String]): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
      
      inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
      
      inline def setEstimateGas(value: /* tx */ TransactionRequest => js.Promise[js.BigInt]): Self = StObject.set(x, "estimateGas", js.Any.fromFunction1(value))
      
      inline def setEstimateGasUndefined: Self = StObject.set(x, "estimateGas", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderNull: Self = StObject.set(x, "provider", null)
      
      inline def setResolveName(value: /* name */ String => js.Promise[Null | String]): Self = StObject.set(x, "resolveName", js.Any.fromFunction1(value))
      
      inline def setResolveNameUndefined: Self = StObject.set(x, "resolveName", js.undefined)
      
      inline def setSendTransaction(value: /* tx */ TransactionRequest => js.Promise[TransactionResponse]): Self = StObject.set(x, "sendTransaction", js.Any.fromFunction1(value))
      
      inline def setSendTransactionUndefined: Self = StObject.set(x, "sendTransaction", js.undefined)
    }
  }
}
