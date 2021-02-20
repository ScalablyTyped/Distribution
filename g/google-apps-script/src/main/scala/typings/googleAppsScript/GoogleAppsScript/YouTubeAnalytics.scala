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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YouTubeAnalytics extends StObject {
  
  var GroupItems: js.UndefOr[GroupItemsCollection] = js.native
  
  var Groups: js.UndefOr[GroupsCollection] = js.native
  
  var Reports: js.UndefOr[ReportsCollection] = js.native
  
  // Create a new instance of ErrorProto
  def newErrorProto(): ErrorProto = js.native
  
  // Create a new instance of Errors
  def newErrors(): Errors = js.native
  
  // Create a new instance of Group
  def newGroup(): Group = js.native
  
  // Create a new instance of GroupContentDetails
  def newGroupContentDetails(): GroupContentDetails = js.native
  
  // Create a new instance of GroupItem
  def newGroupItem(): GroupItem = js.native
  
  // Create a new instance of GroupItemResource
  def newGroupItemResource(): GroupItemResource = js.native
  
  // Create a new instance of GroupSnippet
  def newGroupSnippet(): GroupSnippet = js.native
}
object YouTubeAnalytics {
  
  @scala.inline
  def apply(
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
    
    @js.native
    trait EmptyResponse extends StObject {
      
      var errors: js.UndefOr[Errors] = js.native
    }
    object EmptyResponse {
      
      @scala.inline
      def apply(): EmptyResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EmptyResponse]
      }
      
      @scala.inline
      implicit class EmptyResponseMutableBuilder[Self <: EmptyResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      }
    }
    
    @js.native
    trait ErrorProto extends StObject {
      
      var argument: js.UndefOr[js.Array[String]] = js.native
      
      var code: js.UndefOr[String] = js.native
      
      var debugInfo: js.UndefOr[String] = js.native
      
      var domain: js.UndefOr[String] = js.native
      
      var externalErrorMessage: js.UndefOr[String] = js.native
      
      var location: js.UndefOr[String] = js.native
      
      var locationType: js.UndefOr[String] = js.native
    }
    object ErrorProto {
      
      @scala.inline
      def apply(): ErrorProto = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ErrorProto]
      }
      
      @scala.inline
      implicit class ErrorProtoMutableBuilder[Self <: ErrorProto] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArgument(value: js.Array[String]): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
        
        @scala.inline
        def setArgumentVarargs(value: String*): Self = StObject.set(x, "argument", js.Array(value :_*))
        
        @scala.inline
        def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        @scala.inline
        def setDebugInfo(value: String): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
        
        @scala.inline
        def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setExternalErrorMessage(value: String): Self = StObject.set(x, "externalErrorMessage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExternalErrorMessageUndefined: Self = StObject.set(x, "externalErrorMessage", js.undefined)
        
        @scala.inline
        def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      }
    }
    
    @js.native
    trait Errors extends StObject {
      
      var code: js.UndefOr[String] = js.native
      
      var error: js.UndefOr[js.Array[ErrorProto]] = js.native
      
      var requestId: js.UndefOr[String] = js.native
    }
    object Errors {
      
      @scala.inline
      def apply(): Errors = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Errors]
      }
      
      @scala.inline
      implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        @scala.inline
        def setError(value: js.Array[ErrorProto]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        @scala.inline
        def setErrorVarargs(value: ErrorProto*): Self = StObject.set(x, "error", js.Array(value :_*))
        
        @scala.inline
        def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      }
    }
    
    @js.native
    trait Group extends StObject {
      
      var contentDetails: js.UndefOr[GroupContentDetails] = js.native
      
      var errors: js.UndefOr[Errors] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var snippet: js.UndefOr[GroupSnippet] = js.native
    }
    object Group {
      
      @scala.inline
      def apply(): Group = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Group]
      }
      
      @scala.inline
      implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentDetails(value: GroupContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
        
        @scala.inline
        def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setSnippet(value: GroupSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    @js.native
    trait GroupContentDetails extends StObject {
      
      var itemCount: js.UndefOr[String] = js.native
      
      var itemType: js.UndefOr[String] = js.native
    }
    object GroupContentDetails {
      
      @scala.inline
      def apply(): GroupContentDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupContentDetails]
      }
      
      @scala.inline
      implicit class GroupContentDetailsMutableBuilder[Self <: GroupContentDetails] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
        
        @scala.inline
        def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      }
    }
    
    @js.native
    trait GroupItem extends StObject {
      
      var errors: js.UndefOr[Errors] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var groupId: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var resource: js.UndefOr[GroupItemResource] = js.native
    }
    object GroupItem {
      
      @scala.inline
      def apply(): GroupItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupItem]
      }
      
      @scala.inline
      implicit class GroupItemMutableBuilder[Self <: GroupItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setResource(value: GroupItemResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      }
    }
    
    @js.native
    trait GroupItemResource extends StObject {
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
    }
    object GroupItemResource {
      
      @scala.inline
      def apply(): GroupItemResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupItemResource]
      }
      
      @scala.inline
      implicit class GroupItemResourceMutableBuilder[Self <: GroupItemResource] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    @js.native
    trait GroupSnippet extends StObject {
      
      var publishedAt: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object GroupSnippet {
      
      @scala.inline
      def apply(): GroupSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupSnippet]
      }
      
      @scala.inline
      implicit class GroupSnippetMutableBuilder[Self <: GroupSnippet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait ListGroupItemsResponse extends StObject {
      
      var errors: js.UndefOr[Errors] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var items: js.UndefOr[js.Array[GroupItem]] = js.native
      
      var kind: js.UndefOr[String] = js.native
    }
    object ListGroupItemsResponse {
      
      @scala.inline
      def apply(): ListGroupItemsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListGroupItemsResponse]
      }
      
      @scala.inline
      implicit class ListGroupItemsResponseMutableBuilder[Self <: ListGroupItemsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[GroupItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: GroupItem*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    @js.native
    trait ListGroupsResponse extends StObject {
      
      var errors: js.UndefOr[Errors] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var items: js.UndefOr[js.Array[Group]] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object ListGroupsResponse {
      
      @scala.inline
      def apply(): ListGroupsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListGroupsResponse]
      }
      
      @scala.inline
      implicit class ListGroupsResponseMutableBuilder[Self <: ListGroupsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[Group]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: Group*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait QueryResponse extends StObject {
      
      var columnHeaders: js.UndefOr[js.Array[ResultTableColumnHeader]] = js.native
      
      var errors: js.UndefOr[Errors] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var rows: js.UndefOr[js.Array[js.Array[_]]] = js.native
    }
    object QueryResponse {
      
      @scala.inline
      def apply(): QueryResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryResponse]
      }
      
      @scala.inline
      implicit class QueryResponseMutableBuilder[Self <: QueryResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnHeaders(value: js.Array[ResultTableColumnHeader]): Self = StObject.set(x, "columnHeaders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnHeadersUndefined: Self = StObject.set(x, "columnHeaders", js.undefined)
        
        @scala.inline
        def setColumnHeadersVarargs(value: ResultTableColumnHeader*): Self = StObject.set(x, "columnHeaders", js.Array(value :_*))
        
        @scala.inline
        def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setRows(value: js.Array[js.Array[_]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        @scala.inline
        def setRowsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "rows", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ResultTableColumnHeader extends StObject {
      
      var columnType: js.UndefOr[String] = js.native
      
      var dataType: js.UndefOr[String] = js.native
      
      var name: js.UndefOr[String] = js.native
    }
    object ResultTableColumnHeader {
      
      @scala.inline
      def apply(): ResultTableColumnHeader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResultTableColumnHeader]
      }
      
      @scala.inline
      implicit class ResultTableColumnHeaderMutableBuilder[Self <: ResultTableColumnHeader] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnType(value: String): Self = StObject.set(x, "columnType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnTypeUndefined: Self = StObject.set(x, "columnType", js.undefined)
        
        @scala.inline
        def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
  }
  
  @scala.inline
  implicit class YouTubeAnalyticsMutableBuilder[Self <: YouTubeAnalytics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupItems(value: GroupItemsCollection): Self = StObject.set(x, "GroupItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupItemsUndefined: Self = StObject.set(x, "GroupItems", js.undefined)
    
    @scala.inline
    def setGroups(value: GroupsCollection): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setNewErrorProto(value: () => ErrorProto): Self = StObject.set(x, "newErrorProto", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewErrors(value: () => Errors): Self = StObject.set(x, "newErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGroup(value: () => Group): Self = StObject.set(x, "newGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGroupContentDetails(value: () => GroupContentDetails): Self = StObject.set(x, "newGroupContentDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGroupItem(value: () => GroupItem): Self = StObject.set(x, "newGroupItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGroupItemResource(value: () => GroupItemResource): Self = StObject.set(x, "newGroupItemResource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGroupSnippet(value: () => GroupSnippet): Self = StObject.set(x, "newGroupSnippet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReports(value: ReportsCollection): Self = StObject.set(x, "Reports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsUndefined: Self = StObject.set(x, "Reports", js.undefined)
  }
}
