package typings.fundamentalReact

import typings.fundamentalReact.anon.Checked
import typings.fundamentalReact.anon.PartialSwitchProps
import typings.fundamentalReact.anon.WeakValidationMapSwitchPr
import typings.fundamentalReact.fundamentalReactStrings.Switch
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwitchSwitchMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Switch/Switch.SwitchProps> & {  displayName :'Switch'} */
  object default {
    
    inline def apply(props: SwitchProps): ReactNode = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
    inline def apply(props: SwitchProps, context: Any): ReactNode = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
    
    @JSImport("fundamental-react/lib/Switch/Switch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Switch/Switch", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Switch/Switch", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialSwitchProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialSwitchProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Switch/Switch", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String | Switch] = js.native
    inline def displayName_=(x: js.UndefOr[String | Switch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Switch/Switch", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapSwitchPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapSwitchPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait SwitchProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputProps: js.UndefOr[Any] = js.undefined
    
    var internalLabels: js.UndefOr[Checked] = js.undefined
    
    var labelProps: js.UndefOr[Any] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var semantic: js.UndefOr[Boolean] = js.undefined
  }
  object SwitchProps {
    
    inline def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwitchProps] (val x: Self) extends AnyVal {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputProps(value: Any): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setInternalLabels(value: Checked): Self = StObject.set(x, "internalLabels", value.asInstanceOf[js.Any])
      
      inline def setInternalLabelsUndefined: Self = StObject.set(x, "internalLabels", js.undefined)
      
      inline def setLabelProps(value: Any): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
      
      inline def setLabelPropsUndefined: Self = StObject.set(x, "labelProps", js.undefined)
      
      inline def setOnChange(value: /* repeated */ Any => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSemantic(value: Boolean): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
      
      inline def setSemanticUndefined: Self = StObject.set(x, "semantic", js.undefined)
    }
  }
}
