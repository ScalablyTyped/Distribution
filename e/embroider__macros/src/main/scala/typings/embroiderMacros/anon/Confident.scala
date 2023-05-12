package typings.embroiderMacros.anon

import typings.embroiderMacros.embroiderMacrosBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Confident extends StObject {
  
  var confident: `true`
  
  var value: Any
}
object Confident {
  
  inline def apply(value: Any): Confident = {
    val __obj = js.Dynamic.literal(confident = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confident]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Confident] (val x: Self) extends AnyVal {
    
    inline def setConfident(value: `true`): Self = StObject.set(x, "confident", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
