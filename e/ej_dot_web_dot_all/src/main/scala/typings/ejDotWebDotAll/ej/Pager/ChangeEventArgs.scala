package typings.ejDotWebDotAll.ej.Pager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
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

object ChangeEventArgs {
  @scala.inline
  def apply(
    currentPage: Int | Double = null,
    event: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

