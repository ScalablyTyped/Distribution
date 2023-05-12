package typings.gestalt.mod

import typings.gestalt.anon.AnimationState
import typings.gestalt.gestaltStrings.`30vh`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownProps extends StObject {
  
  var anchor: js.UndefOr[HTMLElement | Null] = js.undefined
  
  var children: Node
  
  var disableMobileUI: js.UndefOr[Boolean] = js.undefined
  
  var headerContent: js.UndefOr[Node] = js.undefined
  
  var id: String
  
  var idealDirection: js.UndefOr[FourDirections] = js.undefined
  
  var isWithinFixedContainer: js.UndefOr[Boolean] = js.undefined
  
  var maxHeight: js.UndefOr[`30vh`] = js.undefined
  
  var mobileOnAnimationEnd: js.UndefOr[OnAnimationEndType] = js.undefined
  
  def onDismiss(): Unit
  
  var zIndex: js.UndefOr[Indexable] = js.undefined
}
object DropdownProps {
  
  inline def apply(id: String, onDismiss: () => Unit): DropdownProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[DropdownProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisableMobileUI(value: Boolean): Self = StObject.set(x, "disableMobileUI", value.asInstanceOf[js.Any])
    
    inline def setDisableMobileUIUndefined: Self = StObject.set(x, "disableMobileUI", js.undefined)
    
    inline def setHeaderContent(value: Node): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
    
    inline def setHeaderContentUndefined: Self = StObject.set(x, "headerContent", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdealDirection(value: FourDirections): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
    
    inline def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
    
    inline def setIsWithinFixedContainer(value: Boolean): Self = StObject.set(x, "isWithinFixedContainer", value.asInstanceOf[js.Any])
    
    inline def setIsWithinFixedContainerUndefined: Self = StObject.set(x, "isWithinFixedContainer", js.undefined)
    
    inline def setMaxHeight(value: `30vh`): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMobileOnAnimationEnd(value: /* args */ AnimationState => Unit): Self = StObject.set(x, "mobileOnAnimationEnd", js.Any.fromFunction1(value))
    
    inline def setMobileOnAnimationEndUndefined: Self = StObject.set(x, "mobileOnAnimationEnd", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setZIndex(value: Indexable): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
