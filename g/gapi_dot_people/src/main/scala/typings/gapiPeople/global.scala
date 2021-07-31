package typings.gapiPeople

import typings.gapi.gapi.client.HttpRequest
import typings.gapiPeople.gapi.client.people.Person
import typings.gapiPeople.gapi.client.people.people.BatchGetResponse
import typings.gapiPeople.gapi.client.people.people.GetBatchGetParameters
import typings.gapiPeople.gapi.client.people.people.GetParameters
import typings.gapiPeople.gapi.client.people.people.connections.ListParameters
import typings.gapiPeople.gapi.client.people.people.connections.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object people {
        
        object people {
          
          @JSGlobal("gapi.client.people.people")
          @js.native
          val ^ : js.Any = js.native
          
          object connections {
            
            @JSGlobal("gapi.client.people.people.connections")
            @js.native
            val ^ : js.Any = js.native
            
            @scala.inline
            def list(parameters: ListParameters): HttpRequest[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Response]]
          }
          
          @scala.inline
          def get(parameters: GetParameters): HttpRequest[Person] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Person]]
          
          @scala.inline
          def getBatchGet(parameters: GetBatchGetParameters): HttpRequest[BatchGetResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBatchGet")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[BatchGetResponse]]
        }
      }
    }
  }
}
