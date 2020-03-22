package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAltBroadcastStatus
import typings.gapiClientYoutube.AnonAltFields
import typings.gapiClientYoutube.AnonBroadcastStatus
import typings.gapiClientYoutube.AnonDisplaySlate
import typings.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel
import typings.gapiClientYoutube.AnonStreamId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastsResource extends js.Object {
  /**
    * Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video
    * stream, though a video stream may be bound to more than one broadcast.
    */
  def bind(request: AnonStreamId): Request_[LiveBroadcast]
  /** Controls the settings for a slate that can be displayed in the broadcast stream. */
  def control(request: AnonDisplaySlate): Request_[LiveBroadcast]
  /** Deletes a broadcast. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Creates a broadcast. */
  def insert(request: AnonOnBehalfOfContentOwnerChannel): Request_[LiveBroadcast]
  /** Returns a list of YouTube broadcasts that match the API request parameters. */
  def list(request: AnonBroadcastStatus): Request_[LiveBroadcastListResponse]
  /**
    * Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a
    * broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that
    * the value of the status.streamStatus property for the stream bound to your broadcast is active.
    */
  def transition(request: AnonAltBroadcastStatus): Request_[LiveBroadcast]
  /** Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object. */
  def update(request: AnonOnBehalfOfContentOwnerChannel): Request_[LiveBroadcast]
}

object LiveBroadcastsResource {
  @scala.inline
  def apply(
    bind: AnonStreamId => Request_[LiveBroadcast],
    control: AnonDisplaySlate => Request_[LiveBroadcast],
    delete: AnonAltFields => Request_[Unit],
    insert: AnonOnBehalfOfContentOwnerChannel => Request_[LiveBroadcast],
    list: AnonBroadcastStatus => Request_[LiveBroadcastListResponse],
    transition: AnonAltBroadcastStatus => Request_[LiveBroadcast],
    update: AnonOnBehalfOfContentOwnerChannel => Request_[LiveBroadcast]
  ): LiveBroadcastsResource = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), control = js.Any.fromFunction1(control), delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), transition = js.Any.fromFunction1(transition), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LiveBroadcastsResource]
  }
}

