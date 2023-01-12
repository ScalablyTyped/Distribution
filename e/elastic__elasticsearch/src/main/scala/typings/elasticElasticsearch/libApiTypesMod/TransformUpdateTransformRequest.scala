package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformUpdateTransformRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var _meta: js.UndefOr[Metadata] = js.undefined
  
  var defer_validation: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var dest: js.UndefOr[TransformDestination] = js.undefined
  
  var frequency: js.UndefOr[Duration] = js.undefined
  
  var retention_policy: js.UndefOr[TransformRetentionPolicyContainer | Null] = js.undefined
  
  var settings: js.UndefOr[TransformSettings] = js.undefined
  
  var source: js.UndefOr[TransformSource] = js.undefined
  
  var sync: js.UndefOr[TransformSyncContainer] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var transform_id: Id
}
object TransformUpdateTransformRequest {
  
  inline def apply(transform_id: Id): TransformUpdateTransformRequest = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformUpdateTransformRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformUpdateTransformRequest] (val x: Self) extends AnyVal {
    
    inline def setDefer_validation(value: Boolean): Self = StObject.set(x, "defer_validation", value.asInstanceOf[js.Any])
    
    inline def setDefer_validationUndefined: Self = StObject.set(x, "defer_validation", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDest(value: TransformDestination): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
    
    inline def setFrequency(value: Duration): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setRetention_policy(value: TransformRetentionPolicyContainer): Self = StObject.set(x, "retention_policy", value.asInstanceOf[js.Any])
    
    inline def setRetention_policyNull: Self = StObject.set(x, "retention_policy", null)
    
    inline def setRetention_policyUndefined: Self = StObject.set(x, "retention_policy", js.undefined)
    
    inline def setSettings(value: TransformSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSource(value: TransformSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSync(value: TransformSyncContainer): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTransform_id(value: Id): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
    
    inline def set_meta(value: Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
