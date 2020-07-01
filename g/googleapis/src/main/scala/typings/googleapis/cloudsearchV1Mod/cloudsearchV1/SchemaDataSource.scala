package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Datasource is a logical namespace for items to be indexed. All items must
  * belong to a datasource.  This is the prerequisite before items can be
  * indexed into Cloud Search.
  */
@js.native
trait SchemaDataSource extends js.Object {
  /**
    * If true, Indexing API rejects any modification calls to this datasource
    * such as create, update, and delete. Disabling this does not imply halting
    * process of previously accepted data.
    */
  var disableModifications: js.UndefOr[Boolean] = js.native
  /**
    * Disable serving any search or assist results.
    */
  var disableServing: js.UndefOr[Boolean] = js.native
  /**
    * Required. Display name of the datasource The maximum length is 300
    * characters.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * List of service accounts that have indexing access.
    */
  var indexingServiceAccounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * This field restricts visibility to items at the datasource level. Items
    * within the datasource are restricted to the union of users and groups
    * included in this field. Note that, this does not ensure access to a
    * specific item, as users need to have ACL permissions on the contained
    * items. This ensures a high level access on the entire datasource, and
    * that the individual items are not shared outside this visibility.
    */
  var itemsVisibility: js.UndefOr[js.Array[SchemaGSuitePrincipal]] = js.native
  /**
    * Name of the datasource resource. Format: datasources/{source_id}. &lt;br
    * /&gt;The name is ignored when creating a datasource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * IDs of the Long Running Operations (LROs) currently running for this
    * schema.
    */
  var operationIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A short name or alias for the source.  This value will be used to match
    * the &#39;source&#39; operator. For example, if the short name is
    * *&amp;lt;value&amp;gt;* then queries like *source:&amp;lt;value&amp;gt;*
    * will only return results for this source. The value must be unique across
    * all datasources. The value must only contain alphanumeric characters
    * (a-zA-Z0-9). The value cannot start with &#39;google&#39; and cannot be
    * one of the following: mail, gmail, docs, drive, groups, sites, calendar,
    * hangouts, gplus, keep, people, teams. Its maximum length is 32
    * characters.
    */
  var shortName: js.UndefOr[String] = js.native
}

object SchemaDataSource {
  @scala.inline
  def apply(
    disableModifications: js.UndefOr[Boolean] = js.undefined,
    disableServing: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    indexingServiceAccounts: js.Array[String] = null,
    itemsVisibility: js.Array[SchemaGSuitePrincipal] = null,
    name: String = null,
    operationIds: js.Array[String] = null,
    shortName: String = null
  ): SchemaDataSource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableModifications)) __obj.updateDynamic("disableModifications")(disableModifications.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableServing)) __obj.updateDynamic("disableServing")(disableServing.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (indexingServiceAccounts != null) __obj.updateDynamic("indexingServiceAccounts")(indexingServiceAccounts.asInstanceOf[js.Any])
    if (itemsVisibility != null) __obj.updateDynamic("itemsVisibility")(itemsVisibility.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operationIds != null) __obj.updateDynamic("operationIds")(operationIds.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDataSource]
  }
}

