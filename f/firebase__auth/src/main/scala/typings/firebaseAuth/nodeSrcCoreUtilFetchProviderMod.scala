package typings.firebaseAuth

import typings.firebaseAuth.anon.FnCall
import typings.firebaseAuth.anon.TypeofResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeSrcCoreUtilFetchProviderMod {
  
  @JSImport("@firebase/auth/dist/node/src/core/util/fetch_provider", "FetchProvider")
  @js.native
  open class FetchProvider () extends StObject
  /* static members */
  object FetchProvider {
    
    @JSImport("@firebase/auth/dist/node/src/core/util/fetch_provider", "FetchProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fetch(): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")().asInstanceOf[FnCall]
    
    @JSImport("@firebase/auth/dist/node/src/core/util/fetch_provider", "FetchProvider.fetchImpl")
    @js.native
    def fetchImpl: Any = js.native
    inline def fetchImpl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fetchImpl")(x.asInstanceOf[js.Any])
    
    inline def headers(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("headers")().asInstanceOf[Any]
    
    @JSImport("@firebase/auth/dist/node/src/core/util/fetch_provider", "FetchProvider.headersImpl")
    @js.native
    def headersImpl: Any = js.native
    inline def headersImpl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headersImpl")(x.asInstanceOf[js.Any])
    
    inline def initialize(fetchImpl: FnCall): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(fetchImpl.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def initialize(
      fetchImpl: FnCall,
      headersImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Headers */ Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(fetchImpl.asInstanceOf[js.Any], headersImpl.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initialize(
      fetchImpl: FnCall,
      headersImpl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Headers */ Any,
      responseImpl: TypeofResponse
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(fetchImpl.asInstanceOf[js.Any], headersImpl.asInstanceOf[js.Any], responseImpl.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initialize(fetchImpl: FnCall, headersImpl: Unit, responseImpl: TypeofResponse): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(fetchImpl.asInstanceOf[js.Any], headersImpl.asInstanceOf[js.Any], responseImpl.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def response(): TypeofResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("response")().asInstanceOf[TypeofResponse]
    
    @JSImport("@firebase/auth/dist/node/src/core/util/fetch_provider", "FetchProvider.responseImpl")
    @js.native
    def responseImpl: Any = js.native
    inline def responseImpl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("responseImpl")(x.asInstanceOf[js.Any])
  }
}
