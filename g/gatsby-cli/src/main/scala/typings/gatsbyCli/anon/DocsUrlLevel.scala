package typings.gatsbyCli.anon

import typings.gatsbyCli.errorMapMod.ErrorCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocsUrlLevel extends StObject {
  
  var category: ErrorCategory = js.native
  
  var docsUrl: String = js.native
  
  var level: typings.gatsbyCli.structuredErrorsTypesMod.Level = js.native
  
  def text(): String = js.native
}
object DocsUrlLevel {
  
  @scala.inline
  def apply(
    category: ErrorCategory,
    docsUrl: String,
    level: typings.gatsbyCli.structuredErrorsTypesMod.Level,
    text: () => String
  ): DocsUrlLevel = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], docsUrl = docsUrl.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[DocsUrlLevel]
  }
  
  @scala.inline
  implicit class DocsUrlLevelMutableBuilder[Self <: DocsUrlLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: ErrorCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: typings.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
  }
}
