package typings.ejDotWebDotAll.ejNs.PagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current page index.
    */
  var currentPage: js.UndefOr[Double] = js.undefined
  /** Returns current action event type and its target.
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** Returns the pager model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentPage: Int | Double = null,
    event: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): ClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClickEventArgs]
  }
}

