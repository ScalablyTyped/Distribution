package typings.gapiPlus

import typings.gapi.gapi.client.HttpRequest
import typings.gapiPlus.gapi.client.plus.people.GetParameters
import typings.gapiPlus.gapi.client.plus.people.PeopleFeed
import typings.gapiPlus.gapi.client.plus.people.Person
import typings.gapiPlus.gapi.client.plus.people.SearchParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      // See Google+ REST API Reference https://developers.google.com/+/web/api/rest/latest/
      object plus {
        
        object people {
          
          @JSGlobal("gapi.client.plus.people")
          @js.native
          val ^ : js.Any = js.native
          
          @scala.inline
          def get(parameters: GetParameters): HttpRequest[Person] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Person]]
          
          @scala.inline
          def search(parameters: SearchParameters): HttpRequest[PeopleFeed] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[PeopleFeed]]
        }
      }
    }
  }
}
