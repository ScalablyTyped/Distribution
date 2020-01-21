package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTagOverride extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object EventTagOverride {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, id: String = null): EventTagOverride = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTagOverride]
  }
}

