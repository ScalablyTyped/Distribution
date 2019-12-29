package typings.ejDotWebDotAll.ej.Slider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipChangeEventArgs extends js.Object {
  /** returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns slider id.
    */
  var id: js.UndefOr[String] = js.undefined
  /** returns true if event triggered by interaction else returns false.
    */
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  /** returns the slider model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns current handle number or index
    */
  var sliderIndex: js.UndefOr[Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the slider value.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object TooltipChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    sliderIndex: Int | Double = null,
    `type`: String = null,
    value: Int | Double = null
  ): TooltipChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (sliderIndex != null) __obj.updateDynamic("sliderIndex")(sliderIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipChangeEventArgs]
  }
}

