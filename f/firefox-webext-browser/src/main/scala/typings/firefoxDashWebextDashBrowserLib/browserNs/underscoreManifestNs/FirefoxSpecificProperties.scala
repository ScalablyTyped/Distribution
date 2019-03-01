package typings
package firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirefoxSpecificProperties extends js.Object {
  var id: js.UndefOr[ExtensionID] = js.undefined
  var strict_max_version: js.UndefOr[java.lang.String] = js.undefined
  var strict_min_version: js.UndefOr[java.lang.String] = js.undefined
  var update_url: js.UndefOr[java.lang.String] = js.undefined
}

object FirefoxSpecificProperties {
  @scala.inline
  def apply(
    id: ExtensionID = null,
    strict_max_version: java.lang.String = null,
    strict_min_version: java.lang.String = null,
    update_url: java.lang.String = null
  ): FirefoxSpecificProperties = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (strict_max_version != null) __obj.updateDynamic("strict_max_version")(strict_max_version)
    if (strict_min_version != null) __obj.updateDynamic("strict_min_version")(strict_min_version)
    if (update_url != null) __obj.updateDynamic("update_url")(update_url)
    __obj.asInstanceOf[FirefoxSpecificProperties]
  }
}

