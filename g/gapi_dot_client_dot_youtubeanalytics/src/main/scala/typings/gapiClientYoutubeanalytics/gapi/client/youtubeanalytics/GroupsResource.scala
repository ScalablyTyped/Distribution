package typings.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutubeanalytics.anon.Alt
import typings.gapiClientYoutubeanalytics.anon.Fields
import typings.gapiClientYoutubeanalytics.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Deletes a group. */
  def delete(request: Alt): Request[Unit]
  /** Creates a group. */
  def insert(request: Fields): Request[Group]
  /**
    * Returns a collection of groups that match the API request parameters. For example, you can retrieve all groups that the authenticated user owns, or you
    * can retrieve one or more groups by their unique IDs.
    */
  def list(request: Key): Request[GroupListResponse]
  /** Modifies a group. For example, you could change a group's title. */
  def update(request: Fields): Request[Group]
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
}

