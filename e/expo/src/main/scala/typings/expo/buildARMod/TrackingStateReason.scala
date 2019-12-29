package typings.expo.buildARMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TrackingStateReason with String] = js.native
  /* "ARTrackingStateReasonExcessiveMotion" */ @js.native
  object ExcessiveMotion extends TopLevel[ExcessiveMotion with String]
  
  /* "ARTrackingStateReasonInitializing" */ @js.native
  object Initializing extends TopLevel[Initializing with String]
  
  /* "ARTrackingStateReasonInsufficientFeatures" */ @js.native
  object InsufficientFeatures extends TopLevel[InsufficientFeatures with String]
  
  /* "ARTrackingStateReasonNone" */ @js.native
  object None extends TopLevel[None with String]
  
  /* "ARTrackingStateReasonRelocalizing" */ @js.native
  object Relocalizing extends TopLevel[Relocalizing with String]
  
}

