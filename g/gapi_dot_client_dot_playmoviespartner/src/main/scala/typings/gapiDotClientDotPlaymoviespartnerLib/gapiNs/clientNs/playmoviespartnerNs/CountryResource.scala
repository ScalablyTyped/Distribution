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
    get: js.Function1[
      gapiDotClientDotPlaymoviespartnerLib.Anon_AccesstokenAccountIdAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[StoreInfo]
    ]
  ): CountryResource = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[CountryResource]
  }
}

