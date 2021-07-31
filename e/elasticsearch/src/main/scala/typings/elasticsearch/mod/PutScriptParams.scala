package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutScriptParams
  extends StObject
     with GenericParams {
  
  var id: String
  
  var lang: String
}
object PutScriptParams {
  
  @scala.inline
  def apply(id: String, lang: String): PutScriptParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScriptParams]
  }
  
  @scala.inline
  implicit class PutScriptParamsMutableBuilder[Self <: PutScriptParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
  }
}
