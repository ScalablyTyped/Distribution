package typings.feathersjsRestClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@feathersjs/rest-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Transport]
  @scala.inline
  def default(base: String): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(base.asInstanceOf[js.Any]).asInstanceOf[Transport]
  
  type Handler = js.Function2[
    /* connection */ js.Any, 
    /* options */ js.UndefOr[js.Any], 
    js.Function0[HandlerResult]
  ]
  
  @js.native
  trait HandlerResult
    extends js.Function {
    
    /**
      * initialize service
      */
    def apply(): Unit = js.native
    
    /**
      * Transport Service
      */
    var Service: js.Any = js.native
    
    /**
      * default Service
      */
    var service: js.Any = js.native
  }
  
  trait Transport extends StObject {
    
    def angular(connection: js.Any): js.Function0[HandlerResult]
    def angular(connection: js.Any, options: js.Any): js.Function0[HandlerResult]
    
    def angularHttpClient(connection: js.Any): js.Function0[HandlerResult]
    def angularHttpClient(connection: js.Any, options: js.Any): js.Function0[HandlerResult]
    @JSName("angularHttpClient")
    var angularHttpClient_Original: Handler
    
    @JSName("angular")
    var angular_Original: Handler
    
    def axios(connection: js.Any): js.Function0[HandlerResult]
    def axios(connection: js.Any, options: js.Any): js.Function0[HandlerResult]
    @JSName("axios")
    var axios_Original: Handler
    
    def fetch(connection: js.Any): js.Function0[HandlerResult]
    def fetch(connection: js.Any, options: js.Any): js.Function0[HandlerResult]
    @JSName("fetch")
    var fetch_Original: Handler
    
    def jquery(connection: js.Any): js.Function0[HandlerResult]
    def jquery(connection: js.Any, options: js.Any): js.Function0[HandlerResult]
    @JSName("jquery")
    var jquery_Original: Handler
    
    def request(connection: js.Any): js.Function0[HandlerResult]
    def request(connection: js.Any, options: js.Any): js.Function0[HandlerResult]
    @JSName("request")
    var request_Original: Handler
    
    def superagent(connection: js.Any): js.Function0[HandlerResult]
    def superagent(connection: js.Any, options: js.Any): js.Function0[HandlerResult]
    @JSName("superagent")
    var superagent_Original: Handler
  }
  object Transport {
    
    @scala.inline
    def apply(
      angular: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult],
      angularHttpClient: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult],
      axios: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult],
      fetch: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult],
      jquery: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult],
      request: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult],
      superagent: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult]
    ): Transport = {
      val __obj = js.Dynamic.literal(angular = js.Any.fromFunction2(angular), angularHttpClient = js.Any.fromFunction2(angularHttpClient), axios = js.Any.fromFunction2(axios), fetch = js.Any.fromFunction2(fetch), jquery = js.Any.fromFunction2(jquery), request = js.Any.fromFunction2(request), superagent = js.Any.fromFunction2(superagent))
      __obj.asInstanceOf[Transport]
    }
    
    @scala.inline
    implicit class TransportMutableBuilder[Self <: Transport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngular(value: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "angular", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAngularHttpClient(value: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "angularHttpClient", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAxios(value: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "axios", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFetch(value: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setJquery(value: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "jquery", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRequest(value: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuperagent(value: (/* connection */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "superagent", js.Any.fromFunction2(value))
    }
  }
}
