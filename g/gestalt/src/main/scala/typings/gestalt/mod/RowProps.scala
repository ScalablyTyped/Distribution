package typings.gestalt.mod

import typings.gestalt.gestaltStrings.around
import typings.gestalt.gestaltStrings.auto
import typings.gestalt.gestaltStrings.baseline
import typings.gestalt.gestaltStrings.between
import typings.gestalt.gestaltStrings.center
import typings.gestalt.gestaltStrings.end
import typings.gestalt.gestaltStrings.evenly
import typings.gestalt.gestaltStrings.grow
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.shrink
import typings.gestalt.gestaltStrings.start
import typings.gestalt.gestaltStrings.stretch
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowProps extends StObject {
  
  var alignContent: js.UndefOr[start | end | center | between | around | evenly | stretch] = js.undefined
  
  var alignItems: js.UndefOr[start | end | center | baseline | stretch] = js.undefined
  
  var alignSelf: js.UndefOr[auto | start | end | center | baseline | stretch] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var fit: js.UndefOr[Boolean] = js.undefined
  
  var flex: js.UndefOr[grow | shrink | none] = js.undefined
  
  var gap: js.UndefOr[UnsignedUpTo12] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var justifyContent: js.UndefOr[start | end | center | between | around | evenly] = js.undefined
  
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  
  var minHeight: js.UndefOr[Double | String] = js.undefined
  
  var minWidth: js.UndefOr[Double | String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object RowProps {
  
  @scala.inline
  def apply(): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProps]
  }
  
  @scala.inline
  implicit class RowPropsMutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignContent(value: start | end | center | between | around | evenly | stretch): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    @scala.inline
    def setAlignItems(value: start | end | center | baseline | stretch): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    @scala.inline
    def setAlignSelf(value: auto | start | end | center | baseline | stretch): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    @scala.inline
    def setFlex(value: grow | shrink | none): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    @scala.inline
    def setGap(value: UnsignedUpTo12): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setJustifyContent(value: start | end | center | between | around | evenly): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
