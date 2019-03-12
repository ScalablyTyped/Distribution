package typings
package gapiDotClientDotPlaymoviespartnerLib.gapiNs.clientNs.playmoviespartnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryResource extends js.Object {
  /**
    * Get a StoreInfo given its video id and country.
    *
    * See _Authentication and Authorization rules_ and
    * _Get methods rules_ for more information about this method.
    */
  def get(request: gapiDotClientDotPlaymoviespartnerLib.Anon_AccesstokenAccountIdAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[StoreInfo]
}

object CountryResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotPlaymoviespartnerLib.Anon_AccesstokenAccountIdAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[StoreInfo]
  ): CountryResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[CountryResource]
  }
}

