package typings.gestalt.mod

import typings.gestalt.gestaltStrings.auto
import typings.gestalt.gestaltStrings.baseline
import typings.gestalt.gestaltStrings.center
import typings.gestalt.gestaltStrings.end
import typings.gestalt.gestaltStrings.grow
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.shrink
import typings.gestalt.gestaltStrings.start
import typings.gestalt.gestaltStrings.stretch
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexItemProps extends StObject {
  
  var alignSelf: js.UndefOr[auto | start | end | center | baseline | stretch] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var flex: js.UndefOr[grow | shrink | none] = js.undefined
  
  var flexBasis: js.UndefOr[String | Double] = js.undefined
  
  var minWidth: js.UndefOr[Double | String] = js.undefined
}
object FlexItemProps {
  
  inline def apply(): FlexItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexItemProps]
  }
  
  extension [Self <: FlexItemProps](x: Self) {
    
    inline def setAlignSelf(value: auto | start | end | center | baseline | stretch): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setFlex(value: grow | shrink | none): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexBasis(value: String | Double): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
  }
}
