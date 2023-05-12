package typings.gestalt.mod

import typings.gestalt.gestaltStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexItemProps extends StObject {
  
  var alignSelf: js.UndefOr[auto | AlignItemsType] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var dataTestId: js.UndefOr[String] = js.undefined
  
  var flex: js.UndefOr[FlexType] = js.undefined
  
  var flexBasis: js.UndefOr[String | Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  
  var minWidth: js.UndefOr[Double | String] = js.undefined
}
object FlexItemProps {
  
  inline def apply(): FlexItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexItemProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexItemProps] (val x: Self) extends AnyVal {
    
    inline def setAlignSelf(value: auto | AlignItemsType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDataTestId(value: String): Self = StObject.set(x, "dataTestId", value.asInstanceOf[js.Any])
    
    inline def setDataTestIdUndefined: Self = StObject.set(x, "dataTestId", js.undefined)
    
    inline def setFlex(value: FlexType): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexBasis(value: String | Double): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
  }
}
