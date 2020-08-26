package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AcceptsInStreamVideoPlacements
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySitesResource extends js.Object {
  /** Gets one directory site by ID. */
  def get(request: Fields): Request[DirectorySite] = js.native
  /** Inserts a new directory site. */
  def insert(request: Key): Request[DirectorySite] = js.native
  /** Retrieves a list of directory sites, possibly filtered. This method supports paging. */
  def list(request: AcceptsInStreamVideoPlacements): Request[DirectorySitesListResponse] = js.native
}

object DirectorySitesResource {
  @scala.inline
  def apply(
    get: Fields => Request[DirectorySite],
    insert: Key => Request[DirectorySite],
    list: AcceptsInStreamVideoPlacements => Request[DirectorySitesListResponse]
  ): DirectorySitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DirectorySitesResource]
  }
  @scala.inline
  implicit class DirectorySitesResourceOps[Self <: DirectorySitesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[DirectorySite]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[DirectorySite]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AcceptsInStreamVideoPlacements => Request[DirectorySitesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

