package typings.gestalt.mod

import typings.gestalt.gestaltStrings.down
import typings.gestalt.gestaltStrings.left
import typings.gestalt.gestaltStrings.right
import typings.gestalt.gestaltStrings.up
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipProps extends StObject {
  
  var children: ReactNode
  
  var idealDirection: js.UndefOr[up | right | down | left] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var link: js.UndefOr[ReactNode] = js.undefined
  
  var text: String
  
  var zIndex: js.UndefOr[Indexable] = js.undefined
}
object TooltipProps {
  
  @scala.inline
  def apply(text: String): TooltipProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setIdealDirection(value: up | right | down | left): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setLink(value: ReactNode): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: Indexable): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
