package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.MonitoringBulkRequest
import typings.elasticElasticsearch.libApiTypesMod.MonitoringBulkResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiMonitoringMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/monitoring", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Monitoring {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Monitoring extends StObject {
    
    def bulk[TDocument, TPartialDocument](params: MonitoringBulkRequest[TDocument, TPartialDocument]): js.Promise[MonitoringBulkResponse] = js.native
    def bulk[TDocument, TPartialDocument](params: MonitoringBulkRequest[TDocument, TPartialDocument], options: TransportRequestOptions): js.Promise[MonitoringBulkResponse] = js.native
    def bulk[TDocument, TPartialDocument](
      params: MonitoringBulkRequest[TDocument, TPartialDocument],
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[MonitoringBulkResponse, Any]] = js.native
    def bulk[TDocument, TPartialDocument](
      params: MonitoringBulkRequest[TDocument, TPartialDocument],
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[MonitoringBulkResponse] = js.native
    def bulk[TDocument, TPartialDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MonitoringBulkRequest[TDocument, TPartialDocument]
    ): js.Promise[MonitoringBulkResponse] = js.native
    def bulk[TDocument, TPartialDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MonitoringBulkRequest[TDocument, TPartialDocument],
      options: TransportRequestOptions
    ): js.Promise[MonitoringBulkResponse] = js.native
    def bulk[TDocument, TPartialDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MonitoringBulkRequest[TDocument, TPartialDocument],
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[MonitoringBulkResponse, Any]] = js.native
    def bulk[TDocument, TPartialDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MonitoringBulkRequest[TDocument, TPartialDocument],
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[MonitoringBulkResponse] = js.native
    
    var transport: Transport = js.native
  }
  
  trait That extends StObject {
    
    var transport: Transport
  }
  object That {
    
    inline def apply(transport: Transport): That = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[That]
    }
    
    extension [Self <: That](x: Self) {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
