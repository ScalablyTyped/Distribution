package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackInfoRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var accept_enterprise: js.UndefOr[Boolean] = js.undefined
  
  var categories: js.UndefOr[js.Array[String]] = js.undefined
}
object XpackInfoRequest {
  
  inline def apply(): XpackInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XpackInfoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackInfoRequest] (val x: Self) extends AnyVal {
    
    inline def setAccept_enterprise(value: Boolean): Self = StObject.set(x, "accept_enterprise", value.asInstanceOf[js.Any])
    
    inline def setAccept_enterpriseUndefined: Self = StObject.set(x, "accept_enterprise", js.undefined)
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
  }
}
