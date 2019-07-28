package typings.ejDotWebDotAll.ejNs.SliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns slider id
    */
  var id: js.UndefOr[String] = js.undefined
  /** returns the slider model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.SliderNs.Model] = js.undefined
  /** returns current handle number or index
    */
  var sliderIndex: js.UndefOr[Double] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the slider value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object StopEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    model: typings.ejDotWebDotAll.ejNs.SliderNs.Model = null,
    sliderIndex: Int | Double = null,
    `type`: String = null,
    value: Int | Double = null
  ): StopEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model)
    if (sliderIndex != null) __obj.updateDynamic("sliderIndex")(sliderIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEventArgs]
  }
}

