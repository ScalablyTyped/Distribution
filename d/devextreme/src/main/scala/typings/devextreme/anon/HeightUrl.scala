package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightUrl extends StObject {
  
  var height: js.UndefOr[Double | RangeMaxPoint] = js.undefined
  
  var url: js.UndefOr[String | RangeMinPoint] = js.undefined
  
  var width: js.UndefOr[Double | RangeMaxPoint] = js.undefined
}
object HeightUrl {
  
  inline def apply(): HeightUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightUrl]
  }
  
  extension [Self <: HeightUrl](x: Self) {
    
    inline def setHeight(value: Double | RangeMaxPoint): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setUrl(value: String | RangeMinPoint): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double | RangeMaxPoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
