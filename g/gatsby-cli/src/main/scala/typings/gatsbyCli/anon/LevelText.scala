package typings.gatsbyCli.anon

import typings.gatsbyCli.errorMapMod.ErrorCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelText extends StObject {
  
  var category: ErrorCategory
  
  var level: typings.gatsbyCli.structuredErrorsTypesMod.Level
  
  def text(context: js.Any): String
}
object LevelText {
  
  inline def apply(
    category: ErrorCategory,
    level: typings.gatsbyCli.structuredErrorsTypesMod.Level,
    text: js.Any => String
  ): LevelText = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[LevelText]
  }
  
  extension [Self <: LevelText](x: Self) {
    
    inline def setCategory(value: ErrorCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: typings.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setText(value: js.Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
