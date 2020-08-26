package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlaymoviespartner.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountryResource extends js.Object {
  /**
    * Get a StoreInfo given its video id and country.
    *
    * See _Authentication and Authorization rules_ and
    * _Get methods rules_ for more information about this method.
    */
  def get(request: Callback): Request[StoreInfo] = js.native
}

object CountryResource {
  @scala.inline
  def apply(get: Callback => Request[StoreInfo]): CountryResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[CountryResource]
  }
  @scala.inline
  implicit class CountryResourceOps[Self <: CountryResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Callback => Request[StoreInfo]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

