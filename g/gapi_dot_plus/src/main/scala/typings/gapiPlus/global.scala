package typings.gapiPlus

import typings.gapi.gapi.client.HttpRequest
import typings.gapiPlus.gapi.client.plus.people.GetParameters
import typings.gapiPlus.gapi.client.plus.people.PeopleFeed
import typings.gapiPlus.gapi.client.plus.people.Person
import typings.gapiPlus.gapi.client.plus.people.SearchParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      // See Google+ REST API Reference https://developers.google.com/+/web/api/rest/latest/
      @js.native
      object plus extends js.Object {
        @js.native
        object people extends js.Object {
          def get(parameters: GetParameters): HttpRequest[Person] = js.native
          def search(parameters: SearchParameters): HttpRequest[PeopleFeed] = js.native
        }
        
      }
      
    }
    
  }
  
}

