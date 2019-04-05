package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataSourceChildLink extends js.Object {
  var href: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CustomDataSourceChildLink {
  @scala.inline
  def apply(href: java.lang.String = null, `type`: java.lang.String = null): CustomDataSourceChildLink = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CustomDataSourceChildLink]
  }
}

