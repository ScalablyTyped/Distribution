package typings.fundamentalReact

import typings.fundamentalReact.anon.PartialButtonGroupProps
import typings.fundamentalReact.anon.WeakValidationMapButtonGr
import typings.fundamentalReact.fundamentalReactStrings.ButtonGroup
import typings.react.mod.HTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Button/ButtonGroup.ButtonGroupProps> & {  displayName :'ButtonGroup'} */
  object default {
    
    @scala.inline
    def apply(props: PropsWithChildren[ButtonGroupProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    @scala.inline
    def apply(props: PropsWithChildren[ButtonGroupProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("fundamental-react/lib/Button/ButtonGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Button/ButtonGroup", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/ButtonGroup", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialButtonGroupProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialButtonGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/ButtonGroup", "default.displayName")
    @js.native
    def displayName: js.UndefOr[ButtonGroup | String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[ButtonGroup | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/ButtonGroup", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapButtonGr] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapButtonGr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait ButtonGroupProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object ButtonGroupProps {
    
    @scala.inline
    def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
    
    @scala.inline
    implicit class ButtonGroupPropsMutableBuilder[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
}
