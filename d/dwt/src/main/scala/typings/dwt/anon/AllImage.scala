package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllImage extends StObject {
  
  var allImage: js.UndefOr[DisplayName] = js.undefined
  
  var besides: js.UndefOr[`0`] = js.undefined
  
  var viewPort: js.UndefOr[`0`] = js.undefined
  
  var visibility: js.UndefOr[Boolean] = js.undefined
}
object AllImage {
  
  inline def apply(): AllImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllImage]
  }
  
  extension [Self <: AllImage](x: Self) {
    
    inline def setAllImage(value: DisplayName): Self = StObject.set(x, "allImage", value.asInstanceOf[js.Any])
    
    inline def setAllImageUndefined: Self = StObject.set(x, "allImage", js.undefined)
    
    inline def setBesides(value: `0`): Self = StObject.set(x, "besides", value.asInstanceOf[js.Any])
    
    inline def setBesidesUndefined: Self = StObject.set(x, "besides", js.undefined)
    
    inline def setViewPort(value: `0`): Self = StObject.set(x, "viewPort", value.asInstanceOf[js.Any])
    
    inline def setViewPortUndefined: Self = StObject.set(x, "viewPort", js.undefined)
    
    inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
