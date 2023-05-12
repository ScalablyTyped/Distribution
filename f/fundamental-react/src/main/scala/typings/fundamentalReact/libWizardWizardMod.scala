package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactStrings.`no-labels`
import typings.fundamentalReact.fundamentalReactStrings.anchors
import typings.fundamentalReact.fundamentalReactStrings.lg
import typings.fundamentalReact.fundamentalReactStrings.list_
import typings.fundamentalReact.fundamentalReactStrings.md
import typings.fundamentalReact.fundamentalReactStrings.sm
import typings.fundamentalReact.fundamentalReactStrings.solid
import typings.fundamentalReact.fundamentalReactStrings.stacked
import typings.fundamentalReact.fundamentalReactStrings.tabs
import typings.fundamentalReact.fundamentalReactStrings.transparent
import typings.fundamentalReact.fundamentalReactStrings.xl
import typings.fundamentalReact.libWizardWizardContainerMod.WizardContainerProps
import typings.fundamentalReact.libWizardWizardContentMod.WizardContentProps
import typings.fundamentalReact.libWizardWizardFooterMod.WizardFooterProps
import typings.fundamentalReact.libWizardWizardNavigationMod.WizardNavigationProps
import typings.fundamentalReact.libWizardWizardStepMod.WizardStepProps
import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWizardWizardMod {
  
  @JSImport("fundamental-react/lib/Wizard/Wizard", JSImport.Default)
  @js.native
  open class default ()
    extends Component[WizardProps, js.Object, Any]
  object default {
    
    /* was `typeof WizardContainer` */
    @JSImport("fundamental-react/lib/Wizard/Wizard", "default.Container")
    @js.native
    val Container: FunctionComponent[WizardContainerProps] = js.native
    
    /* was `typeof WizardContent` */
    @JSImport("fundamental-react/lib/Wizard/Wizard", "default.Content")
    @js.native
    val Content: FunctionComponent[WizardContentProps] = js.native
    
    /* was `typeof WizardFooter` */
    @JSImport("fundamental-react/lib/Wizard/Wizard", "default.Footer")
    @js.native
    val Footer: FunctionComponent[WizardFooterProps] = js.native
    
    /* was `typeof WizardNavigation` */
    @JSImport("fundamental-react/lib/Wizard/Wizard", "default.Navigation")
    @js.native
    val Navigation: FunctionComponent[WizardNavigationProps] = js.native
    
    /* was `typeof WizardStep` */
    @JSImport("fundamental-react/lib/Wizard/Wizard", "default.Step")
    @js.native
    val Step: FunctionComponent[WizardStepProps] = js.native
  }
  
  type Wizard = Component[WizardProps, js.Object, Any]
  
  trait WizardProps extends StObject {
    
    /** Content background styling. */
    var background: js.UndefOr[solid | list_ | transparent] = js.undefined
    
    /** Label to use for the cancel button., default is 'Cancel' */
    var cancelLabel: js.UndefOr[String] = js.undefined
    
    /** Wizard.Step nodes to render as steps. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** CSS class(es) to add to the element. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Props to be spread to the WizardContent component. */
    var contentProps: js.UndefOr[js.Object] = js.undefined
    
    /** By default wizard body has no horizontal paddings. Add a size to modify the padding. */
    var contentSize: js.UndefOr[sm | md | lg | xl] = js.undefined
    
    /** Props to be spread to the WizardFooter component. */
    var footerProps: js.UndefOr[js.Object] = js.undefined
    
    /** Props to be spread to the WizardNavigation component. */
    var headerProps: js.UndefOr[js.Object] = js.undefined
    
    /** By default wizard header has no horizontal paddings. Add a size to modify the padding. */
    var headerSize: js.UndefOr[sm | md | lg | xl] = js.undefined
    
    /**
      * Navigation type. `anchors` mode Displays all steps in one scrolling
      * page, while `tabs` shows one page at a time with navigation buttons in
      * the footer. default is 'anchors'
      */
    var navigationType: js.UndefOr[anchors | tabs] = js.undefined
    
    /**
      * Default label for next step buttons. Can be overriden by setting
      * `nextLabel` on specific steps. default is 'Next Step'
      */
    var nextLabel: js.UndefOr[String] = js.undefined
    
    /** Callback function; triggered when the cancel button is clicked. */
    var onCancel: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    /** Callback function; triggered when the next step button is clicked in the last step. */
    var onComplete: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    /** Callback function; triggered when the next step button is clicked in any step other than last. */
    var onStepChange: js.UndefOr[
        js.Function4[
          /* event */ SyntheticEvent[Element, Event], 
          /* step */ ReactElement, 
          /* index */ Double, 
          /* count */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Space-saving options. `stacking` option reduces all non-active steps to
      * a condensed form with a pop-up menu, while `no-labels` hides all text
      * from steps, only displaying the indicators.
      */
    var option: js.UndefOr[stacked | `no-labels`] = js.undefined
    
    /**
      * Default label for previous step buttons. Can be overriden by setting
      * `previousLabel` on specific steps. default is 'Previous Step'
      */
    var previousLabel: js.UndefOr[String] = js.undefined
    
    /** Whether to show auto-generated titles in page contents. default is true */
    var showTitles: js.UndefOr[Boolean] = js.undefined
  }
  object WizardProps {
    
    inline def apply(): WizardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WizardProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WizardProps] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: solid | list_ | transparent): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
      
      inline def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentProps(value: js.Object): Self = StObject.set(x, "contentProps", value.asInstanceOf[js.Any])
      
      inline def setContentPropsUndefined: Self = StObject.set(x, "contentProps", js.undefined)
      
      inline def setContentSize(value: sm | md | lg | xl): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
      
      inline def setContentSizeUndefined: Self = StObject.set(x, "contentSize", js.undefined)
      
      inline def setFooterProps(value: js.Object): Self = StObject.set(x, "footerProps", value.asInstanceOf[js.Any])
      
      inline def setFooterPropsUndefined: Self = StObject.set(x, "footerProps", js.undefined)
      
      inline def setHeaderProps(value: js.Object): Self = StObject.set(x, "headerProps", value.asInstanceOf[js.Any])
      
      inline def setHeaderPropsUndefined: Self = StObject.set(x, "headerProps", js.undefined)
      
      inline def setHeaderSize(value: sm | md | lg | xl): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      inline def setHeaderSizeUndefined: Self = StObject.set(x, "headerSize", js.undefined)
      
      inline def setNavigationType(value: anchors | tabs): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
      
      inline def setNavigationTypeUndefined: Self = StObject.set(x, "navigationType", js.undefined)
      
      inline def setNextLabel(value: String): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      inline def setOnCancel(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnComplete(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnStepChange(
        value: (/* event */ SyntheticEvent[Element, Event], /* step */ ReactElement, /* index */ Double, /* count */ Double) => Unit
      ): Self = StObject.set(x, "onStepChange", js.Any.fromFunction4(value))
      
      inline def setOnStepChangeUndefined: Self = StObject.set(x, "onStepChange", js.undefined)
      
      inline def setOption(value: stacked | `no-labels`): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setPreviousLabel(value: String): Self = StObject.set(x, "previousLabel", value.asInstanceOf[js.Any])
      
      inline def setPreviousLabelUndefined: Self = StObject.set(x, "previousLabel", js.undefined)
      
      inline def setShowTitles(value: Boolean): Self = StObject.set(x, "showTitles", value.asInstanceOf[js.Any])
      
      inline def setShowTitlesUndefined: Self = StObject.set(x, "showTitles", js.undefined)
    }
  }
}
