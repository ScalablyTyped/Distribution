package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityRoleTemplateInlineScript
  extends StObject
     with ScriptBase
     with _SecurityRoleTemplateScript {
  
  var lang: js.UndefOr[ScriptLanguage] = js.undefined
  
  var options: js.UndefOr[Record[String, String]] = js.undefined
  
  var source: SecurityRoleTemplateInlineQuery
}
object SecurityRoleTemplateInlineScript {
  
  inline def apply(source: SecurityRoleTemplateInlineQuery): SecurityRoleTemplateInlineScript = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityRoleTemplateInlineScript]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityRoleTemplateInlineScript] (val x: Self) extends AnyVal {
    
    inline def setLang(value: ScriptLanguage): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setOptions(value: Record[String, String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSource(value: SecurityRoleTemplateInlineQuery): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
