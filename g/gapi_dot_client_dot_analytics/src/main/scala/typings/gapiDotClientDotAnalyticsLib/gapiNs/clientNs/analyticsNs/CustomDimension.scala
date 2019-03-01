package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimension extends js.Object {
  /** Account ID. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Boolean indicating whether the custom dimension is active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Time the custom dimension was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Custom dimension ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Index of the custom dimension. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Kind value for a custom dimension. Set to "analytics#customDimension". It is a read-only field. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the custom dimension. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Parent link for the custom dimension. Points to the property to which the custom dimension belongs. */
  var parentLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** Scope of the custom dimension: HIT, SESSION, USER or PRODUCT. */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /** Link for the custom dimension */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Time the custom dimension was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Property ID. */
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
    parentLink: gapiDotClientDotAnalyticsLib.Anon_Href = null,
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

