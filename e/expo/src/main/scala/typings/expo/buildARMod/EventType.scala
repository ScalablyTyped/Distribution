package typings.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSImport("expo/build/AR", "EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait AnchorsDidUpdate extends EventType
  
  @js.native
  sealed trait CameraDidChangeTrackingState extends EventType
  
  @js.native
  sealed trait DidFailWithError extends EventType
  
  @js.native
  sealed trait FrameDidUpdate extends EventType
  
  @js.native
  sealed trait SessionInterruptionEnded extends EventType
  
  @js.native
  sealed trait SessionWasInterrupted extends EventType
  
  /* 2 */ val AnchorsDidUpdate: typings.expo.buildARMod.EventType.AnchorsDidUpdate with Double = js.native
  /* 3 */ val CameraDidChangeTrackingState: typings.expo.buildARMod.EventType.CameraDidChangeTrackingState with Double = js.native
  /* 1 */ val DidFailWithError: typings.expo.buildARMod.EventType.DidFailWithError with Double = js.native
  /* 0 */ val FrameDidUpdate: typings.expo.buildARMod.EventType.FrameDidUpdate with Double = js.native
  /* 5 */ val SessionInterruptionEnded: typings.expo.buildARMod.EventType.SessionInterruptionEnded with Double = js.native
  /* 4 */ val SessionWasInterrupted: typings.expo.buildARMod.EventType.SessionWasInterrupted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

