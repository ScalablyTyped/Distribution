package typings
package ejDotWebDotAllLib.ejNs.RadioButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires before the RadioButton is going to changed its state successfully
    */
  var beforeChange: js.UndefOr[js.Function1[/* e */ BeforeChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires when the RadioButton state is changed successfully
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Specifies the check attribute of the Radio Button.
    * @Default {false}
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when the RadioButton created successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Specify the CSS class to RadioButton to achieve custom theme.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when the RadioButton destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Specifies the enablePersistence property for RadioButton while initialization. The enablePersistence API save current model value to browser cookies for state maintains. While
    * refreshing the radio button control page the model value apply from browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the Right to Left direction to RadioButton
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the RadioButton control state.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the HTML Attributes of the Checkbox
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specifies the id attribute for the Radio Button while initialization.
    * @Default {null}
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Specify the idPrefix value to be added before the current id of the RadioButton.
    * @Default {ej}
    */
  var idPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the name attribute for the Radio Button while initialization.
    * @Default {Sets id as name if it is null}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the size of the RadioButton.
    * @Default {small}
    */
  var size: js.UndefOr[ejDotWebDotAllLib.ejNs.RadioButtonSize | java.lang.String] = js.undefined
  /** Specifies the text content for RadioButton.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Set the jQuery validation error message in radio button.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.undefined
  /** Set the jQuery validation rules in radio button.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Specifies the value attribute of the Radio Button.
    * @Default {null}
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    beforeChange: /* e */ BeforeChangeEventArgs => scala.Unit = null,
    change: /* e */ ChangeEventArgs => scala.Unit = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    create: /* e */ CreateEventArgs => scala.Unit = null,
    cssClass: java.lang.String = null,
    destroy: /* e */ DestroyEventArgs => scala.Unit = null,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    htmlAttributes: js.Any = null,
    id: java.lang.String = null,
    idPrefix: java.lang.String = null,
    name: java.lang.String = null,
    size: ejDotWebDotAllLib.ejNs.RadioButtonSize | java.lang.String = null,
    text: java.lang.String = null,
    validationMessage: js.Any = null,
    validationRules: js.Any = null,
    value: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction1(beforeChange))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Model]
  }
}

