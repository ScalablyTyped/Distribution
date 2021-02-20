package typings.gatsbyCli.anon

import typings.gatsbyCli.errorMapMod.ErrorCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryDocsUrl extends StObject {
  
  var category: ErrorCategory = js.native
  
  var docsUrl: String = js.native
  
  var level: typings.gatsbyCli.structuredErrorsTypesMod.Level = js.native
  
  def text(context: js.Any): String = js.native
  
  var `type`: typings.gatsbyCli.structuredErrorsTypesMod.Type = js.native
}
object CategoryDocsUrl {
  
  @scala.inline
  def apply(
    category: ErrorCategory,
    docsUrl: String,
    level: typings.gatsbyCli.structuredErrorsTypesMod.Level,
    text: js.Any => String,
    `type`: typings.gatsbyCli.structuredErrorsTypesMod.Type
  ): CategoryDocsUrl = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], docsUrl = docsUrl.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryDocsUrl]
  }
  
  @scala.inline
  implicit class CategoryDocsUrlMutableBuilder[Self <: CategoryDocsUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: ErrorCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: typings.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: js.Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: typings.gatsbyCli.structuredErrorsTypesMod.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
