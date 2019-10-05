package typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var contextual_command: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var payload: js.UndefOr[String] = js.undefined
  var removeWhenSelected: js.UndefOr[Boolean] = js.undefined
  var values: js.UndefOr[js.Array[MenuValue]] = js.undefined
}

object MenuItem {
  @scala.inline
  def apply(
    action: String = null,
    contextual_command: String = null,
    id: String = null,
    payload: String = null,
    removeWhenSelected: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[MenuValue] = null
  ): MenuItem = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (contextual_command != null) __obj.updateDynamic("contextual_command")(contextual_command)
    if (id != null) __obj.updateDynamic("id")(id)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (!js.isUndefined(removeWhenSelected)) __obj.updateDynamic("removeWhenSelected")(removeWhenSelected)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[MenuItem]
  }
}

