package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetRoleMappingRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: js.UndefOr[Names] = js.undefined
}
object SecurityGetRoleMappingRequest {
  
  inline def apply(): SecurityGetRoleMappingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetRoleMappingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetRoleMappingRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Names): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: Name*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
