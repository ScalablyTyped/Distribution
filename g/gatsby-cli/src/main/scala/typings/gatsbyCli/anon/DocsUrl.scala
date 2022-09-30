package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocsUrl extends StObject {
  
  var docsUrl: String
  
  var level: typings.gatsbyCli.structuredErrorsTypesMod.Level
  
  def text(context: Any): String
}
object DocsUrl {
  
  inline def apply(docsUrl: String, level: typings.gatsbyCli.structuredErrorsTypesMod.Level, text: Any => String): DocsUrl = {
    val __obj = js.Dynamic.literal(docsUrl = docsUrl.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[DocsUrl]
  }
  
  extension [Self <: DocsUrl](x: Self) {
    
    inline def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: typings.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setText(value: Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
