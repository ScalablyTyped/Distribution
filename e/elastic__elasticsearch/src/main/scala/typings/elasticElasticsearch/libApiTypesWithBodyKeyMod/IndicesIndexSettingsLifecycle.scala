package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexSettingsLifecycle extends StObject {
  
  var indexing_complete: js.UndefOr[Boolean] = js.undefined
  
  var name: Name
  
  var origination_date: js.UndefOr[long] = js.undefined
  
  var parse_origination_date: js.UndefOr[Boolean] = js.undefined
  
  var rollover_alias: js.UndefOr[String] = js.undefined
  
  var step: js.UndefOr[IndicesIndexSettingsLifecycleStep] = js.undefined
}
object IndicesIndexSettingsLifecycle {
  
  inline def apply(name: Name): IndicesIndexSettingsLifecycle = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesIndexSettingsLifecycle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesIndexSettingsLifecycle] (val x: Self) extends AnyVal {
    
    inline def setIndexing_complete(value: Boolean): Self = StObject.set(x, "indexing_complete", value.asInstanceOf[js.Any])
    
    inline def setIndexing_completeUndefined: Self = StObject.set(x, "indexing_complete", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrigination_date(value: long): Self = StObject.set(x, "origination_date", value.asInstanceOf[js.Any])
    
    inline def setOrigination_dateUndefined: Self = StObject.set(x, "origination_date", js.undefined)
    
    inline def setParse_origination_date(value: Boolean): Self = StObject.set(x, "parse_origination_date", value.asInstanceOf[js.Any])
    
    inline def setParse_origination_dateUndefined: Self = StObject.set(x, "parse_origination_date", js.undefined)
    
    inline def setRollover_alias(value: String): Self = StObject.set(x, "rollover_alias", value.asInstanceOf[js.Any])
    
    inline def setRollover_aliasUndefined: Self = StObject.set(x, "rollover_alias", js.undefined)
    
    inline def setStep(value: IndicesIndexSettingsLifecycleStep): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
