package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformDestination
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformRetentionPolicyContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformSettings
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformSource
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformSyncContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta extends StObject {
  
  var _meta: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var dest: js.UndefOr[TransformDestination] = js.undefined
  
  var frequency: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
  
  var retention_policy: js.UndefOr[TransformRetentionPolicyContainer | Null] = js.undefined
  
  var settings: js.UndefOr[TransformSettings] = js.undefined
  
  var source: js.UndefOr[TransformSource] = js.undefined
  
  var sync: js.UndefOr[TransformSyncContainer] = js.undefined
}
object Meta {
  
  inline def apply(): Meta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Meta]
  }
  
  extension [Self <: Meta](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDest(value: TransformDestination): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
    
    inline def setFrequency(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
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
    
    inline def set_meta(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
