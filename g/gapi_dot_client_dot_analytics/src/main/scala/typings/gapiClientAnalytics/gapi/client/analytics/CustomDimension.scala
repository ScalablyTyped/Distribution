package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClientAnalytics.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimension extends js.Object {
  /** Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Boolean indicating whether the custom dimension is active. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Time the custom dimension was created. */
  var created: js.UndefOr[String] = js.undefined
  /** Custom dimension ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Index of the custom dimension. */
  var index: js.UndefOr[Double] = js.undefined
  /** Kind value for a custom dimension. Set to "analytics#customDimension". It is a read-only field. */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of the custom dimension. */
  var name: js.UndefOr[String] = js.undefined
  /** Parent link for the custom dimension. Points to the property to which the custom dimension belongs. */
  var parentLink: js.UndefOr[Href] = js.undefined
  /** Scope of the custom dimension: HIT, SESSION, USER or PRODUCT. */
  var scope: js.UndefOr[String] = js.undefined
  /** Link for the custom dimension */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Time the custom dimension was last modified. */
  var updated: js.UndefOr[String] = js.undefined
  /** Property ID. */
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object CustomDimension {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    created: String = null,
    id: String = null,
    index: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    name: String = null,
    parentLink: Href = null,
    scope: String = null,
    selfLink: String = null,
    updated: String = null,
    webPropertyId: String = null
  ): CustomDimension = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDimension]
  }
}

