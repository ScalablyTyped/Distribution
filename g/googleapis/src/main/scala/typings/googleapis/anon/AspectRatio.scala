package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AspectRatio extends StObject {
  
  var aspectRatio: js.UndefOr[String] = js.undefined
  
  var minHeight: js.UndefOr[String] = js.undefined
  
  var minWidth: js.UndefOr[String] = js.undefined
}
object AspectRatio {
  
  inline def apply(): AspectRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AspectRatio]
  }
  
  extension [Self <: AspectRatio](x: Self) {
    
    inline def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setMinHeight(value: String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
  }
}
