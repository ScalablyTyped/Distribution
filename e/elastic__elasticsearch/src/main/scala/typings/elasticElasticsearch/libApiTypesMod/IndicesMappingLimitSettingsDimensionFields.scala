package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesMappingLimitSettingsDimensionFields extends StObject {
  
  var limit: js.UndefOr[integer] = js.undefined
}
object IndicesMappingLimitSettingsDimensionFields {
  
  inline def apply(): IndicesMappingLimitSettingsDimensionFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesMappingLimitSettingsDimensionFields]
  }
  
  extension [Self <: IndicesMappingLimitSettingsDimensionFields](x: Self) {
    
    inline def setLimit(value: integer): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
