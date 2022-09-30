package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  var level: typings.gatsbyCli.structuredErrorsTypesMod.Level
  
  def text(context: Any): String
}
object Level {
  
  inline def apply(level: typings.gatsbyCli.structuredErrorsTypesMod.Level, text: Any => String): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[Level]
  }
  
  extension [Self <: Level](x: Self) {
    
    inline def setLevel(value: typings.gatsbyCli.structuredErrorsTypesMod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setText(value: Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
