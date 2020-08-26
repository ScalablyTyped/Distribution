package typings.gapiClientKgsearch.gapi.client.kgsearch

import typings.gapiClient.gapi.client.Request
import typings.gapiClientKgsearch.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitiesResource extends js.Object {
  /**
    * Searches Knowledge Graph for entities that match the constraints.
    * A list of matched entities will be returned in response, which will be in
    * JSON-LD format and compatible with http://schema.org
    */
  def search(request: Accesstoken): Request[SearchResponse] = js.native
}

object EntitiesResource {
  @scala.inline
  def apply(search: Accesstoken => Request[SearchResponse]): EntitiesResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[EntitiesResource]
  }
  @scala.inline
  implicit class EntitiesResourceOps[Self <: EntitiesResource] (val x: Self) extends AnyVal {
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
    def setSearch(value: Accesstoken => Request[SearchResponse]): Self = this.set("search", js.Any.fromFunction1(value))
  }
  
}

