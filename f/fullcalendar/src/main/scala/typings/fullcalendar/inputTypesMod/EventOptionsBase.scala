package typings.fullcalendar.inputTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptionsBase extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String | js.Array[String]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var constraint: js.UndefOr[ConstraintInput] = js.undefined
  var durationEditable: js.UndefOr[Boolean] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var overlap: js.UndefOr[Boolean] = js.undefined
  var rendering: js.UndefOr[String] = js.undefined
  var startEditable: js.UndefOr[Boolean] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object EventOptionsBase {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    className: String | js.Array[String] = null,
    color: String = null,
    constraint: ConstraintInput = null,
    durationEditable: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    overlap: js.UndefOr[Boolean] = js.undefined,
    rendering: String = null,
    startEditable: js.UndefOr[Boolean] = js.undefined,
    textColor: String = null
  ): EventOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (!js.isUndefined(durationEditable)) __obj.updateDynamic("durationEditable")(durationEditable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap.get.asInstanceOf[js.Any])
    if (rendering != null) __obj.updateDynamic("rendering")(rendering.asInstanceOf[js.Any])
    if (!js.isUndefined(startEditable)) __obj.updateDynamic("startEditable")(startEditable.get.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOptionsBase]
  }
}

