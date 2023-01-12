package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSankeyNode extends StObject {
  
  /**
    * Hides the sankey node&apos;s tooltip.
    */
  def hideTooltip(): Unit
  
  /**
    * Changes the sankey node&apos;s hover state.
    */
  def hover(state: Boolean): Unit
  
  /**
    * Indicates whether the sankey node is in the hover state.
    */
  def isHovered(): Boolean
  
  /**
    * The node&apos;s label.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The node&apos;s incoming links.
    */
  var linksIn: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The node&apos;s outgoing links.
    */
  var linksOut: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Shows the sankey node&apos;s tooltip.
    */
  def showTooltip(): Unit
  
  /**
    * The node&apos;s label.
    * @deprecated Use label instead.
    */
  var title: js.UndefOr[String] = js.undefined
}
object dxSankeyNode {
  
  inline def apply(hideTooltip: () => Unit, hover: Boolean => Unit, isHovered: () => Boolean, showTooltip: () => Unit): dxSankeyNode = {
    val __obj = js.Dynamic.literal(hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), showTooltip = js.Any.fromFunction0(showTooltip))
    __obj.asInstanceOf[dxSankeyNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxSankeyNode] (val x: Self) extends AnyVal {
    
    inline def setHideTooltip(value: () => Unit): Self = StObject.set(x, "hideTooltip", js.Any.fromFunction0(value))
    
    inline def setHover(value: Boolean => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction1(value))
    
    inline def setIsHovered(value: () => Boolean): Self = StObject.set(x, "isHovered", js.Any.fromFunction0(value))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLinksIn(value: js.Array[Any]): Self = StObject.set(x, "linksIn", value.asInstanceOf[js.Any])
    
    inline def setLinksInUndefined: Self = StObject.set(x, "linksIn", js.undefined)
    
    inline def setLinksInVarargs(value: Any*): Self = StObject.set(x, "linksIn", js.Array(value*))
    
    inline def setLinksOut(value: js.Array[Any]): Self = StObject.set(x, "linksOut", value.asInstanceOf[js.Any])
    
    inline def setLinksOutUndefined: Self = StObject.set(x, "linksOut", js.undefined)
    
    inline def setLinksOutVarargs(value: Any*): Self = StObject.set(x, "linksOut", js.Array(value*))
    
    inline def setShowTooltip(value: () => Unit): Self = StObject.set(x, "showTooltip", js.Any.fromFunction0(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
