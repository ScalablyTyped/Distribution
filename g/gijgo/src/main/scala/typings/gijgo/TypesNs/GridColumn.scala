package typings.gijgo.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumn extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var cssClass: js.UndefOr[String] = js.undefined
  var decimalDigits: js.UndefOr[Double] = js.undefined
  var editField: js.UndefOr[String] = js.undefined
  var editor: js.UndefOr[js.Any] = js.undefined
  var events: js.UndefOr[js.Any] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[js.Any] = js.undefined
  var filterable: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var headerCssClass: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var renderer: js.UndefOr[js.Any] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var tmpl: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object GridColumn {
  @scala.inline
  def apply(
    align: String = null,
    cssClass: String = null,
    decimalDigits: Int | Double = null,
    editField: String = null,
    editor: js.Any = null,
    events: js.Any = null,
    field: String = null,
    filter: js.Any = null,
    filterable: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    headerCssClass: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    minWidth: Int | Double = null,
    mode: String = null,
    priority: Int | Double = null,
    renderer: js.Any = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    tmpl: String = null,
    tooltip: String = null,
    `type`: String = null,
    width: Int | Double = null
  ): GridColumn = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (decimalDigits != null) __obj.updateDynamic("decimalDigits")(decimalDigits.asInstanceOf[js.Any])
    if (editField != null) __obj.updateDynamic("editField")(editField)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (events != null) __obj.updateDynamic("events")(events)
    if (field != null) __obj.updateDynamic("field")(field)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable)
    if (format != null) __obj.updateDynamic("format")(format)
    if (headerCssClass != null) __obj.updateDynamic("headerCssClass")(headerCssClass)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tmpl != null) __obj.updateDynamic("tmpl")(tmpl)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumn]
  }
}

