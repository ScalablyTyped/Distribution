package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.FieldCapsRequest
import typings.elasticElasticsearch.libApiTypesMod.FieldCapsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiFieldCapsMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/field_caps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[FieldCapsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[FieldCapsResponse]]
  inline def default(params: Unit, options: TransportRequestOptions): js.Promise[FieldCapsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FieldCapsResponse]]
  inline def default(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FieldCapsResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[FieldCapsResponse, Any]]]
  inline def default(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[FieldCapsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FieldCapsResponse]]
  inline def default(params: FieldCapsRequest): js.Promise[FieldCapsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FieldCapsResponse]]
  inline def default(params: FieldCapsRequest, options: TransportRequestOptions): js.Promise[FieldCapsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FieldCapsResponse]]
  inline def default(params: FieldCapsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FieldCapsResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[FieldCapsResponse, Any]]]
  inline def default(params: FieldCapsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[FieldCapsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FieldCapsResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FieldCapsRequest): js.Promise[FieldCapsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FieldCapsResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FieldCapsRequest,
    options: TransportRequestOptions
  ): js.Promise[FieldCapsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FieldCapsResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FieldCapsRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[FieldCapsResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[FieldCapsResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FieldCapsRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[FieldCapsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FieldCapsResponse]]
  
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
