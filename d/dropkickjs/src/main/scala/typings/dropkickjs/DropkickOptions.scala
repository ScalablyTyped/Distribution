package typings.dropkickjs

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropkickOptions extends js.Object {
  var change: js.UndefOr[js.Function0[Unit]] = js.undefined
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[Node] = js.undefined
  var initialize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var mobile: js.UndefOr[Boolean] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var open: js.UndefOr[js.Function0[Unit]] = js.undefined
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
  var selectedOptions: js.UndefOr[js.Array[String]] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object DropkickOptions {
  @scala.inline
  def apply(
    change: () => Unit = null,
    close: () => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    form: Node = null,
    initialize: () => Unit = null,
    length: Int | Double = null,
    mobile: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    open: () => Unit = null,
    options: js.Array[String] = null,
    selectedIndex: Int | Double = null,
    selectedOptions: js.Array[String] = null,
    value: String = null
  ): DropkickOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction0(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction0(open))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedOptions != null) __obj.updateDynamic("selectedOptions")(selectedOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropkickOptions]
  }
}

