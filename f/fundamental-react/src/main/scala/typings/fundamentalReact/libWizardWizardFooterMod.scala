package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWizardWizardFooterMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Wizard/WizardFooter", JSImport.Default)
  @js.native
  val default: FunctionComponent[WizardFooterProps] = js.native
  
  trait WizardFooterProps extends StObject {
    
    /** Nodes to render as extra content before the Cancel button */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** CSS class(es) to add to the element */
    var className: js.UndefOr[String] = js.undefined
    
    /** Cancel button label, default is 'Cancel' */
    var label: js.UndefOr[String] = js.undefined
    
    /** Callback function; triggered when the cancel button is pressed. */
    var onCancel: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
  }
  object WizardFooterProps {
    
    inline def apply(): WizardFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WizardFooterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WizardFooterProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnCancel(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    }
  }
  
  type _To = FunctionComponent[WizardFooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `libWizardWizardFooterMod.foo` */
  override def _to: FunctionComponent[WizardFooterProps] = default
}
