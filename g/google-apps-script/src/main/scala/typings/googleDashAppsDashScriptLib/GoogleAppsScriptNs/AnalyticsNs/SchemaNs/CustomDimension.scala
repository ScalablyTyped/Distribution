package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimension extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var created: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parentLink: js.UndefOr[CustomDimensionParentLink] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object CustomDimension {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    created: java.lang.String = null,
    id: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    parentLink: CustomDimensionParentLink = null,
    scope: java.lang.String = null,
    selfLink: java.lang.String = null,
    updated: java.lang.String = null,
    webPropertyId: java.lang.String = null
  ): CustomDimension = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (created != null) __obj.updateDynamic("created")(created)
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[CustomDimension]
  }
}

