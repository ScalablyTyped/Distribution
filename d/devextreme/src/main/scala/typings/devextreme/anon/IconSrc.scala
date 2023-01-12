package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSrc extends StObject {
  
  /**
    * A URL pointing to the custom icon to be used for the marker.
    */
  var iconSrc: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the marker location.
    */
  var location: js.UndefOr[Any | String | js.Array[Double]] = js.undefined
  
  /**
    * A callback function performed when the marker is clicked.
    */
  var onClick: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A tooltip to be used for the marker.
    */
  var tooltip: js.UndefOr[String | IsShown] = js.undefined
}
object IconSrc {
  
  inline def apply(): IconSrc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSrc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconSrc] (val x: Self) extends AnyVal {
    
    inline def setIconSrc(value: String): Self = StObject.set(x, "iconSrc", value.asInstanceOf[js.Any])
    
    inline def setIconSrcUndefined: Self = StObject.set(x, "iconSrc", js.undefined)
    
    inline def setLocation(value: Any | String | js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTooltip(value: String | IsShown): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
