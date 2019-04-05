package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesCollection extends js.Object {
  // Gets one country by ID.
  def get(profileId: java.lang.String, dartId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Country
  // Retrieves a list of countries.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CountriesListResponse
}

object CountriesCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Country,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CountriesListResponse
  ): CountriesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CountriesCollection]
  }
}

