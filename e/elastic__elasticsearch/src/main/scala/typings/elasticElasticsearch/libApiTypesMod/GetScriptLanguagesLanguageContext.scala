package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptLanguagesLanguageContext extends StObject {
  
  var contexts: js.Array[String]
  
  var language: ScriptLanguage
}
object GetScriptLanguagesLanguageContext {
  
  inline def apply(contexts: js.Array[String], language: ScriptLanguage): GetScriptLanguagesLanguageContext = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptLanguagesLanguageContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetScriptLanguagesLanguageContext] (val x: Self) extends AnyVal {
    
    inline def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setLanguage(value: ScriptLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
