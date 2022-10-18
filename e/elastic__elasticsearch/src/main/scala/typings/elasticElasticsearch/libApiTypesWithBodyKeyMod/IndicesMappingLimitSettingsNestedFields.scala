package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesMappingLimitSettingsNestedFields extends StObject {
  
  var limit: js.UndefOr[integer] = js.undefined
}
object IndicesMappingLimitSettingsNestedFields {
  
  inline def apply(): IndicesMappingLimitSettingsNestedFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesMappingLimitSettingsNestedFields]
  }
  
  extension [Self <: IndicesMappingLimitSettingsNestedFields](x: Self) {
    
    inline def setLimit(value: integer): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
