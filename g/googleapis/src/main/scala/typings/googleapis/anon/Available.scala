package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Available extends StObject {
  
  var available: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object Available {
  
  inline def apply(): Available = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Available]
  }
  
  extension [Self <: Available](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
