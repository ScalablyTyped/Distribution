package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotYoutube.Anon_AltBroadcastStatus
import typings.gapiDotClientDotYoutube.Anon_AltBroadcastStatusFields
import typings.gapiDotClientDotYoutube.Anon_AltDisplaySlate
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwner
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel
import typings.gapiDotClientDotYoutube.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastsResource extends js.Object {
  /**
    * Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video
    * stream, though a video stream may be bound to more than one broadcast.
    */
  def bind(request: Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwner): Request[LiveBroadcast]
  /** Controls the settings for a slate that can be displayed in the broadcast stream. */
  def control(request: Anon_AltDisplaySlate): Request[LiveBroadcast]
  /** Deletes a broadcast. */
  def delete(request: Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel): Request[Unit]
  /** Creates a broadcast. */
  def insert(request: Anon_AltFieldsKeyOauthtoken): Request[LiveBroadcast]
  /** Returns a list of YouTube broadcasts that match the API request parameters. */
  def list(request: Anon_AltBroadcastStatus): Request[LiveBroadcastListResponse]
  /**
    * Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a
    * broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that
    * the value of the status.streamStatus property for the stream bound to your broadcast is active.
    */
  def transition(request: Anon_AltBroadcastStatusFields): Request[LiveBroadcast]
  /** Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object. */
  def update(request: Anon_AltFieldsKeyOauthtoken): Request[LiveBroadcast]
}

object LiveBroadcastsResource {
  @scala.inline
  def apply(
    bind: Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwner => Request[LiveBroadcast],
    control: Anon_AltDisplaySlate => Request[LiveBroadcast],
    delete: Anon_AltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel => Request[Unit],
    insert: Anon_AltFieldsKeyOauthtoken => Request[LiveBroadcast],
    list: Anon_AltBroadcastStatus => Request[LiveBroadcastListResponse],
    transition: Anon_AltBroadcastStatusFields => Request[LiveBroadcast],
    update: Anon_AltFieldsKeyOauthtoken => Request[LiveBroadcast]
  ): LiveBroadcastsResource = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), control = js.Any.fromFunction1(control), delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), transition = js.Any.fromFunction1(transition), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LiveBroadcastsResource]
  }
}

