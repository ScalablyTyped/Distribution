package typings.gestalt.anon

import typings.gestalt.gestaltStrings.alertdialog
import typings.gestalt.gestaltStrings.auto
import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.dialog
import typings.gestalt.gestaltStrings.full
import typings.gestalt.mod.AbstractEventHandler
import typings.gestalt.mod.Indexable
import typings.gestalt.mod.OnAnimationEndType
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAnimationEnd extends StObject {
  
  var accessibilityLabel: String
  
  var onAnimationEnd: js.UndefOr[OnAnimationEndType] = js.undefined
  
  var onClick: js.UndefOr[
    AbstractEventHandler[
      (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement]), 
      OnDismissStart
    ]
  ] = js.undefined
  
  var primaryAction: js.UndefOr[Target] = js.undefined
  
  var role: js.UndefOr[alertdialog | dialog] = js.undefined
  
  var showDismissButton: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[default | full | auto] = js.undefined
  
  var subHeading: js.UndefOr[String] = js.undefined
  
  var zIndex: js.UndefOr[Indexable] = js.undefined
}
object OnAnimationEnd {
  
  inline def apply(accessibilityLabel: String): OnAnimationEnd = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAnimationEnd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnAnimationEnd] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setOnAnimationEnd(value: /* args */ AnimationState => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnClick(
      value: /* arg */ OnDismissStart & (Event[
          (MouseEvent[HTMLAnchorElement | HTMLButtonElement, NativeMouseEvent]) | (KeyboardEvent[HTMLAnchorElement | HTMLButtonElement])
        ]) => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setPrimaryAction(value: Target): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
    
    inline def setPrimaryActionUndefined: Self = StObject.set(x, "primaryAction", js.undefined)
    
    inline def setRole(value: alertdialog | dialog): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setShowDismissButton(value: Boolean): Self = StObject.set(x, "showDismissButton", value.asInstanceOf[js.Any])
    
    inline def setShowDismissButtonUndefined: Self = StObject.set(x, "showDismissButton", js.undefined)
    
    inline def setSize(value: default | full | auto): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSubHeading(value: String): Self = StObject.set(x, "subHeading", value.asInstanceOf[js.Any])
    
    inline def setSubHeadingUndefined: Self = StObject.set(x, "subHeading", js.undefined)
    
    inline def setZIndex(value: Indexable): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
