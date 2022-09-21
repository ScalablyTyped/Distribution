package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesGetTemplateParams
  extends StObject
     with GenericParams {
  
  var flatSettings: js.UndefOr[Boolean] = js.undefined
  
  var includeTypeName: js.UndefOr[Boolean] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var name: js.UndefOr[NameList] = js.undefined
}
object IndicesGetTemplateParams {
  
  inline def apply(): IndicesGetTemplateParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesGetTemplateParams]
  }
  
  extension [Self <: IndicesGetTemplateParams](x: Self) {
    
    inline def setFlatSettings(value: Boolean): Self = StObject.set(x, "flatSettings", value.asInstanceOf[js.Any])
    
    inline def setFlatSettingsUndefined: Self = StObject.set(x, "flatSettings", js.undefined)
    
    inline def setIncludeTypeName(value: Boolean): Self = StObject.set(x, "includeTypeName", value.asInstanceOf[js.Any])
    
    inline def setIncludeTypeNameUndefined: Self = StObject.set(x, "includeTypeName", js.undefined)
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    inline def setName(value: NameList): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
