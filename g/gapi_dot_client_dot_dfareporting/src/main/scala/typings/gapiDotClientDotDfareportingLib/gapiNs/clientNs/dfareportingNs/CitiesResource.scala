package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CitiesResource extends js.Object {
  /** Retrieves a list of cities, possibly filtered. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltCountryDartIds): gapiDotClientLib.gapiNs.clientNs.Request[CitiesListResponse]
}

object CitiesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCountryDartIds, 
      gapiDotClientLib.gapiNs.clientNs.Request[CitiesListResponse]
    ]
  ): CitiesResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[CitiesResource]
  }
}

