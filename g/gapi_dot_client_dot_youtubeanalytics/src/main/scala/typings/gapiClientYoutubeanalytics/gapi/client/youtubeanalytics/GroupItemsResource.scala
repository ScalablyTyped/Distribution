package typings.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutubeanalytics.anon.Alt
import typings.gapiClientYoutubeanalytics.anon.Fields
import typings.gapiClientYoutubeanalytics.anon.GroupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItemsResource extends js.Object {
  /** Removes an item from a group. */
  def delete(request: Alt): Request[Unit]
  /** Creates a group item. */
  def insert(request: Fields): Request[GroupItem]
  /** Returns a collection of group items that match the API request parameters. */
  def list(request: GroupId): Request[GroupItemListResponse]
}

object GroupItemsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    insert: Fields => Request[GroupItem],
    list: GroupId => Request[GroupItemListResponse]
  ): GroupItemsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GroupItemsResource]
  }
}

