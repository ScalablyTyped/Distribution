package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesMappingLimitSettingsTotalFields extends StObject {
  
  var limit: js.UndefOr[integer] = js.undefined
}
object IndicesMappingLimitSettingsTotalFields {
  
  inline def apply(): IndicesMappingLimitSettingsTotalFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesMappingLimitSettingsTotalFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesMappingLimitSettingsTotalFields] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: integer): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
