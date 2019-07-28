package typings.googleDashAppsDashScript.GoogleAppsScriptNs.PeopleNs.CollectionNs.PeopleNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.PeopleNs.SchemaNs.ListConnectionsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

