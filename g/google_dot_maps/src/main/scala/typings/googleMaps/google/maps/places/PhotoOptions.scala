package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines photo-requesting options.
  */
trait PhotoOptions extends StObject {
  
  /**
    * The maximum height in pixels of the returned image.
    */
  var maxHeight: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum width in pixels of the returned image.
    */
  var maxWidth: js.UndefOr[Double | Null] = js.undefined
}
object PhotoOptions {
  
  inline def apply(): PhotoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhotoOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightNull: Self = StObject.set(x, "maxHeight", null)
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
  }
}
