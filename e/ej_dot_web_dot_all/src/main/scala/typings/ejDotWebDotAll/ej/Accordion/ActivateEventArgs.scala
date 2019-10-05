package typings.ejDotWebDotAll.ej.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivateEventArgs extends js.Object {
  /** returns current active header
    */
  var activeHeader: js.UndefOr[js.Any] = js.undefined
  /** returns active index
    */
  var activeIndex: js.UndefOr[Double] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns true when the Accordion index activated by user interaction otherwise returns false
    */
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  /** returns the accordion model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Accordion.Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ActivateEventArgs {
  @scala.inline
  def apply(
    activeHeader: js.Any = null,
    activeIndex: Int | Double = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.Accordion.Model = null,
    `type`: String = null
  ): ActivateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (activeHeader != null) __obj.updateDynamic("activeHeader")(activeHeader)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivateEventArgs]
  }
}

