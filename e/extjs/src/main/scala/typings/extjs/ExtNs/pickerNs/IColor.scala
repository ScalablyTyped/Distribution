package typings.extjs.ExtNs.pickerNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor extends IComponent {
  /** [Config Option] (Boolean) */
  var allowReselect: js.UndefOr[Boolean] = js.undefined
  /** [Method] Clears any selection and sets the value to null  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var clickEvent: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String[]) */
  var colors: js.UndefOr[Array] = js.undefined
  /** [Method] Get the currently selected color value
  		* @returns String value The selected value. Null if nothing is selected.
  		*/
  var getValue: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IColor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Selects the specified color in the picker fires the select event
  		* @param color String A valid 6-digit color hex code (# will be stripped if included)
  		* @param suppressEvent Boolean True to stop the select event from firing.
  		*/
  var select: js.UndefOr[
    js.Function2[
      /* color */ js.UndefOr[java.lang.String], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object IColor {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    allowReselect: js.UndefOr[Boolean] = js.undefined,
    clear: () => Unit = null,
    clickEvent: java.lang.String = null,
    colors: Array = null,
    componentCls: java.lang.String = null,
    getValue: () => java.lang.String = null,
    handler: js.Any = null,
    itemCls: java.lang.String = null,
    onRender: () => Unit = null,
    renderTpl: js.Any = null,
    scope: js.Any = null,
    select: (/* color */ js.UndefOr[java.lang.String], /* suppressEvent */ js.UndefOr[Boolean]) => Unit = null,
    selectedCls: java.lang.String = null,
    value: java.lang.String = null
  ): IColor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(allowReselect)) __obj.updateDynamic("allowReselect")(allowReselect)
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (clickEvent != null) __obj.updateDynamic("clickEvent")(clickEvent)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (componentCls != null) __obj.updateDynamic("componentCls")(componentCls)
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls)
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    if (selectedCls != null) __obj.updateDynamic("selectedCls")(selectedCls)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IColor]
  }
}

