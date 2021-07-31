package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocsUrlString extends StObject {
  
  var docsUrl: String
  
  var level: typings.gatsbyCli.structuredErrorsTypesMod.Level
  
  def text(hasPathFilePathLineColumn: Column): String
}
object DocsUrlString {
  
  @scala.inline
  def apply(docsUrl: String, level: typings.gatsbyCli.structuredErrorsTypesMod.Level, text: Column => String): DocsUrlString = {
    val __obj = js.Dynamic.literal(docsUrl = docsUrl.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[DocsUrlString]
  }
  
  @scala.inline
  implicit class DocsUrlStringMutableBuilder[Self <: DocsUrlString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: typings.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Column => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
