package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObjectInput
  extends RangeInput
     with EventOptionsBase
     with /* customField */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var _id: js.UndefOr[java.lang.String] = js.undefined
  var allDay: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var source: js.UndefOr[fullcalendarLib.eventsourceMod.default] = js.undefined
  var title: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object EventObjectInput {
  @scala.inline
  def apply(
    title: java.lang.String,
    StringDictionary: /* customField */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    _id: java.lang.String = null,
    allDay: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    className: java.lang.String | js.Array[java.lang.String] = null,
    color: java.lang.String = null,
    constraint: ConstraintInput = null,
    durationEditable: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    end: MomentInput = null,
    id: java.lang.String | scala.Double = null,
    overlap: js.UndefOr[scala.Boolean] = js.undefined,
    rendering: java.lang.String = null,
    source: fullcalendarLib.eventsourceMod.default = null,
    start: MomentInput = null,
    startEditable: js.UndefOr[scala.Boolean] = js.undefined,
    textColor: java.lang.String = null,
    url: java.lang.String = null
  ): EventObjectInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (!js.isUndefined(allDay)) __obj.updateDynamic("allDay")(allDay)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (!js.isUndefined(durationEditable)) __obj.updateDynamic("durationEditable")(durationEditable)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap)
    if (rendering != null) __obj.updateDynamic("rendering")(rendering)
    if (source != null) __obj.updateDynamic("source")(source)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(startEditable)) __obj.updateDynamic("startEditable")(startEditable)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[EventObjectInput]
  }
}

