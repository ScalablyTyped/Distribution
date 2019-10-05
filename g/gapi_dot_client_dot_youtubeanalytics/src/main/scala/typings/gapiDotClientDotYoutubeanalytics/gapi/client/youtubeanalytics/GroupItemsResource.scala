package typings.gapiDotClientDotYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutubeanalytics.Anon_Alt
import typings.gapiDotClientDotYoutubeanalytics.Anon_AltFields
import typings.gapiDotClientDotYoutubeanalytics.Anon_AltFieldsGroupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItemsResource extends js.Object {
  /** Removes an item from a group. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Creates a group item. */
  def insert(request: Anon_AltFields): Request[GroupItem]
  /** Returns a collection of group items that match the API request parameters. */
  def list(request: Anon_AltFieldsGroupId): Request[GroupItemListResponse]
}

object GroupItemsResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    insert: Anon_AltFields => Request[GroupItem],
    list: Anon_AltFieldsGroupId => Request[GroupItemListResponse]
  ): GroupItemsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GroupItemsResource]
  }
}

