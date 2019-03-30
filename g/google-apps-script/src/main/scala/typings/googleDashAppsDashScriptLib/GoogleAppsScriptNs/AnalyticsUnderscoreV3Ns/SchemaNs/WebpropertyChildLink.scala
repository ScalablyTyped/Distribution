package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertyChildLink extends js.Object {
  var href: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object WebpropertyChildLink {
  @scala.inline
  def apply(href: java.lang.String = null, `type`: java.lang.String = null): WebpropertyChildLink = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WebpropertyChildLink]
  }
}

