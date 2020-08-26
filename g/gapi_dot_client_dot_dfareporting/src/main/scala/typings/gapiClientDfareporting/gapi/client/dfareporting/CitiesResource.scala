package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.CountryDartIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CitiesResource extends js.Object {
  /** Retrieves a list of cities, possibly filtered. */
  def list(request: CountryDartIds): Request[CitiesListResponse] = js.native
}

object CitiesResource {
  @scala.inline
  def apply(list: CountryDartIds => Request[CitiesListResponse]): CitiesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CitiesResource]
  }
  @scala.inline
  implicit class CitiesResourceOps[Self <: CitiesResource] (val x: Self) extends AnyVal {
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
    def setList(value: CountryDartIds => Request[CitiesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

