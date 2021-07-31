package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptParams
  extends StObject
     with GenericParams {
  
  var id: String
  
  var lang: String
}
object GetScriptParams {
  
  @scala.inline
  def apply(id: String, lang: String): GetScriptParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptParams]
  }
  
  @scala.inline
  implicit class GetScriptParamsMutableBuilder[Self <: GetScriptParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
  }
}
