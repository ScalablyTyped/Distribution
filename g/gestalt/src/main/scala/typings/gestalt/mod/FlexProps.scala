package typings.gestalt.mod

import typings.gestalt.gestaltStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexProps extends StObject {
  
  var alignContent: js.UndefOr[AlignContentType] = js.undefined
  
  var alignItems: js.UndefOr[AlignItemsType] = js.undefined
  
  var alignSelf: js.UndefOr[auto | AlignItemsType] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var dataTestId: js.UndefOr[String] = js.undefined
  
  var direction: js.UndefOr[DirectionType] = js.undefined
  
  var flex: js.UndefOr[FlexType] = js.undefined
  
  var gap: js.UndefOr[UnsignedUpTo12 | typings.gestalt.anon.Column] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var justifyContent: js.UndefOr[JustifyContentType] = js.undefined
  
  var lgAlignItems: js.UndefOr[AlignItemsType] = js.undefined
  
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  
  var mdAlignItems: js.UndefOr[AlignItemsType] = js.undefined
  
  var minHeight: js.UndefOr[Double | String] = js.undefined
  
  var minWidth: js.UndefOr[Double | String] = js.undefined
  
  var overflow: js.UndefOr[OverflowType] = js.undefined
  
  var smAlignItems: js.UndefOr[AlignItemsType] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object FlexProps {
  
  inline def apply(): FlexProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexProps] (val x: Self) extends AnyVal {
    
    inline def setAlignContent(value: AlignContentType): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    inline def setAlignItems(value: AlignItemsType): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    inline def setAlignSelf(value: auto | AlignItemsType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDataTestId(value: String): Self = StObject.set(x, "dataTestId", value.asInstanceOf[js.Any])
    
    inline def setDataTestIdUndefined: Self = StObject.set(x, "dataTestId", js.undefined)
    
    inline def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFlex(value: FlexType): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setGap(value: UnsignedUpTo12 | typings.gestalt.anon.Column): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setJustifyContent(value: JustifyContentType): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    inline def setLgAlignItems(value: AlignItemsType): Self = StObject.set(x, "lgAlignItems", value.asInstanceOf[js.Any])
    
    inline def setLgAlignItemsUndefined: Self = StObject.set(x, "lgAlignItems", js.undefined)
    
    inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMdAlignItems(value: AlignItemsType): Self = StObject.set(x, "mdAlignItems", value.asInstanceOf[js.Any])
    
    inline def setMdAlignItemsUndefined: Self = StObject.set(x, "mdAlignItems", js.undefined)
    
    inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOverflow(value: OverflowType): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setSmAlignItems(value: AlignItemsType): Self = StObject.set(x, "smAlignItems", value.asInstanceOf[js.Any])
    
    inline def setSmAlignItemsUndefined: Self = StObject.set(x, "smAlignItems", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
