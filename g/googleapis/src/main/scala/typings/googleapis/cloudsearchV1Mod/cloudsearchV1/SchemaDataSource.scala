package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Datasource is a logical namespace for items to be indexed. All items must
  * belong to a datasource.  This is the prerequisite before items can be
  * indexed into Cloud Search.
  */
trait SchemaDataSource extends StObject {
  
  /**
    * If true, Indexing API rejects any modification calls to this datasource
    * such as create, update, and delete. Disabling this does not imply halting
    * process of previously accepted data.
    */
  var disableModifications: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable serving any search or assist results.
    */
  var disableServing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Display name of the datasource The maximum length is 300
    * characters.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * List of service accounts that have indexing access.
    */
  var indexingServiceAccounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This field restricts visibility to items at the datasource level. Items
    * within the datasource are restricted to the union of users and groups
    * included in this field. Note that, this does not ensure access to a
    * specific item, as users need to have ACL permissions on the contained
    * items. This ensures a high level access on the entire datasource, and
    * that the individual items are not shared outside this visibility.
    */
  var itemsVisibility: js.UndefOr[js.Array[SchemaGSuitePrincipal]] = js.undefined
  
  /**
    * Name of the datasource resource. Format: datasources/{source_id}. &lt;br
    * /&gt;The name is ignored when creating a datasource.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * IDs of the Long Running Operations (LROs) currently running for this
    * schema.
    */
  var operationIds: js.UndefOr[js.Array[String]] = js.undefined
  
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
  var shortName: js.UndefOr[String] = js.undefined
}
object SchemaDataSource {
  
  @scala.inline
  def apply(): SchemaDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSource]
  }
  
  @scala.inline
  implicit class SchemaDataSourceMutableBuilder[Self <: SchemaDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableModifications(value: Boolean): Self = StObject.set(x, "disableModifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableModificationsUndefined: Self = StObject.set(x, "disableModifications", js.undefined)
    
    @scala.inline
    def setDisableServing(value: Boolean): Self = StObject.set(x, "disableServing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableServingUndefined: Self = StObject.set(x, "disableServing", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIndexingServiceAccounts(value: js.Array[String]): Self = StObject.set(x, "indexingServiceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexingServiceAccountsUndefined: Self = StObject.set(x, "indexingServiceAccounts", js.undefined)
    
    @scala.inline
    def setIndexingServiceAccountsVarargs(value: String*): Self = StObject.set(x, "indexingServiceAccounts", js.Array(value :_*))
    
    @scala.inline
    def setItemsVisibility(value: js.Array[SchemaGSuitePrincipal]): Self = StObject.set(x, "itemsVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVisibilityUndefined: Self = StObject.set(x, "itemsVisibility", js.undefined)
    
    @scala.inline
    def setItemsVisibilityVarargs(value: SchemaGSuitePrincipal*): Self = StObject.set(x, "itemsVisibility", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperationIds(value: js.Array[String]): Self = StObject.set(x, "operationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdsUndefined: Self = StObject.set(x, "operationIds", js.undefined)
    
    @scala.inline
    def setOperationIdsVarargs(value: String*): Self = StObject.set(x, "operationIds", js.Array(value :_*))
    
    @scala.inline
    def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
  }
}
