package typings.entropyWinstonElasticsearchApm

import typings.elasticApmNode.mod.Agent
import typings.winstonTransport.mod.TransportStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@entropy/winston-elasticsearch-apm", JSImport.Namespace)
  @js.native
  class ^ protected () extends ElasticsearchApm {
    def this(opts: ElasticsearchApmOptions) = this()
  }
  
  @js.native
  trait ElasticsearchApm
    extends typings.winstonTransport.mod.^ {
    
    @JSName("log")
    def log_MElasticsearchApm(info: js.Any, next: js.Function0[Unit]): js.Any = js.native
  }
  
  trait ElasticsearchApmOptions
    extends StObject
       with TransportStreamOptions {
    
    var apm: Agent
  }
  object ElasticsearchApmOptions {
    
    @scala.inline
    def apply(apm: Agent): ElasticsearchApmOptions = {
      val __obj = js.Dynamic.literal(apm = apm.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElasticsearchApmOptions]
    }
    
    @scala.inline
    implicit class ElasticsearchApmOptionsMutableBuilder[Self <: ElasticsearchApmOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApm(value: Agent): Self = StObject.set(x, "apm", value.asInstanceOf[js.Any])
    }
  }
}
