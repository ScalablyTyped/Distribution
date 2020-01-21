package typings.fullcalendar.inputTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.fullcalendar.eventSourceMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObjectInput
  extends RangeInput
     with EventOptionsBase
     with /* customField */ StringDictionary[js.Any] {
  var _id: js.UndefOr[String] = js.undefined
  var allDay: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var source: js.UndefOr[default] = js.undefined
  var title: String
  var url: js.UndefOr[String] = js.undefined
}

object EventObjectInput {
  @scala.inline
  def apply(
    title: String,
    StringDictionary: /* customField */ StringDictionary[js.Any] = null,
    _id: String = null,
    allDay: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    borderColor: String = null,
    className: String | js.Array[String] = null,
    color: String = null,
    constraint: ConstraintInput = null,
    durationEditable: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    end: MomentInput = null,
    id: String | Double = null,
    overlap: js.UndefOr[Boolean] = js.undefined,
    rendering: String = null,
    source: default = null,
    start: MomentInput = null,
    startEditable: js.UndefOr[Boolean] = js.undefined,
    textColor: String = null,
    url: String = null
  ): EventObjectInput = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (!js.isUndefined(allDay)) __obj.updateDynamic("allDay")(allDay.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (!js.isUndefined(durationEditable)) __obj.updateDynamic("durationEditable")(durationEditable.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap.asInstanceOf[js.Any])
    if (rendering != null) __obj.updateDynamic("rendering")(rendering.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(startEditable)) __obj.updateDynamic("startEditable")(startEditable.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObjectInput]
  }
}

