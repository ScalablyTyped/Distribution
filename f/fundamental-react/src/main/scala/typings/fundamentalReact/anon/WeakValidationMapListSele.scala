package typings.fundamentalReact.anon

import typings.react.mod.SyntheticEvent
import typings.react.mod.Validator
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListSelectionProps> */
trait WeakValidationMapListSele extends StObject {
  
  var checkBoxAriaLabel: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function2[
          /* event */ SyntheticEvent[HTMLInputElement, Event], 
          /* checkedState */ Boolean, 
          Unit
        ]) | Null
      ]
    ]
  ] = js.undefined
  
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapListSele {
  
  inline def apply(): WeakValidationMapListSele = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapListSele]
  }
  
  extension [Self <: WeakValidationMapListSele](x: Self) {
    
    inline def setCheckBoxAriaLabel(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "checkBoxAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setCheckBoxAriaLabelUndefined: Self = StObject.set(x, "checkBoxAriaLabel", js.undefined)
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setOnChange(
      value: Validator[
          js.UndefOr[
            (js.Function2[
              /* event */ SyntheticEvent[HTMLInputElement, Event], 
              /* checkedState */ Boolean, 
              Unit
            ]) | Null
          ]
        ]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setSelected(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
