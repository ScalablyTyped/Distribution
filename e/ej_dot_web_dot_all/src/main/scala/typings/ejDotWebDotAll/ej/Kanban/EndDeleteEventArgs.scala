package typings.ejDotWebDotAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndDeleteEventArgs extends js.Object {
  /** Current action name
    */
  var action: js.UndefOr[String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns deleted  data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object EndDeleteEventArgs {
  @scala.inline
  def apply(
    action: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    model: js.Any = null,
    requestType: String = null,
    `type`: String = null
  ): EndDeleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EndDeleteEventArgs]
  }
}

