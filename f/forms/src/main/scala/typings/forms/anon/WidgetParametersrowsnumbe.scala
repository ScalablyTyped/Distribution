package typings.forms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined forms.forms.WidgetParameters & {  rows ? :number,   cols ? :number} */
trait WidgetParametersrowsnumbe extends js.Object {
  /** Custom classes to add to the rendered widget. */
  var classes: js.UndefOr[js.Array[String]] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  /** Custom classes to add to the choices label when applicable (multipleRadio and multipleCheckbox) */
  var labelClasses: js.UndefOr[js.Array[String]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  /** A string representing the widget type, e.g. 'text' or 'checkbox' */
  var `type`: js.UndefOr[String] = js.undefined
}

object WidgetParametersrowsnumbe {
  @scala.inline
  def apply(
    classes: js.Array[String] = null,
    cols: js.UndefOr[Double] = js.undefined,
    labelClasses: js.Array[String] = null,
    rows: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): WidgetParametersrowsnumbe = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (labelClasses != null) __obj.updateDynamic("labelClasses")(labelClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetParametersrowsnumbe]
  }
}

