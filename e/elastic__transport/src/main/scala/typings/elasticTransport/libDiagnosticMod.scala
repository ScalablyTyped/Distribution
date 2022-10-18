package typings.elasticTransport

import typings.elasticTransport.elasticTransportStrings.deserialization
import typings.elasticTransport.elasticTransportStrings.request
import typings.elasticTransport.elasticTransportStrings.response
import typings.elasticTransport.elasticTransportStrings.resurrect
import typings.elasticTransport.elasticTransportStrings.serialization
import typings.elasticTransport.elasticTransportStrings.sniff
import typings.elasticTransport.libConnectionBaseConnectionMod.ConnectionRequestOptions
import typings.elasticTransport.libErrorsMod.ElasticsearchClientError
import typings.elasticTransport.libPoolClusterConnectionPoolMod.ResurrectEvent
import typings.elasticTransport.libTypesMod.DiagnosticResult
import typings.elasticTransport.libTypesMod.DiagnosticResultResponse
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDiagnosticMod {
  
  @JSImport("@elastic/transport/lib/Diagnostic", JSImport.Default)
  @js.native
  open class default () extends Diagnostic
  
  @js.native
  sealed trait events extends StObject
  @JSImport("@elastic/transport/lib/Diagnostic", "events")
  @js.native
  object events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[events & String] = js.native
    
    @js.native
    sealed trait DESERIALIZATION
      extends StObject
         with events
    /* "deserialization" */ val DESERIALIZATION: typings.elasticTransport.libDiagnosticMod.events.DESERIALIZATION & String = js.native
    
    @js.native
    sealed trait REQUEST
      extends StObject
         with events
    /* "request" */ val REQUEST: typings.elasticTransport.libDiagnosticMod.events.REQUEST & String = js.native
    
    @js.native
    sealed trait RESPONSE
      extends StObject
         with events
    /* "response" */ val RESPONSE: typings.elasticTransport.libDiagnosticMod.events.RESPONSE & String = js.native
    
    @js.native
    sealed trait RESURRECT
      extends StObject
         with events
    /* "resurrect" */ val RESURRECT: typings.elasticTransport.libDiagnosticMod.events.RESURRECT & String = js.native
    
    @js.native
    sealed trait SERIALIZATION
      extends StObject
         with events
    /* "serialization" */ val SERIALIZATION: typings.elasticTransport.libDiagnosticMod.events.SERIALIZATION & String = js.native
    
    @js.native
    sealed trait SNIFF
      extends StObject
         with events
    /* "sniff" */ val SNIFF: typings.elasticTransport.libDiagnosticMod.events.SNIFF & String = js.native
  }
  
  @js.native
  trait Diagnostic extends EventEmitter {
    
    def off(event: String, listener: DiagnosticListener): this.type = js.native
    
    @JSName("on")
    def on_deserialization(event: deserialization, listener: DiagnosticListenerLight): this.type = js.native
    @JSName("on")
    def on_request(event: request, listener: DiagnosticListenerFull): this.type = js.native
    @JSName("on")
    def on_response(event: response, listener: DiagnosticListenerFullResponse): this.type = js.native
    @JSName("on")
    def on_resurrect(event: resurrect, listener: DiagnosticListenerResurrect): this.type = js.native
    @JSName("on")
    def on_serialization(event: serialization, listener: DiagnosticListenerFull): this.type = js.native
    @JSName("on")
    def on_sniff(event: sniff, listener: DiagnosticListenerFull): this.type = js.native
    
    @JSName("once")
    def once_deserialization(event: deserialization, listener: DiagnosticListenerLight): this.type = js.native
    @JSName("once")
    def once_request(event: request, listener: DiagnosticListenerFull): this.type = js.native
    @JSName("once")
    def once_response(event: response, listener: DiagnosticListenerFullResponse): this.type = js.native
    @JSName("once")
    def once_resurrect(event: resurrect, listener: DiagnosticListenerResurrect): this.type = js.native
    @JSName("once")
    def once_serialization(event: serialization, listener: DiagnosticListenerFull): this.type = js.native
    @JSName("once")
    def once_sniff(event: sniff, listener: DiagnosticListenerFull): this.type = js.native
  }
  
  type DiagnosticListener = js.Function2[/* err */ ElasticsearchClientError | Null, /* meta */ Any | Null, Unit]
  
  type DiagnosticListenerFull = js.Function2[
    /* err */ ElasticsearchClientError | Null, 
    /* meta */ (DiagnosticResult[Any, Any]) | Null, 
    Unit
  ]
  
  type DiagnosticListenerFullResponse = js.Function2[
    /* err */ ElasticsearchClientError | Null, 
    /* meta */ (DiagnosticResultResponse[Any, Any]) | Null, 
    Unit
  ]
  
  type DiagnosticListenerLight = js.Function2[
    /* err */ ElasticsearchClientError | Null, 
    /* meta */ ConnectionRequestOptions | Null, 
    Unit
  ]
  
  type DiagnosticListenerResurrect = js.Function2[/* err */ ElasticsearchClientError | Null, /* meta */ ResurrectEvent | Null, Unit]
}
