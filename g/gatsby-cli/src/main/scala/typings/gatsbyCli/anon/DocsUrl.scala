package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocsUrl extends StObject {
  
  var docsUrl: String
  
  var level: typings.gatsbyCli.structuredErrorsTypesMod.Level
  
  def text(context: js.Any): String
}
object DocsUrl {
  
  @scala.inline
  def apply(docsUrl: String, level: typings.gatsbyCli.structuredErrorsTypesMod.Level, text: js.Any => String): DocsUrl = {
    val __obj = js.Dynamic.literal(docsUrl = docsUrl.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[DocsUrl]
  }
  
  @scala.inline
  implicit class DocsUrlMutableBuilder[Self <: DocsUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: typings.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: js.Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
