package typings.googleDashAppsDashScript.GoogleAppsScript.People.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema.ListConnectionsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.People.Collection.People")
@js.native
object People extends js.Object {
  @js.native
  trait ConnectionsCollection extends js.Object {
    // Provides a list of the authenticated user's contacts merged with any
    // connected profiles.
    // <br>
    // The request throws a 400 error if 'personFields' is not specified.
    def list(resourceName: String): ListConnectionsResponse = js.native
    // Provides a list of the authenticated user's contacts merged with any
    // connected profiles.
    // <br>
    // The request throws a 400 error if 'personFields' is not specified.
    def list(resourceName: String, optionalArgs: js.Object): ListConnectionsResponse = js.native
  }
  
}

