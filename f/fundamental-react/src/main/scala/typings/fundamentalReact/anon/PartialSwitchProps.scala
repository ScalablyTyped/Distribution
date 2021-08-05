package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Switch/Switch.SwitchProps> */
trait PartialSwitchProps extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var inputProps: js.UndefOr[js.Any] = js.undefined
  
  var internalLabels: js.UndefOr[Checked] = js.undefined
  
  var labelProps: js.UndefOr[js.Any] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var semantic: js.UndefOr[Boolean] = js.undefined
}
object PartialSwitchProps {
  
  inline def apply(): PartialSwitchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSwitchProps]
  }
  
  extension [Self <: PartialSwitchProps](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
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
    
    inline def setInputProps(value: js.Any): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
    
    inline def setInternalLabels(value: Checked): Self = StObject.set(x, "internalLabels", value.asInstanceOf[js.Any])
    
    inline def setInternalLabelsUndefined: Self = StObject.set(x, "internalLabels", js.undefined)
    
    inline def setLabelProps(value: js.Any): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
    
    inline def setLabelPropsUndefined: Self = StObject.set(x, "labelProps", js.undefined)
    
    inline def setOnChange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setSemantic(value: Boolean): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
    
    inline def setSemanticUndefined: Self = StObject.set(x, "semantic", js.undefined)
  }
}
