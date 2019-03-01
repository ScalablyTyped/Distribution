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
    delete: js.Function1[
      gapiDotClientDotYoutubeanalyticsLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    insert: js.Function1[
      gapiDotClientDotYoutubeanalyticsLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[GroupItem]
    ],
    list: js.Function1[
      gapiDotClientDotYoutubeanalyticsLib.Anon_AltFieldsGroupId, 
      gapiDotClientLib.gapiNs.clientNs.Request[GroupItemListResponse]
    ]
  ): GroupItemsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[GroupItemsResource]
  }
}

