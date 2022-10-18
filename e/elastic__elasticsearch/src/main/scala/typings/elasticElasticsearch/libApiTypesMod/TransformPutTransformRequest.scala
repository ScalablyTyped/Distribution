package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformPutTransformRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var _meta: js.UndefOr[Metadata] = js.undefined
  
  var defer_validation: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var dest: TransformDestination
  
  var frequency: js.UndefOr[Duration] = js.undefined
  
  var latest: js.UndefOr[TransformLatest] = js.undefined
  
  var pivot: js.UndefOr[TransformPivot] = js.undefined
  
  var retention_policy: js.UndefOr[TransformRetentionPolicyContainer] = js.undefined
  
  var settings: js.UndefOr[TransformSettings] = js.undefined
  
  var source: TransformSource
  
  var sync: js.UndefOr[TransformSyncContainer] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var transform_id: Id
}
object TransformPutTransformRequest {
  
  inline def apply(dest: TransformDestination, source: TransformSource, transform_id: Id): TransformPutTransformRequest = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformPutTransformRequest]
  }
  
  extension [Self <: TransformPutTransformRequest](x: Self) {
    
    inline def setDefer_validation(value: Boolean): Self = StObject.set(x, "defer_validation", value.asInstanceOf[js.Any])
    
    inline def setDefer_validationUndefined: Self = StObject.set(x, "defer_validation", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDest(value: TransformDestination): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setFrequency(value: Duration): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setLatest(value: TransformLatest): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    
    inline def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
    
    inline def setPivot(value: TransformPivot): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
    
    inline def setPivotUndefined: Self = StObject.set(x, "pivot", js.undefined)
    
    inline def setRetention_policy(value: TransformRetentionPolicyContainer): Self = StObject.set(x, "retention_policy", value.asInstanceOf[js.Any])
    
    inline def setRetention_policyUndefined: Self = StObject.set(x, "retention_policy", js.undefined)
    
    inline def setSettings(value: TransformSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSource(value: TransformSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSync(value: TransformSyncContainer): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTransform_id(value: Id): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
    
    inline def set_meta(value: Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
