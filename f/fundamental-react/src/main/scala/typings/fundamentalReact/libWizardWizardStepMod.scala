package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import typings.fundamentalReact.fundamentalReactStrings.`no-label`
import typings.fundamentalReact.fundamentalReactStrings.`stacked-top`
import typings.fundamentalReact.fundamentalReactStrings.active
import typings.fundamentalReact.fundamentalReactStrings.branching
import typings.fundamentalReact.fundamentalReactStrings.completed
import typings.fundamentalReact.fundamentalReactStrings.current
import typings.fundamentalReact.fundamentalReactStrings.none
import typings.fundamentalReact.fundamentalReactStrings.stacked
import typings.fundamentalReact.fundamentalReactStrings.upcoming
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWizardWizardStepMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Wizard/WizardStep", JSImport.Default)
  @js.native
  val default: FunctionComponent[WizardStepProps] = js.native
  
  trait WizardStepProps extends StObject {
    
    /** (integrated only) Mark step as having unknown following content. */
    var branching: js.UndefOr[Boolean] = js.undefined
    
    /** (integated only) Nodes to render as step content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** CSS class(es) to add to the element. */
    var className: js.UndefOr[String] = js.undefined
    
    /** (standalone only) Appearance of the connector to the next element. */
    var connector: js.UndefOr[
        none | typings.fundamentalReact.fundamentalReactStrings.default | active | branching
      ] = js.undefined
    
    /** Icon glyph to display in the indicator component. */
    var glyph: js.UndefOr[ReactNode] = js.undefined
    
    /** Text to display in the indicator component if no glyph given. */
    var indicator: js.UndefOr[String] = js.undefined
    
    /** Menu to show instead of triggering a click even. Used mostly for stacking steps. */
    var menu: js.UndefOr[ReactNode] = js.undefined
    
    /** (standalone only) Step appearance modifiers. */
    var modifiers: js.UndefOr[
        js.Array[completed | current | upcoming | `no-label` | stacked | `stacked-top` | active]
      ] = js.undefined
    
    /** (integrated only) Label to use on the next step button. */
    var nextLabel: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
    
    /** Label to use as the optional text in step header. */
    var optionalLabel: js.UndefOr[String] = js.undefined
    
    /** (integrated only) Label to use on the previous step button. */
    var previousLabel: js.UndefOr[String] = js.undefined
    
    var title: String
    
    /** (integrated only) True if moving to the next step is allowed. default is true */
    var valid: js.UndefOr[Boolean] = js.undefined
  }
  object WizardStepProps {
    
    inline def apply(title: String): WizardStepProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[WizardStepProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WizardStepProps] (val x: Self) extends AnyVal {
      
      inline def setBranching(value: Boolean): Self = StObject.set(x, "branching", value.asInstanceOf[js.Any])
      
      inline def setBranchingUndefined: Self = StObject.set(x, "branching", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setConnector(value: none | typings.fundamentalReact.fundamentalReactStrings.default | active | branching): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
      
      inline def setGlyph(value: ReactNode): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      inline def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      inline def setMenu(value: ReactNode): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setModifiers(value: js.Array[completed | current | upcoming | `no-label` | stacked | `stacked-top` | active]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(value: (completed | current | upcoming | `no-label` | stacked | `stacked-top` | active)*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setNextLabel(value: String): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOptionalLabel(value: String): Self = StObject.set(x, "optionalLabel", value.asInstanceOf[js.Any])
      
      inline def setOptionalLabelUndefined: Self = StObject.set(x, "optionalLabel", js.undefined)
      
      inline def setPreviousLabel(value: String): Self = StObject.set(x, "previousLabel", value.asInstanceOf[js.Any])
      
      inline def setPreviousLabelUndefined: Self = StObject.set(x, "previousLabel", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  type _To = FunctionComponent[WizardStepProps]
  
  /* This means you don't have to write `default`, but can instead just say `libWizardWizardStepMod.foo` */
  override def _to: FunctionComponent[WizardStepProps] = default
}
