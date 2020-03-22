package typings.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutubeanalytics.AnonAlt
import typings.gapiClientYoutubeanalytics.AnonFields
import typings.gapiClientYoutubeanalytics.AnonGroupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItemsResource extends js.Object {
  /** Removes an item from a group. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Creates a group item. */
  def insert(request: AnonFields): Request_[GroupItem]
  /** Returns a collection of group items that match the API request parameters. */
  def list(request: AnonGroupId): Request_[GroupItemListResponse]
}

object GroupItemsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    insert: AnonFields => Request_[GroupItem],
    list: AnonGroupId => Request_[GroupItemListResponse]
  ): GroupItemsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GroupItemsResource]
  }
}

