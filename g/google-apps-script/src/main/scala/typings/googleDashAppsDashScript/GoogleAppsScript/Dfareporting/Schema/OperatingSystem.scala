package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystem extends js.Object {
  var dartId: js.UndefOr[String] = js.undefined
  var desktop: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var mobile: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object OperatingSystem {
  @scala.inline
  def apply(
    dartId: String = null,
    desktop: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    mobile: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    if (dartId != null) __obj.updateDynamic("dartId")(dartId)
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OperatingSystem]
  }
}

