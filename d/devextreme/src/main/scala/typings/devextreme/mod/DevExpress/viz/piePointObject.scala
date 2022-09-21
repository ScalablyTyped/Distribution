package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait piePointObject
  extends StObject
     with basePointObject {
  
  /**
    * Hides a specific point.
    */
  def hide(): Unit
  
  /**
    * Provides information about the visibility state of a point.
    */
  def isVisible(): Boolean
  
  /**
    * Gets the percentage value of the specific point.
    */
  var percent: js.UndefOr[String | Double | js.Date] = js.undefined
  
  /**
    * Makes a specific point visible.
    */
  def show(): Unit
}
object piePointObject {
  
  inline def apply(
    clearHover: () => Unit,
    clearSelection: () => Unit,
    getColor: () => String,
    getLabel: () => baseLabelObject & js.Array[baseLabelObject],
    hide: () => Unit,
    hideTooltip: () => Unit,
    hover: () => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    isVisible: () => Boolean,
    select: () => Unit,
    show: () => Unit,
    showTooltip: () => Unit
  ): piePointObject = {
    val __obj = js.Dynamic.literal(clearHover = js.Any.fromFunction0(clearHover), clearSelection = js.Any.fromFunction0(clearSelection), getColor = js.Any.fromFunction0(getColor), getLabel = js.Any.fromFunction0(getLabel), hide = js.Any.fromFunction0(hide), hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction0(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), isVisible = js.Any.fromFunction0(isVisible), select = js.Any.fromFunction0(select), show = js.Any.fromFunction0(show), showTooltip = js.Any.fromFunction0(showTooltip))
    __obj.asInstanceOf[piePointObject]
  }
  
  extension [Self <: piePointObject](x: Self) {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setPercent(value: String | Double | js.Date): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
