package typings
package ejDotWebDotAllLib.ejNs.CheckBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires before the CheckBox is going to changed its state successfully
    */
  var beforeChange: js.UndefOr[js.Function1[/* e */ BeforeChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires when the CheckBox state is changed successfully
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Specifies the State of CheckBox.See below to get available CheckState
    * @Default {null}
    */
  var checkState: js.UndefOr[ejDotWebDotAllLib.ejNs.CheckState | java.lang.String] = js.undefined
  /** Specifies whether CheckBox has to be in checked or not. We can also specify array of string as value for this property. If any of the value in the specified array matches the
    * value of the textbox, then it will be considered as checked. It will be useful in MVVM binding, specify array type to identify the values of the checked CheckBoxes.
    * @Default {false}
    */
  var checked: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /** Fires when the CheckBox state is created successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root CSS class for CheckBox theme, which is used customize.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when the CheckBox state is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Specifies the persist property for CheckBox while initialization. The persist API save current model value to browser cookies for state maintains. While refreshing the CheckBox
    * control page the model value apply from browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the Right to Left direction to Checkbox
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the enable or disable Tri-State for checkbox control.
    * @Default {false}
    */
  var enableTriState: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the checkbox control state.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** It allows to define the characteristics of the CheckBox control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specified value to be added an id attribute of the CheckBox.
    * @Default {null}
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Specify the prefix value of id to be added before the current id of the CheckBox.
    * @Default {ej}
    */
  var idPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the name attribute of the CheckBox.
    * @Default {null}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Displays rounded corner borders to CheckBox
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the size of the CheckBox.See below to know available CheckboxSize
    * @Default {small}
    */
  var size: js.UndefOr[ejDotWebDotAllLib.ejNs.CheckboxSize | java.lang.String] = js.undefined
  /** Specifies the text content to be displayed for CheckBox.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
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
  var value: js.UndefOr[java.lang.String] = js.undefined
}

