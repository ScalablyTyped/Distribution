package typings.gapiPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object people {
  
  trait BatchGetResponse extends StObject {
    
    var responses: js.Array[PersonResponse]
  }
  object BatchGetResponse {
    
    inline def apply(responses: js.Array[PersonResponse]): BatchGetResponse = {
      val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetResponse]
    }
    
    extension [Self <: BatchGetResponse](x: Self) {
      
      inline def setResponses(value: js.Array[PersonResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesVarargs(value: PersonResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
    }
  }
  
  trait GetBatchGetParameters extends StObject {
    
    var personFields: String
    
    // Query parameters
    var resourcesName: js.UndefOr[String] = js.undefined
  }
  object GetBatchGetParameters {
    
    inline def apply(personFields: String): GetBatchGetParameters = {
      val __obj = js.Dynamic.literal(personFields = personFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBatchGetParameters]
    }
    
    extension [Self <: GetBatchGetParameters](x: Self) {
      
      inline def setPersonFields(value: String): Self = StObject.set(x, "personFields", value.asInstanceOf[js.Any])
      
      inline def setResourcesName(value: String): Self = StObject.set(x, "resourcesName", value.asInstanceOf[js.Any])
      
      inline def setResourcesNameUndefined: Self = StObject.set(x, "resourcesName", js.undefined)
    }
  }
  
  trait GetParameters extends StObject {
    
    // Query parameters
    var personFields: String
    
    var resourceName: String
  }
  object GetParameters {
    
    inline def apply(personFields: String, resourceName: String): GetParameters = {
      val __obj = js.Dynamic.literal(personFields = personFields.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetParameters]
    }
    
    extension [Self <: GetParameters](x: Self) {
      
      inline def setPersonFields(value: String): Self = StObject.set(x, "personFields", value.asInstanceOf[js.Any])
      
      inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    }
  }
  
  trait PersonResponse extends StObject {
    
    var httpStatusCode: Double
    
    var person: Person
    
    var requestedResourceName: String
  }
  object PersonResponse {
    
    inline def apply(httpStatusCode: Double, person: Person, requestedResourceName: String): PersonResponse = {
      val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], person = person.asInstanceOf[js.Any], requestedResourceName = requestedResourceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersonResponse]
    }
    
    extension [Self <: PersonResponse](x: Self) {
      
      inline def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
      
      inline def setPerson(value: Person): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
      
      inline def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
    }
  }
  
  object connections {
    
    trait ListParameters extends StObject {
      
      var pageSize: js.UndefOr[Double] = js.undefined
      
      // Query parameters
      var pageToken: js.UndefOr[String] = js.undefined
      
      var personFields: String
      
      var resourceName: String
      
      var sortOrder: js.UndefOr[SortOrder] = js.undefined
      
      var syncToken: js.UndefOr[String] = js.undefined
    }
    object ListParameters {
      
      inline def apply(personFields: String, resourceName: String): ListParameters = {
        val __obj = js.Dynamic.literal(personFields = personFields.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
        __obj.asInstanceOf[ListParameters]
      }
      
      extension [Self <: ListParameters](x: Self) {
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setPersonFields(value: String): Self = StObject.set(x, "personFields", value.asInstanceOf[js.Any])
        
        inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
        
        inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
        
        inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
        
        inline def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
        
        inline def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
      }
    }
    
    trait Response extends StObject {
      
      var connections: js.Array[Person]
      
      var nextPageToken: String
      
      var nextSyncToken: String
    }
    object Response {
      
      inline def apply(connections: js.Array[Person], nextPageToken: String, nextSyncToken: String): Response = {
        val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], nextSyncToken = nextSyncToken.asInstanceOf[js.Any])
        __obj.asInstanceOf[Response]
      }
      
      extension [Self <: Response](x: Self) {
        
        inline def setConnections(value: js.Array[Person]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
        
        inline def setConnectionsVarargs(value: Person*): Self = StObject.set(x, "connections", js.Array(value :_*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.gapiPeople.gapiPeopleStrings.LAST_MODIFIED_ASCENDING
      - typings.gapiPeople.gapiPeopleStrings.FIRST_NAME_ASCENDING
      - typings.gapiPeople.gapiPeopleStrings.LAST_NAME_ASCENDING
    */
    trait SortOrder extends StObject
    object SortOrder {
      
      inline def FIRST_NAME_ASCENDING: typings.gapiPeople.gapiPeopleStrings.FIRST_NAME_ASCENDING = "FIRST_NAME_ASCENDING".asInstanceOf[typings.gapiPeople.gapiPeopleStrings.FIRST_NAME_ASCENDING]
      
      inline def LAST_MODIFIED_ASCENDING: typings.gapiPeople.gapiPeopleStrings.LAST_MODIFIED_ASCENDING = "LAST_MODIFIED_ASCENDING".asInstanceOf[typings.gapiPeople.gapiPeopleStrings.LAST_MODIFIED_ASCENDING]
      
      inline def LAST_NAME_ASCENDING: typings.gapiPeople.gapiPeopleStrings.LAST_NAME_ASCENDING = "LAST_NAME_ASCENDING".asInstanceOf[typings.gapiPeople.gapiPeopleStrings.LAST_NAME_ASCENDING]
    }
  }
}
