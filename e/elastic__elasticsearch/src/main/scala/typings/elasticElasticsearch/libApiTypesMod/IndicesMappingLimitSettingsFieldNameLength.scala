package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesMappingLimitSettingsFieldNameLength extends StObject {
  
  var limit: js.UndefOr[long] = js.undefined
}
object IndicesMappingLimitSettingsFieldNameLength {
  
  inline def apply(): IndicesMappingLimitSettingsFieldNameLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesMappingLimitSettingsFieldNameLength]
  }
  
  extension [Self <: IndicesMappingLimitSettingsFieldNameLength](x: Self) {
    
    inline def setLimit(value: long): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
