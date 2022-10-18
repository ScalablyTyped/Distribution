package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesMappingLimitSettingsDepth extends StObject {
  
  var limit: js.UndefOr[integer] = js.undefined
}
object IndicesMappingLimitSettingsDepth {
  
  inline def apply(): IndicesMappingLimitSettingsDepth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesMappingLimitSettingsDepth]
  }
  
  extension [Self <: IndicesMappingLimitSettingsDepth](x: Self) {
    
    inline def setLimit(value: integer): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
