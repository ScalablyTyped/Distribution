package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltDartId
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesResource extends js.Object {
  /** Gets one country by ID. */
  def get(request: AnonAltDartId): Request_[Country]
  /** Retrieves a list of countries. */
  def list(request: AnonAltFieldsKey): Request_[CountriesListResponse]
}

object CountriesResource {
  @scala.inline
  def apply(get: AnonAltDartId => Request_[Country], list: AnonAltFieldsKey => Request_[CountriesListResponse]): CountriesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CountriesResource]
  }
}

