package typings.ejWebAll.ej.Tab

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxLoadEventArgs extends js.Object {
  /** returns the URL of AJAX request
    */
  var URL: js.UndefOr[String] = js.undefined
  /** returns current active tab header .
    */
  var activeHeader: js.UndefOr[HTMLElement] = js.undefined
  /** returns current active index.
    */
  var activeIndex: js.UndefOr[Double] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns, is it triggered by interaction or not.
    */
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  /** returns the tab model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns previous active tab header.
    */
  var prevActiveHeader: js.UndefOr[HTMLElement] = js.undefined
  /** returns previous active index.
    */
  var prevActiveIndex: js.UndefOr[Double] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AjaxLoadEventArgs {
  @scala.inline
  def apply(
    URL: String = null,
    activeHeader: HTMLElement = null,
    activeIndex: js.UndefOr[Double] = js.undefined,
    cancel: js.UndefOr[Boolean] = js.undefined,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    prevActiveHeader: HTMLElement = null,
    prevActiveIndex: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): AjaxLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL.asInstanceOf[js.Any])
    if (activeHeader != null) __obj.updateDynamic("activeHeader")(activeHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(activeIndex)) __obj.updateDynamic("activeIndex")(activeIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (prevActiveHeader != null) __obj.updateDynamic("prevActiveHeader")(prevActiveHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(prevActiveIndex)) __obj.updateDynamic("prevActiveIndex")(prevActiveIndex.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxLoadEventArgs]
  }
}

