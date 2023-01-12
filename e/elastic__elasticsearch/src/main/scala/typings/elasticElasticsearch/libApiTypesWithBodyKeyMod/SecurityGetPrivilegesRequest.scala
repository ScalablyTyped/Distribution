package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetPrivilegesRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var application: js.UndefOr[Name] = js.undefined
  
  var name: js.UndefOr[Names] = js.undefined
}
object SecurityGetPrivilegesRequest {
  
  inline def apply(): SecurityGetPrivilegesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetPrivilegesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetPrivilegesRequest] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Name): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setName(value: Names): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: Name*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
