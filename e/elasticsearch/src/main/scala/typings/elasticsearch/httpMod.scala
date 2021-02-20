package typings.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("elasticsearch/src/lib/connectors/http", JSImport.Namespace)
  @js.native
  class ^ protected () extends HttpConnector {
    def this(host: js.Any, config: js.Any) = this()
  }
  
  @js.native
  trait HttpConnector extends StObject {
    
    // onStatusSet(handler: (status: any) => void): void;
    def createAgent(config: js.Any): js.Any = js.native
    
    def makeAgentConfig(config: js.Any): js.Any = js.native
    
    def makeReqParams(params: js.Any): js.Any = js.native
    
    def request(
      params: js.Any,
      callback: js.Function4[
          /* error */ js.Any, 
          /* response */ js.Any, 
          /* status */ js.Any, 
          /* headers */ js.Any, 
          Unit
        ]
    ): Unit = js.native
  }
  object HttpConnector {
    
    @scala.inline
    def apply(
      createAgent: js.Any => js.Any,
      makeAgentConfig: js.Any => js.Any,
      makeReqParams: js.Any => js.Any,
      request: (js.Any, js.Function4[
          /* error */ js.Any, 
          /* response */ js.Any, 
          /* status */ js.Any, 
          /* headers */ js.Any, 
          Unit
        ]) => Unit
    ): HttpConnector = {
      val __obj = js.Dynamic.literal(createAgent = js.Any.fromFunction1(createAgent), makeAgentConfig = js.Any.fromFunction1(makeAgentConfig), makeReqParams = js.Any.fromFunction1(makeReqParams), request = js.Any.fromFunction2(request))
      __obj.asInstanceOf[HttpConnector]
    }
    
    @scala.inline
    implicit class HttpConnectorMutableBuilder[Self <: HttpConnector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateAgent(value: js.Any => js.Any): Self = StObject.set(x, "createAgent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMakeAgentConfig(value: js.Any => js.Any): Self = StObject.set(x, "makeAgentConfig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMakeReqParams(value: js.Any => js.Any): Self = StObject.set(x, "makeReqParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequest(
        value: (js.Any, js.Function4[
              /* error */ js.Any, 
              /* response */ js.Any, 
              /* status */ js.Any, 
              /* headers */ js.Any, 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
    }
  }
}
