package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataSource extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var childLink: js.UndefOr[CustomDataSourceChildLink] = js.undefined
  var created: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var importBehavior: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parentLink: js.UndefOr[CustomDataSourceParentLink] = js.undefined
  var profilesLinked: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var schema: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object CustomDataSource {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    childLink: CustomDataSourceChildLink = null,
    created: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    importBehavior: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    parentLink: CustomDataSourceParentLink = null,
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

