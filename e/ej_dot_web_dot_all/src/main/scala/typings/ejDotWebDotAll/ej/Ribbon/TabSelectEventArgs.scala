package typings.ejDotWebDotAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabSelectEventArgs extends js.Object {
  /** returns current active tab header .
    */
  var activeHeader: js.UndefOr[js.Any] = js.undefined
  /** returns current active index.
    */
  var activeIndex: js.UndefOr[Double] = js.undefined
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the ribbon model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns previous active tab header.
    */
  var prevActiveHeader: js.UndefOr[js.Any] = js.undefined
  /** returns previous active index.
    */
  var prevActiveIndex: js.UndefOr[Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object TabSelectEventArgs {
  @scala.inline
  def apply(
    activeHeader: js.Any = null,
    activeIndex: Int | Double = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    prevActiveHeader: js.Any = null,
    prevActiveIndex: Int | Double = null,
    `type`: String = null
  ): TabSelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (activeHeader != null) __obj.updateDynamic("activeHeader")(activeHeader.asInstanceOf[js.Any])
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (prevActiveHeader != null) __obj.updateDynamic("prevActiveHeader")(prevActiveHeader.asInstanceOf[js.Any])
    if (prevActiveIndex != null) __obj.updateDynamic("prevActiveIndex")(prevActiveIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabSelectEventArgs]
  }
}

