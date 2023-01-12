package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPositionableOptions extends StObject {
  
  var alignment: js.UndefOr[String] = js.undefined
  
  var allowBottomOverlap: js.UndefOr[Boolean] = js.undefined
  
  var allowOverlap: js.UndefOr[Boolean] = js.undefined
  
  var hOffset: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var vOffset: js.UndefOr[Double] = js.undefined
}
object IPositionableOptions {
  
  inline def apply(): IPositionableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPositionableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPositionableOptions] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAllowBottomOverlap(value: Boolean): Self = StObject.set(x, "allowBottomOverlap", value.asInstanceOf[js.Any])
    
    inline def setAllowBottomOverlapUndefined: Self = StObject.set(x, "allowBottomOverlap", js.undefined)
    
    inline def setAllowOverlap(value: Boolean): Self = StObject.set(x, "allowOverlap", value.asInstanceOf[js.Any])
    
    inline def setAllowOverlapUndefined: Self = StObject.set(x, "allowOverlap", js.undefined)
    
    inline def setHOffset(value: Double): Self = StObject.set(x, "hOffset", value.asInstanceOf[js.Any])
    
    inline def setHOffsetUndefined: Self = StObject.set(x, "hOffset", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setVOffset(value: Double): Self = StObject.set(x, "vOffset", value.asInstanceOf[js.Any])
    
    inline def setVOffsetUndefined: Self = StObject.set(x, "vOffset", js.undefined)
  }
}
