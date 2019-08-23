package typings.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraDidChangeTrackingStateEvent extends js.Object {
  var trackingState: TrackingState
  var trackingStateReason: TrackingStateReason
}

object CameraDidChangeTrackingStateEvent {
  @scala.inline
  def apply(trackingState: TrackingState, trackingStateReason: TrackingStateReason): CameraDidChangeTrackingStateEvent = {
    val __obj = js.Dynamic.literal(trackingState = trackingState, trackingStateReason = trackingStateReason)
  
    __obj.asInstanceOf[CameraDidChangeTrackingStateEvent]
  }
}

