package typings.gapiClientCivicinfo.gapi.client.civicinfo

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCivicinfo.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DivisionsResource extends js.Object {
  /** Searches for political divisions by their natural name or OCD ID. */
  def search(request: Alt): Request[DivisionSearchResponse] = js.native
}

object DivisionsResource {
  @scala.inline
  def apply(search: Alt => Request[DivisionSearchResponse]): DivisionsResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[DivisionsResource]
  }
  @scala.inline
  implicit class DivisionsResourceOps[Self <: DivisionsResource] (val x: Self) extends AnyVal {
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
    def setSearch(value: Alt => Request[DivisionSearchResponse]): Self = this.set("search", js.Any.fromFunction1(value))
  }
  
}

