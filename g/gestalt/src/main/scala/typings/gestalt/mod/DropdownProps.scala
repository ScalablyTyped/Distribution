package typings.gestalt.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownProps extends StObject {
  
  /**
    * Ref for the element that the Dropdown will attach to, will most likely be a Button
    */
  var anchor: js.UndefOr[HTMLElement] = js.undefined
  
  var children: ReactElement | js.Array[ReactElement]
  
  /**
    * Removes the Layer component around Popover.
    * Should only be used in cases where Layer breaks the Dropdown positionings such as
    * when the anchor element is within a sticky component.
    */
  var dangerouslyRemoveLayer: js.UndefOr[Boolean] = js.undefined
  
  var headerContent: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Unique id to identify this Dropdown
    */
  var id: String
  
  /**
    * Preferred direction for the Dropdown to open
    *
    * @default "down"
    */
  var idealDirection: js.UndefOr[FourDirections] = js.undefined
  
  def onDismiss(): Unit
  
  var zIndex: js.UndefOr[Indexable] = js.undefined
}
object DropdownProps {
  
  inline def apply(children: ReactElement | js.Array[ReactElement], id: String, onDismiss: () => Unit): DropdownProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[DropdownProps]
  }
  
  extension [Self <: DropdownProps](x: Self) {
    
    inline def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDangerouslyRemoveLayer(value: Boolean): Self = StObject.set(x, "dangerouslyRemoveLayer", value.asInstanceOf[js.Any])
    
    inline def setDangerouslyRemoveLayerUndefined: Self = StObject.set(x, "dangerouslyRemoveLayer", js.undefined)
    
    inline def setHeaderContent(value: ReactNode): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
    
    inline def setHeaderContentUndefined: Self = StObject.set(x, "headerContent", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdealDirection(value: FourDirections): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
    
    inline def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setZIndex(value: Indexable): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
