package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesGetTemplate
  extends StObject
     with Generic {
  
  var flat_settings: js.UndefOr[Boolean] = js.undefined
  
  var include_type_name: js.UndefOr[Boolean] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String | js.Array[String]] = js.undefined
}
object IndicesGetTemplate {
  
  inline def apply(): IndicesGetTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesGetTemplate]
  }
  
  extension [Self <: IndicesGetTemplate](x: Self) {
    
    inline def setFlat_settings(value: Boolean): Self = StObject.set(x, "flat_settings", value.asInstanceOf[js.Any])
    
    inline def setFlat_settingsUndefined: Self = StObject.set(x, "flat_settings", js.undefined)
    
    inline def setInclude_type_name(value: Boolean): Self = StObject.set(x, "include_type_name", value.asInstanceOf[js.Any])
    
    inline def setInclude_type_nameUndefined: Self = StObject.set(x, "include_type_name", js.undefined)
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
