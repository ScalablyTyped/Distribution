package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.FeaturesGetFeaturesRequest
import typings.elasticElasticsearch.libApiTypesMod.FeaturesGetFeaturesResponse
import typings.elasticElasticsearch.libApiTypesMod.FeaturesResetFeaturesRequest
import typings.elasticElasticsearch.libApiTypesMod.FeaturesResetFeaturesResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiFeaturesMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/features", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Features {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Features extends StObject {
    
    def getFeatures(): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(params: Unit, options: TransportRequestOptions): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FeaturesGetFeaturesResponse, Any]] = js.native
    def getFeatures(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(params: FeaturesGetFeaturesRequest): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(params: FeaturesGetFeaturesRequest, options: TransportRequestOptions): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(params: FeaturesGetFeaturesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FeaturesGetFeaturesResponse, Any]] = js.native
    def getFeatures(params: FeaturesGetFeaturesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesGetFeaturesRequest): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesGetFeaturesRequest,
      options: TransportRequestOptions
    ): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesGetFeaturesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[FeaturesGetFeaturesResponse, Any]] = js.native
    def getFeatures(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesGetFeaturesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[FeaturesGetFeaturesResponse] = js.native
    
    def resetFeatures(): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(params: Unit, options: TransportRequestOptions): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FeaturesResetFeaturesResponse, Any]] = js.native
    def resetFeatures(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(params: FeaturesResetFeaturesRequest): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(params: FeaturesResetFeaturesRequest, options: TransportRequestOptions): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(params: FeaturesResetFeaturesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FeaturesResetFeaturesResponse, Any]] = js.native
    def resetFeatures(params: FeaturesResetFeaturesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesResetFeaturesRequest): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesResetFeaturesRequest,
      options: TransportRequestOptions
    ): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesResetFeaturesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[FeaturesResetFeaturesResponse, Any]] = js.native
    def resetFeatures(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesResetFeaturesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[FeaturesResetFeaturesResponse] = js.native
    
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
