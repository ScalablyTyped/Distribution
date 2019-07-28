package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltDartId
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesResource extends js.Object {
  /** Gets one country by ID. */
  def get(request: Anon_AltDartId): Request[Country]
  /** Retrieves a list of countries. */
  def list(request: Anon_AltFieldsKey): Request[CountriesListResponse]
}

object CountriesResource {
  @scala.inline
  def apply(get: Anon_AltDartId => Request[Country], list: Anon_AltFieldsKey => Request[CountriesListResponse]): CountriesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CountriesResource]
  }
}

