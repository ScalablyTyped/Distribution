package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMetric extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var max_value: js.UndefOr[String] = js.undefined
  var min_value: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentLink: js.UndefOr[CustomMetricParentLink] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object CustomMetric {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    created: String = null,
    id: String = null,
    index: Int | Double = null,
    kind: String = null,
    max_value: String = null,
    min_value: String = null,
    name: String = null,
    parentLink: CustomMetricParentLink = null,
    scope: String = null,
    selfLink: String = null,
    `type`: String = null,
    updated: String = null,
    webPropertyId: String = null
  ): CustomMetric = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (created != null) __obj.updateDynamic("created")(created)
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (max_value != null) __obj.updateDynamic("max_value")(max_value)
    if (min_value != null) __obj.updateDynamic("min_value")(min_value)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[CustomMetric]
  }
}

