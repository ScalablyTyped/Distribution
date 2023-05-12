package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWizardWizardContainerMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Wizard/WizardContainer", JSImport.Default)
  @js.native
  val default: FunctionComponent[WizardContainerProps] = js.native
  
  trait WizardContainerProps extends StObject {
    
    /** Wizard contents to render (should be Wizard.Navigation, Wizard.Content and Wizard.Footer respectively) */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** CSS class(es) to add to the element. */
    var className: js.UndefOr[String] = js.undefined
  }
  object WizardContainerProps {
    
    inline def apply(): WizardContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WizardContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WizardContainerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type _To = FunctionComponent[WizardContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `libWizardWizardContainerMod.foo` */
  override def _to: FunctionComponent[WizardContainerProps] = default
}
