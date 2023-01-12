package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexItemHighlightConfig extends StObject {
  
  /**
    * Style of the border around the box representing the item's base size
    */
  var baseSizeBorder: js.UndefOr[LineStyle] = js.undefined
  
  /**
    * Style of the box representing the item's base size
    */
  var baseSizeBox: js.UndefOr[BoxStyle] = js.undefined
  
  /**
    * Style of the arrow representing if the item grew or shrank
    */
  var flexibilityArrow: js.UndefOr[LineStyle] = js.undefined
}
object FlexItemHighlightConfig {
  
  inline def apply(): FlexItemHighlightConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexItemHighlightConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexItemHighlightConfig] (val x: Self) extends AnyVal {
    
    inline def setBaseSizeBorder(value: LineStyle): Self = StObject.set(x, "baseSizeBorder", value.asInstanceOf[js.Any])
    
    inline def setBaseSizeBorderUndefined: Self = StObject.set(x, "baseSizeBorder", js.undefined)
    
    inline def setBaseSizeBox(value: BoxStyle): Self = StObject.set(x, "baseSizeBox", value.asInstanceOf[js.Any])
    
    inline def setBaseSizeBoxUndefined: Self = StObject.set(x, "baseSizeBox", js.undefined)
    
    inline def setFlexibilityArrow(value: LineStyle): Self = StObject.set(x, "flexibilityArrow", value.asInstanceOf[js.Any])
    
    inline def setFlexibilityArrowUndefined: Self = StObject.set(x, "flexibilityArrow", js.undefined)
  }
}
