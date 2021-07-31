package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Token/Token", JSImport.Default)
  @js.native
  val default: FunctionComponent[TokenProps] = js.native
  
  trait TokenProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    @JSName("onClick")
    var onClick_TokenProps: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]
      ] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
  }
  object TokenProps {
    
    @scala.inline
    def apply(): TokenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenProps]
    }
    
    @scala.inline
    implicit class TokenPropsMutableBuilder[Self <: TokenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    }
  }
  
  type _To = FunctionComponent[TokenProps]
  
  /* This means you don't have to write `default`, but can instead just say `tokenMod.foo` */
  override def _to: FunctionComponent[TokenProps] = default
}
