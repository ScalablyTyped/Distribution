package typings.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutubeanalytics.anon.Alt
import typings.gapiClientYoutubeanalytics.anon.Fields
import typings.gapiClientYoutubeanalytics.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsResource extends js.Object {
  /** Deletes a group. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Creates a group. */
  def insert(request: Fields): Request[Group] = js.native
  /**
    * Returns a collection of groups that match the API request parameters. For example, you can retrieve all groups that the authenticated user owns, or you
    * can retrieve one or more groups by their unique IDs.
    */
  def list(request: Key): Request[GroupListResponse] = js.native
  /** Modifies a group. For example, you could change a group's title. */
  def update(request: Fields): Request[Group] = js.native
}

object GroupsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    insert: Fields => Request[Group],
    list: Key => Request[GroupListResponse],
    update: Fields => Request[Group]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[GroupsResource]
  }
  @scala.inline
  implicit class GroupsResourceOps[Self <: GroupsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Alt => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[Group]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[GroupListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fields => Request[Group]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

