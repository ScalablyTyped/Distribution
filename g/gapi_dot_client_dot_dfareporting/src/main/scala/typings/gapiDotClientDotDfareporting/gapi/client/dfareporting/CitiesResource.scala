package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltCountryDartIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CitiesResource extends js.Object {
  /** Retrieves a list of cities, possibly filtered. */
  def list(request: Anon_AltCountryDartIds): Request[CitiesListResponse]
}

object CitiesResource {
  @scala.inline
  def apply(list: Anon_AltCountryDartIds => Request[CitiesListResponse]): CitiesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CitiesResource]
  }
}

