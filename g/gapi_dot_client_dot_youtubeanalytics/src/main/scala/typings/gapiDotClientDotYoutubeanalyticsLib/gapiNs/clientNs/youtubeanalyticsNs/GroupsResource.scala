package typings
package gapiDotClientDotYoutubeanalyticsLib.gapiNs.clientNs.youtubeanalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Deletes a group. */
  def delete(request: gapiDotClientDotYoutubeanalyticsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Creates a group. */
  def insert(request: gapiDotClientDotYoutubeanalyticsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Group]
  /**
    * Returns a collection of groups that match the API request parameters. For example, you can retrieve all groups that the authenticated user owns, or you
    * can retrieve one or more groups by their unique IDs.
    */
  def list(request: gapiDotClientDotYoutubeanalyticsLib.Anon_AltFieldsId): gapiDotClientLib.gapiNs.clientNs.Request[GroupListResponse]
  /** Modifies a group. For example, you could change a group's title. */
  def update(request: gapiDotClientDotYoutubeanalyticsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Group]
}

object GroupsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotYoutubeanalyticsLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    insert: js.Function1[
      gapiDotClientDotYoutubeanalyticsLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Group]
    ],
    list: js.Function1[
      gapiDotClientDotYoutubeanalyticsLib.Anon_AltFieldsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[GroupListResponse]
    ],
    update: js.Function1[
      gapiDotClientDotYoutubeanalyticsLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Group]
    ]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(delete = delete, insert = insert, list = list, update = update)
  
    __obj.asInstanceOf[GroupsResource]
  }
}

