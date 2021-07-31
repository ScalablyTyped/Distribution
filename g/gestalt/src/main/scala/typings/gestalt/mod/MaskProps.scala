package typings.gestalt.mod

import typings.gestalt.gestaltNumbers.`0`
import typings.gestalt.gestaltNumbers.`1`
import typings.gestalt.gestaltNumbers.`2`
import typings.gestalt.gestaltNumbers.`3`
import typings.gestalt.gestaltNumbers.`4`
import typings.gestalt.gestaltNumbers.`5`
import typings.gestalt.gestaltNumbers.`6`
import typings.gestalt.gestaltNumbers.`7`
import typings.gestalt.gestaltNumbers.`8`
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
  
  @scala.inline
  def apply(): MaskProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskProps]
  }
  
  @scala.inline
  implicit class MaskPropsMutableBuilder[Self <: MaskProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setRounding(value: circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    @scala.inline
    def setWash(value: Boolean): Self = StObject.set(x, "wash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWashUndefined: Self = StObject.set(x, "wash", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWillChangeTransform(value: Boolean): Self = StObject.set(x, "willChangeTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillChangeTransformUndefined: Self = StObject.set(x, "willChangeTransform", js.undefined)
  }
}
