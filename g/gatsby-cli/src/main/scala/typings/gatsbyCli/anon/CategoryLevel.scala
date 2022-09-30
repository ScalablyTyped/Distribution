package typings.gatsbyCli.anon

import typings.gatsbyCli.errorMapMod.ErrorCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryLevel extends StObject {
  
  var category: ErrorCategory
  
  var level: typings.gatsbyCli.structuredErrorsTypesMod.Level
  
  def text(context: Any): String
  
  var `type`: typings.gatsbyCli.structuredErrorsTypesMod.Type
}
object CategoryLevel {
  
  inline def apply(
    category: ErrorCategory,
    level: typings.gatsbyCli.structuredErrorsTypesMod.Level,
    text: Any => String,
    `type`: typings.gatsbyCli.structuredErrorsTypesMod.Type
  ): CategoryLevel = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryLevel]
  }
  
  extension [Self <: CategoryLevel](x: Self) {
    
    inline def setCategory(value: ErrorCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: typings.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setText(value: Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    inline def setType(value: typings.gatsbyCli.structuredErrorsTypesMod.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
