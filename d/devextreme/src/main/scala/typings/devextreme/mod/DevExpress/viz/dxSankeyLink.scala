package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSankeyLink extends StObject {
  
  /**
    * An object that describes the connection.
    */
  var connection: js.UndefOr[dxSankeyConnectionInfoObject] = js.undefined
  
  /**
    * Hides the sankey link&apos;s tooltip.
    */
  def hideTooltip(): Unit
  
  /**
    * Changes the sankey link&apos;s hover state.
    */
  def hover(state: Boolean): Unit
  
  /**
    * Indicates whether the sankey link is in the hover state.
    */
  def isHovered(): Boolean
  
  /**
    * Shows the sankey link&apos;s tooltip.
    */
  def showTooltip(): Unit
}
object dxSankeyLink {
  
  inline def apply(hideTooltip: () => Unit, hover: Boolean => Unit, isHovered: () => Boolean, showTooltip: () => Unit): dxSankeyLink = {
    val __obj = js.Dynamic.literal(hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), showTooltip = js.Any.fromFunction0(showTooltip))
    __obj.asInstanceOf[dxSankeyLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxSankeyLink] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: dxSankeyConnectionInfoObject): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setHideTooltip(value: () => Unit): Self = StObject.set(x, "hideTooltip", js.Any.fromFunction0(value))
    
    inline def setHover(value: Boolean => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction1(value))
    
    inline def setIsHovered(value: () => Boolean): Self = StObject.set(x, "isHovered", js.Any.fromFunction0(value))
    
    inline def setShowTooltip(value: () => Unit): Self = StObject.set(x, "showTooltip", js.Any.fromFunction0(value))
  }
}
