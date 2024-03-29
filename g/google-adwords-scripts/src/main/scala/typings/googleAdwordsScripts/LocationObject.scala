package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationObject extends StObject {
  
  var bidModifier: js.UndefOr[Double] = js.undefined
  
  var id: Double
}
object LocationObject {
  
  inline def apply(id: Double): LocationObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationObject] (val x: Self) extends AnyVal {
    
    inline def setBidModifier(value: Double): Self = StObject.set(x, "bidModifier", value.asInstanceOf[js.Any])
    
    inline def setBidModifierUndefined: Self = StObject.set(x, "bidModifier", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
