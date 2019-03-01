package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptionsBase extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var constraint: js.UndefOr[ConstraintInput] = js.undefined
  var durationEditable: js.UndefOr[scala.Boolean] = js.undefined
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var overlap: js.UndefOr[scala.Boolean] = js.undefined
  var rendering: js.UndefOr[java.lang.String] = js.undefined
  var startEditable: js.UndefOr[scala.Boolean] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object EventOptionsBase {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    className: java.lang.String | js.Array[java.lang.String] = null,
    color: java.lang.String = null,
    constraint: ConstraintInput = null,
    durationEditable: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    overlap: js.UndefOr[scala.Boolean] = js.undefined,
    rendering: java.lang.String = null,
    startEditable: js.UndefOr[scala.Boolean] = js.undefined,
    textColor: java.lang.String = null
  ): EventOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (!js.isUndefined(durationEditable)) __obj.updateDynamic("durationEditable")(durationEditable)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap)
    if (rendering != null) __obj.updateDynamic("rendering")(rendering)
    if (!js.isUndefined(startEditable)) __obj.updateDynamic("startEditable")(startEditable)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[EventOptionsBase]
  }
}

