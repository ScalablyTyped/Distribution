package typings.gapiDotClientDotYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutubeanalytics.Anon_Alt
import typings.gapiDotClientDotYoutubeanalytics.Anon_AltFields
import typings.gapiDotClientDotYoutubeanalytics.Anon_AltFieldsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Deletes a group. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Creates a group. */
  def insert(request: Anon_AltFields): Request[Group]
  /**
    * Returns a collection of groups that match the API request parameters. For example, you can retrieve all groups that the authenticated user owns, or you
    * can retrieve one or more groups by their unique IDs.
    */
  def list(request: Anon_AltFieldsId): Request[GroupListResponse]
  /** Modifies a group. For example, you could change a group's title. */
  def update(request: Anon_AltFields): Request[Group]
}

object GroupsResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    insert: Anon_AltFields => Request[Group],
    list: Anon_AltFieldsId => Request[GroupListResponse],
    update: Anon_AltFields => Request[Group]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GroupsResource]
  }
}

