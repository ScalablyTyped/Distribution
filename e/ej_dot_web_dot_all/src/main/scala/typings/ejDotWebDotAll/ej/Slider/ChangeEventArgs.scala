package typings.ejDotWebDotAll.ej.Slider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
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
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Slider.Model] = js.undefined
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

object ChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.Slider.Model = null,
    sliderIndex: Int | Double = null,
    `type`: String = null,
    value: Int | Double = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (model != null) __obj.updateDynamic("model")(model)
    if (sliderIndex != null) __obj.updateDynamic("sliderIndex")(sliderIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

