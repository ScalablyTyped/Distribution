package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.SearchString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  /** Gets one project by ID. */
  def get(request: Fields): Request[Project] = js.native
  /** Retrieves a list of projects, possibly filtered. This method supports paging. */
  def list(request: SearchString): Request[ProjectsListResponse] = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(get: Fields => Request[Project], list: SearchString => Request[ProjectsListResponse]): ProjectsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[Project]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: SearchString => Request[ProjectsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

