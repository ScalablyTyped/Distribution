package typings.ejDotWebDotAll.ej.Tab

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxBeforeLoadEventArgs extends js.Object {
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
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Tab.Model] = js.undefined
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

object AjaxBeforeLoadEventArgs {
  @scala.inline
  def apply(
    URL: String = null,
    activeHeader: HTMLElement = null,
    activeIndex: Int | Double = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.Tab.Model = null,
    prevActiveHeader: HTMLElement = null,
    prevActiveIndex: Int | Double = null,
    `type`: String = null
  ): AjaxBeforeLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL)
    if (activeHeader != null) __obj.updateDynamic("activeHeader")(activeHeader)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevActiveHeader != null) __obj.updateDynamic("prevActiveHeader")(prevActiveHeader)
    if (prevActiveIndex != null) __obj.updateDynamic("prevActiveIndex")(prevActiveIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
  }
}

