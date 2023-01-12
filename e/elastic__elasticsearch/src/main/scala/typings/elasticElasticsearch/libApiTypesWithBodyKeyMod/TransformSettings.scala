package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformSettings extends StObject {
  
  var align_checkpoints: js.UndefOr[Boolean] = js.undefined
  
  var dates_as_epoch_millis: js.UndefOr[Boolean] = js.undefined
  
  var deduce_mappings: js.UndefOr[Boolean] = js.undefined
  
  var docs_per_second: js.UndefOr[float] = js.undefined
  
  var max_page_search_size: js.UndefOr[integer] = js.undefined
  
  var unattended: js.UndefOr[Boolean] = js.undefined
}
object TransformSettings {
  
  inline def apply(): TransformSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformSettings] (val x: Self) extends AnyVal {
    
    inline def setAlign_checkpoints(value: Boolean): Self = StObject.set(x, "align_checkpoints", value.asInstanceOf[js.Any])
    
    inline def setAlign_checkpointsUndefined: Self = StObject.set(x, "align_checkpoints", js.undefined)
    
    inline def setDates_as_epoch_millis(value: Boolean): Self = StObject.set(x, "dates_as_epoch_millis", value.asInstanceOf[js.Any])
    
    inline def setDates_as_epoch_millisUndefined: Self = StObject.set(x, "dates_as_epoch_millis", js.undefined)
    
    inline def setDeduce_mappings(value: Boolean): Self = StObject.set(x, "deduce_mappings", value.asInstanceOf[js.Any])
    
    inline def setDeduce_mappingsUndefined: Self = StObject.set(x, "deduce_mappings", js.undefined)
    
    inline def setDocs_per_second(value: float): Self = StObject.set(x, "docs_per_second", value.asInstanceOf[js.Any])
    
    inline def setDocs_per_secondUndefined: Self = StObject.set(x, "docs_per_second", js.undefined)
    
    inline def setMax_page_search_size(value: integer): Self = StObject.set(x, "max_page_search_size", value.asInstanceOf[js.Any])
    
    inline def setMax_page_search_sizeUndefined: Self = StObject.set(x, "max_page_search_size", js.undefined)
    
    inline def setUnattended(value: Boolean): Self = StObject.set(x, "unattended", value.asInstanceOf[js.Any])
    
    inline def setUnattendedUndefined: Self = StObject.set(x, "unattended", js.undefined)
  }
}
