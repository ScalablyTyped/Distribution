package typings.gestalt.mod

import typings.gestalt.gestaltInts.`0`
import typings.gestalt.gestaltInts.`1`
import typings.gestalt.gestaltInts.`2`
import typings.gestalt.gestaltInts.`3`
import typings.gestalt.gestaltInts.`4`
import typings.gestalt.gestaltInts.`5`
import typings.gestalt.gestaltInts.`6`
import typings.gestalt.gestaltInts.`7`
import typings.gestalt.gestaltInts.`8`
import typings.gestalt.gestaltStrings.circle
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var rounding: js.UndefOr[circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  
  var wash: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var willChangeTransform: js.UndefOr[Boolean] = js.undefined
}
object MaskProps {
  
  inline def apply(): MaskProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskProps]
  }
  
  extension [Self <: MaskProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setRounding(value: circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    inline def setWash(value: Boolean): Self = StObject.set(x, "wash", value.asInstanceOf[js.Any])
    
    inline def setWashUndefined: Self = StObject.set(x, "wash", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWillChangeTransform(value: Boolean): Self = StObject.set(x, "willChangeTransform", value.asInstanceOf[js.Any])
    
    inline def setWillChangeTransformUndefined: Self = StObject.set(x, "willChangeTransform", js.undefined)
  }
}
