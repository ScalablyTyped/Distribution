package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  var level: typings.gatsbyCli.structuredErrorsTypesMod.Level
  
  def text(context: js.Any): String
}
object Level {
  
  @scala.inline
  def apply(level: typings.gatsbyCli.structuredErrorsTypesMod.Level, text: js.Any => String): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: typings.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: js.Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
