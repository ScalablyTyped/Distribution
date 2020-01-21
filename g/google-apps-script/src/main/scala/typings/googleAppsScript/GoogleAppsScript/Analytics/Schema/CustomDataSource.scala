package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataSource extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var childLink: js.UndefOr[CustomDataSourceChildLink] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var importBehavior: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentLink: js.UndefOr[CustomDataSourceParentLink] = js.undefined
  var profilesLinked: js.UndefOr[js.Array[String]] = js.undefined
  var schema: js.UndefOr[js.Array[String]] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
  var uploadType: js.UndefOr[String] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
}

object CustomDataSource {
  @scala.inline
  def apply(
    accountId: String = null,
    childLink: CustomDataSourceChildLink = null,
    created: String = null,
    description: String = null,
    id: String = null,
    importBehavior: String = null,
    kind: String = null,
    name: String = null,
    parentLink: CustomDataSourceParentLink = null,
    profilesLinked: js.Array[String] = null,
    schema: js.Array[String] = null,
    selfLink: String = null,
    `type`: String = null,
    updated: String = null,
    uploadType: String = null,
    webPropertyId: String = null
  ): CustomDataSource = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (childLink != null) __obj.updateDynamic("childLink")(childLink.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (importBehavior != null) __obj.updateDynamic("importBehavior")(importBehavior.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (profilesLinked != null) __obj.updateDynamic("profilesLinked")(profilesLinked.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDataSource]
  }
}

