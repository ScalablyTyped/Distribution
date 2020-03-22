package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlaymoviespartner.AnonCallback
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
  def get(request: AnonCallback): Request_[StoreInfo]
}

object CountryResource {
  @scala.inline
  def apply(get: AnonCallback => Request_[StoreInfo]): CountryResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[CountryResource]
  }
}

