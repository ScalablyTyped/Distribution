package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ConnectionType
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.ConnectionTypesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionTypesCollection extends js.Object {
  // Gets one connection type by ID.
  def get(profileId: String, id: String): ConnectionType
  // Retrieves a list of connection types.
  def list(profileId: String): ConnectionTypesListResponse
}

object ConnectionTypesCollection {
  @scala.inline
  def apply(get: (String, String) => ConnectionType, list: String => ConnectionTypesListResponse): ConnectionTypesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ConnectionTypesCollection]
  }
}

