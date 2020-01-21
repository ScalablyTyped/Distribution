package typings.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutubeanalytics.AnonAlt
import typings.gapiClientYoutubeanalytics.AnonAltFields
import typings.gapiClientYoutubeanalytics.AnonAltFieldsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Deletes a group. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Creates a group. */
  def insert(request: AnonAltFields): Request_[Group]
  /**
    * Returns a collection of groups that match the API request parameters. For example, you can retrieve all groups that the authenticated user owns, or you
    * can retrieve one or more groups by their unique IDs.
    */
  def list(request: AnonAltFieldsId): Request_[GroupListResponse]
  /** Modifies a group. For example, you could change a group's title. */
  def update(request: AnonAltFields): Request_[Group]
}

object GroupsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    insert: AnonAltFields => Request_[Group],
    list: AnonAltFieldsId => Request_[GroupListResponse],
    update: AnonAltFields => Request_[Group]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GroupsResource]
  }
}

