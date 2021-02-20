package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XpackInfo extends Generic {
  
  var accept_enterprise: js.UndefOr[Boolean] = js.native
  
  var categories: js.UndefOr[String | js.Array[String]] = js.native
}
object XpackInfo {
  
  @scala.inline
  def apply(): XpackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XpackInfo]
  }
  
  @scala.inline
  implicit class XpackInfoMutableBuilder[Self <: XpackInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept_enterprise(value: Boolean): Self = StObject.set(x, "accept_enterprise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept_enterpriseUndefined: Self = StObject.set(x, "accept_enterprise", js.undefined)
    
    @scala.inline
    def setCategories(value: String | js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
  }
}
