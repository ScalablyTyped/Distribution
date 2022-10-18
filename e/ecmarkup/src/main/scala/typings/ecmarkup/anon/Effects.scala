package typings.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Effects extends StObject {
  
  var description: typings.std.Element | Null
  
  var effects: js.Array[String]
  
  var `for`: typings.std.Element | Null
  
  var redefinition: Boolean
}
object Effects {
  
  inline def apply(effects: js.Array[String], redefinition: Boolean): Effects = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], redefinition = redefinition.asInstanceOf[js.Any], description = null)
    __obj.updateDynamic("for")(null)
    __obj.asInstanceOf[Effects]
  }
  
  extension [Self <: Effects](x: Self) {
    
    inline def setDescription(value: typings.std.Element): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEffects(value: js.Array[String]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsVarargs(value: String*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setFor(value: typings.std.Element): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForNull: Self = StObject.set(x, "for", null)
    
    inline def setRedefinition(value: Boolean): Self = StObject.set(x, "redefinition", value.asInstanceOf[js.Any])
  }
}
