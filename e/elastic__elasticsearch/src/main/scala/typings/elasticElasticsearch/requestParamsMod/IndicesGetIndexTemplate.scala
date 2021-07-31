package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesGetIndexTemplate
  extends StObject
     with Generic {
  
  var flat_settings: js.UndefOr[Boolean] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String | js.Array[String]] = js.undefined
}
object IndicesGetIndexTemplate {
  
  @scala.inline
  def apply(): IndicesGetIndexTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesGetIndexTemplate]
  }
  
  @scala.inline
  implicit class IndicesGetIndexTemplateMutableBuilder[Self <: IndicesGetIndexTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlat_settings(value: Boolean): Self = StObject.set(x, "flat_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlat_settingsUndefined: Self = StObject.set(x, "flat_settings", js.undefined)
    
    @scala.inline
    def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
