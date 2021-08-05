package typings.gestalt.mod

import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.down
import typings.gestalt.gestaltStrings.flexible
import typings.gestalt.gestaltStrings.left
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.orange
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.right
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.up
import typings.gestalt.gestaltStrings.white
import typings.gestalt.gestaltStrings.xl
import typings.gestalt.gestaltStrings.xs
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlyoutProps extends StObject {
  
  var anchor: HTMLElement
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var color: js.UndefOr[blue | orange | red | white | darkGray] = js.undefined
  
  var idealDirection: js.UndefOr[up | right | down | left] = js.undefined
  
  // ideally a HTMLAnchorElement
  def onDismiss(): Unit
  
  var positionRelativeToAnchor: js.UndefOr[Boolean] = js.undefined
  
  var shouldFocus: js.UndefOr[Boolean] = js.undefined
  
  var showCaret: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[xs | sm | md | lg | xl | flexible | Double] = js.undefined
}
object FlyoutProps {
  
  inline def apply(anchor: HTMLElement, onDismiss: () => Unit): FlyoutProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[FlyoutProps]
  }
  
  extension [Self <: FlyoutProps](x: Self) {
    
    inline def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: blue | orange | red | white | darkGray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIdealDirection(value: up | right | down | left): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
    
    inline def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setPositionRelativeToAnchor(value: Boolean): Self = StObject.set(x, "positionRelativeToAnchor", value.asInstanceOf[js.Any])
    
    inline def setPositionRelativeToAnchorUndefined: Self = StObject.set(x, "positionRelativeToAnchor", js.undefined)
    
    inline def setShouldFocus(value: Boolean): Self = StObject.set(x, "shouldFocus", value.asInstanceOf[js.Any])
    
    inline def setShouldFocusUndefined: Self = StObject.set(x, "shouldFocus", js.undefined)
    
    inline def setShowCaret(value: Boolean): Self = StObject.set(x, "showCaret", value.asInstanceOf[js.Any])
    
    inline def setShowCaretUndefined: Self = StObject.set(x, "showCaret", js.undefined)
    
    inline def setSize(value: xs | sm | md | lg | xl | flexible | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
