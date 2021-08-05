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
  
  extension [Self <: LocationObject](x: Self) {
    
    inline def setBidModifier(value: Double): Self = StObject.set(x, "bidModifier", value.asInstanceOf[js.Any])
    
    inline def setBidModifierUndefined: Self = StObject.set(x, "bidModifier", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
