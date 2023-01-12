package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformDestination
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformLatest
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPivot
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformRetentionPolicyContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformSettings
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformSource
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformSyncContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dest extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var dest: js.UndefOr[TransformDestination] = js.undefined
  
  var frequency: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
  
  var latest: js.UndefOr[TransformLatest] = js.undefined
  
  var pivot: js.UndefOr[TransformPivot] = js.undefined
  
  var retention_policy: js.UndefOr[TransformRetentionPolicyContainer] = js.undefined
  
  var settings: js.UndefOr[TransformSettings] = js.undefined
  
  var source: js.UndefOr[TransformSource] = js.undefined
  
  var sync: js.UndefOr[TransformSyncContainer] = js.undefined
}
object Dest {
  
  inline def apply(): Dest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDest(value: TransformDestination): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
    
    inline def setFrequency(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
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
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSync(value: TransformSyncContainer): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
