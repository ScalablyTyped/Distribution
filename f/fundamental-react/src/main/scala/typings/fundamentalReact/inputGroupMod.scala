package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.PartialInputGroupAddonPro
import typings.fundamentalReact.anon.State
import typings.fundamentalReact.anon.WeakValidationMapInputGro
import typings.fundamentalReact.fundamentalReactStrings.InputGroupDotAddon
import typings.react.mod.Component
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputGroupMod {
  
  @JSImport("fundamental-react/lib/InputGroup/InputGroup", JSImport.Default)
  @js.native
  class default ()
    extends Component[InputGroupProps, js.Object, js.Any]
  object default {
    
    @JSImport("fundamental-react/lib/InputGroup/InputGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/InputGroup/InputGroup.InputGroupAddonProps> & {  displayName :'InputGroup.Addon'} */
    object Addon {
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon")
      @js.native
      def apply(props: PropsWithChildren[InputGroupAddonProps]): ReactElement | Null = js.native
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon")
      @js.native
      def apply(props: PropsWithChildren[InputGroupAddonProps], context: js.Any): ReactElement | Null = js.native
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
      @scala.inline
      def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialInputGroupAddonPro] = js.native
      @scala.inline
      def defaultProps_=(x: js.UndefOr[PartialInputGroupAddonPro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon.displayName")
      @js.native
      def displayName: js.UndefOr[InputGroupDotAddon | String] = js.native
      @scala.inline
      def displayName_=(x: js.UndefOr[InputGroupDotAddon | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapInputGro] = js.native
      @scala.inline
      def propTypes_=(x: js.UndefOr[WeakValidationMapInputGro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.displayName")
    @js.native
    def displayName: typings.fundamentalReact.fundamentalReactStrings.InputGroup = js.native
    @scala.inline
    def displayName_=(x: typings.fundamentalReact.fundamentalReactStrings.InputGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type InputGroup = Component[InputGroupProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.before
    - typings.fundamentalReact.fundamentalReactStrings.after
  */
  trait InputGroupAddonPosition extends StObject
  object InputGroupAddonPosition {
    
    @scala.inline
    def after: typings.fundamentalReact.fundamentalReactStrings.after = "after".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.after]
    
    @scala.inline
    def before: typings.fundamentalReact.fundamentalReactStrings.before = "before".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.before]
  }
  
  @js.native
  trait InputGroupAddonProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var isButton: js.UndefOr[Boolean] = js.native
  }
  object InputGroupAddonProps {
    
    @scala.inline
    def apply(): InputGroupAddonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupAddonProps]
    }
    
    @scala.inline
    implicit class InputGroupAddonPropsMutableBuilder[Self <: InputGroupAddonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setIsButton(value: Boolean): Self = StObject.set(x, "isButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsButtonUndefined: Self = StObject.set(x, "isButton", js.undefined)
    }
  }
  
  @js.native
  trait InputGroupProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var props: js.UndefOr[js.Any] = js.native
    
    var validationState: js.UndefOr[State] = js.native
  }
  object InputGroupProps {
    
    @scala.inline
    def apply(): InputGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupProps]
    }
    
    @scala.inline
    implicit class InputGroupPropsMutableBuilder[Self <: InputGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setValidationState(value: State): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.text
    - typings.fundamentalReact.fundamentalReactStrings.number
    - typings.fundamentalReact.fundamentalReactStrings.search
  */
  trait InputGroupTypes extends StObject
  object InputGroupTypes {
    
    @scala.inline
    def number: typings.fundamentalReact.fundamentalReactStrings.number = "number".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.number]
    
    @scala.inline
    def search: typings.fundamentalReact.fundamentalReactStrings.search = "search".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.search]
    
    @scala.inline
    def text: typings.fundamentalReact.fundamentalReactStrings.text = "text".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.text]
  }
}
