package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesResource extends js.Object {
  /** Gets one country by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltDartId): gapiDotClientLib.gapiNs.clientNs.Request[Country]
  /** Retrieves a list of countries. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[CountriesListResponse]
}

object CountriesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltDartId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Country]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[CountriesListResponse]
    ]
  ): CountriesResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[CountriesResource]
  }
}

