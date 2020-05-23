package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClientAnalytics.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMetric extends js.Object {
  /** Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Boolean indicating whether the custom metric is active. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Time the custom metric was created. */
  var created: js.UndefOr[String] = js.undefined
  /** Custom metric ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Index of the custom metric. */
  var index: js.UndefOr[Double] = js.undefined
  /** Kind value for a custom metric. Set to "analytics#customMetric". It is a read-only field. */
  var kind: js.UndefOr[String] = js.undefined
  /** Max value of custom metric. */
  var max_value: js.UndefOr[String] = js.undefined
  /** Min value of custom metric. */
  var min_value: js.UndefOr[String] = js.undefined
  /** Name of the custom metric. */
  var name: js.UndefOr[String] = js.undefined
  /** Parent link for the custom metric. Points to the property to which the custom metric belongs. */
  var parentLink: js.UndefOr[Href] = js.undefined
  /** Scope of the custom metric: HIT or PRODUCT. */
  var scope: js.UndefOr[String] = js.undefined
  /** Link for the custom metric */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Data type of custom metric. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Time the custom metric was last modified. */
  var updated: js.UndefOr[String] = js.undefined
  /** Property ID. */
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object CustomMetric {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    created: String = null,
    id: String = null,
    index: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    max_value: String = null,
    min_value: String = null,
    name: String = null,
    parentLink: Href = null,
    scope: String = null,
    selfLink: String = null,
    `type`: String = null,
    updated: String = null,
    webPropertyId: String = null
  ): CustomMetric = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (max_value != null) __obj.updateDynamic("max_value")(max_value.asInstanceOf[js.Any])
    if (min_value != null) __obj.updateDynamic("min_value")(min_value.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMetric]
  }
}

