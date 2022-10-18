package typings.firebaseAuth

import typings.firebaseAuth.anon.FnCall
import typings.std.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmTestHelpersMockFetchMod {
  
  @JSImport("@firebase/auth/dist/node-esm/test/helpers/mock_fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mock(url: String, response: js.Object): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("mock")(url.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Route]
  inline def mock(url: String, response: js.Object, status: Double): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("mock")(url.asInstanceOf[js.Any], response.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Route]
  
  inline def setUp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUp")().asInstanceOf[Unit]
  
  inline def setUpWithOverride(fetchOverride: FnCall): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpWithOverride")(fetchOverride.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def tearDown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tearDown")().asInstanceOf[Unit]
  
  trait Call extends StObject {
    
    var headers: Headers
    
    var method: js.UndefOr[String] = js.undefined
    
    var request: js.UndefOr[js.Object | String] = js.undefined
  }
  object Call {
    
    inline def apply(headers: Headers): Call = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Call]
    }
    
    extension [Self <: Call](x: Self) {
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRequest(value: js.Object | String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
  
  trait Route extends StObject {
    
    var calls: js.Array[Call]
    
    var response: js.Object
    
    var status: Double
  }
  object Route {
    
    inline def apply(calls: js.Array[Call], response: js.Object, status: Double): Route = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    extension [Self <: Route](x: Self) {
      
      inline def setCalls(value: js.Array[Call]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      inline def setCallsVarargs(value: Call*): Self = StObject.set(x, "calls", js.Array(value*))
      
      inline def setResponse(value: js.Object): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
