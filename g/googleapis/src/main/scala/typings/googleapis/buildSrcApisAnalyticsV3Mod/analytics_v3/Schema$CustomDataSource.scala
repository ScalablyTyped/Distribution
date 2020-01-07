package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.googleapis.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics custom data source.
  */
@js.native
trait Schema$CustomDataSource extends js.Object {
  /**
    * Account ID to which this custom data source belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  var childLink: js.UndefOr[Anon_Href] = js.native
  /**
    * Time this custom data source was created.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Description of custom data source.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Custom data source ID.
    */
  var id: js.UndefOr[String] = js.native
  var importBehavior: js.UndefOr[String] = js.native
  /**
    * Resource type for Analytics custom data source.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this custom data source.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent link for this custom data source. Points to the web property to
    * which this custom data source belongs.
    */
  var parentLink: js.UndefOr[Anon_Href] = js.native
  /**
    * IDs of views (profiles) linked to the custom data source.
    */
  var profilesLinked: js.UndefOr[js.Array[String]] = js.native
  /**
    * Collection of schema headers of the custom data source.
    */
  var schema: js.UndefOr[js.Array[String]] = js.native
  /**
    * Link for this Analytics custom data source.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Type of the custom data source.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Time this custom data source was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Upload type of the custom data source.
    */
  var uploadType: js.UndefOr[String] = js.native
  /**
    * Web property ID of the form UA-XXXXX-YY to which this custom data source
    * belongs.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object Schema$CustomDataSource {
  @scala.inline
  def apply(
    accountId: String = null,
    childLink: Anon_Href = null,
    created: String = null,
    description: String = null,
    id: String = null,
    importBehavior: String = null,
    kind: String = null,
    name: String = null,
    parentLink: Anon_Href = null,
    profilesLinked: js.Array[String] = null,
    schema: js.Array[String] = null,
    selfLink: String = null,
    `type`: String = null,
    updated: String = null,
    uploadType: String = null,
    webPropertyId: String = null
  ): Schema$CustomDataSource = {
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
    __obj.asInstanceOf[Schema$CustomDataSource]
  }
}

