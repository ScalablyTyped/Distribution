package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.PartialInputGroupAddonPro
import typings.fundamentalReact.anon.State
import typings.fundamentalReact.anon.WeakValidationMapInputGro
import typings.fundamentalReact.fundamentalReactStrings.InputGroupDotAddon
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputGroupInputGroupMod {
  
  @JSImport("fundamental-react/lib/InputGroup/InputGroup", JSImport.Default)
  @js.native
  open class default ()
    extends Component[InputGroupProps, js.Object, Any]
  object default {
    
    @JSImport("fundamental-react/lib/InputGroup/InputGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/InputGroup/InputGroup.InputGroupAddonProps> & {  displayName :'InputGroup.Addon'} */
    object Addon {
      
      inline def apply(props: InputGroupAddonProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
      inline def apply(props: InputGroupAddonProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialInputGroupAddonPro] = js.native
      inline def defaultProps_=(x: js.UndefOr[PartialInputGroupAddonPro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon.displayName")
      @js.native
      def displayName: js.UndefOr[InputGroupDotAddon | String] = js.native
      inline def displayName_=(x: js.UndefOr[InputGroupDotAddon | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapInputGro] = js.native
      inline def propTypes_=(x: js.UndefOr[WeakValidationMapInputGro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.displayName")
    @js.native
    def displayName: typings.fundamentalReact.fundamentalReactStrings.InputGroup = js.native
    inline def displayName_=(x: typings.fundamentalReact.fundamentalReactStrings.InputGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type InputGroup = Component[InputGroupProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.before
    - typings.fundamentalReact.fundamentalReactStrings.after
  */
  trait InputGroupAddonPosition extends StObject
  object InputGroupAddonPosition {
    
    inline def after: typings.fundamentalReact.fundamentalReactStrings.after = "after".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.after]
    
    inline def before: typings.fundamentalReact.fundamentalReactStrings.before = "before".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.before]
  }
  
  trait InputGroupAddonProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var isButton: js.UndefOr[Boolean] = js.undefined
  }
  object InputGroupAddonProps {
    
    inline def apply(): InputGroupAddonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupAddonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputGroupAddonProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setIsButton(value: Boolean): Self = StObject.set(x, "isButton", value.asInstanceOf[js.Any])
      
      inline def setIsButtonUndefined: Self = StObject.set(x, "isButton", js.undefined)
    }
  }
  
  trait InputGroupProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var props: js.UndefOr[Any] = js.undefined
    
    var validationState: js.UndefOr[State] = js.undefined
  }
  object InputGroupProps {
    
    inline def apply(): InputGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputGroupProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setValidationState(value: State): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.text
    - typings.fundamentalReact.fundamentalReactStrings.number
    - typings.fundamentalReact.fundamentalReactStrings.search
  */
  trait InputGroupTypes extends StObject
  object InputGroupTypes {
    
    inline def number: typings.fundamentalReact.fundamentalReactStrings.number = "number".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.number]
    
    inline def search: typings.fundamentalReact.fundamentalReactStrings.search = "search".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.search]
    
    inline def text: typings.fundamentalReact.fundamentalReactStrings.text = "text".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.text]
  }
}
