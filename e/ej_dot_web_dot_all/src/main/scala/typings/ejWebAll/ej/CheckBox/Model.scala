package typings.ejWebAll.ej.CheckBox

import typings.ejWebAll.ej.CheckState
import typings.ejWebAll.ej.CheckboxSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Fires before the CheckBox is going to changed its state successfully
    */
  var beforeChange: js.UndefOr[js.Function1[/* e */ BeforeChangeEventArgs, Unit]] = js.native
  
  /** Fires when the CheckBox state is changed successfully
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Specifies the State of CheckBox.See below to get available CheckState
    * @Default {null}
    */
  var checkState: js.UndefOr[CheckState | String] = js.native
  
  /** Specifies whether CheckBox has to be in checked or not. We can also specify array of string as value for this property. If any of the value in the specified array matches the
    * value of the textbox, then it will be considered as checked. It will be useful in MVVM binding, specify array type to identify the values of the checked CheckBoxes.
    * @Default {false}
    */
  var checked: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /** Fires when the CheckBox state is created successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Sets the root CSS class for CheckBox theme, which is used customize.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Fires when the CheckBox state is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Specifies the persist property for CheckBox while initialization. The persist API save current model value to browser cookies for state maintains. While refreshing the CheckBox
    * control page the model value apply from browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** Specify the Right to Left direction to Checkbox
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Specifies the enable or disable Tri-State for checkbox control.
    * @Default {false}
    */
  var enableTriState: js.UndefOr[Boolean] = js.native
  
  /** Specifies the checkbox control state.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** It allows to define the characteristics of the CheckBox control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Specified value to be added an id attribute of the CheckBox.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.native
  
  /** Specify the prefix value of id to be added before the current id of the CheckBox.
    * @Default {ej}
    */
  var idPrefix: js.UndefOr[String] = js.native
  
  /** Specifies the name attribute of the CheckBox.
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.native
  
  /** Displays rounded corner borders to CheckBox
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Specifies the size of the CheckBox.See below to know available CheckboxSize
    * @Default {small}
    */
  var size: js.UndefOr[CheckboxSize | String] = js.native
  
  /** Specifies the text content to be displayed for CheckBox.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Set the jQuery validation error message in CheckBox.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  
  /** Set the jQuery validation rules in CheckBox.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  
  /** Specifies the value attribute of the CheckBox.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setBeforeChange(value: /* e */ BeforeChangeEventArgs => Unit): Self = this.set("beforeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeChange: Self = this.set("beforeChange", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setCheckState(value: CheckState | String): Self = this.set("checkState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckState: Self = this.set("checkState", js.undefined)
    
    @scala.inline
    def setCheckedVarargs(value: String*): Self = this.set("checked", js.Array(value :_*))
    
    @scala.inline
    def setChecked(value: Boolean | js.Array[String]): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnableTriState(value: Boolean): Self = this.set("enableTriState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTriState: Self = this.set("enableTriState", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdPrefix(value: String): Self = this.set("idPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdPrefix: Self = this.set("idPrefix", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setSize(value: CheckboxSize | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setValidationMessage(value: js.Any): Self = this.set("validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMessage: Self = this.set("validationMessage", js.undefined)
    
    @scala.inline
    def setValidationRules(value: js.Any): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
