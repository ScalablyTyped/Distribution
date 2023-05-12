package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import typings.fundamentalReact.fundamentalReactStrings.lg
import typings.fundamentalReact.fundamentalReactStrings.md
import typings.fundamentalReact.fundamentalReactStrings.sm
import typings.fundamentalReact.fundamentalReactStrings.xl
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWizardWizardNavigationMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Wizard/WizardNavigation", JSImport.Default)
  @js.native
  val default: FunctionComponent[WizardNavigationProps] = js.native
  
  trait WizardNavigationProps extends StObject {
    
    /** Wizard.Step nodes to render as steps */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** CSS class(es) to add to the element */
    var className: js.UndefOr[String] = js.undefined
    
    /** By default wizard header has no horizontal paddings. Add a size to modify the padding */
    var size: js.UndefOr[sm | md | lg | xl] = js.undefined
  }
  object WizardNavigationProps {
    
    inline def apply(): WizardNavigationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WizardNavigationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WizardNavigationProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setSize(value: sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FunctionComponent[WizardNavigationProps]
  
  /* This means you don't have to write `default`, but can instead just say `libWizardWizardNavigationMod.foo` */
  override def _to: FunctionComponent[WizardNavigationProps] = default
}
