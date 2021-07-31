package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesExistsTemplateParams
  extends StObject
     with GenericParams {
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var name: NameList
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}
object IndicesExistsTemplateParams {
  
  @scala.inline
  def apply(name: NameList): IndicesExistsTemplateParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesExistsTemplateParams]
  }
  
  @scala.inline
  implicit class IndicesExistsTemplateParamsMutableBuilder[Self <: IndicesExistsTemplateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setName(value: NameList): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
