package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.DartId
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountriesResource extends js.Object {
  /** Gets one country by ID. */
  def get(request: DartId): Request[Country] = js.native
  /** Retrieves a list of countries. */
  def list(request: Key): Request[CountriesListResponse] = js.native
}

object CountriesResource {
  @scala.inline
  def apply(get: DartId => Request[Country], list: Key => Request[CountriesListResponse]): CountriesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CountriesResource]
  }
  @scala.inline
  implicit class CountriesResourceOps[Self <: CountriesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: DartId => Request[Country]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[CountriesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

