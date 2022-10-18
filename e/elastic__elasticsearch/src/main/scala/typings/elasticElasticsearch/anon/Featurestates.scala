package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Featurestates extends StObject {
  
  var feature_states: js.UndefOr[js.Array[String]] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var include_global_state: js.UndefOr[Boolean] = js.undefined
  
  var indices: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Indices] = js.undefined
  
  var metadata: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata] = js.undefined
  
  var partial: js.UndefOr[Boolean] = js.undefined
}
object Featurestates {
  
  inline def apply(): Featurestates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Featurestates]
  }
  
  extension [Self <: Featurestates](x: Self) {
    
    inline def setFeature_states(value: js.Array[String]): Self = StObject.set(x, "feature_states", value.asInstanceOf[js.Any])
    
    inline def setFeature_statesUndefined: Self = StObject.set(x, "feature_states", js.undefined)
    
    inline def setFeature_statesVarargs(value: String*): Self = StObject.set(x, "feature_states", js.Array(value*))
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setInclude_global_state(value: Boolean): Self = StObject.set(x, "include_global_state", value.asInstanceOf[js.Any])
    
    inline def setInclude_global_stateUndefined: Self = StObject.set(x, "include_global_state", js.undefined)
    
    inline def setIndices(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMetadata(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
  }
}
