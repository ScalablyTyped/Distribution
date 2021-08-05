package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationVisibility extends StObject {
  
  var location: js.UndefOr[String] = js.undefined
  
  var visibility: js.UndefOr[Boolean] = js.undefined
}
object LocationVisibility {
  
  inline def apply(): LocationVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationVisibility]
  }
  
  extension [Self <: LocationVisibility](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
