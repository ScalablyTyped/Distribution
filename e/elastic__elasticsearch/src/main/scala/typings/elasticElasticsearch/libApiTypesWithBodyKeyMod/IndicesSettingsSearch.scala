package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSettingsSearch extends StObject {
  
  var idle: js.UndefOr[IndicesSearchIdle] = js.undefined
  
  var slowlog: js.UndefOr[IndicesSlowlogSettings] = js.undefined
}
object IndicesSettingsSearch {
  
  inline def apply(): IndicesSettingsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesSettingsSearch]
  }
  
  extension [Self <: IndicesSettingsSearch](x: Self) {
    
    inline def setIdle(value: IndicesSearchIdle): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    inline def setSlowlog(value: IndicesSlowlogSettings): Self = StObject.set(x, "slowlog", value.asInstanceOf[js.Any])
    
    inline def setSlowlogUndefined: Self = StObject.set(x, "slowlog", js.undefined)
  }
}
