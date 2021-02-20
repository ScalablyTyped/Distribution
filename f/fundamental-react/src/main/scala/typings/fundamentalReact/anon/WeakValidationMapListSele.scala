package typings.fundamentalReact.anon

import typings.react.mod.SyntheticEvent
import typings.react.mod.Validator
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListSelectionProps> */
@js.native
trait WeakValidationMapListSele extends StObject {
  
  var checkBoxAriaLabel: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
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
  ] = js.native
  
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}
object WeakValidationMapListSele {
  
  @scala.inline
  def apply(): WeakValidationMapListSele = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapListSele]
  }
  
  @scala.inline
  implicit class WeakValidationMapListSeleMutableBuilder[Self <: WeakValidationMapListSele] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckBoxAriaLabel(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "checkBoxAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckBoxAriaLabelUndefined: Self = StObject.set(x, "checkBoxAriaLabel", js.undefined)
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setOnChange(
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
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setSelected(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
