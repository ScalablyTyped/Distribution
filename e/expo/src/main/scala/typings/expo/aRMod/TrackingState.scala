package typings.expo.aRMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TrackingState extends js.Object

@JSImport("expo/build/AR", "TrackingState")
@js.native
object TrackingState extends js.Object {
  /** Tracking is limited. See tracking reason for details. */
  @js.native
  sealed trait Limited extends TrackingState
  
  /** Tracking is Normal. */
  @js.native
  sealed trait Normal extends TrackingState
  
  /** Tracking is not available. */
  @js.native
  sealed trait NotAvailable extends TrackingState
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TrackingState with String] = js.native
  /* "ARTrackingStateLimited" */ @js.native
  object Limited extends TopLevel[Limited with String]
  
  /* "ARTrackingStateNormal" */ @js.native
  object Normal extends TopLevel[Normal with String]
  
  /* "ARTrackingStateNotAvailable" */ @js.native
  object NotAvailable extends TopLevel[NotAvailable with String]
  
}

