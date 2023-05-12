package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ThemeType extends StObject {
  
  var additional_backgrounds_alignment: js.UndefOr[js.Array[ThemeTypeAdditionalBackgroundsAlignment]] = js.undefined
  
  var additional_backgrounds_tiling: js.UndefOr[js.Array[ThemeTypeAdditionalBackgroundsTiling]] = js.undefined
  
  var color_scheme: js.UndefOr[ThemeTypeColorScheme] = js.undefined
  
  var content_color_scheme: js.UndefOr[ThemeTypeContentColorScheme] = js.undefined
}
object _ThemeType {
  
  inline def apply(): _ThemeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_ThemeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: _ThemeType] (val x: Self) extends AnyVal {
    
    inline def setAdditional_backgrounds_alignment(value: js.Array[ThemeTypeAdditionalBackgroundsAlignment]): Self = StObject.set(x, "additional_backgrounds_alignment", value.asInstanceOf[js.Any])
    
    inline def setAdditional_backgrounds_alignmentUndefined: Self = StObject.set(x, "additional_backgrounds_alignment", js.undefined)
    
    inline def setAdditional_backgrounds_alignmentVarargs(value: ThemeTypeAdditionalBackgroundsAlignment*): Self = StObject.set(x, "additional_backgrounds_alignment", js.Array(value*))
    
    inline def setAdditional_backgrounds_tiling(value: js.Array[ThemeTypeAdditionalBackgroundsTiling]): Self = StObject.set(x, "additional_backgrounds_tiling", value.asInstanceOf[js.Any])
    
    inline def setAdditional_backgrounds_tilingUndefined: Self = StObject.set(x, "additional_backgrounds_tiling", js.undefined)
    
    inline def setAdditional_backgrounds_tilingVarargs(value: ThemeTypeAdditionalBackgroundsTiling*): Self = StObject.set(x, "additional_backgrounds_tiling", js.Array(value*))
    
    inline def setColor_scheme(value: ThemeTypeColorScheme): Self = StObject.set(x, "color_scheme", value.asInstanceOf[js.Any])
    
    inline def setColor_schemeUndefined: Self = StObject.set(x, "color_scheme", js.undefined)
    
    inline def setContent_color_scheme(value: ThemeTypeContentColorScheme): Self = StObject.set(x, "content_color_scheme", value.asInstanceOf[js.Any])
    
    inline def setContent_color_schemeUndefined: Self = StObject.set(x, "content_color_scheme", js.undefined)
  }
}
