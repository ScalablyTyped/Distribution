package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackInfo
  extends StObject
     with Generic {
  
  var accept_enterprise: js.UndefOr[Boolean] = js.undefined
  
  var categories: js.UndefOr[String | js.Array[String]] = js.undefined
}
object XpackInfo {
  
  inline def apply(): XpackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XpackInfo]
  }
  
  extension [Self <: XpackInfo](x: Self) {
    
    inline def setAccept_enterprise(value: Boolean): Self = StObject.set(x, "accept_enterprise", value.asInstanceOf[js.Any])
    
    inline def setAccept_enterpriseUndefined: Self = StObject.set(x, "accept_enterprise", js.undefined)
    
    inline def setCategories(value: String | js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
  }
}
