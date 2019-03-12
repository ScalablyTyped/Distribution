package typings
package gapiDotClientDotYoutubeanalyticsLib.gapiNs.clientNs.youtubeanalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItemsResource extends js.Object {
  /** Removes an item from a group. */
  def delete(request: gapiDotClientDotYoutubeanalyticsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Creates a group item. */
  def insert(request: gapiDotClientDotYoutubeanalyticsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[GroupItem]
  /** Returns a collection of group items that match the API request parameters. */
  def list(request: gapiDotClientDotYoutubeanalyticsLib.Anon_AltFieldsGroupId): gapiDotClientLib.gapiNs.clientNs.Request[GroupItemListResponse]
}

object GroupItemsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotYoutubeanalyticsLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    insert: gapiDotClientDotYoutubeanalyticsLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[GroupItem],
    list: gapiDotClientDotYoutubeanalyticsLib.Anon_AltFieldsGroupId => gapiDotClientLib.gapiNs.clientNs.Request[GroupItemListResponse]
  ): GroupItemsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GroupItemsResource]
  }
}

