package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var level: typings.gatsbyCli.structuredErrorsTypesMod.Level
  
  def text(context: js.Any): String
  
  var `type`: typings.gatsbyCli.structuredErrorsTypesMod.Type
}
object Text {
  
  @scala.inline
  def apply(
    level: typings.gatsbyCli.structuredErrorsTypesMod.Level,
    text: js.Any => String,
    `type`: typings.gatsbyCli.structuredErrorsTypesMod.Type
  ): Text = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: typings.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: js.Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: typings.gatsbyCli.structuredErrorsTypesMod.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
