package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformUpdateTransformResponse extends StObject {
  
  var _meta: js.UndefOr[Metadata] = js.undefined
  
  var authorization: js.UndefOr[MlTransformAuthorization] = js.undefined
  
  var create_time: long
  
  var description: String
  
  var dest: ReindexDestination
  
  var frequency: js.UndefOr[Duration] = js.undefined
  
  var id: Id
  
  var latest: js.UndefOr[TransformLatest] = js.undefined
  
  var pivot: js.UndefOr[TransformPivot] = js.undefined
  
  var retention_policy: js.UndefOr[TransformRetentionPolicyContainer] = js.undefined
  
  var settings: TransformSettings
  
  var source: ReindexSource
  
  var sync: js.UndefOr[TransformSyncContainer] = js.undefined
  
  var version: VersionString
}
object TransformUpdateTransformResponse {
  
  inline def apply(
    create_time: long,
    description: String,
    dest: ReindexDestination,
    id: Id,
    settings: TransformSettings,
    source: ReindexSource,
    version: VersionString
  ): TransformUpdateTransformResponse = {
    val __obj = js.Dynamic.literal(create_time = create_time.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformUpdateTransformResponse]
  }
  
  extension [Self <: TransformUpdateTransformResponse](x: Self) {
    
    inline def setAuthorization(value: MlTransformAuthorization): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setCreate_time(value: long): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDest(value: ReindexDestination): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setFrequency(value: Duration): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLatest(value: TransformLatest): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    
    inline def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
    
    inline def setPivot(value: TransformPivot): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
    
    inline def setPivotUndefined: Self = StObject.set(x, "pivot", js.undefined)
    
    inline def setRetention_policy(value: TransformRetentionPolicyContainer): Self = StObject.set(x, "retention_policy", value.asInstanceOf[js.Any])
    
    inline def setRetention_policyUndefined: Self = StObject.set(x, "retention_policy", js.undefined)
    
    inline def setSettings(value: TransformSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSource(value: ReindexSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSync(value: TransformSyncContainer): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def set_meta(value: Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
