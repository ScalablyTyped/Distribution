package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptLanguagesResponse extends StObject {
  
  var language_contexts: js.Array[GetScriptLanguagesLanguageContext]
  
  var types_allowed: js.Array[String]
}
object GetScriptLanguagesResponse {
  
  inline def apply(language_contexts: js.Array[GetScriptLanguagesLanguageContext], types_allowed: js.Array[String]): GetScriptLanguagesResponse = {
    val __obj = js.Dynamic.literal(language_contexts = language_contexts.asInstanceOf[js.Any], types_allowed = types_allowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptLanguagesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetScriptLanguagesResponse] (val x: Self) extends AnyVal {
    
    inline def setLanguage_contexts(value: js.Array[GetScriptLanguagesLanguageContext]): Self = StObject.set(x, "language_contexts", value.asInstanceOf[js.Any])
    
    inline def setLanguage_contextsVarargs(value: GetScriptLanguagesLanguageContext*): Self = StObject.set(x, "language_contexts", js.Array(value*))
    
    inline def setTypes_allowed(value: js.Array[String]): Self = StObject.set(x, "types_allowed", value.asInstanceOf[js.Any])
    
    inline def setTypes_allowedVarargs(value: String*): Self = StObject.set(x, "types_allowed", js.Array(value*))
  }
}
