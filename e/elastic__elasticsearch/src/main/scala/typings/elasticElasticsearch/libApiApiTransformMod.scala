package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.TransformDeleteTransformRequest
import typings.elasticElasticsearch.libApiTypesMod.TransformDeleteTransformResponse
import typings.elasticElasticsearch.libApiTypesMod.TransformGetTransformRequest
import typings.elasticElasticsearch.libApiTypesMod.TransformGetTransformResponse
import typings.elasticElasticsearch.libApiTypesMod.TransformGetTransformStatsRequest
import typings.elasticElasticsearch.libApiTypesMod.TransformGetTransformStatsResponse
import typings.elasticElasticsearch.libApiTypesMod.TransformPreviewTransformRequest
import typings.elasticElasticsearch.libApiTypesMod.TransformPreviewTransformResponse
import typings.elasticElasticsearch.libApiTypesMod.TransformPutTransformRequest
import typings.elasticElasticsearch.libApiTypesMod.TransformPutTransformResponse
import typings.elasticElasticsearch.libApiTypesMod.TransformResetTransformRequest
import typings.elasticElasticsearch.libApiTypesMod.TransformResetTransformResponse
import typings.elasticElasticsearch.libApiTypesMod.TransformStartTransformRequest
import typings.elasticElasticsearch.libApiTypesMod.TransformStartTransformResponse
import typings.elasticElasticsearch.libApiTypesMod.TransformStopTransformRequest
import typings.elasticElasticsearch.libApiTypesMod.TransformStopTransformResponse
import typings.elasticElasticsearch.libApiTypesMod.TransformUpdateTransformRequest
import typings.elasticElasticsearch.libApiTypesMod.TransformUpdateTransformResponse
import typings.elasticElasticsearch.libApiTypesMod.TransformUpgradeTransformsRequest
import typings.elasticElasticsearch.libApiTypesMod.TransformUpgradeTransformsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiTransformMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/transform", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Transform {
    def this(transport: Transport) = this()
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
  
  @js.native
  trait Transform extends StObject {
    
    def deleteTransform(params: TransformDeleteTransformRequest): js.Promise[TransformDeleteTransformResponse] = js.native
    def deleteTransform(params: TransformDeleteTransformRequest, options: TransportRequestOptions): js.Promise[TransformDeleteTransformResponse] = js.native
    def deleteTransform(params: TransformDeleteTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformDeleteTransformResponse, Any]] = js.native
    def deleteTransform(params: TransformDeleteTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformDeleteTransformResponse] = js.native
    def deleteTransform(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformDeleteTransformRequest): js.Promise[TransformDeleteTransformResponse] = js.native
    def deleteTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformDeleteTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformDeleteTransformResponse] = js.native
    def deleteTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformDeleteTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformDeleteTransformResponse, Any]] = js.native
    def deleteTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformDeleteTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformDeleteTransformResponse] = js.native
    
    def getTransform(): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(params: Unit, options: TransportRequestOptions): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformGetTransformResponse, Any]] = js.native
    def getTransform(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(params: TransformGetTransformRequest): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(params: TransformGetTransformRequest, options: TransportRequestOptions): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(params: TransformGetTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformGetTransformResponse, Any]] = js.native
    def getTransform(params: TransformGetTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformRequest): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformGetTransformResponse, Any]] = js.native
    def getTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformGetTransformResponse] = js.native
    
    def getTransformStats(params: TransformGetTransformStatsRequest): js.Promise[TransformGetTransformStatsResponse] = js.native
    def getTransformStats(params: TransformGetTransformStatsRequest, options: TransportRequestOptions): js.Promise[TransformGetTransformStatsResponse] = js.native
    def getTransformStats(params: TransformGetTransformStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformGetTransformStatsResponse, Any]] = js.native
    def getTransformStats(params: TransformGetTransformStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformGetTransformStatsResponse] = js.native
    def getTransformStats(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformStatsRequest): js.Promise[TransformGetTransformStatsResponse] = js.native
    def getTransformStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformGetTransformStatsResponse] = js.native
    def getTransformStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformGetTransformStatsResponse, Any]] = js.native
    def getTransformStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformGetTransformStatsResponse] = js.native
    
    def previewTransform[TTransform](): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](params: Unit, options: TransportRequestOptions): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformPreviewTransformResponse[TTransform], Any]] = js.native
    def previewTransform[TTransform](params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](params: TransformPreviewTransformRequest): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](params: TransformPreviewTransformRequest, options: TransportRequestOptions): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](params: TransformPreviewTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformPreviewTransformResponse[TTransform], Any]] = js.native
    def previewTransform[TTransform](params: TransformPreviewTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPreviewTransformRequest): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPreviewTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPreviewTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformPreviewTransformResponse[TTransform], Any]] = js.native
    def previewTransform[TTransform](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPreviewTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    
    def putTransform(params: TransformPutTransformRequest): js.Promise[TransformPutTransformResponse] = js.native
    def putTransform(params: TransformPutTransformRequest, options: TransportRequestOptions): js.Promise[TransformPutTransformResponse] = js.native
    def putTransform(params: TransformPutTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformPutTransformResponse, Any]] = js.native
    def putTransform(params: TransformPutTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformPutTransformResponse] = js.native
    def putTransform(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPutTransformRequest): js.Promise[TransformPutTransformResponse] = js.native
    def putTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPutTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformPutTransformResponse] = js.native
    def putTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPutTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformPutTransformResponse, Any]] = js.native
    def putTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPutTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformPutTransformResponse] = js.native
    
    def resetTransform(params: TransformResetTransformRequest): js.Promise[TransformResetTransformResponse] = js.native
    def resetTransform(params: TransformResetTransformRequest, options: TransportRequestOptions): js.Promise[TransformResetTransformResponse] = js.native
    def resetTransform(params: TransformResetTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformResetTransformResponse, Any]] = js.native
    def resetTransform(params: TransformResetTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformResetTransformResponse] = js.native
    def resetTransform(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformResetTransformRequest): js.Promise[TransformResetTransformResponse] = js.native
    def resetTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformResetTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformResetTransformResponse] = js.native
    def resetTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformResetTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformResetTransformResponse, Any]] = js.native
    def resetTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformResetTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformResetTransformResponse] = js.native
    
    def startTransform(params: TransformStartTransformRequest): js.Promise[TransformStartTransformResponse] = js.native
    def startTransform(params: TransformStartTransformRequest, options: TransportRequestOptions): js.Promise[TransformStartTransformResponse] = js.native
    def startTransform(params: TransformStartTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformStartTransformResponse, Any]] = js.native
    def startTransform(params: TransformStartTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformStartTransformResponse] = js.native
    def startTransform(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStartTransformRequest): js.Promise[TransformStartTransformResponse] = js.native
    def startTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStartTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformStartTransformResponse] = js.native
    def startTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStartTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformStartTransformResponse, Any]] = js.native
    def startTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStartTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformStartTransformResponse] = js.native
    
    def stopTransform(params: TransformStopTransformRequest): js.Promise[TransformStopTransformResponse] = js.native
    def stopTransform(params: TransformStopTransformRequest, options: TransportRequestOptions): js.Promise[TransformStopTransformResponse] = js.native
    def stopTransform(params: TransformStopTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformStopTransformResponse, Any]] = js.native
    def stopTransform(params: TransformStopTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformStopTransformResponse] = js.native
    def stopTransform(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStopTransformRequest): js.Promise[TransformStopTransformResponse] = js.native
    def stopTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStopTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformStopTransformResponse] = js.native
    def stopTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStopTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformStopTransformResponse, Any]] = js.native
    def stopTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStopTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformStopTransformResponse] = js.native
    
    var transport: Transport = js.native
    
    def updateTransform(params: TransformUpdateTransformRequest): js.Promise[TransformUpdateTransformResponse] = js.native
    def updateTransform(params: TransformUpdateTransformRequest, options: TransportRequestOptions): js.Promise[TransformUpdateTransformResponse] = js.native
    def updateTransform(params: TransformUpdateTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformUpdateTransformResponse, Any]] = js.native
    def updateTransform(params: TransformUpdateTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformUpdateTransformResponse] = js.native
    def updateTransform(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpdateTransformRequest): js.Promise[TransformUpdateTransformResponse] = js.native
    def updateTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpdateTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformUpdateTransformResponse] = js.native
    def updateTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpdateTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformUpdateTransformResponse, Any]] = js.native
    def updateTransform(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpdateTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformUpdateTransformResponse] = js.native
    
    def upgradeTransforms(): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(params: Unit, options: TransportRequestOptions): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformUpgradeTransformsResponse, Any]] = js.native
    def upgradeTransforms(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(params: TransformUpgradeTransformsRequest): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(params: TransformUpgradeTransformsRequest, options: TransportRequestOptions): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(params: TransformUpgradeTransformsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformUpgradeTransformsResponse, Any]] = js.native
    def upgradeTransforms(params: TransformUpgradeTransformsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpgradeTransformsRequest): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpgradeTransformsRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpgradeTransformsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformUpgradeTransformsResponse, Any]] = js.native
    def upgradeTransforms(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpgradeTransformsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformUpgradeTransformsResponse] = js.native
  }
}
