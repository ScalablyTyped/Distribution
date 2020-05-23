package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.DartId
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesResource extends js.Object {
  /** Gets one country by ID. */
  def get(request: DartId): Request[Country]
  /** Retrieves a list of countries. */
  def list(request: Key): Request[CountriesListResponse]
}

object CountriesResource {
  @scala.inline
  def apply(get: DartId => Request[Country], list: Key => Request[CountriesListResponse]): CountriesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CountriesResource]
  }
}

