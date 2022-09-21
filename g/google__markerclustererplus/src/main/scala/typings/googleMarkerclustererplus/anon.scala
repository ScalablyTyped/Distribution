package typings.googleMarkerclustererplus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsAdded extends StObject {
    
    var isAdded: js.UndefOr[Boolean] = js.undefined
  }
  object IsAdded {
    
    inline def apply(): IsAdded = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsAdded]
    }
    
    extension [Self <: IsAdded](x: Self) {
      
      inline def setIsAdded(value: Boolean): Self = StObject.set(x, "isAdded", value.asInstanceOf[js.Any])
      
      inline def setIsAddedUndefined: Self = StObject.set(x, "isAdded", js.undefined)
    }
  }
}
