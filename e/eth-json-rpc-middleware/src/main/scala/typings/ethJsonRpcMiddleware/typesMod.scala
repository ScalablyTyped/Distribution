package typings.ethJsonRpcMiddleware

import typings.metamaskSafeEventEmitter.mod.default
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Block = Record[String, BlockData]
  
  type BlockCache = Record[String, Block]
  
  type BlockData = String | js.Array[String]
  
  type Cache = Record[Double, BlockCache]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<Array<string>> * / any */ trait JsonRpcRequestToCache extends StObject {
    
    var skipCache: Boolean
  }
  object JsonRpcRequestToCache {
    
    inline def apply(skipCache: Boolean): JsonRpcRequestToCache = {
      val __obj = js.Dynamic.literal(skipCache = skipCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRpcRequestToCache]
    }
    
    extension [Self <: JsonRpcRequestToCache](x: Self) {
      
      inline def setSkipCache(value: Boolean): Self = StObject.set(x, "skipCache", value.asInstanceOf[js.Any])
    }
  }
  
  type Payload = Partial[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<Array<any>> */ Any
  ]
  
  @js.native
  trait SafeEventEmitterProvider extends default {
    
    def send(
      req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<any> */ Any,
      callback: SendCallBack
    ): Unit = js.native
    
    def sendAsync[T, U](
      req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcRequest<T> */ Any,
      cb: SendAsyncCallBack[U]
    ): Unit = js.native
  }
  
  type SendAsyncCallBack[T] = js.Function2[
    /* err */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcResponse<T> */ /* providerRes */ Any, 
    Unit
  ]
  
  type SendCallBack = js.Function2[
    /* err */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcResponse<any> */ /* providerRes */ Any, 
    Unit
  ]
}
