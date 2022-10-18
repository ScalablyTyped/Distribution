package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.MigrationDeprecationsRequest
import typings.elasticElasticsearch.libApiTypesMod.MigrationDeprecationsResponse
import typings.elasticElasticsearch.libApiTypesMod.MigrationGetFeatureUpgradeStatusRequest
import typings.elasticElasticsearch.libApiTypesMod.MigrationGetFeatureUpgradeStatusResponse
import typings.elasticElasticsearch.libApiTypesMod.MigrationPostFeatureUpgradeRequest
import typings.elasticElasticsearch.libApiTypesMod.MigrationPostFeatureUpgradeResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiMigrationMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/migration", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Migration {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Migration extends StObject {
    
    def deprecations(): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(params: Unit, options: TransportRequestOptions): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MigrationDeprecationsResponse, Any]] = js.native
    def deprecations(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(params: MigrationDeprecationsRequest): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(params: MigrationDeprecationsRequest, options: TransportRequestOptions): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(params: MigrationDeprecationsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MigrationDeprecationsResponse, Any]] = js.native
    def deprecations(params: MigrationDeprecationsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationDeprecationsRequest): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationDeprecationsRequest,
      options: TransportRequestOptions
    ): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationDeprecationsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[MigrationDeprecationsResponse, Any]] = js.native
    def deprecations(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationDeprecationsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[MigrationDeprecationsResponse] = js.native
    
    def getFeatureUpgradeStatus(): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(params: Unit, options: TransportRequestOptions): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MigrationGetFeatureUpgradeStatusResponse, Any]] = js.native
    def getFeatureUpgradeStatus(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(params: MigrationGetFeatureUpgradeStatusRequest): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(params: MigrationGetFeatureUpgradeStatusRequest, options: TransportRequestOptions): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(params: MigrationGetFeatureUpgradeStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MigrationGetFeatureUpgradeStatusResponse, Any]] = js.native
    def getFeatureUpgradeStatus(params: MigrationGetFeatureUpgradeStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationGetFeatureUpgradeStatusRequest
    ): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationGetFeatureUpgradeStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationGetFeatureUpgradeStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[MigrationGetFeatureUpgradeStatusResponse, Any]] = js.native
    def getFeatureUpgradeStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationGetFeatureUpgradeStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    
    def postFeatureUpgrade(): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(params: Unit, options: TransportRequestOptions): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MigrationPostFeatureUpgradeResponse, Any]] = js.native
    def postFeatureUpgrade(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(params: MigrationPostFeatureUpgradeRequest): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(params: MigrationPostFeatureUpgradeRequest, options: TransportRequestOptions): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(params: MigrationPostFeatureUpgradeRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MigrationPostFeatureUpgradeResponse, Any]] = js.native
    def postFeatureUpgrade(params: MigrationPostFeatureUpgradeRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationPostFeatureUpgradeRequest): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationPostFeatureUpgradeRequest,
      options: TransportRequestOptions
    ): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationPostFeatureUpgradeRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[MigrationPostFeatureUpgradeResponse, Any]] = js.native
    def postFeatureUpgrade(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationPostFeatureUpgradeRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    
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
