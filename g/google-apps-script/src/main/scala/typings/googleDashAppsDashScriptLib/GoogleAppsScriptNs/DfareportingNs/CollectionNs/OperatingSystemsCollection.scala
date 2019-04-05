package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemsCollection extends js.Object {
  // Gets one operating system by DART ID.
  def get(profileId: java.lang.String, dartId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.OperatingSystem
  // Retrieves a list of operating systems.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.OperatingSystemsListResponse
}

object OperatingSystemsCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.OperatingSystem,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.OperatingSystemsListResponse
  ): OperatingSystemsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperatingSystemsCollection]
  }
}

