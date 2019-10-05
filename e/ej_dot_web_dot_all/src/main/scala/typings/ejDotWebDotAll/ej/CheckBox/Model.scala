package typings.ejDotWebDotAll.ej.CheckBox

import typings.ejDotWebDotAll.ej.CheckState
import typings.ejDotWebDotAll.ej.CheckboxSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires before the CheckBox is going to changed its state successfully
    */
  var beforeChange: js.UndefOr[js.Function1[/* e */ BeforeChangeEventArgs, Unit]] = js.undefined
  /** Fires when the CheckBox state is changed successfully
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Specifies the State of CheckBox.See below to get available CheckState
    * @Default {null}
    */
  var checkState: js.UndefOr[CheckState | String] = js.undefined
  /** Specifies whether CheckBox has to be in checked or not. We can also specify array of string as value for this property. If any of the value in the specified array matches the
    * value of the textbox, then it will be considered as checked. It will be useful in MVVM binding, specify array type to identify the values of the checked CheckBoxes.
    * @Default {false}
    */
  var checked: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /** Fires when the CheckBox state is created successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets the root CSS class for CheckBox theme, which is used customize.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Fires when the CheckBox state is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Specifies the persist property for CheckBox while initialization. The persist API save current model value to browser cookies for state maintains. While refreshing the CheckBox
    * control page the model value apply from browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Specify the Right to Left direction to Checkbox
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Specifies the enable or disable Tri-State for checkbox control.
    * @Default {false}
    */
  var enableTriState: js.UndefOr[Boolean] = js.undefined
  /** Specifies the checkbox control state.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** It allows to define the characteristics of the CheckBox control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specified value to be added an id attribute of the CheckBox.
    * @Default {null}
    */
  var id: js.UndefOr[String] = js.undefined
  /** Specify the prefix value of id to be added before the current id of the CheckBox.
    * @Default {ej}
    */
  var idPrefix: js.UndefOr[String] = js.undefined
  /** Specifies the name attribute of the CheckBox.
    * @Default {null}
    */
  var name: js.UndefOr[String] = js.undefined
  /** Displays rounded corner borders to CheckBox
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Specifies the size of the CheckBox.See below to know available CheckboxSize
    * @Default {small}
    */
  var size: js.UndefOr[CheckboxSize | String] = js.undefined
  /** Specifies the text content to be displayed for CheckBox.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Set the jQuery validation error message in CheckBox.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.undefined
  /** Set the jQuery validation rules in CheckBox.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Specifies the value attribute of the CheckBox.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    beforeChange: /* e */ BeforeChangeEventArgs => Unit = null,
    change: /* e */ ChangeEventArgs => Unit = null,
    checkState: CheckState | String = null,
    checked: Boolean | js.Array[String] = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableTriState: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    htmlAttributes: js.Any = null,
    id: String = null,
    idPrefix: String = null,
    name: String = null,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    size: CheckboxSize | String = null,
    text: String = null,
    validationMessage: js.Any = null,
    validationRules: js.Any = null,
    value: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction1(beforeChange))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (checkState != null) __obj.updateDynamic("checkState")(checkState.asInstanceOf[js.Any])
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableTriState)) __obj.updateDynamic("enableTriState")(enableTriState)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Model]
  }
}

