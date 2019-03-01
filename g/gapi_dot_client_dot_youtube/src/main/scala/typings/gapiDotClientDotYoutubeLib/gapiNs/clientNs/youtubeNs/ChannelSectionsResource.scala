package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionsResource extends js.Object {
  /** Deletes a channelSection. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a channelSection for the authenticated user's channel. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ChannelSection]
  /** Returns channelSection resources that match the API request criteria. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltChannelIdFieldsHl): gapiDotClientLib.gapiNs.clientNs.Request[ChannelSectionListResponse]
  /** Update a channelSection. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner): gapiDotClientLib.gapiNs.clientNs.Request[ChannelSection]
}

object ChannelSectionsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    insert: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ChannelSection]
    ],
    list: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltChannelIdFieldsHl, 
      gapiDotClientLib.gapiNs.clientNs.Request[ChannelSectionListResponse]
    ],
    update: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner, 
      gapiDotClientLib.gapiNs.clientNs.Request[ChannelSection]
    ]
  ): ChannelSectionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ChannelSectionsResource]
  }
}

