package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionWidgetItem extends js.Object {
  /** Specifies whether a widget item should be disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies html code inserted into the widget item element. */
  var html: js.UndefOr[String] = js.undefined
  /** Specifies a template that should be used to render this item only. */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
  ] = js.undefined
  /** Specifies text displayed for the widget item. */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies whether or not a widget item must be displayed. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object CollectionWidgetItem {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    template: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery]) = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CollectionWidgetItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionWidgetItem]
  }
}

