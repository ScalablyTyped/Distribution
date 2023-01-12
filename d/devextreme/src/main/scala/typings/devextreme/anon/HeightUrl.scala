package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightUrl extends StObject {
  
  /**
    * Specifies the height of the image used instead of a point marker.
    */
  var height: js.UndefOr[Double | RangeMaxPoint] = js.undefined
  
  /**
    * Specifies the URL of the image to be used as a point marker.
    */
  var url: js.UndefOr[String | RangeMinPoint] = js.undefined
  
  /**
    * Specifies the width of an image that is used as a point marker.
    */
  var width: js.UndefOr[Double | RangeMaxPoint] = js.undefined
}
object HeightUrl {
  
  inline def apply(): HeightUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeightUrl] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double | RangeMaxPoint): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setUrl(value: String | RangeMinPoint): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double | RangeMaxPoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
