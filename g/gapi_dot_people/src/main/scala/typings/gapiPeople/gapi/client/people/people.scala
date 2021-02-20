package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object people {
  
  @js.native
  trait BatchGetResponse extends StObject {
    
    var responses: js.Array[PersonResponse] = js.native
  }
  object BatchGetResponse {
    
    @scala.inline
    def apply(responses: js.Array[PersonResponse]): BatchGetResponse = {
      val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetResponse]
    }
    
    @scala.inline
    implicit class BatchGetResponseMutableBuilder[Self <: BatchGetResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponses(value: js.Array[PersonResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsesVarargs(value: PersonResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetBatchGetParameters extends StObject {
    
    var personFields: String = js.native
    
    // Query parameters
    var resourcesName: js.UndefOr[String] = js.native
  }
  object GetBatchGetParameters {
    
    @scala.inline
    def apply(personFields: String): GetBatchGetParameters = {
      val __obj = js.Dynamic.literal(personFields = personFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBatchGetParameters]
    }
    
    @scala.inline
    implicit class GetBatchGetParametersMutableBuilder[Self <: GetBatchGetParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersonFields(value: String): Self = StObject.set(x, "personFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesName(value: String): Self = StObject.set(x, "resourcesName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesNameUndefined: Self = StObject.set(x, "resourcesName", js.undefined)
    }
  }
  
  @js.native
  trait GetParameters extends StObject {
    
    // Query parameters
    var personFields: String = js.native
    
    var resourceName: String = js.native
  }
  object GetParameters {
    
    @scala.inline
    def apply(personFields: String, resourceName: String): GetParameters = {
      val __obj = js.Dynamic.literal(personFields = personFields.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetParameters]
    }
    
    @scala.inline
    implicit class GetParametersMutableBuilder[Self <: GetParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersonFields(value: String): Self = StObject.set(x, "personFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PersonResponse extends StObject {
    
    var httpStatusCode: Double = js.native
    
    var person: Person = js.native
    
    var requestedResourceName: String = js.native
  }
  object PersonResponse {
    
    @scala.inline
    def apply(httpStatusCode: Double, person: Person, requestedResourceName: String): PersonResponse = {
      val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], person = person.asInstanceOf[js.Any], requestedResourceName = requestedResourceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersonResponse]
    }
    
    @scala.inline
    implicit class PersonResponseMutableBuilder[Self <: PersonResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerson(value: Person): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
    }
  }
  
  object connections {
    
    @js.native
    trait ListParameters extends StObject {
      
      var pageSize: js.UndefOr[Double] = js.native
      
      // Query parameters
      var pageToken: js.UndefOr[String] = js.native
      
      var personFields: String = js.native
      
      var resourceName: String = js.native
      
      var sortOrder: js.UndefOr[SortOrder] = js.native
      
      var syncToken: js.UndefOr[String] = js.native
    }
    object ListParameters {
      
      @scala.inline
      def apply(personFields: String, resourceName: String): ListParameters = {
        val __obj = js.Dynamic.literal(personFields = personFields.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
        __obj.asInstanceOf[ListParameters]
      }
      
      @scala.inline
      implicit class ListParametersMutableBuilder[Self <: ListParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        @scala.inline
        def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        @scala.inline
        def setPersonFields(value: String): Self = StObject.set(x, "personFields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
        
        @scala.inline
        def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
      }
    }
    
    @js.native
    trait Response extends StObject {
      
      var connections: js.Array[Person] = js.native
      
      var nextPageToken: String = js.native
      
      var nextSyncToken: String = js.native
    }
    object Response {
      
      @scala.inline
      def apply(connections: js.Array[Person], nextPageToken: String, nextSyncToken: String): Response = {
        val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], nextSyncToken = nextSyncToken.asInstanceOf[js.Any])
        __obj.asInstanceOf[Response]
      }
      
      @scala.inline
      implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnections(value: js.Array[Person]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectionsVarargs(value: Person*): Self = StObject.set(x, "connections", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.gapiPeople.gapiPeopleStrings.LAST_MODIFIED_ASCENDING
      - typings.gapiPeople.gapiPeopleStrings.FIRST_NAME_ASCENDING
      - typings.gapiPeople.gapiPeopleStrings.LAST_NAME_ASCENDING
    */
    trait SortOrder extends StObject
    object SortOrder {
      
      @scala.inline
      def FIRST_NAME_ASCENDING: typings.gapiPeople.gapiPeopleStrings.FIRST_NAME_ASCENDING = "FIRST_NAME_ASCENDING".asInstanceOf[typings.gapiPeople.gapiPeopleStrings.FIRST_NAME_ASCENDING]
      
      @scala.inline
      def LAST_MODIFIED_ASCENDING: typings.gapiPeople.gapiPeopleStrings.LAST_MODIFIED_ASCENDING = "LAST_MODIFIED_ASCENDING".asInstanceOf[typings.gapiPeople.gapiPeopleStrings.LAST_MODIFIED_ASCENDING]
      
      @scala.inline
      def LAST_NAME_ASCENDING: typings.gapiPeople.gapiPeopleStrings.LAST_NAME_ASCENDING = "LAST_NAME_ASCENDING".asInstanceOf[typings.gapiPeople.gapiPeopleStrings.LAST_NAME_ASCENDING]
    }
  }
}
