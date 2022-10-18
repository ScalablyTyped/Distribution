package typings.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibConnectorsHttpMod {
  
  @JSImport("elasticsearch/src/lib/connectors/http", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with HttpConnector {
    def this(host: Any, config: Any) = this()
    
    // onStatusSet(handler: (status: any) => void): void;
    /* CompleteClass */
    override def createAgent(config: Any): Any = js.native
    
    /* CompleteClass */
    override def makeAgentConfig(config: Any): Any = js.native
    
    /* CompleteClass */
    override def makeReqParams(params: Any): Any = js.native
    
    /* CompleteClass */
    override def request(
      params: Any,
      callback: js.Function4[/* error */ Any, /* response */ Any, /* status */ Any, /* headers */ Any, Unit]
    ): Unit = js.native
  }
  
  trait HttpConnector extends StObject {
    
    // onStatusSet(handler: (status: any) => void): void;
    def createAgent(config: Any): Any
    
    def makeAgentConfig(config: Any): Any
    
    def makeReqParams(params: Any): Any
    
    def request(
      params: Any,
      callback: js.Function4[/* error */ Any, /* response */ Any, /* status */ Any, /* headers */ Any, Unit]
    ): Unit
  }
  object HttpConnector {
    
    inline def apply(
      createAgent: Any => Any,
      makeAgentConfig: Any => Any,
      makeReqParams: Any => Any,
      request: (Any, js.Function4[/* error */ Any, /* response */ Any, /* status */ Any, /* headers */ Any, Unit]) => Unit
    ): HttpConnector = {
      val __obj = js.Dynamic.literal(createAgent = js.Any.fromFunction1(createAgent), makeAgentConfig = js.Any.fromFunction1(makeAgentConfig), makeReqParams = js.Any.fromFunction1(makeReqParams), request = js.Any.fromFunction2(request))
      __obj.asInstanceOf[HttpConnector]
    }
    
    extension [Self <: HttpConnector](x: Self) {
      
      inline def setCreateAgent(value: Any => Any): Self = StObject.set(x, "createAgent", js.Any.fromFunction1(value))
      
      inline def setMakeAgentConfig(value: Any => Any): Self = StObject.set(x, "makeAgentConfig", js.Any.fromFunction1(value))
      
      inline def setMakeReqParams(value: Any => Any): Self = StObject.set(x, "makeReqParams", js.Any.fromFunction1(value))
      
      inline def setRequest(
        value: (Any, js.Function4[/* error */ Any, /* response */ Any, /* status */ Any, /* headers */ Any, Unit]) => Unit
      ): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
    }
  }
}
