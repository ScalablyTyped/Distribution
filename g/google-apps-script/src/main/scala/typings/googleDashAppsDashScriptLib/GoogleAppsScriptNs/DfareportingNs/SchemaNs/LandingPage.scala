package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LandingPage extends js.Object {
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  var deepLinks: js.UndefOr[js.Array[DeepLink]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object LandingPage {
  @scala.inline
  def apply(
    advertiserId: java.lang.String = null,
    archived: js.UndefOr[scala.Boolean] = js.undefined,
    deepLinks: js.Array[DeepLink] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    url: java.lang.String = null
  ): LandingPage = {
    val __obj = js.Dynamic.literal()
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (deepLinks != null) __obj.updateDynamic("deepLinks")(deepLinks)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[LandingPage]
  }
}

