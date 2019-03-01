package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataSource extends js.Object {
  /** Account ID to which this custom data source belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var childLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** Time this custom data source was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Description of custom data source. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Custom data source ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  var importBehavior: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics custom data source. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this custom data source. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Parent link for this custom data source. Points to the web property to which this custom data source belongs. */
  var parentLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** IDs of views (profiles) linked to the custom data source. */
  var profilesLinked: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Collection of schema headers of the custom data source. */
  var schema: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Link for this Analytics custom data source. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the custom data source. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Time this custom data source was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Upload type of the custom data source. */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY to which this custom data source belongs. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object CustomDataSource {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    childLink: gapiDotClientDotAnalyticsLib.Anon_Href = null,
    created: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    importBehavior: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    parentLink: gapiDotClientDotAnalyticsLib.Anon_Href = null,
    profilesLinked: js.Array[java.lang.String] = null,
    schema: js.Array[java.lang.String] = null,
    selfLink: java.lang.String = null,
    `type`: java.lang.String = null,
    updated: java.lang.String = null,
    uploadType: java.lang.String = null,
    webPropertyId: java.lang.String = null
  ): CustomDataSource = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (childLink != null) __obj.updateDynamic("childLink")(childLink)
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (importBehavior != null) __obj.updateDynamic("importBehavior")(importBehavior)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink)
    if (profilesLinked != null) __obj.updateDynamic("profilesLinked")(profilesLinked)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[CustomDataSource]
  }
}

