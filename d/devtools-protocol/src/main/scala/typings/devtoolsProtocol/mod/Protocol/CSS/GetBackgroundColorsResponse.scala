package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackgroundColorsResponse extends StObject {
  
  /**
    * The range of background colors behind this element, if it contains any visible text. If no
    * visible text is present, this will be undefined. In the case of a flat background color,
    * this will consist of simply that color. In the case of a gradient, this will consist of each
    * of the color stops. For anything more complicated, this will be an empty array. Images will
    * be ignored (as if the image had failed to load).
    */
  var backgroundColors: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The computed font size for this node, as a CSS computed value string (e.g. '12px').
    */
  var computedFontSize: js.UndefOr[String] = js.undefined
  
  /**
    * The computed font weight for this node, as a CSS computed value string (e.g. 'normal' or
    * '100').
    */
  var computedFontWeight: js.UndefOr[String] = js.undefined
}
object GetBackgroundColorsResponse {
  
  inline def apply(): GetBackgroundColorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackgroundColorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBackgroundColorsResponse] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColors(value: js.Array[String]): Self = StObject.set(x, "backgroundColors", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorsUndefined: Self = StObject.set(x, "backgroundColors", js.undefined)
    
    inline def setBackgroundColorsVarargs(value: String*): Self = StObject.set(x, "backgroundColors", js.Array(value*))
    
    inline def setComputedFontSize(value: String): Self = StObject.set(x, "computedFontSize", value.asInstanceOf[js.Any])
    
    inline def setComputedFontSizeUndefined: Self = StObject.set(x, "computedFontSize", js.undefined)
    
    inline def setComputedFontWeight(value: String): Self = StObject.set(x, "computedFontWeight", value.asInstanceOf[js.Any])
    
    inline def setComputedFontWeightUndefined: Self = StObject.set(x, "computedFontWeight", js.undefined)
  }
}
