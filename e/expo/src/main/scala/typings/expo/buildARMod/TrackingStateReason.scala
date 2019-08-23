package typings.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TrackingStateReason extends js.Object

@JSImport("expo/build/AR", "TrackingStateReason")
@js.native
object TrackingStateReason extends js.Object {
  /** Tracking is limited due to a excessive motion of the camera. */
  @js.native
  sealed trait ExcessiveMotion extends TrackingStateReason
  
  /** Tracking is limited due to initialization in progress. */
  @js.native
  sealed trait Initializing extends TrackingStateReason
  
  /** Tracking is limited due to a lack of features visible to the camera. */
  @js.native
  sealed trait InsufficientFeatures extends TrackingStateReason
  
  /** Tracking is not limited. */
  @js.native
  sealed trait None extends TrackingStateReason
  
  /** Tracking is limited due to a relocalization in progress. */
  @js.native
  sealed trait Relocalizing extends TrackingStateReason
  
  /* "ARTrackingStateReasonExcessiveMotion" */ val ExcessiveMotion: typings.expo.buildARMod.TrackingStateReason.ExcessiveMotion with String = js.native
  /* "ARTrackingStateReasonInitializing" */ val Initializing: typings.expo.buildARMod.TrackingStateReason.Initializing with String = js.native
  /* "ARTrackingStateReasonInsufficientFeatures" */ val InsufficientFeatures: typings.expo.buildARMod.TrackingStateReason.InsufficientFeatures with String = js.native
  /* "ARTrackingStateReasonNone" */ val None: typings.expo.buildARMod.TrackingStateReason.None with String = js.native
  /* "ARTrackingStateReasonRelocalizing" */ val Relocalizing: typings.expo.buildARMod.TrackingStateReason.Relocalizing with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TrackingStateReason with String] = js.native
}

