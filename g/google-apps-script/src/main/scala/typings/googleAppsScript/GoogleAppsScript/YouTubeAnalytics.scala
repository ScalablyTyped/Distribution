package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Collection.GroupItemsCollection
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Collection.GroupsCollection
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Collection.ReportsCollection
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.EmptyResponse
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.ErrorProto
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.Errors
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.Group
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupContentDetails
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupItem
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupItemResource
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupSnippet
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.ListGroupItemsResponse
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.ListGroupsResponse
import typings.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.QueryResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YouTubeAnalytics extends StObject {
  
  var GroupItems: js.UndefOr[GroupItemsCollection] = js.undefined
  
  var Groups: js.UndefOr[GroupsCollection] = js.undefined
  
  var Reports: js.UndefOr[ReportsCollection] = js.undefined
  
  // Create a new instance of ErrorProto
  def newErrorProto(): ErrorProto
  
  // Create a new instance of Errors
  def newErrors(): Errors
  
  // Create a new instance of Group
  def newGroup(): Group
  
  // Create a new instance of GroupContentDetails
  def newGroupContentDetails(): GroupContentDetails
  
  // Create a new instance of GroupItem
  def newGroupItem(): GroupItem
  
  // Create a new instance of GroupItemResource
  def newGroupItemResource(): GroupItemResource
  
  // Create a new instance of GroupSnippet
  def newGroupSnippet(): GroupSnippet
}
object YouTubeAnalytics {
  
  inline def apply(
    newErrorProto: () => ErrorProto,
    newErrors: () => Errors,
    newGroup: () => Group,
    newGroupContentDetails: () => GroupContentDetails,
    newGroupItem: () => GroupItem,
    newGroupItemResource: () => GroupItemResource,
    newGroupSnippet: () => GroupSnippet
  ): YouTubeAnalytics = {
    val __obj = js.Dynamic.literal(newErrorProto = js.Any.fromFunction0(newErrorProto), newErrors = js.Any.fromFunction0(newErrors), newGroup = js.Any.fromFunction0(newGroup), newGroupContentDetails = js.Any.fromFunction0(newGroupContentDetails), newGroupItem = js.Any.fromFunction0(newGroupItem), newGroupItemResource = js.Any.fromFunction0(newGroupItemResource), newGroupSnippet = js.Any.fromFunction0(newGroupSnippet))
    __obj.asInstanceOf[YouTubeAnalytics]
  }
  
  object Collection {
    
    @js.native
    trait GroupItemsCollection extends StObject {
      
      // Creates a group item.
      def insert(resource: GroupItem): GroupItem = js.native
      // Creates a group item.
      def insert(resource: GroupItem, optionalArgs: js.Object): GroupItem = js.native
      
      // Returns a collection of group items that match the API request parameters.
      def list(): ListGroupItemsResponse = js.native
      // Returns a collection of group items that match the API request parameters.
      def list(optionalArgs: js.Object): ListGroupItemsResponse = js.native
      
      // Removes an item from a group.
      def remove(): EmptyResponse = js.native
      // Removes an item from a group.
      def remove(optionalArgs: js.Object): EmptyResponse = js.native
    }
    
    @js.native
    trait GroupsCollection extends StObject {
      
      // Creates a group.
      def insert(resource: Group): Group = js.native
      // Creates a group.
      def insert(resource: Group, optionalArgs: js.Object): Group = js.native
      
      // Returns a collection of groups that match the API request parameters. For
      // example, you can retrieve all groups that the authenticated user owns,
      // or you can retrieve one or more groups by their unique IDs.
      def list(): ListGroupsResponse = js.native
      // Returns a collection of groups that match the API request parameters. For
      // example, you can retrieve all groups that the authenticated user owns,
      // or you can retrieve one or more groups by their unique IDs.
      def list(optionalArgs: js.Object): ListGroupsResponse = js.native
      
      // Deletes a group.
      def remove(): EmptyResponse = js.native
      // Deletes a group.
      def remove(optionalArgs: js.Object): EmptyResponse = js.native
      
      // Modifies a group. For example, you could change a group's title.
      def update(resource: Group): Group = js.native
      // Modifies a group. For example, you could change a group's title.
      def update(resource: Group, optionalArgs: js.Object): Group = js.native
    }
    
    @js.native
    trait ReportsCollection extends StObject {
      
      // Retrieve your YouTube Analytics reports.
      def query(): QueryResponse = js.native
      // Retrieve your YouTube Analytics reports.
      def query(optionalArgs: js.Object): QueryResponse = js.native
    }
  }
  
  object Schema {
    
    trait EmptyResponse extends StObject {
      
      var errors: js.UndefOr[Errors] = js.undefined
    }
    object EmptyResponse {
      
      inline def apply(): EmptyResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EmptyResponse]
      }
      
      extension [Self <: EmptyResponse](x: Self) {
        
        inline def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      }
    }
    
    trait ErrorProto extends StObject {
      
      var argument: js.UndefOr[js.Array[String]] = js.undefined
      
      var code: js.UndefOr[String] = js.undefined
      
      var debugInfo: js.UndefOr[String] = js.undefined
      
      var domain: js.UndefOr[String] = js.undefined
      
      var externalErrorMessage: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[String] = js.undefined
      
      var locationType: js.UndefOr[String] = js.undefined
    }
    object ErrorProto {
      
      inline def apply(): ErrorProto = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ErrorProto]
      }
      
      extension [Self <: ErrorProto](x: Self) {
        
        inline def setArgument(value: js.Array[String]): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
        
        inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
        
        inline def setArgumentVarargs(value: String*): Self = StObject.set(x, "argument", js.Array(value*))
        
        inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        inline def setDebugInfo(value: String): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
        
        inline def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
        
        inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setExternalErrorMessage(value: String): Self = StObject.set(x, "externalErrorMessage", value.asInstanceOf[js.Any])
        
        inline def setExternalErrorMessageUndefined: Self = StObject.set(x, "externalErrorMessage", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
        
        inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      }
    }
    
    trait Errors extends StObject {
      
      var code: js.UndefOr[String] = js.undefined
      
      var error: js.UndefOr[js.Array[ErrorProto]] = js.undefined
      
      var requestId: js.UndefOr[String] = js.undefined
    }
    object Errors {
      
      inline def apply(): Errors = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Errors]
      }
      
      extension [Self <: Errors](x: Self) {
        
        inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        inline def setError(value: js.Array[ErrorProto]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        inline def setErrorVarargs(value: ErrorProto*): Self = StObject.set(x, "error", js.Array(value*))
        
        inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
        
        inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      }
    }
    
    trait Group extends StObject {
      
      var contentDetails: js.UndefOr[GroupContentDetails] = js.undefined
      
      var errors: js.UndefOr[Errors] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var snippet: js.UndefOr[GroupSnippet] = js.undefined
    }
    object Group {
      
      inline def apply(): Group = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Group]
      }
      
      extension [Self <: Group](x: Self) {
        
        inline def setContentDetails(value: GroupContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
        
        inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
        
        inline def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSnippet(value: GroupSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    trait GroupContentDetails extends StObject {
      
      var itemCount: js.UndefOr[String] = js.undefined
      
      var itemType: js.UndefOr[String] = js.undefined
    }
    object GroupContentDetails {
      
      inline def apply(): GroupContentDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupContentDetails]
      }
      
      extension [Self <: GroupContentDetails](x: Self) {
        
        inline def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
        
        inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
        
        inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
        
        inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      }
    }
    
    trait GroupItem extends StObject {
      
      var errors: js.UndefOr[Errors] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var groupId: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var resource: js.UndefOr[GroupItemResource] = js.undefined
    }
    object GroupItem {
      
      inline def apply(): GroupItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupItem]
      }
      
      extension [Self <: GroupItem](x: Self) {
        
        inline def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
        
        inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setResource(value: GroupItemResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      }
    }
    
    trait GroupItemResource extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object GroupItemResource {
      
      inline def apply(): GroupItemResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupItemResource]
      }
      
      extension [Self <: GroupItemResource](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait GroupSnippet extends StObject {
      
      var publishedAt: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object GroupSnippet {
      
      inline def apply(): GroupSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupSnippet]
      }
      
      extension [Self <: GroupSnippet](x: Self) {
        
        inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait ListGroupItemsResponse extends StObject {
      
      var errors: js.UndefOr[Errors] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[GroupItem]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object ListGroupItemsResponse {
      
      inline def apply(): ListGroupItemsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListGroupItemsResponse]
      }
      
      extension [Self <: ListGroupItemsResponse](x: Self) {
        
        inline def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[GroupItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: GroupItem*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait ListGroupsResponse extends StObject {
      
      var errors: js.UndefOr[Errors] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Group]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListGroupsResponse {
      
      inline def apply(): ListGroupsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListGroupsResponse]
      }
      
      extension [Self <: ListGroupsResponse](x: Self) {
        
        inline def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[Group]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Group*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait QueryResponse extends StObject {
      
      var columnHeaders: js.UndefOr[js.Array[ResultTableColumnHeader]] = js.undefined
      
      var errors: js.UndefOr[Errors] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var rows: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
    }
    object QueryResponse {
      
      inline def apply(): QueryResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryResponse]
      }
      
      extension [Self <: QueryResponse](x: Self) {
        
        inline def setColumnHeaders(value: js.Array[ResultTableColumnHeader]): Self = StObject.set(x, "columnHeaders", value.asInstanceOf[js.Any])
        
        inline def setColumnHeadersUndefined: Self = StObject.set(x, "columnHeaders", js.undefined)
        
        inline def setColumnHeadersVarargs(value: ResultTableColumnHeader*): Self = StObject.set(x, "columnHeaders", js.Array(value*))
        
        inline def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setRows(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setRowsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "rows", js.Array(value*))
      }
    }
    
    trait ResultTableColumnHeader extends StObject {
      
      var columnType: js.UndefOr[String] = js.undefined
      
      var dataType: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
    }
    object ResultTableColumnHeader {
      
      inline def apply(): ResultTableColumnHeader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResultTableColumnHeader]
      }
      
      extension [Self <: ResultTableColumnHeader](x: Self) {
        
        inline def setColumnType(value: String): Self = StObject.set(x, "columnType", value.asInstanceOf[js.Any])
        
        inline def setColumnTypeUndefined: Self = StObject.set(x, "columnType", js.undefined)
        
        inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
        
        inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
  }
  
  extension [Self <: YouTubeAnalytics](x: Self) {
    
    inline def setGroupItems(value: GroupItemsCollection): Self = StObject.set(x, "GroupItems", value.asInstanceOf[js.Any])
    
    inline def setGroupItemsUndefined: Self = StObject.set(x, "GroupItems", js.undefined)
    
    inline def setGroups(value: GroupsCollection): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setNewErrorProto(value: () => ErrorProto): Self = StObject.set(x, "newErrorProto", js.Any.fromFunction0(value))
    
    inline def setNewErrors(value: () => Errors): Self = StObject.set(x, "newErrors", js.Any.fromFunction0(value))
    
    inline def setNewGroup(value: () => Group): Self = StObject.set(x, "newGroup", js.Any.fromFunction0(value))
    
    inline def setNewGroupContentDetails(value: () => GroupContentDetails): Self = StObject.set(x, "newGroupContentDetails", js.Any.fromFunction0(value))
    
    inline def setNewGroupItem(value: () => GroupItem): Self = StObject.set(x, "newGroupItem", js.Any.fromFunction0(value))
    
    inline def setNewGroupItemResource(value: () => GroupItemResource): Self = StObject.set(x, "newGroupItemResource", js.Any.fromFunction0(value))
    
    inline def setNewGroupSnippet(value: () => GroupSnippet): Self = StObject.set(x, "newGroupSnippet", js.Any.fromFunction0(value))
    
    inline def setReports(value: ReportsCollection): Self = StObject.set(x, "Reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "Reports", js.undefined)
  }
}
