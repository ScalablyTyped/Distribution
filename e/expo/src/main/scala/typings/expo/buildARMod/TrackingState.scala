package typings.expo.buildARMod

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
  
  /* "ARTrackingStateLimited" */ val Limited: typings.expo.buildARMod.TrackingState.Limited with String = js.native
  /* "ARTrackingStateNormal" */ val Normal: typings.expo.buildARMod.TrackingState.Normal with String = js.native
  /* "ARTrackingStateNotAvailable" */ val NotAvailable: typings.expo.buildARMod.TrackingState.NotAvailable with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TrackingState with String] = js.native
}

