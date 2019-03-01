package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastsResource extends js.Object {
  /**
    * Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video
    * stream, though a video stream may be bound to more than one broadcast.
    */
  def bind(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwner): gapiDotClientLib.gapiNs.clientNs.Request[LiveBroadcast]
  /** Controls the settings for a slate that can be displayed in the broadcast stream. */
  def control(request: gapiDotClientDotYoutubeLib.Anon_AltDisplaySlate): gapiDotClientLib.gapiNs.clientNs.Request[LiveBroadcast]
  /** Deletes a broadcast. */
  def delete(
    request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel
  ): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Creates a broadcast. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[LiveBroadcast]
  /** Returns a list of YouTube broadcasts that match the API request parameters. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltBroadcastStatus): gapiDotClientLib.gapiNs.clientNs.Request[LiveBroadcastListResponse]
  /**
    * Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a
    * broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that
    * the value of the status.streamStatus property for the stream bound to your broadcast is active.
    */
  def transition(request: gapiDotClientDotYoutubeLib.Anon_AltBroadcastStatusFields): gapiDotClientLib.gapiNs.clientNs.Request[LiveBroadcast]
  /** Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[LiveBroadcast]
}

object LiveBroadcastsResource {
  @scala.inline
  def apply(
    bind: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwner, 
      gapiDotClientLib.gapiNs.clientNs.Request[LiveBroadcast]
    ],
    control: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltDisplaySlate, 
      gapiDotClientLib.gapiNs.clientNs.Request[LiveBroadcast]
    ],
    delete: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    insert: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[LiveBroadcast]
    ],
    list: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltBroadcastStatus, 
      gapiDotClientLib.gapiNs.clientNs.Request[LiveBroadcastListResponse]
    ],
    transition: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltBroadcastStatusFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[LiveBroadcast]
    ],
    update: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[LiveBroadcast]
    ]
  ): LiveBroadcastsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(bind)
    __obj.updateDynamic("control")(control)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("transition")(transition)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[LiveBroadcastsResource]
  }
}

