package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ThemeType extends StObject {
  
  var additional_backgrounds_alignment: js.UndefOr[js.Array[ThemeTypeAdditionalBackgroundsAlignment]] = js.undefined
  
  var additional_backgrounds_tiling: js.UndefOr[js.Array[ThemeTypeAdditionalBackgroundsTiling]] = js.undefined
}
object _ThemeType {
  
  inline def apply(): _ThemeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_ThemeType]
  }
  
  extension [Self <: _ThemeType](x: Self) {
    
    inline def setAdditional_backgrounds_alignment(value: js.Array[ThemeTypeAdditionalBackgroundsAlignment]): Self = StObject.set(x, "additional_backgrounds_alignment", value.asInstanceOf[js.Any])
    
    inline def setAdditional_backgrounds_alignmentUndefined: Self = StObject.set(x, "additional_backgrounds_alignment", js.undefined)
    
    inline def setAdditional_backgrounds_alignmentVarargs(value: ThemeTypeAdditionalBackgroundsAlignment*): Self = StObject.set(x, "additional_backgrounds_alignment", js.Array(value*))
    
    inline def setAdditional_backgrounds_tiling(value: js.Array[ThemeTypeAdditionalBackgroundsTiling]): Self = StObject.set(x, "additional_backgrounds_tiling", value.asInstanceOf[js.Any])
    
    inline def setAdditional_backgrounds_tilingUndefined: Self = StObject.set(x, "additional_backgrounds_tiling", js.undefined)
    
    inline def setAdditional_backgrounds_tilingVarargs(value: ThemeTypeAdditionalBackgroundsTiling*): Self = StObject.set(x, "additional_backgrounds_tiling", js.Array(value*))
  }
}
