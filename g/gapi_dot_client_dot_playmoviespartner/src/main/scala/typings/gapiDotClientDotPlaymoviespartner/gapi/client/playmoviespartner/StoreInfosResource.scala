package typings.gapiDotClientDotPlaymoviespartner.gapi.client.playmoviespartner

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPlaymoviespartner.Anon_AccesstokenAccountIdAltBearertokenCallbackCountries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreInfosResource extends js.Object {
  var country: CountryResource
  /**
    * List StoreInfos owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: Anon_AccesstokenAccountIdAltBearertokenCallbackCountries): Request[ListStoreInfosResponse]
}

object StoreInfosResource {
  @scala.inline
  def apply(
    country: CountryResource,
    list: Anon_AccesstokenAccountIdAltBearertokenCallbackCountries => Request[ListStoreInfosResponse]
  ): StoreInfosResource = {
    val __obj = js.Dynamic.literal(country = country, list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[StoreInfosResource]
  }
}

