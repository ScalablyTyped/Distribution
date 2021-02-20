package typings.gatsbyCli.anon

import typings.gatsbyCli.errorMapMod.ErrorCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelText extends StObject {
  
  var category: ErrorCategory = js.native
  
  var level: typings.gatsbyCli.structuredErrorsTypesMod.Level = js.native
  
  def text(context: js.Any): String = js.native
}
object LevelText {
  
  @scala.inline
  def apply(
    category: ErrorCategory,
    level: typings.gatsbyCli.structuredErrorsTypesMod.Level,
    text: js.Any => String
  ): LevelText = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[LevelText]
  }
  
  @scala.inline
  implicit class LevelTextMutableBuilder[Self <: LevelText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: ErrorCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: typings.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: js.Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
