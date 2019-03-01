package typings
package dropkickjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropkickOptions extends js.Object {
  var change: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var close: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var form: js.UndefOr[stdLib.Node] = js.undefined
  var initialize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var mobile: js.UndefOr[scala.Boolean] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var open: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var options: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
  var selectedOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object DropkickOptions {
  @scala.inline
  def apply(
    change: js.Function0[scala.Unit] = null,
    close: js.Function0[scala.Unit] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    form: stdLib.Node = null,
    initialize: js.Function0[scala.Unit] = null,
    length: scala.Int | scala.Double = null,
    mobile: js.UndefOr[scala.Boolean] = js.undefined,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    open: js.Function0[scala.Unit] = null,
    options: js.Array[java.lang.String] = null,
    selectedIndex: scala.Int | scala.Double = null,
    selectedOptions: js.Array[java.lang.String] = null,
    value: java.lang.String = null
  ): DropkickOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (close != null) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (form != null) __obj.updateDynamic("form")(form)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (open != null) __obj.updateDynamic("open")(open)
    if (options != null) __obj.updateDynamic("options")(options)
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedOptions != null) __obj.updateDynamic("selectedOptions")(selectedOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DropkickOptions]
  }
}

