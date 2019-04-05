package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarriersCollection extends js.Object {
  // Gets one mobile carrier by ID.
  def get(profileId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.MobileCarrier
  // Retrieves a list of mobile carriers.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.MobileCarriersListResponse
}

object MobileCarriersCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.MobileCarrier,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.MobileCarriersListResponse
  ): MobileCarriersCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MobileCarriersCollection]
  }
}

