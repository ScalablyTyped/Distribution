package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.ShutdownDeleteNodeRequest
import typings.elasticElasticsearch.libApiTypesMod.ShutdownDeleteNodeResponse
import typings.elasticElasticsearch.libApiTypesMod.ShutdownGetNodeRequest
import typings.elasticElasticsearch.libApiTypesMod.ShutdownGetNodeResponse
import typings.elasticElasticsearch.libApiTypesMod.ShutdownPutNodeRequest
import typings.elasticElasticsearch.libApiTypesMod.ShutdownPutNodeResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiShutdownMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/shutdown", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Shutdown {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Shutdown extends StObject {
    
    def deleteNode(params: ShutdownDeleteNodeRequest): js.Promise[ShutdownDeleteNodeResponse] = js.native
    def deleteNode(params: ShutdownDeleteNodeRequest, options: TransportRequestOptions): js.Promise[ShutdownDeleteNodeResponse] = js.native
    def deleteNode(params: ShutdownDeleteNodeRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ShutdownDeleteNodeResponse, Any]] = js.native
    def deleteNode(params: ShutdownDeleteNodeRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ShutdownDeleteNodeResponse] = js.native
    def deleteNode(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownDeleteNodeRequest): js.Promise[ShutdownDeleteNodeResponse] = js.native
    def deleteNode(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownDeleteNodeRequest,
      options: TransportRequestOptions
    ): js.Promise[ShutdownDeleteNodeResponse] = js.native
    def deleteNode(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownDeleteNodeRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ShutdownDeleteNodeResponse, Any]] = js.native
    def deleteNode(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownDeleteNodeRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ShutdownDeleteNodeResponse] = js.native
    
    def getNode(): js.Promise[ShutdownGetNodeResponse] = js.native
    def getNode(params: Unit, options: TransportRequestOptions): js.Promise[ShutdownGetNodeResponse] = js.native
    def getNode(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ShutdownGetNodeResponse, Any]] = js.native
    def getNode(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ShutdownGetNodeResponse] = js.native
    def getNode(params: ShutdownGetNodeRequest): js.Promise[ShutdownGetNodeResponse] = js.native
    def getNode(params: ShutdownGetNodeRequest, options: TransportRequestOptions): js.Promise[ShutdownGetNodeResponse] = js.native
    def getNode(params: ShutdownGetNodeRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ShutdownGetNodeResponse, Any]] = js.native
    def getNode(params: ShutdownGetNodeRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ShutdownGetNodeResponse] = js.native
    def getNode(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownGetNodeRequest): js.Promise[ShutdownGetNodeResponse] = js.native
    def getNode(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownGetNodeRequest,
      options: TransportRequestOptions
    ): js.Promise[ShutdownGetNodeResponse] = js.native
    def getNode(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownGetNodeRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ShutdownGetNodeResponse, Any]] = js.native
    def getNode(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownGetNodeRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ShutdownGetNodeResponse] = js.native
    
    def putNode(params: ShutdownPutNodeRequest): js.Promise[ShutdownPutNodeResponse] = js.native
    def putNode(params: ShutdownPutNodeRequest, options: TransportRequestOptions): js.Promise[ShutdownPutNodeResponse] = js.native
    def putNode(params: ShutdownPutNodeRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ShutdownPutNodeResponse, Any]] = js.native
    def putNode(params: ShutdownPutNodeRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ShutdownPutNodeResponse] = js.native
    def putNode(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownPutNodeRequest): js.Promise[ShutdownPutNodeResponse] = js.native
    def putNode(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownPutNodeRequest,
      options: TransportRequestOptions
    ): js.Promise[ShutdownPutNodeResponse] = js.native
    def putNode(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownPutNodeRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ShutdownPutNodeResponse, Any]] = js.native
    def putNode(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ShutdownPutNodeRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ShutdownPutNodeResponse] = js.native
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: That] (val x: Self) extends AnyVal {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
