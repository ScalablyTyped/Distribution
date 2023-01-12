package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoredScript extends StObject {
  
  var lang: ScriptLanguage
  
  var options: js.UndefOr[Record[String, String]] = js.undefined
  
  var source: String
}
object StoredScript {
  
  inline def apply(lang: ScriptLanguage, source: String): StoredScript = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoredScript]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoredScript] (val x: Self) extends AnyVal {
    
    inline def setLang(value: ScriptLanguage): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Record[String, String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
