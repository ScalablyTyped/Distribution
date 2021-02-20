package typings.gestalt.mod

import typings.gestalt.anon.EventSyntheticEvent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardProps extends StObject {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var image: js.UndefOr[ReactNode] = js.native
  
  var onMouseEnter: js.UndefOr[js.Function1[/* args */ EventSyntheticEvent, Unit]] = js.native
  
  var onMouseLeave: js.UndefOr[js.Function1[/* args */ EventSyntheticEvent, Unit]] = js.native
}
object CardProps {
  
  @scala.inline
  def apply(): CardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardProps]
  }
  
  @scala.inline
  implicit class CardPropsMutableBuilder[Self <: CardProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* args */ EventSyntheticEvent => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* args */ EventSyntheticEvent => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
  }
}
