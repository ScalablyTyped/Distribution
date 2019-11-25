package typings.firefoxDashWebextDashBrowser.browser._manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirefoxSpecificProperties extends js.Object {
  var id: js.UndefOr[ExtensionID] = js.undefined
  var strict_max_version: js.UndefOr[String] = js.undefined
  var strict_min_version: js.UndefOr[String] = js.undefined
  var update_url: js.UndefOr[String] = js.undefined
}

object FirefoxSpecificProperties {
  @scala.inline
  def apply(
    id: ExtensionID = null,
    strict_max_version: String = null,
    strict_min_version: String = null,
    update_url: String = null
  ): FirefoxSpecificProperties = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (strict_max_version != null) __obj.updateDynamic("strict_max_version")(strict_max_version.asInstanceOf[js.Any])
    if (strict_min_version != null) __obj.updateDynamic("strict_min_version")(strict_min_version.asInstanceOf[js.Any])
    if (update_url != null) __obj.updateDynamic("update_url")(update_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirefoxSpecificProperties]
  }
}

