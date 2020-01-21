package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAltBroadcastStatus
import typings.gapiClientYoutube.AnonAltBroadcastStatusFields
import typings.gapiClientYoutube.AnonAltDisplaySlate
import typings.gapiClientYoutube.AnonAltFieldsIdKeyOauthtokenOnBehalfOfContentOwner
import typings.gapiClientYoutube.AnonAltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel
import typings.gapiClientYoutube.AnonAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastsResource extends js.Object {
  /**
    * Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video
    * stream, though a video stream may be bound to more than one broadcast.
    */
  def bind(request: AnonAltFieldsIdKeyOauthtokenOnBehalfOfContentOwner): Request_[LiveBroadcast]
  /** Controls the settings for a slate that can be displayed in the broadcast stream. */
  def control(request: AnonAltDisplaySlate): Request_[LiveBroadcast]
  /** Deletes a broadcast. */
  def delete(request: AnonAltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel): Request_[Unit]
  /** Creates a broadcast. */
  def insert(request: AnonAltFieldsKeyOauthtoken): Request_[LiveBroadcast]
  /** Returns a list of YouTube broadcasts that match the API request parameters. */
  def list(request: AnonAltBroadcastStatus): Request_[LiveBroadcastListResponse]
  /**
    * Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a
    * broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that
    * the value of the status.streamStatus property for the stream bound to your broadcast is active.
    */
  def transition(request: AnonAltBroadcastStatusFields): Request_[LiveBroadcast]
  /** Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object. */
  def update(request: AnonAltFieldsKeyOauthtoken): Request_[LiveBroadcast]
}

object LiveBroadcastsResource {
  @scala.inline
  def apply(
    bind: AnonAltFieldsIdKeyOauthtokenOnBehalfOfContentOwner => Request_[LiveBroadcast],
    control: AnonAltDisplaySlate => Request_[LiveBroadcast],
    delete: AnonAltFieldsIdKeyOauthtokenOnBehalfOfContentOwnerOnBehalfOfContentOwnerChannel => Request_[Unit],
    insert: AnonAltFieldsKeyOauthtoken => Request_[LiveBroadcast],
    list: AnonAltBroadcastStatus => Request_[LiveBroadcastListResponse],
    transition: AnonAltBroadcastStatusFields => Request_[LiveBroadcast],
    update: AnonAltFieldsKeyOauthtoken => Request_[LiveBroadcast]
  ): LiveBroadcastsResource = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), control = js.Any.fromFunction1(control), delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), transition = js.Any.fromFunction1(transition), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LiveBroadcastsResource]
  }
}

