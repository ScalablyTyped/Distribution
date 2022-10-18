package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.State
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComboboxInputComboboxInputMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/ComboboxInput/ComboboxInput", JSImport.Default)
  @js.native
  val default: FunctionComponent[ComboboxInputProps] = js.native
  
  trait ComboboxInputProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var buttonProps: js.UndefOr[js.Object] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var inputProps: js.UndefOr[js.Object] = js.undefined
    
    var list: ReactNode
    
    /* An object containing a `Menu` component. */
    var menu: ReactElement
    
    var onClick: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent], Unit]
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[js.Object] = js.undefined
    
    var validationState: js.UndefOr[State] = js.undefined
  }
  object ComboboxInputProps {
    
    inline def apply(menu: ReactElement): ComboboxInputProps = {
      val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComboboxInputProps]
    }
    
    extension [Self <: ComboboxInputProps](x: Self) {
      
      inline def setButtonProps(value: js.Object): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      inline def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setList(value: ReactNode): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setMenu(value: ReactElement): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopoverProps(value: js.Object): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setValidationState(value: State): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
  
  type _To = FunctionComponent[ComboboxInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComboboxInputComboboxInputMod.foo` */
  override def _to: FunctionComponent[ComboboxInputProps] = default
}
