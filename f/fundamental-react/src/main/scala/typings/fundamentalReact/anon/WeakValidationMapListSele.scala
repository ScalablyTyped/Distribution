package typings.fundamentalReact.anon

import typings.react.mod.SyntheticEvent
import typings.react.mod.Validator
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListSelectionProps> */
@js.native
trait WeakValidationMapListSele extends js.Object {
  
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
  implicit class WeakValidationMapListSeleOps[Self <: WeakValidationMapListSele] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckBoxAriaLabel(value: Validator[js.UndefOr[Null | String]]): Self = this.set("checkBoxAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckBoxAriaLabel: Self = this.set("checkBoxAriaLabel", js.undefined)
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
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
    ): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setSelected(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
