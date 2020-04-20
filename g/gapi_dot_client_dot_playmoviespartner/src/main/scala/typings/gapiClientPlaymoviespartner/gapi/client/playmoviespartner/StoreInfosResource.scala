package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlaymoviespartner.AnonCountries
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
  def list(request: AnonCountries): Request_[ListStoreInfosResponse]
}

object StoreInfosResource {
  @scala.inline
  def apply(country: CountryResource, list: AnonCountries => Request_[ListStoreInfosResponse]): StoreInfosResource = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[StoreInfosResource]
  }
}

