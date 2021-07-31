package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScriptParams
  extends StObject
     with GenericParams {
  
  var id: String
  
  var lang: String
}
object DeleteScriptParams {
  
  @scala.inline
  def apply(id: String, lang: String): DeleteScriptParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScriptParams]
  }
  
  @scala.inline
  implicit class DeleteScriptParamsMutableBuilder[Self <: DeleteScriptParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
  }
}
