package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLButtonElement
import typings.std.HTMLSpanElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokenTokenMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Token/Token", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TokenProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait TokenProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    /** A localized string to be used as aria-label for the token's button */
    var buttonLabel: String
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    @JSName("onClick")
    var onClick_TokenProps: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
      ] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
  }
  object TokenProps {
    
    inline def apply(buttonLabel: String): TokenProps = {
      val __obj = js.Dynamic.literal(buttonLabel = buttonLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenProps] (val x: Self) extends AnyVal {
      
      inline def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[TokenProps & RefAttributes[HTMLSpanElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libTokenTokenMod.foo` */
  override def _to: ForwardRefExoticComponent[TokenProps & RefAttributes[HTMLSpanElement]] = default
}
