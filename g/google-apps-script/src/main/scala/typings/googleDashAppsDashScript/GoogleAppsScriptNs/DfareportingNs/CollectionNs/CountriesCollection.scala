package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.CountriesListResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.Country
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesCollection extends js.Object {
  // Gets one country by ID.
  def get(profileId: String, dartId: String): Country
  // Retrieves a list of countries.
  def list(profileId: String): CountriesListResponse
}

object CountriesCollection {
  @scala.inline
  def apply(get: (String, String) => Country, list: String => CountriesListResponse): CountriesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CountriesCollection]
  }
}

