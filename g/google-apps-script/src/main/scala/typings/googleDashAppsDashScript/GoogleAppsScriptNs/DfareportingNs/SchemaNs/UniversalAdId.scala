package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniversalAdId extends js.Object {
  var registry: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object UniversalAdId {
  @scala.inline
  def apply(registry: String = null, value: String = null): UniversalAdId = {
    val __obj = js.Dynamic.literal()
    if (registry != null) __obj.updateDynamic("registry")(registry)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UniversalAdId]
  }
}

